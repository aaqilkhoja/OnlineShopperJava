//Aaqil Khoja
//Assignment #2
//26th Sept, 2019
//blueprint class for Items objects

public class Items{
    //declaring the variables
    private String name, code;
    private double price;
    
    //default constructor
    public Items(){
    name="";
    code="";
    price=0;
    
    }
    
    //conversion constructor
    public Items(String theName, String theCode, double thePrice){
    name=theName;
    code=theCode;
    price=thePrice;
    }

    //copy constructor
    public Items (Items theItem)
    {
        name=theItem.name;
        code=theItem.code;
        price=theItem.price;
    }
    
    //mutator to set a new name for an Items object
    public void setName(String newName)
    {
        name=newName;
    }
    
    //mutator to set a new code for an Items object
    public void setCode(String newCode)
    {
        code=newCode;
    }
    
    //mutator to set a new price for an Items object
    public void setPrice(double newPrice)
    {
        price=newPrice;
    }
    
    //Accessor to return the name of an Items object
    public String getName()
    {
        return name;
    }
    
    //accessor to return the code of an Items object
    public String getCode(){
    return code;
    }
    
    //accessor to return the price of an Items object
    public double getPrice(){
    return price;
    }
    
    //toString method returns a string with the Items object's Name, Code and Price
    public String toString(){
    String s= "Item:" + name + "\tCode:" + code + "\t Price: " +price;
    return s;
    }
}