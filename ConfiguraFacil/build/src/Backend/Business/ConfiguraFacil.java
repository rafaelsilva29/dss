
package Backend.Business;

import Frontend.Login;
import Backend.DAOs.ConnectionDB;
import Backend.DAOs.UsersDAOs;
import Backend.DAOs.ComponentDAO;
import Backend.DAOs.*;
import Frontend.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.util.*;
import java.util.Properties;  
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.*;  
import javax.mail.Transport;
import javax.mail.Message;



public class ConfiguraFacil implements InterfaceFrontend{

    
    public ConfiguraFacil(){
        
    }
    
    public int login(String user, String pass){
        int res = 0;
        UsersDAOs users = new UsersDAOs();
        
        try {
           res = users.authenticate(user,pass);
            
        } catch (Exception ex) {
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }
    
    public Boolean changePassword(String username, String password) throws Exception{
        UsersDAOs userDAO = new UsersDAOs();
        Boolean done = userDAO.updatePassword(username, password);
        return done;
    }
    
    // ################################### Admin ###############################
    public Boolean addUser(String username, String name, String email, String phone, String address, String nib, String nif, String sSocial, int type) throws Exception{
        Boolean res = false; 
        String password = passwordGenerator(10);
        if (type == 2){
            try {
                Employee emp = new Employee(name,email,phone,address,nib,nif,sSocial);
                EmployeeDAO empDAO = new EmployeeDAO();
                res = empDAO.addEmployee(username, password, emp);   
            }catch (SQLException ex){
                Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
                res = false;
            }
        }
        else if (type == 1){
            try{  
                Seller s = new Seller(name,email,address,phone,nib,nif,sSocial);
                SellerDAO sDAO = new SellerDAO();
                res = sDAO.addSeller(username, password, s);
            }catch (SQLException ex){
               Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
               res = false;
            }
        }
        
        if(res){
            try{
                sendEmail(email,username, password);
            } catch(Exception e){
                System.out.println("Error" + e.getMessage());
            }     
        }
        
        return res;
    }
    
    public Boolean addComponent(Component component) throws Exception{
        Boolean res = true;
        try {
            ComponentDAO compDAO = new ComponentDAO();
            res = compDAO.addComponent(component);
        }catch(SQLException ex){
            Logger.getLogger(ConfiguraFacil.class.getName()).log(Level.SEVERE, null, ex);
            res = false;
        }
        return res;
    }
    
    public Boolean removeComponent(int idComponent) throws Exception{
        ComponentDAO componentDAO = new ComponentDAO();
        try{
           return componentDAO.removeComponent(idComponent);
        } catch(SQLException e){
            System.out.println("Error: " +e.getMessage());
            return false;  
        }
    }
    
    // ################################### SELLER ##############################
    
    // Generate a car 
    public Car generateCar(String brand, String model, double budget, double priceCar) throws Exception{
        CarDAO cardao = new CarDAO();
        Car car = new Car();
        car = cardao.generate(brand,model,budget,priceCar);
        return car;
    }
    
    // Get all Sellers
    public List<Seller> getAllSellers() throws Exception{
        SellerDAO sellerDAO = new SellerDAO();
        List<Seller> resp =  new ArrayList<Seller>();
        resp.addAll(sellerDAO.allSellers());
        return resp;    
    }
    
    // Get a Seller 
    public Seller getSeller(String username) throws Exception{
        SellerDAO sellerDAO = new SellerDAO();
        Seller seller = new Seller();
        seller = sellerDAO.getSeller(username);
        return seller;
    }
    
    // Update a Seller
    public Boolean updateSeller(String username, String name, String email, String phone, String address, String nib, String nif, String ss) throws Exception{
         SellerDAO sellerDAO = new SellerDAO();
         try{
             return sellerDAO.updateSeller(username, name, email, phone, address, nib, nif, ss);
             
         } catch(SQLException e){
             System.out.println("Error: " +e.getMessage());
             return false; 
         }
    }
    
    public Boolean removeSeller(String username) throws Exception{
        SellerDAO sellerDAO = new SellerDAO();
        try{
           return sellerDAO.removeSeller(username);
         } catch(SQLException e){
            System.out.println("Error: " +e.getMessage());
            return false;  
         }
    }
    
    public boolean checkClientID(String nif) throws Exception{
        ClientDAO clientDAO = new ClientDAO();
        try{
           return clientDAO.checkClientID(nif);
         } catch(SQLException e){
            System.out.println("Error: " +e.getMessage());
            return false;  
        }
    }
    
    public List<Order> getAllOrders() throws Exception{
        OrderDAO orderDAO = new OrderDAO();
        List<Order> resp =  new ArrayList<Order>();
        resp.addAll(orderDAO.allOrders());
        return resp;
    }
    
    public List<Order> getAllOrdersBySellerID(String sellerID) throws Exception{
        OrderDAO orderDAO = new OrderDAO();
        List<Order> resp =  new ArrayList<Order>();
        resp.addAll(orderDAO.allOrdersBySellerID(sellerID));
        return resp;
    }
    
    public Car getCarByID(int idCar) throws Exception{
        CarDAO carDAO = new CarDAO();
        return carDAO.getCar(idCar);
    }
    
    public boolean addNewOrder(Order order) throws Exception{
        OrderDAO orderDAO = new OrderDAO();
        try{
            return orderDAO.addOrder(order);
        }catch(SQLException e){
             System.out.println("Error: " +e.getMessage());
             return false; 
        }
    }
    
    public List<String> checkNewOrder(Order order) throws Exception{
        OrderDAO orderDAO = new OrderDAO();
        try{
            return orderDAO.checkOrder(order);
        }catch(SQLException e){
             System.out.println("Error: " +e.getMessage());
             return new ArrayList<>(); 
        }
    }
    
    
    // ################################### EMPLOYEE ############################
    
    
    // Update stock no menu do employee
    public Boolean updateStock (int compID, int qnt) throws Exception{
        Boolean done;
        ComponentDAO compDAO = new ComponentDAO();
        done = compDAO.updateQuantity(compID, qnt);
        return done;
    }
    
    // Get all Employees
    public List<Employee> getAllEmployees() throws Exception{
        EmployeeDAO employeeDAO = new  EmployeeDAO();
        List<Employee> resp =  new ArrayList<Employee>();
        resp.addAll(employeeDAO.allEmployees());
        return resp;    
    }
    
    // Get a Employee 
    public Employee getEmployee(String username) throws Exception{
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee employee = new Employee();
        
        employee = employeeDAO.getEmployee(username);
        
        return employee;
    }
    
    // Update a Emoloyee
    public Boolean updateEmployee(String username, String name, String email, String phone, String address, String nib, String nif, String ss) throws Exception{
         EmployeeDAO employeeDAO = new EmployeeDAO();
         try{
             return employeeDAO.updateEmployee(username, name, email, phone, address, nib, nif, ss);
         } catch(SQLException e){
             System.out.println("Error: " +e.getMessage());
             return false; 
         }
    }
    
     public Boolean removeEmployee(String username)  throws Exception{
        EmployeeDAO employeeDAO = new EmployeeDAO();
        try{
            return employeeDAO.removeEmployee(username);
         } catch(SQLException e){
            System.out.println("Error: " +e.getMessage());
            return false;  
         }
    }
     
    // ################################### Component / Packages ############################
     
    // Get all Components
    public List<Component> getAllComponents() throws Exception{
        ComponentDAO componentDAO = new  ComponentDAO();
        List<Component> resp =  new ArrayList<Component>();
        resp.addAll(componentDAO.allComponents());
        return resp;    
    } 
    
    // Get componet by compability
    public List<Component> getCompentsByComp(String compatability) throws Exception{
        ComponentDAO componentDAO = new  ComponentDAO();
        List<Component> resp =  new ArrayList<Component>();
        resp.addAll(componentDAO.getComponentsByCompat(compatability));
        return resp;
    }
    
    // Get component by compatibility and type and stock
    public List<Component> getComponentBy(String compatibility, int type) throws Exception{
        ComponentDAO compDAO = new ComponentDAO();
        List<Component> resp = new ArrayList<Component>();
        resp.addAll(compDAO.getComponentsBy(compatibility, type));
        return resp;
    }
    
    // Add a package
    public Boolean addPackage(Package packag) throws Exception{
        PackageDAO packageDAO = new PackageDAO();
        try{
            return packageDAO.addPackage(packag);
         } catch(SQLException e){
            System.out.println("Error: " +e.getMessage());
            return false;  
         }
    }
    
    // Get all Packages
    public List<Package> getAllPackages() throws Exception{
        PackageDAO packageDAO = new PackageDAO();
        List<Package> resp =  new ArrayList<Package>();
        resp.addAll(packageDAO.allPackages());
        return resp;    
    } 
    
    // Get all Packages by compatibility
    public List<Package> getPackagesByCompatibility(String compatibility) throws Exception{
        PackageDAO packageDAO = new PackageDAO();
        List<Package> resp =  new ArrayList<Package>();
        resp.addAll(packageDAO.allPackagesByCompatibility(compatibility));
        return resp;    
    } 
    
    // Remove a Package
    public Boolean removePackage(int idPackage) throws Exception{
        PackageDAO packageDAO = new PackageDAO();
        try{
            return packageDAO.removePackage(idPackage);
         } catch(SQLException e){
            System.out.println("Error: " +e.getMessage());
            return false;  
         }
    }
    
    // Get package by name and compatibility
    public Package getPackageNameComp(String compatibility, String name) throws Exception{
        PackageDAO packageDAO = new PackageDAO();
        try{
            return packageDAO.packageCompByName(compatibility, name);
         } catch(SQLException e){
            System.out.println("Error: " +e.getMessage());
            return new Package();
         }
    }

    
    
    // ################################### AUXILIAR FUNCTIONS ############################
    
    // Password generator
    private String passwordGenerator(int length){
        String charCategories = "abcdefghijklmnopqrstuvxz0123456789!#$&?.ABCDEFGHIJKLMNOPKRSTUVXZ";
       
        StringBuilder sb = new StringBuilder();
        
        Random random = new Random(System.nanoTime());

        for (int i = 0; i < length; i++) {
            int k = random.nextInt(charCategories.length()-1);  
            sb.append(charCategories.charAt(k));
        }
        
        String result = sb.toString();
        
        return result;
    }
    
     // Sending email with pass
    public void sendEmail(String to, String username, String pass) throws Exception{
        String from = "configuraFacil@outlook.com";
        String password = "configura2018";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "outlook.office365.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, password);
                }
        });

        try {
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Information Account ConfiguraFacil");
            message.setText("Do not reply to this message...\n\nUsername: " +username+ "\n\n" + "Password: " +pass);

            Transport.send(message);

            System.out.println("Mail has been sent successfully...");

        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }      
    }
}
