
package Backend.DAOs;

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


public class UsersDAOs {
    
    private static ConnectionDB connDB;
    
    public UsersDAOs(){
        this.connDB = new ConnectionDB();
    }
    
    public int authenticate(String user, String pass) throws Exception{
        int res = 0;
        Connection con = this.connDB.initConnection();
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Username, Password, Permission from Users");
            
            while(rs.next()){  
                if(rs.getString(1).equals(user) && rs.getString(2).equals(pass)){
                    res = Integer.parseInt(rs.getString(3));
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
        }
        return res;
    }
    
    public Boolean updatePassword (String username, String password) throws Exception{
        Boolean done = false;
        int rows = 0;
        PreparedStatement st = null;
        Connection con = this.connDB.initConnection();
        
        try{
            st = con.prepareStatement("UPDATE Users SET Password = ? WHERE Username = ?");
                st.setString(1,password);
                st.setString(2,username);
            rows = st.executeUpdate();
            if(rows==1)done = true;
        } catch (SQLException ex){
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            done = false;
        }finally {
            if (st != null) st.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
}
