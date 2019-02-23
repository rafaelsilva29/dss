
package Backend.DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.Version;
import java.util.*;
import java.sql.Time;


public class ConnectionDB{
    
    private static Connection con;
    private static String local;
    private static String port;
    private static String nameDB;
    private static String user;
    private static String pass;
    
    public ConnectionDB(){
        this.local = "127.0.0.1";
        this.port = "3306";
        this.nameDB = "configuraFacil_DB";
        this.user = "root";
        this.pass = "pass123";
    }
    
    // Vai buscar a conexão criada com a DB
    public Connection getConnection(){
        return this.con;
    }
   
    // Inicia a conexão com a base de dados
    public Connection initConnection() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://" +this.local+ ":" +this.port+ "/" +this.nameDB+ "?user=" +this.user+ "&password="+this.pass);
            System.out.println("Connected to configuraFacil_DB..");
            return this.con;
            
        } catch(Exception e){
            System.out.println("Error:" +e.getMessage());
            return null;
        }  
    }
    
    // Fechar a conexão com a DB criada
    public void closeConnection(Connection c) throws Exception{
        try{
            if (c != null) {
                c.close();
                System.out.println("Closed connection to configuraFacil_DB..\n");
            }
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.WARNING, ex.getMessage(), ex);
        }
    }
}
