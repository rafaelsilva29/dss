
package Backend.Business;


public class Client {
  
    private String name;
    private String adress;
    private String nif;
    private String phone;
    
    public Client(){
        this.name = "";
        this.adress = "";
        this.nif = "";
        this.phone = "";
    }
    
    public Client(String nif,String name, String adress, String phone){
        this.name = name;
        this.adress = adress;
        this.nif = nif;
        this.phone = phone;
    }
    
    // getters
    public String getName(){return this.name;}
    public String getAdress(){return this.adress;}
    public String getNif(){return this.nif;}
    public String getPhone(){return this.phone;}
    
    // setters
    public void setName(String name){this.name = name;}
    public void setAdress(String adress){this.adress = adress;}
    public void setNif(String nif){this.nif = nif;}
    public void setPhone(String phone){this.phone = phone;}
}
