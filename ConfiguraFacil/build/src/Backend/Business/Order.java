
package Backend.Business;

import java.util.Date;

public class Order {
    
    private int idOrder;
    private Date date;
    private double price;
    private String status;
    private Car car;
    private String description;
    private String idClient;
    private String idSeller;
    private Client client;
    private int idCar;
    
    public Order(){
        this.date = new Date();
        this.price = 0.0;
        this.status = "";
        this.idSeller = "";
        this.idClient = "";
        this.car = new Car();
    }
    
    public Order(int idOrder, Date date, double price, String status, String desc, int idCar){
        this.idOrder = idOrder;
        this.price=price;
        this.date = date;
        this.status = status;
        this.description = desc;
        this.idCar = idCar;
    }
      
    public Order(Date data, double price, String status, String desc, Car car, Client client, String idClient, String idSeller){
        this.date = data;
        this.price = price;
        this.status = status;
        this.description = desc;
        this.car = car;
        this.idClient = idClient;
        this.idSeller = idSeller;
        this.client = client;
    }
    
    // getters
    public Date getDate(){return this.date;}
    public double getPrice(){return this.price;}
    public String getStatus(){return this.status;}
    public String getIDSeller(){return this.idSeller;}
    public String getIDClient(){return this.idClient;}
    public Car getCar(){return this.car;}
    public Client getClient(){return this.client;}
    public String getDescription(){return this.description;}
    public int getCarID(){return this.idCar;}
    
    // setters
    public void setDate(Date date){this.date = date;}
    public void setPrice(double price){this.price = price;}
    public void setStatus(String status){this.status = status;}
    public void setCar(Car c){this.car = c;}
    
}
