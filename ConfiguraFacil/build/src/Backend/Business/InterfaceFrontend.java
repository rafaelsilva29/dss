
package Backend.Business;

import java.util.List;
import java.util.Map;


public interface InterfaceFrontend {

   
    // ################################### Geral ###############################  
    public Boolean changePassword(String username, String password) throws Exception;
    
    public int login(String name, String pass);
    
    
    // ################################### Admin ###############################
    
    // Adiciona um user
    public Boolean addUser(String username, String name, String email, String phone, String address, String nib, String nif, String sSocial, int type) throws Exception;
    
   
    
    // ################################### SELLER ##############################
    
    // Get all Sellers
    public List<Seller> getAllSellers() throws Exception;
    
    // Get a Seller 
    public Seller getSeller(String username) throws Exception;
    
    // Update a Seller
    public Boolean updateSeller(String username, String name, String email, String phone, String address, String nib, String nif, String ss) throws Exception;
    
    // Remove a Seller
    public Boolean removeSeller(String username) throws Exception;
    
    // Retorna a client
    public boolean checkClientID(String nif) throws Exception;
    
    // Get all orders
    public List<Order> getAllOrders() throws Exception;
    
    // Get order by String sellerID
    public List<Order> getAllOrdersBySellerID(String sellerID) throws Exception;
    
    // View car
    public Car getCarByID(int idCar) throws Exception;
    
    // Add New Order
    public boolean addNewOrder(Order order) throws Exception;
    
    // Generate a random car
    public Car generateCar(String brand, String model, double budget, double priceCar) throws Exception;
    
    // check if a orde can be submit
    public List<String> checkNewOrder(Order order) throws Exception;
    
    // ################################### EMPLOYEE ############################
    // o employee dá update ao stock
    public Boolean updateStock (int compID, int qnt) throws Exception;
    
    // Get all Employees
    public List<Employee> getAllEmployees() throws Exception;
    
    // Get a Employee 
    public Employee getEmployee(String username) throws Exception;
    
    // Update a Employee
    public Boolean updateEmployee(String username, String name, String email, String phone, String address, String nib, String nif, String ss) throws Exception;
    
    // Remove a Employee
    public Boolean removeEmployee(String username) throws Exception;
    
    // ################################### COMPONENTS & PACKAGES ############################
    
    // Get all Components
    public List<Component> getAllComponents() throws Exception;
    
     // Add Component
    public Boolean addComponent(Component c) throws Exception;
    
    // Remove a Component
    public Boolean removeComponent(int idComponent) throws Exception;
    
    // Get list of components by compatability
    public List<Component> getCompentsByComp(String compatability) throws Exception;
    
    // Get list of components by compatability, type and with stock
    public List<Component> getComponentBy(String compatibility, int type) throws Exception;
    
    // Add a package
    public Boolean addPackage(Package packag) throws Exception;
    
    // Get all Packages
    public List<Package> getAllPackages() throws Exception;
    
    // Remove a Package
    public Boolean removePackage(int idPackage) throws Exception;
    
    // Get Packages by compatibility
    public List<Package> getPackagesByCompatibility(String compatibility) throws Exception;
    
    // Get package by name and compatibility
    public Package getPackageNameComp(String compatibility, String name) throws Exception;
}
