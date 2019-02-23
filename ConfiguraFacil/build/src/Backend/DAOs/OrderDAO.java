
package Backend.DAOs;


import Backend.Business.Car;
import Backend.Business.Client;
import Backend.Business.Component;
import Backend.Business.Package;
import Backend.DAOs.ConnectionDB;
import Backend.Business.ConfiguraFacil;
import Backend.Business.Order;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.Version;
import java.util.*;
import java.sql.Time;

public class OrderDAO {
  
    private static ConnectionDB connDB;
     
    public OrderDAO(){
        this.connDB = new ConnectionDB();
    }
            
    public Boolean addOrder(Order order) throws Exception{
        Connection con = this.connDB.initConnection();
        Boolean done = false;
        int rows = -1;
        
        int idCar = -1;
        Map<Integer,Component> components = new HashMap<Integer,Component>();
        Map<Integer,Package> pack = new HashMap<Integer,Package>();
        
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        PreparedStatement st4 = null;
        PreparedStatement st5 = null;
        PreparedStatement st6 = null;
        PreparedStatement st7 = null;
        
        String idSeller = order.getIDSeller();
        String idClient = order.getIDClient();
      
        
        try{
            con.setAutoCommit(false);
            
            if(order.getIDClient().isEmpty()){
                Client client = order.getClient();
                st1 = con.prepareStatement("INSERT INTO Client (NIF, Name, Address, Phone) VALUES (?,?,?,?)");
                st1.setString(1,client.getNif());
                st1.setString(2,client.getName());
                st1.setString(3,client.getAdress());
                st1.setString(4,client.getPhone());
                rows = st1.executeUpdate();
            
                if(rows == 0){ throw new SQLException("Creating Client failed, no rows affected.");}
            }
            
            st2 = con.prepareStatement("INSERT INTO Car (idCar, Brand, Model) VALUES (default,?,?)",st2.RETURN_GENERATED_KEYS);
            st2.setString(1,order.getCar().getBrand());
            st2.setString(2,order.getCar().getModel());
            rows = st2.executeUpdate();
            
            if(rows == 0){ throw new SQLException("Creating Car failed, no rows affected.");}
            
            ResultSet generatedKey = st2.getGeneratedKeys();
                if(generatedKey.next()){
                    idCar = generatedKey.getInt(1);
            }  
                
            java.sql.Date sDate = new java.sql.Date(order.getDate().getTime());
            
            
            st3 = con.prepareStatement("INSERT INTO `Order` (idOrder, Date, Price, Status, Description, Seller_Username, Client_NIF, idCar) VALUES (default,?,?,?,?,?,?,?)");
            st3.setDate(1,sDate);
            st3.setDouble(2, order.getPrice());
            st3.setString(3, order.getStatus());
            st3.setString(4,order.getDescription());
            st3.setString(5, order.getIDSeller());
            if(order.getIDClient().isEmpty()){
                st3.setString(6, order.getClient().getNif());
            }else{
                st3.setString(6, order.getIDClient());
            }
            st3.setInt(7, idCar);
            rows = st3.executeUpdate();
                
            if(rows == 0){ throw new SQLException("Creating Order failed, no rows affected.");}
            
            components.putAll(order.getCar().getComponets());
              
            for(Component c : components.values()){
                st4 = con.prepareStatement("INSERT INTO CompCar (idComponent, idCar) VALUES (?,?)");
                st4.setInt(1, c.getID());
                st4.setInt(2,idCar);
                rows = st4.executeUpdate();
                
                if(rows == 0){ throw new SQLException("Creating CompCar failed, no rows affected.");}
                
                st6 = con.prepareStatement("UPDATE Component SET Quantity = Quantity-1 WHERE idComponent = ?");
                st6.setInt(1,c.getID());
                rows = st6.executeUpdate();
                
                if(rows == 0){ throw new SQLException("Update compcar quantity, no rows affected.");}
            }
            
            pack.putAll(order.getCar().getPackages());
            
            for(Package p : pack.values()){
                st5 = con.prepareStatement("INSERT INTO PackageCar (idPackage, idCar) VALUES (?,?)");
                st5.setInt(1, p.getPackageID());
                st5.setInt(2, idCar);
                rows = st5.executeUpdate();

                if(rows == 0){ throw new SQLException("Creating PackageCar failed, no rows affected."); }
                
                for(Component c : p.getComponents().values()){
                    st7 = con.prepareStatement("UPDATE Component SET Quantity = Quantity-1 WHERE idComponent = ?");
                    st7.setInt(1,c.getID());
                    rows = st7.executeUpdate();
                    
                    if(rows == 0){ throw new SQLException("Update compackage quantity, no rows affected."); }
                }
            }

            done = true;
            con.commit();
            
        }catch (SQLException ex) {
            System.err.print("Couldn't add order");
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            if (con != null){
                try{
                    System.err.print("Transaction addNewOrder is being rolled back");
                    con.rollback();      
                    done = false;
                }catch(SQLException excep){
                    System.out.print(excep);
                    done = false;
                }         
            }  
            
        } finally{
            if (st1 != null) st1.close();
            if (st2 != null) st2.close();
            if (st3 != null) st3.close();
            if (st4 != null) st3.close();
            if (st5 != null) st5.close();
            if (st6 != null) st6.close();
            if (st7 != null) st7.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
    
    public List<Order> allOrders() throws Exception{
        Connection con = this.connDB.initConnection();
        List<Order> resp = new ArrayList<Order>();
        ResultSet orders = null;
        PreparedStatement st = null;
        
        try{
            st = con.prepareStatement("SELECT idOrder, Date, Price, Status, Description, idCar from `Order`");
            orders = st.executeQuery();
            while(orders.next()){
                int idOrder = orders.getInt("idOrder");
                Date date = orders.getDate("Date");
                double price = orders.getDouble("Price");
                String status = orders.getString("Status");
                String description = orders.getString("Description"); 
                int idCar = orders.getInt("idCar");
                resp.add(new Order(idOrder,date,price,status,description,idCar));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }   
    
    public List<Order> allOrdersBySellerID(String idSeller) throws Exception{
        Connection con = this.connDB.initConnection();
        List<Order> resp = new ArrayList<Order>();
        ResultSet orders = null;
        PreparedStatement st = null;
        
        try{
            st = con.prepareStatement("SELECT idOrder, Date, Price, Status, Description, idCar from `Order` WHERE Seller_Username = ?");
            st.setString(1,idSeller);
            orders = st.executeQuery();
            while(orders.next()){
                int idOrder = orders.getInt("idOrder");
                Date date = orders.getDate("Date");
                double price = orders.getDouble("Price");
                String status = orders.getString("Status");
                String description = orders.getString("Description"); 
                int idCar = orders.getInt("idCar");
                resp.add(new Order(idOrder,date,price,status,description,idCar));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }   

    public List<String> checkOrder(Order order) throws Exception {
        Connection con = this.connDB.initConnection();
        
        Map<Integer,Package> packs = new HashMap<>();
        Map<Integer,Component> comps = new HashMap<>();
        
        packs.putAll(order.getCar().getPackages());
        comps.putAll(order.getCar().getComponets());
        
        ResultSet comp = null;
        ResultSet pac = null;
        
        List<String> resp =  new ArrayList<>();
        
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;

        try{
            for(Component c : comps.values()){
                st1 = con.prepareStatement("SELECT idComponent, Quantity from Component WHERE idComponent = ? AND Quantity > 0");
                st1.setInt(1,c.getID());
                comp = st1.executeQuery();
                if(!comp.next()){
                    resp.add(c.getName());
                    break;
                }
            }
            
            for(Package p : packs.values()){
                Map<Integer,Component> aux = new HashMap<>();
                aux.putAll(p.getComponents());
                for(Component c : aux.values()){
                    st2 = con.prepareStatement("SELECT idComponent, Quantity from Component WHERE idComponent = ? AND Quantity > 0");
                    st2.setInt(1,c.getID());
                    pac = st2.executeQuery();
                    if(!pac.next()){
                        resp.add(c.getName());
                        break;
                    }
                }
            }  
       } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st1 != null) st1.close();
            if(st2 != null) st2.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }
}
