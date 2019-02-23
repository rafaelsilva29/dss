
package Backend.Business;

public class Seller {
    private String userID; // é u username
    private String name;
    private String mail;
    private String address; 
    private String phone;
    private String nib;
    private String nif;
    private String sSocial;
    
    public Seller(String userID, String mail, String name)
    {
        this.userID    = userID;
        this.name      = name;
        this.mail      = mail;
    }

    public Seller(String userID, String name, String mail, String address, String phone, String nib, String nif, String sSocial)
    {
        this.userID    = userID;
        this.name      = name;
        this.mail      = mail;
        this.address   = address;
        this.phone     = phone;
        this.nib       = nib;
        this.nif       = nif;
        this.sSocial   = sSocial;
    }
    
    public Seller(String name, String mail, String address, String phone, String nib, String nif, String sSocial)
    {
        this.name      = name;
        this.mail      = mail;
        this.address   = address;
        this.phone     = phone;
        this.nib       = nib;
        this.nif       = nif;
        this.sSocial   = sSocial;
    }
    
    public Seller()
    {
        this.name      = "Default";
        this.mail      = "Default";
        this.address   = "Default";
        this.phone     = "Default";
        this.nib       = "Default";
        this.nif       = "Default";
        this.sSocial   = "Default";
        
    }

    public String getID()
    {
        return this.userID;
    }

    public String getName()
    {
        return this.name;
    }

    public String getEmail()
    {
        return this.mail;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getPhone()
    {
        return this.phone;
    }

    public String getNIB()
    {
        return this.nib;
    }

    public String getNIF()
    {
        return this.nif;
    }

    public String getSSocial()
    {
        return this.sSocial;
    }


    public void setUserID(String id){
        this.userID = id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }


    public void setEmail(String mail)
    {
        this.mail=mail;
    }


    public void setAddress(String address)
    {
        this.address=address;
    }

    public void setPhone(String phone)
    {
        this.phone=phone;
    }

    public void setNIB(String nib)
    {
        this.nib=nib;
    }

    public void setNIF(String nif)
    {
        this.nif=nif;
    }

    public void setSSocial(String ss)
    {
        this.sSocial=ss;
    }
    
    @Override
    public Object clone()
    {
        return new Seller(this.userID, this.name, this.mail, this.address, 
                         this.phone, this.nib, this.nif, this.sSocial);
    }


}
