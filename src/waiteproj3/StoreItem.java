/*Demonstrate the use of Classes and Objects - Inheritance and Polymorphism.

Write a program for a used book store to track their inventory.  
The book dealer buys and sells three kinds of items, books, DVD movies, and paintings.  
Each item in inventory should have an instance of an object instantiated for it.  
Each object should have at least 
 *one constructor 
 *use get and set methods to set and read the object properties.  
The super class StoreItem should contain all the objects and methods that all StoreItems share such as:
  *title
  *author
  *date acquired
  *purchasePrice (what the dealer paid to get this item in the store)
  *asking price (the price the dealer wants for this item)
  *etc.
  *the methods get, set, printableString
  *A method to calculate the profit on a sale is also necessary. 

The Book class should have the properties that are unique to Books (genre, title author, etc). 

The Movie class should have the properties that are unique to movies(title, 
    director, actors[], actresses[], etc.).  

The Painting class should have the properties that are unique to 
    paintings (height, width, media (oil, water color, etc.) ). 

Make the object instances keep track of how many of each type of StoreItem are in the store. 
When selling an item, you will remove the object and decrement the count for that item's class.  

When adding an item to inventory, an object needs to be instantiated and the count for 
     that item type increased.  (Hint: Use a static counter.)  

Demonstrate the use of inheritance (Hint:  StoreItem is the super class).  
Also, demonstrate polymorphism in this project.  
Allow the user to add inventory (create new objects), 
sell inventory (remove objects), 
and display current inventory (display each object’s properties one at a time).  

IMPORTANT: None of these classes, StoreItem, book, Movie, or Painting, should have direct input or output.  
This means that the GUI class should handle the IO, not the StoreItem class.  
Or, said another way, the Book class should not ask the user for the value of a property, 
nor shall it print output directly to the screen.  

Listed below is the UML diagram for the minimum level project for this assignment. 

StoreItem
- itemCount : int Static
- title: String
- author :String
- dateAcquired :date
- purchasePrice: int
- askingPrice : int

+ Vehicle ( title: String, author :String, dateAcquired :date,  purchasePrice: int, askingPrice : int)
+ getTitle() : string
+ setTitle( Title : string)

(add get and set for other attributes)
+ deal( custOffer : int) : Boolean
+ remove()    //remove should decrement the itemCount var
+ calculateCommission(custOffer : int) : int

Book class extends StoreItem
- bookCount : int Static
- title : String
- genre : String
+ Book(title: String, author :String, dateAcquired :date, purchasePrice: int, askingPrice : int, genre : String)
(add get and set properties)
+ remove()  // called when removing a book item, decrements the bookCount
+ printableString(): string

Movie class extends StoreItem
- movieCount : int Static
- title : String
- director : String
- actors[] : String[]
- actresses[]: String[]
+ Movie
   ( title: String, 
     author :String, 
     dateAcquired :date, 
     purchasePrice: int, 
     askingPrice : int,
     add, 
     director : String,
     actors[] : String[], 
     actresses[]: String[])
+ remove()
+ printableString(): string
 
Painting class extends StoreItem
- paintingCount : int Static
- height : int
- width : int
- media : String
+ Painting
     (title: String, 
      author :String, 
      dateAcquired :date,  
      purchasePrice: int, 
      askingPrice : int, 
      height :int, 
      width : int  
      media : String)
+ remove()
+ printableString(): string
 */
package waiteproj3;

import java.util.Date;

/**
 *
 * @author mw047
 */
public class StoreItem {

    private static int      itemCount;

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int aItemCount) {
        itemCount = aItemCount;
    }

    public StoreItem(){
        
    }
    public StoreItem(String title, String author, Date dateAcquired, int purchasePrice, int askingPrice) {
        this.title = title;
        this.author = author;
        this.dateAcquired = dateAcquired;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
    }

    protected String    title;
    protected String    author;
    private Date      dateAcquired;
    private int   purchasePrice;
    private int   askingPrice;
    private int   profit;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }    
    
    public Date getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(Date dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getAskingPrice() {
        return askingPrice;
    }

    public void setAskingPrice(int askingPrice) {
        this.askingPrice = askingPrice;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
    
    /**************************************************
     * Method Name: remove()
     * Method Author:  Mary Waite
     **************************************************
     * Purpose of the Method:  decrement count
     * Method Inputs:  int quantity
     * Return value:  none
     **************************************************
     * Date:  30 September 2017
     * @param quantity
     **************************************************/    
    protected void remove(int quantity) // called when removing an item, decrements the bookCount
    {
        itemCount-=quantity;
    }
    
    
    /**************************************************
     * Method Name: printString()
     * Method Author:  Mary Waite
     **************************************************
     * Purpose of the Method:  return object as printable line item
     * Method Inputs:  none
     * Return value:  String p
     **************************************************
     * Date:  30 September 2017
     * @return 
     **************************************************/
    protected String printableString()
    {
        String p = title + String.format("%-25s", " ") 
                + author + String.format("%-25s", " ") 
                + dateAcquired + String.format("%-25s", " ") 
                + purchasePrice + String.format("%-25s", " ") 
                + askingPrice + String.format("%-25s", " ") ;
        
        return p;
    }
    
}
