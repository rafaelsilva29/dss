
package Backend.DAOs;

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


public class PackageDAO {
    
     private static ConnectionDB connDB;
     
     public PackageDAO(){
         this.connDB = new ConnectionDB();
     }
     
     public Package getPackage(int id) throws Exception{
        Connection con = this.connDB.initConnection();
        Package pack = new Package();
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = con.prepareStatement("SELECT Name, Price, Description, Compatibility FROM Package WHERE idPackage = ?;");
            st.setInt(1,id);
            System.out.println("SQL: "+ st);
            rs = st.executeQuery();
            pack.setName(rs.getString("Name"));
            pack.setPrice(rs.getDouble("Price"));
            pack.setDescription(rs.getString("Description"));
            pack.setCompatibility(rs.getString("Compatibility"));
            
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if (st!=null) st.close();
            if (rs!=null) rs.close();
            this.connDB.closeConnection(con);
            
        }
        return pack;
    }
     
    public Boolean addPackage(Package pack) throws Exception{
        Connection con = this.connDB.initConnection();
        Boolean done = false;
        int rows = -1;
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        ResultSet rs = null;
        int packageID = -1;
        Map<Integer,Component> aux = new HashMap<Integer,Component>();
        
        try{
            con.setAutoCommit(false);
            System.out.println(pack.getName());
            System.out.println(pack.getCompatibility());
            st3 = con.prepareStatement("SELECT Name, Compatibility FROM Package WHERE Name = ? AND Compatibility = ?");
            st3.setString(1,pack.getName());
            st3.setString(2,pack.getCompatibility());
            rs = st3.executeQuery();
            
            if(!rs.next()){
                st1 = con.prepareStatement("INSERT INTO Package (idPackage, Name, Description, Price, Compatibility) VALUES (default,?,?,?,?)",st1.RETURN_GENERATED_KEYS);
                st1.setString(1,pack.getName());
                st1.setString(2,pack.getDescription());
                st1.setDouble(3, pack.getPrice());
                st1.setString(4, pack.getCompatibility());
                rows = st1.executeUpdate();
            
                if(rows == 0){ throw new SQLException("Creating Package failed, no rows affected.");}
            
                ResultSet generatedKey = st1.getGeneratedKeys();
                    if(generatedKey.next()){
                        packageID = generatedKey.getInt(1);
                }  
                
                aux.putAll(pack.getComponents());
              
                for(Component c : aux.values()){
                    st2 = con.prepareStatement("INSERT INTO CompPackage (idComponent, idPackage) VALUES (?,?)");
                    st2.setInt(1, c.getID());
                    st2.setInt(2, packageID);
                    rows = st2.executeUpdate();
                
                    if(rows == 0){ throw new SQLException("Creating PackageComponent failed, no rows affected.");}
                    else{ done=true; }
                }
            }
            con.commit();
            
        }catch (SQLException ex) {
            if (con != null){
                try{
                    System.err.print("Transaction add Package is being rolled back");
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
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
    public void updateName(int packID, String name) throws Exception{
        Connection con = this.connDB.initConnection();
        try{
            PreparedStatement st = con.prepareStatement("UPDATE Package SET Name = ? WHERE idPackage = ?");
            st.setString(1,name);
            st.setInt(2,packID);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
        }
    }
    
    public void updatePrice(int packID, Double price) throws Exception{
        Connection con = this.connDB.initConnection();
        try{
            PreparedStatement st = con.prepareStatement("UPDATE Package SET Price = ? WHERE idPackage = ?");
            st.setString(1,String.valueOf(price));
            st.setInt(2,packID);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
        }
    }
    
    public void updateDescription(int packID, String dsc) throws Exception{
        Connection con = this.connDB.initConnection();
        try{
            PreparedStatement st = con.prepareStatement("UPDATE Package SET Description = ? WHERE idPackage = ?");
            st.setString(1,dsc);
            st.setInt(2,packID);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
        }
    }   
    
     public List<Package> allPackages() throws Exception{
        Connection con = this.connDB.initConnection();
        List<Package> resp = new ArrayList<Package>();
        ResultSet packages = null;
        PreparedStatement st = null;
        
        try{
            st = con.prepareStatement("SELECT idPackage, Name, Description, Price, Compatibility from package");
            packages = st.executeQuery();
            while(packages.next()){
                int idPackage = packages.getInt("idPackage");
                String name = packages.getString("Name");
                String description = packages.getString("Description");
                double price = packages.getDouble("Price");
                String compatibility = packages.getString("Compatibility");
                resp.add(new Package(idPackage , name, description, price, compatibility));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }  
     
    public Package packageCompByName(String compatibility, String name) throws Exception{
        Connection con = this.connDB.initConnection();
        Package resp = new Package();
        Map<Integer,Component> components = new HashMap<Integer,Component>();
        
        ResultSet pack = null;
        ResultSet comp = null;
        
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        
        try{
            st1 = con.prepareStatement("SELECT idPackage, Name, Description, Price, Compatibility from Package WHERE Compatibility = ? AND Name = ?");
            st1.setString(1, compatibility);
            st1.setString(2,name);
            pack = st1.executeQuery();
            
            if(pack.next()){
                int idPackage = pack.getInt("idPackage");
                String packName = pack.getString("Name");
                String packDescr = pack.getString("Description");
                double packPrice = pack.getDouble("Price");
                String packCompa = pack.getString("Compatibility");
                
                st2 = con.prepareStatement("SELECT comp.idComponent, comp.Name, comp.Price, comp.Description, comp.Type, comp.Compatibility from Component as comp INNER JOIN CompPackage as compack ON compack.idComponent = comp.idComponent AND compack.idPackage = ?");
                st2.setInt(1, idPackage);
                comp = st2.executeQuery();
                
                while(comp.next()){
                    int idComponent = comp.getInt("idComponent");
                    String compName = comp.getString("Name");
                    double priceComp = comp.getDouble("Price");
                    String compDescr = comp.getString("Description");
                    int type = comp.getInt("Type");
                    String compa = comp.getString(("Compatibility"));
                    components.put(idComponent,new Component(idComponent,compName,priceComp,compDescr,type,compa));
                }
                
                resp = new Package(idPackage,packName,packDescr,packPrice,components,packCompa);
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
     
    public List<Package> allPackagesByCompatibility(String compatibility) throws Exception{
        Connection con = this.connDB.initConnection();
        List<Package> resp = new ArrayList<Package>();
        ResultSet packages = null;
        PreparedStatement st = null;
        
        try{
            st = con.prepareStatement("SELECT idPackage, Name, Description, Price, Compatibility from package WHERE Compatibility = ?");
            st.setString(1, compatibility);
            packages = st.executeQuery();
            while(packages.next()){
                int idPackage = packages.getInt("idPackage");
                String name = packages.getString("Name");
                String description = packages.getString("Description");
                double price = packages.getDouble("Price");
                resp.add(new Package(idPackage , name, description, price, compatibility));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if(st != null) st.close();
            this.connDB.closeConnection(con);
            return resp;
        }
    }  
     
     public Boolean removePackage(int idPackage) throws Exception{
        Connection con = this.connDB.initConnection();
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        PreparedStatement st4 = null;
        PreparedStatement st5 = null;
        ResultSet compackge = null;
        ResultSet packgecar = null;
        
        Boolean done = false;
        int affectedRows = 0;
        
        try{
            con.setAutoCommit(false);
            
            st1 = con.prepareStatement("SELECT * FROM CompPackage WHERE idPackage = ?");
            st1.setInt(1,idPackage);
            compackge = st1.executeQuery(); 
            
            if(compackge.next()){
                st2 = con.prepareStatement("DELETE FROM CompPackage WHERE idPackage = ?");
                st2.setInt(1,idPackage);
                affectedRows = st2.executeUpdate(); 
                
                if(affectedRows == 0){ throw new SQLException("Deleting CompPackage failed, no rows affected.");} 
            }
            
            st3 = con.prepareStatement("SELECT * FROM PackageCar WHERE idPackage = ?");
            st3.setInt(1,idPackage);
            packgecar = st3.executeQuery(); 
            
            if(packgecar.next()){
                st4 = con.prepareStatement("DELETE FROM CompPackage WHERE idPackage = ?");
                st4.setInt(1,idPackage);
                affectedRows = st4.executeUpdate(); 
                
                if(affectedRows == 0){ throw new SQLException("Deleting CompPackage failed, no rows affected.");} 
            }
            
            st5 = con.prepareStatement("DELETE FROM Package WHERE idPackage = ?");
            st5.setInt(1,idPackage);
            affectedRows = st5.executeUpdate(); 
            
            if(affectedRows == 0){ throw new SQLException("Deleting Package failed, no rows affected.");} 
            else {done = true;} 
            con.commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            if (con != null){
                try{
                    System.err.print("Transaction Remove Package is being rolled back");
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
