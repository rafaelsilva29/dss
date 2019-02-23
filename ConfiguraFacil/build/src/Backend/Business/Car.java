
package Backend.Business;

import java.util.*;


public class Car {
    
    private String brand;
    private String model;
    private Map<Integer,Component> components;
    private Map<Integer,Package> packages;
    
    public Car(){
        this.brand = "";
        this.model = "";
        this.components = new HashMap<Integer,Component>();
        this.packages = new HashMap<Integer,Package>();
    }
    
    public Car(String brand, String model, Map<Integer,Component> components, Map<Integer,Package> packages){
        this.brand = brand;
        this.model = model;
        this.components = components;
        this.packages = packages;
    }
    
    // getters
    public String getBrand(){return this.brand;}
    public String getModel(){return this.model;}
    public Map<Integer,Component> getComponets(){return this.components;}
    public Map<Integer,Package> getPackages(){return this.packages;}
    
    // setters
    public void setBrand(String brand){this.brand = brand;}
    public void setModel(String model){this.model = model;}
    
    // Component
    
    public void addComponent(Component c){
        int idComponent = c.getID();
        this.components.put(idComponent, c);
    }
    
    public void removeComponent(Component c){
        int idComponent =  c.getID();
        this.components.remove(idComponent);
    }
    
    // Pakckages
    
    public void addPackage(Package p){
        int idPackage = p.getPackageID();
        this.packages.put(idPackage, p);
    }
    
    public void removePackage(Package p){
        int idPackage = p.getPackageID();
        this.packages.remove(idPackage);
    }
    
    public double getTotalPrice(){
        double total = 0;
        if (this.model.equals("BMW_1")){total = 15000.00;}
        else if (this.model.equals("BMW_2")){total = 18000.00;}
        else if (this.model.equals("BMW_3")){total = 20000.00;}
        else if (this.model.equals("BMW_4")){total = 25000.00;}
        else if (this.model.equals("Mini_1")){total = 17000.00;}
        else if (this.model.equals("Mini_2")){total = 19000.00;}
        else if (this.model.equals("Mini_3")){total = 22000.00;}
        else if (this.model.equals("Mini_4")){total = 25000.00;}
        else if (this.model.equals("RollsRoyce_1")){total = 20000.00;}
        else if (this.model.equals("RollsRoyce_2")){total = 25000.00;}
        else if (this.model.equals("RollsRoyce_3")){total = 30000.00;}
        else if (this.model.equals("RollsRoyce_4")){total = 35000.00;}
        for(Component c : this.components.values()){
            total += c.getPrice();
        }
        for(Package p : this.packages.values()){
            total += p.getPrice();
        }
        return total;
    }
    
}
