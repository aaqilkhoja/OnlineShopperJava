//Aaqil Khoja
//Assignment #2
//26th Sept, 2019
//Main class to use all the methods for the Shopping Bag
import java.text.DecimalFormat;
public class OnlineShopper {
    public static void main(String[] args)  {
        //declaring variable(s)
        double totalCost=0;
        
        //This line of code formats the total price to two decimal places
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        
        //initializing the Items objects
        Items item1= new Items("Peas","PP43", 2.99);
        Items item2= new Items("Milk","MM97", 1.99);
        Items item3= new Items("Tea","TT32", 4.99);
       
        //this line of code basically adds all the contents into an array of Items[] just so it is easier
        //to add items to the bag
        Items[] contentsOfBag = {item1, item2, item3, item3, item1, item3};
        
        //creating a LinkedBag
        BagInterface<Items> shoppingBag = new LinkedBag<>();
        
        //this for loop adds the items into the shopping cart
        for (int index = 0; index<contentsOfBag.length; index++)
        {
            Items nextItem = contentsOfBag[index];
            shoppingBag.add(nextItem);
            totalCost = totalCost+ nextItem.getPrice();

        }
        
        //This line gets the current size of the bag
        System.out.println("Items in shopping cart: " +shoppingBag.getCurrentSize());

        //To get the frequency of the items in the shopping bag
        System.out.println("There are/is "+ shoppingBag.getFrequencyOf(item1) +" of "  + item1.getName() + " in the bag");
        System.out.println("There are/is "+ shoppingBag.getFrequencyOf(item2) +" of "  + item2.getName() + " in the bag");
        System.out.println("There are/is "+ shoppingBag.getFrequencyOf(item3) +" of "  + item3.getName() + " in the bag");
        
        //to get the total cost of the items in the bag
        System.out.println("The total cost of all the items is: $" + numberFormat.format(totalCost)+"\n");

        
        
        //this line of code takes all the contents of the bag and stores them into an object array
        Object [] contents = shoppingBag.toArray();
        //this for loop prints out the contents of the object array which has the contents of the bag
        for(int i =0; i< contents.length; i++)
        {
            System.out.println(contents[i]);
        }
        
        
        System.out.println();
        
        
        //remove one item
        //item to remove must have it's price deducted from the total price first before being removed
        System.out.println("Removing One Peas from the bag");
        totalCost= totalCost-item1.getPrice();
        shoppingBag.remove(item1);
        
        
        
        //This block of code displays the items that are left in the shopping bag and the total price
        System.out.println("Items in shopping cart: " +shoppingBag.getCurrentSize());
        System.out.println("The items that we have left in the bag are:");
        contents = shoppingBag.toArray();
        //this for loop prints out the contents of the object array which has the contents of the bag
        for(int i =0; i< contents.length; i++)
        {
            System.out.println(contents[i]);
        }
        System.out.println("The total cost of the items in the bag is:" + numberFormat.format(totalCost)+"\n");
        

        
        //This block of code will show that I have an item and the amount of that item in the bag
        if(shoppingBag.contains(item3))
        {
            System.out.println("The shopping bag contains " + shoppingBag.getFrequencyOf(item3) + " " +  item3.getName()+"\n");
        }
        
        
        
        //This block of code removes all Items of a specific type and gives the new total price of the shopping bag
        System.out.println("Removing all Teas from the shopping bag cause it wasn't decaf");
        //The while loop uses the contains method to check if the Item is in the shopping bag or not
        while(shoppingBag.contains(item3))
        {
            totalCost=totalCost-item3.getPrice();
            //if the item is in the bag, it gets removed
            shoppingBag.remove(item3);
        }   
        //This block of code prints the remaining items in the bag and the total price
        System.out.println("Items in shopping cart: " +shoppingBag.getCurrentSize());
        System.out.println("The remaining contents of the bag are:");
        contents = shoppingBag.toArray();
        for(int i =0; i< contents.length; i++)
        {
            System.out.println(contents[i]);
        }

        //printing the final cost of the bag
        System.out.println("Total cost: " + "\t$" + numberFormat.format(totalCost));
    } 
}// end main

