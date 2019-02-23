package Backend.Business;

public class Employee
{
    private String userID; // é u username
    private String name;
    private String email;
    private String phone;
    private String address;
    private String nib;
    private String nif;
    private String sSocial;

    public Employee(Employee emp){
        emp.clone();
    }
    
    public Employee(String userID, String mail, String name){
        this.userID    = userID;
        this.name      = name;
        this.email      = mail;
    }
    
    public Employee (){
        this.userID  = "Default";
        this.name    = "Default";
        this.email   = "Default";
        this.phone   = "Default";
        this.address = "Default";
        this.nib     = "Default";
        this.nif     = "Default";
        this.sSocial = "Default";
    }

    public Employee( String userID, String name, String email, String phone, String address, String nib, String nif, String sSocial){
        this.userID  = userID;
        this.name    = name;
        this.email   = email;
        this.phone   = phone;
        this.address = address;
        this.nib     = nib;
        this.nif     = nif;
        this.sSocial = sSocial;  
    }
    
    public Employee(String name, String email, String phone, String address, String nib, String nif, String sSocial){
        this.name    = name;
        this.email   = email;
        this.phone   = phone;
        this.address = address;
        this.nib     = nib;
        this.nif     = nif;
        this.sSocial = sSocial;

    }
    

    public String getUserID(){
        return this.userID;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getAddress(){
        return this.address;
    }
    public String getNIB(){
        return this.nib;
    }
    public String getNIF(){
        return this.nif;
    }
    public String getSSocial(){
        return this.sSocial;
    }
    
    public void setUserID(String id){
        this.userID = id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhone (String phone){
        this.phone = phone;
    }
    
    public void setAddress (String address){
        this.address = address;
    }
    
    public void setNIB (String nib){
        this.nib = nib;
    }
    
    public void setNIF (String nif){
        this.nif = nif;
    }
    
    public void setSSocial (String sSocial){
        this.sSocial = sSocial;
    }
    @Override
    public Employee clone(){
        return new Employee ();
    }
 
}