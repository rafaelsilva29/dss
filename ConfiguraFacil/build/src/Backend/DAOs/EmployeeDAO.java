
package Backend.DAOs;

import Backend.Business.Employee;
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

public class EmployeeDAO
{
    private static ConnectionDB connDB;

    public EmployeeDAO(){
        this.connDB = new ConnectionDB();
    }

  public Employee getEmployee(String username) throws Exception{
        Connection con = this.connDB.initConnection();
        Employee employee = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = con.prepareStatement("SELECT Name, Email, Phone, Address, NIB, NIF, SS, UserName FROM Employee WHERE Username = ?");
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
                employee = new Employee(user, name, email, address, phone, nib, nif, ss);
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
            
        } finally{
            this.connDB.closeConnection(con);
            if (st != null) st.close();
        }
        return employee;
    }

    public Boolean addEmployee(String username, String password, Employee emp) throws Exception{
        Connection con = this.connDB.initConnection();
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
            st.setInt(3,2);
            int affectedRows = st.executeUpdate();
            if(affectedRows == 0){ throw new SQLException("Creating User failed, no rows affected.");}
            
            /*ResultSet generatedKey = st.getGeneratedKeys();
                if(generatedKey.next()){
                    userID = generatedKey.getInt(1);
                }  */  
            st2 = con.prepareStatement("INSERT INTO Employee (idEmployee, Name, Email, Phone, Address, NIB, NIF, SS, Username) VALUES (default,?,?,?,?,?,?,?,?);");
                st2.setString(1, emp.getName());
                st2.setString(2, emp.getEmail());
                st2.setString(3, emp.getPhone());
                st2.setString(4, emp.getAddress());
                st2.setString(5, emp.getNIB());
                st2.setString(6, emp.getNIF());
                st2.setString(7, emp.getSSocial());
                st2.setString(8, username);
            st2.executeUpdate();
            done = true;
            con.commit();
            
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
            if(st!=null)    st.close();
            if(getID!=null) getID.close();
            if(st2!=null)   st2.close();
            if(rs1!=null)   rs1.close();
        }
        return done;
    }
    
    public Boolean updateEmployee(String username, String name, String email, String phone, String address, String nib, String nif, String ss) throws Exception{
        Connection con = this.connDB.initConnection();
        PreparedStatement st = null;
        int affectedRows = 0;
        Boolean done = false;
        try{
            st = con.prepareStatement("UPDATE Employee SET Name = ?, Email = ?, Phone = ?, Address = ?, NIB = ?, NIF = ?, SS = ? WHERE Username = ?");
            st.setString(1,name);
            st.setString(2,email);
            st.setString(3,phone);
            st.setString(4,address);
            st.setString(5,nib);
            st.setString(6,nif);
            st.setString(7,ss);
            st.setString(8,username);
            affectedRows = st.executeUpdate();
            if(affectedRows == 0) {throw new SQLException("Update Employee failed, no rows affected.");}
            else {done = true;}
        }catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            done = false;  
        } finally{
            if (st != null) st.close();
            this.connDB.closeConnection(con);
        }
        return done;
    }
    
    public Boolean removeEmployee(String username) throws Exception{
        Connection con = this.connDB.initConnection();
        PreparedStatement st = null;
        PreparedStatement st2 = null;
        Boolean done = false;
        int affectedRows = 0;
        try{
            con.setAutoCommit(false);
            st = con.prepareStatement("DELETE FROM Employee WHERE Username = ?");
            st.setString(1,username);
            affectedRows = st.executeUpdate(); 
            if(affectedRows == 0){ throw new SQLException("Delete Employee failed, no rows affected.");} 
            
            st2 = con.prepareStatement("DELETE FROM Users WHERE Username = ?");
            st2.setString(1,username);
            affectedRows = st2.executeUpdate(); 
            if(affectedRows == 0){ throw new SQLException("Delete User failed, no rows affected.");} 
            else {done = true;} 
            con.commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            if (con != null){
                try{
                    System.err.print("Transaction Remove Employee is being rolled back");
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
   
    public List<Employee> allEmployees() throws Exception{
        Connection con = this.connDB.initConnection();
        List<Employee> resp = new ArrayList<Employee>();
        ResultSet employees = null;
        
        try{
            PreparedStatement st = con.prepareStatement("SELECT Username as `Username`, Name as `NameEmployee`, Email as `EmailEmployee` FROM employee");
            employees = st.executeQuery();
            while(employees.next()){
                String Name = employees.getString("NameEmployee");
                String Username = employees.getString("Username");
                String Email = employees.getString("EmailEmployee");
                resp.add(new Employee(Username,Email,Name));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            this.connDB.closeConnection(con);
            return resp;
        }
    }
}