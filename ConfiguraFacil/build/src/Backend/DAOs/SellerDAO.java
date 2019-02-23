
package Backend.DAOs;

import Backend.Business.Seller;
import Backend.Business.ConfiguraFacil;
import Backend.DAOs.ConnectionDB;
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


public class SellerDAO {
    
    private static ConnectionDB connDB;

    public SellerDAO(){
        this.connDB = new ConnectionDB();
    }
    
    public Seller getSeller(String username) throws Exception{
        Connection con = this.connDB.initConnection();
        Seller seller = new Seller();
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = con.prepareStatement("SELECT Name, Email, Phone, Address, NIB, NIF, SS, UserName FROM Seller WHERE Username = ?");
            st.setString(1,username);
            rs = st.executeQuery();
            if(rs.next()){
                String name = rs.getString("Name");
                String email = rs.getString("Email");
                String phone = rs.getString("Phone");
                String address = rs.getString("Address");
                String nib = rs.getString("NIB");
                String nif = rs.getString("NIF");
                String ss = rs.getString("SS");
                String user = rs.getString("Username");
                seller = new Seller(user, name, email, address, phone, nib, nif, ss);
            }
        }catch (SQLException ex) {
            System.out.println("Errork: "+ ex.getMessage());
            
        } finally{
            this.connDB.closeConnection(con);
            if (st != null) st.close();
        }
        return seller;
    }
    
    public Boolean addSeller(String username, String password, Seller emp) throws Exception{
        Connection con = this.connDB.initConnection();
        //int userID = 0;
        Boolean done = false;
        PreparedStatement st = null;
        PreparedStatement getID = null;
        PreparedStatement st2 = null;
        ResultSet rs1 = null;
        
        try{
            con.setAutoCommit(false);
            st = con.prepareStatement("INSERT INTO Users (Username, Password, Permission) VALUES (?,?,?);",st.RETURN_GENERATED_KEYS);
                st.setString(1,username);
                st.setString(2,password);
                st.setInt(3,1);
            int affectedRows = st.executeUpdate();
            if(affectedRows == 0){ throw new SQLException("Creating User failed, no rows affected.");}
            
            /*ResultSet generatedKey = st.getGeneratedKeys();
                if(generatedKey.next()){
                    userID = generatedKey.getInt(1);
                }*/
                
            st2 = con.prepareStatement("INSERT INTO Seller (idSeller, Name, Email, Phone, Address, NIB, NIF, SS, Username) VALUES (default,?,?,?,?,?,?,?,?);");
                st2.setString(1, emp.getName());
                st2.setString(2, emp.getEmail());
                st2.setString(3, emp.getPhone());
                st2.setString(4, emp.getAddress());
                st2.setString(5, emp.getNIB());
                st2.setString(6, emp.getNIF());
                st2.setString(7, emp.getSSocial());
                st2.setString(8, username);
            affectedRows = st2.executeUpdate();
            if(affectedRows == 0){ throw new SQLException("Creating User failed, no rows affected.");}
            else {done = true;}
            con.commit();
            
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            if (con != null){
                try{
                    System.err.print("Transaction Seller is being rolled back");
                    con.rollback();
                    
                    done = false;
                }catch(SQLException excep){
                    System.out.print(excep);
                    done = false;
                }
                
            }
            
        } finally{
            con.setAutoCommit(true);
            this.connDB.closeConnection(con);
            if(st!=null)    st.close();
            if(getID!=null) getID.close();
            if(st2!=null)   st2.close();
            if(rs1!=null)   rs1.close();
        }
        return done;
    }

    public Boolean updateSeller(String username, String name, String email, String phone, String address, String nib, String nif, String ss) throws Exception{
        Connection con = this.connDB.initConnection();
        PreparedStatement st = null;
        Boolean done = false;
        int affectedRows = 0;
        try{
            st = con.prepareStatement("UPDATE Seller SET Name = ?, Email = ?, Phone = ?, Address = ?, NIB = ?, NIF = ?, SS = ? WHERE Username = ?");
            st.setString(1,name);
            st.setString(2,email);
            st.setString(3,phone);
            st.setString(4,address);
            st.setString(5,nib);
            st.setString(6,nif);
            st.setString(7,ss);
            st.setString(8,username);
            affectedRows = st.executeUpdate();
            if(affectedRows == 0){ throw new SQLException("Update User failed, no rows affected.");} 
            else {done = true;} 
            
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            if (st != null) st.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
    public Boolean removeSeller(String username) throws Exception{
        Connection con = this.connDB.initConnection();
        PreparedStatement st = null;
        PreparedStatement st2 = null;
        Boolean done = false;
        int affectedRows = 0;
        try{
            con.setAutoCommit(false);
            st = con.prepareStatement("DELETE FROM Seller WHERE Username = ?");
            st.setString(1,username);
            affectedRows = st.executeUpdate(); 
            if(affectedRows == 0){ throw new SQLException("Deleting Seller failed, no rows affected.");} 
            
            st2 = con.prepareStatement("DELETE FROM Users WHERE Username = ?");
            st2.setString(1,username);
            affectedRows = st2.executeUpdate(); 
            if(affectedRows == 0){ throw new SQLException("Deleting User failed, no rows affected.");} 
            else {done = true;} 
            con.commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            if (con != null){
                try{
                    System.err.print("Transaction Remove Seller is being rolled back");
                    con.rollback(); 
                    done = false;
                }catch(SQLException excep){
                    System.out.print(excep);
                    done = false;
                }   
            }   
        } finally{
            con.setAutoCommit(true);
            if (st != null) st.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }

    public List<Seller> allSellers() throws Exception{
        Connection con = this.connDB.initConnection();
        List<Seller> resp = new ArrayList<Seller>();
        ResultSet sellers = null;
        PreparedStatement st = null;
        
        try{
            st = con.prepareStatement("SELECT Username as `Username`, Name as `NameSeller`, Email as `EmailSeller` FROM seller");
            sellers = st.executeQuery();
            while(sellers.next()){
                String Name = sellers.getString("NameSeller");
                String Username = sellers.getString("Username");
                String Email = sellers.getString("EmailSeller");
                resp.add(new Seller(Username,Email,Name));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
            if(st != null) st.close();
            return resp;
        }
    }   
}
