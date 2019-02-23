
package Backend.DAOs;

import Backend.Business.Admin;
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

public class AdminDAO
{
    private static ConnectionDB connDB;

    public AdminDAO(){
        this.connDB = new ConnectionDB();
    }

    public Admin getAdmin(String username) throws Exception{
        Connection con = this.connDB.initConnection();
        Admin adm = new Admin();
        try{
            PreparedStatement st = con.prepareStatement("SELECT Username,idUser, a.idAmin, a.Email FROM Users INNER JOIN Admin AS a WHERE Username == a.?");
            st.setString(1,username);
            ResultSet rs = st.executeQuery();
            adm.setUserID(rs.getString("idUser")); 
            adm.setAdminID(rs.getString("idAdmin"));
            adm.setUsername(rs.getString("Username"));
            adm.setEmail(rs.getString("Email"));
            adm.setPassword(rs.getString("Password"));
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
            
        }
        return adm;
    }

    public Boolean addAdmin(String username, String password, Admin adm) throws Exception{
        Connection con = this.connDB.initConnection();
        String userID;
        Boolean done = false;
        
        try{
            con.setAutoCommit(false);
            PreparedStatement st = con.prepareStatement("INSERT INTO Users (Username, Password, Permission) VALUES (?,?,?)");
                st.setString(1,username);
                st.setString(2,password);
                st.setInt(3,2);
            st.executeUpdate();
            
            PreparedStatement getID = con.prepareStatement("SELECT idUsers FROM Users WHERE Username = '?'");
                getID.setString(1,username);
            ResultSet rs1 = getID.executeQuery();
            userID = rs1.getString("idUsers");
            
            PreparedStatement st2 = con.prepareStatement("INSERT INTO Employee (idAdmin, idUsers) VALUES (default,?)");
                st2.setString(2, adm.getEmail());
                st2.setString(8, userID);
            st2.executeUpdate();
            
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            if (con != null){
                try{
                    System.err.print("Transaction Employee is being rolled back");
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
            done = true;
        }
        return done;
    }

    public void updateEmail(String idUser, String email) throws Exception{
        Connection con = this.connDB.initConnection();
        try{
            PreparedStatement st = con.prepareStatement("UPDATE Admin SET Email = ? WHERE idUsers = ?");
            st.setString(1,email);
            st.setString(2,idUser);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
        }
    }

}