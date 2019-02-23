
package Backend.DAOs;

import Backend.Business.Car;
import Backend.Business.Component;
import Backend.Business.Package;
import Backend.DAOs.ConnectionDB;
import Backend.Business.ConfiguraFacil;
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


public class CarDAO {
    
     private static ConnectionDB connDB;
     
    public CarDAO(){
        this.connDB = new ConnectionDB();
     }
     
    public int addCar(Car car) throws Exception{
        Connection con = this.connDB.initConnection();
        int rows = -1;
        
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        
        int idCar = -1;
        Map<Integer,Component> components = new HashMap<Integer,Component>();
        Map<Integer,Package> pack = new HashMap<Integer,Package>();
        
        try{
            con.setAutoCommit(false);
            
            st1 = con.prepareStatement("INSERT INTO Car (idCar, Brand, Model) VALUES (default,?,?,?)",st1.RETURN_GENERATED_KEYS);
            st1.setString(1,car.getBrand());
            st1.setString(2,car.getModel());
            rows = st1.executeUpdate();
            
            if(rows == 0){ throw new SQLException("Creating Car failed, no rows affected.");}
            
            ResultSet generatedKey = st1.getGeneratedKeys();
                if(generatedKey.next()){
                    idCar = generatedKey.getInt(1);
            }  
                
            components.putAll(car.getComponets());
              
            for(Component c : components.values()){
                st2 = con.prepareStatement("INSERT INTO CompCar (idComponent, idCar) VALUES (?,?)");
                st2.setInt(1, c.getID());
                st2.setInt(2,idCar);
                rows = st2.executeUpdate();
                
                if(rows == 0){ idCar=-1; throw new SQLException("Creating CompCar failed, no rows affected.");}
            }
            
            pack.putAll(car.getPackages());
            
            for(Package p : pack.values()){
                st3 = con.prepareStatement("INSERT INTO PackageCar (idPackage, idCar) VALUES (?,?)");
                st3.setInt(1, p.getPackageID());
                st3.setInt(2, idCar);
                rows = st3.executeUpdate();
                
                if(rows == 0){ idCar=-1; throw new SQLException("Creating PackageCar failed, no rows affected."); }
            }
  
            con.commit();
            
        }catch (SQLException ex) {
           if (con != null){
                try{
                    System.err.print("Transaction addCar is being rolled back");
                    con.rollback(); 
                    idCar = -1;
                }catch(SQLException excep){
                    System.out.print(excep);
                   idCar = -1;
                }   
            }   
            
        } finally{
            if (st1 != null) st1.close();
            if (st2 != null) st2.close();
            if (st3 != null) st3.close();
            this.connDB.closeConnection(con);
        }
        return idCar;
    }
    
    public Boolean removeCar(int idCar) throws Exception{
        Connection con = this.connDB.initConnection();
        
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        PreparedStatement st4 = null;
        PreparedStatement st5 = null;
        
        ResultSet compcar = null;
        ResultSet packgecar = null;
        
        Boolean done = false;
        int affectedRows = 0;
        
        try{
            con.setAutoCommit(false);
            
            st1 = con.prepareStatement("SELECT * FROM CompCar WHERE idCar = ?");
            st1.setInt(1,idCar);
            compcar = st1.executeQuery(); 
            
            if(compcar.next()){
                st2 = con.prepareStatement("DELETE FROM CompCar WHERE idCar = ?");
                st2.setInt(1,idCar);
                affectedRows = st2.executeUpdate(); 
                
                if(affectedRows == 0){ throw new SQLException("Deleting CompCar failed, no rows affected.");} 
            }
            
            st3 = con.prepareStatement("SELECT * FROM PackageCar WHERE idCar = ?");
            st3.setInt(1,idCar);
            packgecar = st3.executeQuery(); 
            
            if(packgecar.next()){
                st4 = con.prepareStatement("DELETE FROM CompPackage WHERE idCar = ?");
                st4.setInt(1,idCar);
                affectedRows = st4.executeUpdate(); 
                
                if(affectedRows == 0){ throw new SQLException("Deleting CompPackage failed, no rows affected.");} 
            }
            
            st5 = con.prepareStatement("DELETE FROM Car WHERE idCar = ?");
            st5.setInt(1,idCar);
            affectedRows = st5.executeUpdate(); 
            
            if(affectedRows == 0){ throw new SQLException("Deleting Car failed, no rows affected.");} 
            else {done = true;} 
            con.commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            if (con != null){
                try{
                    System.err.print("Transaction Remove Car is being rolled back");
                    con.rollback(); 
                    done = false;
                }catch(SQLException excep){
                    System.out.print(excep);
                    done = false;
                }   
            }   
        } finally{
            con.setAutoCommit(true);
            if (st1 != null) st1.close();
            if (st2 != null) st2.close();
            if (st3 != null) st3.close();
            if (st4 != null) st4.close();
            if (st5 != null) st5.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
     public Car getCar(int idCar) throws Exception{
        Connection con = this.connDB.initConnection();
        Car resp = new Car();
        
        ResultSet car = null;
        ResultSet component = null;
        ResultSet pack = null;
        
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        PreparedStatement st4 = null;
        
        Map<Integer,Component> components = new HashMap<Integer,Component>();
        Map<Integer,Package> packages = new HashMap<Integer,Package>();
        
        try{
            st1 = con.prepareStatement("SELECT idCar, Brand, Model FROM Car WHERE idCar = ?");
            st1.setInt(1,idCar);
            car = st1.executeQuery();
  
            if(car.next()){
                String brand = car.getString("Brand");
                String model = car.getString("Model");
                
                st2 = con.prepareStatement("SELECT comp.idComponent, comp.Name, comp.Description, comp.Price FROM Component as comp INNER JOIN CompCar as compcar ON comp.idComponent = compcar.idComponent AND compcar.idCar = ?");
                st2.setInt(1,idCar);
                component = st2.executeQuery();
                
                while(component.next()){
                    String name = component.getString("Name");
                    String desc = component.getString("Description");
                    double price = component.getDouble("Price");
                    int idComponent = component.getInt("idComponent");
                    components.put(idComponent,new Component(idComponent,name,desc,price));    
                }
                
                st3 = con.prepareStatement("SELECT pack.idPackage, pack.Name, pack.Description, pack.Price FROM Package as pack INNER JOIN PackageCar as packcar ON pack.idPackage = packcar.idPackage AND packcar.idCar = ?");
                st3.setInt(1,idCar);
                pack = st3.executeQuery();
                
                while(pack.next()){
                    String name = pack.getString("Name");
                    String desc = pack.getString("Description");
                    double price = pack.getDouble("Price");
                    int idPackage = pack.getInt("idPackage");
                    packages.put(idPackage,new Package(idPackage,name,desc,price));   
                }
                
                resp = new Car(brand,model,components,packages);
            }
                   
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st1 != null) st1.close();
            if(st2 != null) st2.close();
            if(st3 != null) st3.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }   
     
    public Car generate(String brand, String model, double budget, double priceCar) throws Exception{
        Connection con = this.connDB.initConnection();
        Car car = new Car();
        double priceCarFinal = 0;
        priceCarFinal = priceCarFinal + priceCar;
        
        ResultSet typeMain = null;
        ResultSet compMain = null;
        ResultSet typePlus = null;
        ResultSet compPlus = null;
        
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        PreparedStatement st4 = null;
        
        List<Integer> typesMain = new ArrayList<Integer>();
        List<Integer> typesPlus = new ArrayList<Integer>();

        Map<Integer,Component> componentsMain = new HashMap<Integer,Component>();
        Map<Integer,Component> componentsPlus = new HashMap<Integer,Component>();
        
        Map<Integer,Component> componentsFinal = new HashMap<Integer,Component>();
        Map<Integer,Package> packages = new HashMap<Integer,Package>();
        
        try{
            st1 = con.prepareStatement("SELECT DISTINCT Type FROM Component WHERE Compatibility = ? AND (Type = 1 OR Type = 2 OR Type = 3 OR Type = 4 OR Type = 7 OR Type = 8 OR Type = 12) ORDER BY Type ASC");
            st1.setString(1,brand);
            typeMain = st1.executeQuery();
            
            while(typeMain.next()){
                int ty = typeMain.getInt("Type");
                typesMain.add(ty);
            }
            
            st2 = con.prepareStatement("SELECT idComponent, Name, Price, Quantity, Description, Type, Compatibility FROM Component WHERE Compatibility = ? AND (Type = 1 OR Type = 2 OR Type = 3 OR Type = 4 OR Type = 7 OR Type = 8 OR Type = 12) ORDER BY Type ASC");
            st2.setString(1,brand);
            compMain = st2.executeQuery();
            
            while(compMain.next()){
                int idComp = compMain.getInt("idComponent");
                String name = compMain.getString("Name");
                double price = compMain.getDouble("Price");
                String desc = compMain.getString("Description");
                int ty = compMain.getInt("Type");
                String compat = compMain.getString("Compatibility");
                componentsMain.put(idComp, new Component(idComp,name,price,desc,ty,compat));
            }
                
            for(Integer ty : typesMain){
                Component c = lowCostType(componentsMain,ty);
                double priceComp = c.getPrice();
                priceCarFinal = priceCarFinal + priceComp;
                if(priceCarFinal < budget){
                    componentsFinal.put(c.getID(), c); 
                } else{
                    priceCarFinal = priceCarFinal - priceComp;
                    break;
                }
            }
            
            // Get components plus
            
            if(budget > priceCarFinal){
                 st3 = con.prepareStatement("SELECT DISTINCT Type FROM Component WHERE Compatibility = ? AND (Type = 5 OR Type = 6 OR Type = 9 OR Type = 10 OR Type = 11 OR Type = 13 OR Type = 14 OR Type = 15) ORDER BY Type ASC");
                 st3.setString(1,brand);
                 typePlus = st3.executeQuery();
              
                 
                 while(typePlus.next()){
                    int ty = typePlus.getInt("Type");
                    typesPlus.add(ty);
                 }
                 
                 st4 = con.prepareStatement("SELECT idComponent, Name, Price, Quantity, Description, Type, Compatibility FROM Component WHERE Compatibility = ? AND (Type = 5 OR Type = 6 OR Type = 9 OR Type = 10 OR Type = 11 OR Type = 13 OR Type = 14 OR Type = 15) ORDER BY Type ASC");
                 st4.setString(1,brand);
                 compPlus = st4.executeQuery();
            
                 while(compPlus.next()){
                     int idComp = compPlus.getInt("idComponent");
                     String name = compPlus.getString("Name");
                     double price = compPlus.getDouble("Price");
                     String desc = compPlus.getString("Description");
                     int ty = compPlus.getInt("Type");
                     String compat = compPlus.getString("Compatibility");
                     componentsPlus.put(idComp, new Component(idComp,name,price,desc,ty,compat));
                 }
                 
                 for(Integer ty : typesPlus){
                    Component c = lowCostType(componentsPlus,ty);
                    double priceComp = c.getPrice();
                    priceCarFinal = priceCarFinal + priceComp;
                    if(priceCarFinal < budget){
                        componentsFinal.put(c.getID(), c); 
                    } else{
                        priceCarFinal = priceCarFinal - priceComp;
                        break;
                    }
                }
            }
            
            car = new Car(brand,model,componentsFinal,new HashMap<Integer,Package>());
                
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st1 != null) st1.close();
            if(st2 != null) st2.close();
            if(st3 != null) st3.close();
            if(st4 != null) st4.close();
            this.connDB.closeConnection(con);
            return car;
        }
    }
    
    private Component lowCostType(Map<Integer,Component> components, int type){
        Map<Integer,Component> auxComp = new HashMap<Integer,Component>();
        Component comp = new Component();
        comp.setPrice(999999999);
        
        for(Component c : components.values()){
            if(c.getType() == type){    
                auxComp.put(c.getID(), c);
            }
        }
        
        for(Component c : auxComp.values()){
            if(c.getPrice() <= comp.getPrice()){
                comp = c;
            }
        }
        
        return comp;
    }
}
