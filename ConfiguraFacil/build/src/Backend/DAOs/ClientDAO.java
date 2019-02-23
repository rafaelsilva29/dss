
package Backend.DAOs;

import Backend.Business.Client;
import Backend.Business.ConfiguraFacil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientDAO {
  
     private static ConnectionDB connDB;
     
     public ClientDAO(){
         this.connDB = new ConnectionDB();
     }
     
     public boolean checkClientID(String idClient) throws Exception{
        Connection con = this.connDB.initConnection();
        boolean flag = false;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            st = con.prepareStatement("SELECT NIF, Name, Address, Phone FROM Client WHERE NIF = ?");
            st.setString(1,idClient);
            rs = st.executeQuery();
            if(rs.next()){
                flag = true;
            }   
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            flag = false;
            
        } finally{
            if (st!=null) st.close();
            if (rs!=null) rs.close();
            this.connDB.closeConnection(con);  
        }
        return flag;
    }
}
