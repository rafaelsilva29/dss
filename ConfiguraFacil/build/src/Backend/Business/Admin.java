
package Backend.Business;

public class Admin {
    
    private String userID;
    private String adminID;
    private String username;
    private String email;
    private String password;
    
    public Admin (Admin adm){
        adm.clone();
    }
    
    public Admin(){
        
        this.userID = "Default";
        this.adminID = "Default";
        this.username = "Default";
        this.email = "Default";
        this.password = "Default";
        
    }
    
    public Admin(String userID, String adminID, String username, String email, String pass){
        
        this.adminID = adminID;
        this.username = username;
        this.email = email;
        this.password = pass;
        
    }
    
    //Set
    
    public void setUserID(String userID){ this.userID = userID; }
    public void setAdminID(String adminID){ this.adminID = adminID; }
    public void setUsername(String username){ this.username = username; } 
    public void setEmail(String email){ this.email = email; }
    public void setPassword(String pass) { this.password = pass; }
    
    //Get
    
    public String getUserID(){ return this.userID; }
    public String getAdminID(){ return this.adminID; }
    public String getUsername(){ return this.username; }
    public String getEmail(){ return this.email; }
    public String getPassword(){ return this.password; }

    // clone
    public Admin clone(){
        return new Admin ();
    }
 
}
