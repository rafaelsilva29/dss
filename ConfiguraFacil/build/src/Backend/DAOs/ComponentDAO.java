
package Backend.DAOs;

import Backend.Business.Component;
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


public class ComponentDAO {
     private static ConnectionDB connDB;
     
     public ComponentDAO(){
         this.connDB = new ConnectionDB();
     }
     
     public Component getComponent(int id) throws Exception{
        Connection con = this.connDB.initConnection();
        Component comp = new Component();
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = con.prepareStatement("SELECT Name, Price, Quantity, Description, Rate FROM Component WHERE idComponent = ?");
            st.setInt(1,id);
            System.out.println("SQL: "+ st);
            rs = st.executeQuery();
            comp.setName(rs.getString("Name"));
            comp.setPrice(rs.getDouble("Price"));
            comp.setQuantity(rs.getInt("Quantity"));
            comp.setDescription(rs.getString("Description"));
            //comp.setRate(rs.getInt("Rate"));
            
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
            if (st != null) st.close();    
        }
        return comp;
    }
     
    public Boolean addComponent(Component comp) throws Exception{
        Connection con = this.connDB.initConnection();
        Boolean done = false;
        int rows = -1;
        
        ResultSet rs = null;
        
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        try{
            st1 = con.prepareStatement("SELECT Name, Compatibility FROM Component WHERE Name = ? AND Compatibility = ?");
            st1.setString(1,comp.getName());
            st1.setString(2,comp.getCompatibility());
            rs = st1.executeQuery();
            
            if(!rs.next()){
                st2 = con.prepareStatement("INSERT INTO Component (idComponent, Name, Price, Quantity, Description, Type, Compatibility) VALUES (default,?,?,?,?,?,?)");
                st2.setString(1,comp.getName());
                st2.setDouble(2,comp.getPrice());
                st2.setInt(3,comp.getQuantity());
                st2.setString(4, comp.getDescription());
                st2.setInt(5, comp.getType());
                st2.setString(6, comp.getCompatibility());
                rows = st2.executeUpdate();
                
                if(rows == 0){ throw new SQLException("Creating Component failed, no rows affected.");}
                else{ done=true; } 
            }
            
        }catch (SQLException ex) {
            System.err.print("Nao deu para add component");
            done = false;
            
        } finally{
            if (st1 != null) st1.close();
            if (st2 != null) st2.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
    public Boolean updateName(int compID, String name) throws Exception{
        Connection con = this.connDB.initConnection();
        PreparedStatement st = null;
        int rows = 0;
        Boolean done = false;
        try{
            st = con.prepareStatement("UPDATE Component SET Name = ? WHERE idComponent = ?");
            st.setString(1,name);
            st.setInt(2,compID);
            rows = st.executeUpdate();
            if (rows == 1) done = true;
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if (st != null) st.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
    public Boolean updatePrice(int compID, Double price) throws Exception{
        Connection con = this.connDB.initConnection();
        PreparedStatement st = null;
        int rows = 0;
        Boolean done = false;
        try{
            st = con.prepareStatement("UPDATE Component SET Price = ? WHERE idComponent = ?");
            st.setString(1,String.valueOf(price));
            st.setInt(2,compID);
            rows = st.executeUpdate();
            if (rows == 1) done = true;
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if (st != null) st.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
    public Boolean updateQuantity(int compID, int qnt) throws Exception{
        Connection con = this.connDB.initConnection();
        Boolean done = false;
        PreparedStatement st = null;
        int rows = 0;
        try{
            st = con.prepareStatement("UPDATE Component SET Quantity = Quantity+? WHERE idComponent = ?");
            st.setInt(1,qnt);
            st.setInt(2,compID);
            rows = st.executeUpdate();
            if (rows==1){done = true;}
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            System.err.print("Nao deu para add Stock");
            done = false;
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con); 
        }
        return done;
    }
    
    public Boolean updateDescription(int compID, String dsc) throws Exception{
        Connection con = this.connDB.initConnection();
        Boolean done = false;
        PreparedStatement st = null;
        int rows = 0;
        try{
            st = con.prepareStatement("UPDATE Component SET Description = ? WHERE idComponent = ?");
            st.setString(1,dsc);
            st.setInt(2,compID);
            rows = st.executeUpdate();
            if (rows==1){done = true;}
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
    /*public Boolean updateRate(int compID, int rate) throws Exception{
        Connection con = this.connDB.initConnection();
        Boolean done = false;
        PreparedStatement st = null;
        int rows = 0;
        try{
            st = con.prepareStatement("UPDATE Component SET Rate = ? WHERE idComponent = ?");
            st.setString(1,String.valueOf(rate));
            st.setInt(2,compID);
            rows = st.executeUpdate();
            if (rows==1){done = true;}
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
        }
        return done;
    } */
    
    public List<Component> allComponents() throws Exception{
        Connection con = this.connDB.initConnection();
        List<Component> resp = new ArrayList<Component>();
        ResultSet components = null;
        PreparedStatement st = null;
        
        try{
            st = con.prepareStatement("SELECT idComponent, Name, Price, Quantity, Description, Type, Compatibility from component");
            components = st.executeQuery();
            while(components.next()){
                int idComponent = components.getInt("idComponent");
                String name = components.getString("Name");
                double price = components.getDouble("Price");
                int quant = components.getInt("Quantity");
                String description = components.getString("Description");
                int type = components.getInt("Type");
                String compatibility = components.getString("Compatibility");
                resp.add(new Component(idComponent,name,price,quant,description,type,compatibility));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }   
    
    public List<Component> getComponentsByCompat(String compatibility) throws Exception{
        Connection con = this.connDB.initConnection();
        List<Component> resp = new ArrayList<Component>();
        ResultSet components = null;
        PreparedStatement st = null;
        
        try{
            st = con.prepareStatement("SELECT idComponent, Name, Price, Quantity, Description, Type, Compatibility from component WHERE Compatibility = ?");
            st.setString(1, compatibility);
            components = st.executeQuery();
            while(components.next()){
                int idComponent = components.getInt("idComponent");
                String name = components.getString("Name");
                double price = components.getDouble("Price");
                int quant = components.getInt("Quantity");
                String description = components.getString("Description");
                int type = components.getInt("Type");
                resp.add(new Component(idComponent,name,price,quant,description,type,compatibility));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }   
    
    public List<Component> getComponentsBy(String compatibility, int type) throws Exception{
        Connection con = this.connDB.initConnection();
        List<Component> resp = new ArrayList<Component>();
        ResultSet components = null;
        PreparedStatement st = null;
        
        try{
            st = con.prepareStatement("SELECT idComponent, Name, Price, Quantity, Description, Type, Compatibility from component WHERE (Compatibility = ? and Type = ? and Quantity > 0)");
            st.setString(1, compatibility);
            st.setInt(2, type);
            components = st.executeQuery();
            while(components.next()){
                int idComponent = components.getInt("idComponent");
                String name = components.getString("Name");
                double price = components.getDouble("Price");
                int quant = components.getInt("Quantity");
                String description = components.getString("Description");
                resp.add(new Component(idComponent,name,price,quant,description,type,compatibility));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }   
    
    public Boolean removeComponent(int idComponent) throws Exception{
        Connection con = this.connDB.initConnection();
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        PreparedStatement st4 = null;
        PreparedStatement st5 = null;
        ResultSet compcar = null;
        ResultSet compackge = null;
        
        Boolean done = false;
        int affectedRows = 0;
        
        try{
            con.setAutoCommit(false);
            
            st1 = con.prepareStatement("SELECT * FROM CompCar WHERE idComponent = ?");
            st1.setInt(1,idComponent);
            compcar = st1.executeQuery(); 
            
            if(compcar.next()){
                st2 = con.prepareStatement("DELETE FROM CompCar WHERE idComponent = ?");
                st2.setInt(1,idComponent);
                affectedRows = st2.executeUpdate(); 
                
                if(affectedRows == 0){ throw new SQLException("Deleting CompCar failed, no rows affected.");} 
            }
            
            st3 = con.prepareStatement("SELECT * FROM CompPackage WHERE idComponent = ?");
            st3.setInt(1,idComponent);
            compackge = st3.executeQuery(); 
            
            if(compackge.next()){
                st4 = con.prepareStatement("DELETE FROM CompPackage WHERE idComponent = ?");
                st4.setInt(1,idComponent);
                affectedRows = st4.executeUpdate(); 
                
                if(affectedRows == 0){ throw new SQLException("Deleting CompCar failed, no rows affected.");} 
            }
            
            st5 = con.prepareStatement("DELETE FROM Component WHERE idComponent = ?");
            st5.setInt(1,idComponent);
            affectedRows = st5.executeUpdate(); 
            
            if(affectedRows == 0){ throw new SQLException("Deleting Component failed, no rows affected.");} 
            else {done = true;} 
            con.commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            if (con != null){
                try{
                    System.err.print("Transaction Remove Component is being rolled back");
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
    
}
