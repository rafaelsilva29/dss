
package Backend.Business;

public class Component {
    private int componentID;
    private String name;
    private Double price;
    private int quantity;
    private String description;
    private int type;
    private String compatibility;

    public Component(){
        this.componentID   = 0;
        this.name          = "Default";
        this.price         = 0.00;
        this.quantity      = 0;
        this.description   = "Default";
        this.type          = 99999;
        this.compatibility = "Default";
    }
    
    public Component(int compID, String name, Double price, int qnt, String desc, int type, String comp){
        this.componentID   = compID;
        this.name          = name;
        this.price         = price;
        this.quantity      = qnt;
        this.description   = desc;
        this.type          = type;
        this.compatibility = comp;
    }
    
    public Component(String name, Double price, int qnt, String desc, int type, String comp){
        this.name          = name;
        this.price         = price;
        this.quantity      = qnt;
        this.description   = desc;
        this.type          = type;
        this.compatibility = comp;
    }
    
     public Component(int compID,String name, Double price, String desc, int type, String comp){
        this.componentID   = compID;
        this.name          = name;
        this.price         = price;
        this.description   = desc;
        this.type          = type;
        this.compatibility = comp;
    }
    
    public Component(int id, String name, String desc, Double price){
        this.componentID   = id;
        this.name          = name;
        this.price         = price;
        this.description   = desc;
    }
    
    public Component(Component c){
        this.componentID   = c.getID();
        this.name          = c.getName();
        this.price         = c.getPrice();
        this.quantity      = c.getQuantity();
        this.description   = c.getDescription();
        this.type          = c.getType();
        this.compatibility = c.getCompatibility();
    }
    
    public int getID(){
        return this.componentID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Double getPrice(){
        return this.price;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public int getType(){
        return this.type;
    }
    
    public String getCompatibility(){
        return this.compatibility;
    }
    
    public void setID(int id){
        this.componentID = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setQuantity(int qnt){
        this.quantity = qnt;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setType(int type){
        this.type = type;
    }
    
    public void setCompatibility(String compatibility){
        this.compatibility = compatibility;
    }
}
