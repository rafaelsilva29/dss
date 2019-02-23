

package Backend.Business;
import Backend.Business.Component;
import java.util.HashMap;
import java.util.Map;

public class Package {
    
    private int packageID;
    private String name;
    private String description;
    private double price;
    private Map<Integer,Component> components;
    private String compatibility;
    
    public Package(){
        this.packageID     = 0;
        this.name          = "Default";
        this.description   = "Default";
        this.price         = 0.00;
        this.components    = new HashMap<Integer,Component>();
        this.compatibility = "Default";
    }
    
    public Package(int packID, String name, String desc, Double price, Map<Integer, Component> comp, String compat){
        this.packageID     = packID;
        this.name          = name;
        this.description   = desc;
        this.price         = price;
        this.components    = comp;
        this.compatibility = compat;
    }
    
    public Package(String name, String desc, Double price, Map<Integer, Component> comp, String compat){
        this.packageID     = 0;
        this.name          = name;
        this.description   = desc;
        this.price         = price;
        this.components    = comp;
        this.compatibility = compat;
    }
    
     public Package(int packID, String name, String desc, double price, String compat){
        this.packageID     = packID;
        this.name          = name;
        this.description   = desc;
        this.price         = price;
        this.compatibility = compat;
    }
     
    public Package(int id, String name, String desc, double price){
        this.packageID     = id;
        this.name          = name;
        this.description   = desc;
        this.price         = price;
    }
    
    //Set
    
    public void setPackageID(int packID){ this.packageID = packID; }
    public void setName(String name){ this.name = name; }
    public void setDescription(String des){ this.description = des; }
    public void setPrice(double price){ this.price = price; }
    public void setCompatibility(String compat){ this.compatibility = compat; }
    
    //Get
    
    public int getPackageID(){ return this.packageID; }
    public String getName(){ return this.name; }
    public String getDescription(){ return this.description; }
    public double getPrice(){ return this.price; }
    public String getCompatibility(){ return this.compatibility; }
    public Map<Integer,Component> getComponents(){return this.components;}
    
    public void addComponent(Component comp){
        int id = comp.getID();
        this.components.put(id, comp);
    }
    
    public void removeComponent(Component comp){
        int id = comp.getID();
        this.components.remove(id, comp);
    }
    
    
    
}
