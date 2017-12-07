/*
The Painting class should have the properties that are unique to 
    paintings (height, width, media (oil, water color, etc.) ). 

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
      widtprivate h : int  
  private     media : String)
+ private remove()
+ printableString(): string
 */
package waiteproj3;

import java.util.Date;

/**
 *
 * @author mw047
 */
public class Painting extends StoreItem {

    private int     height;
    private int     width;
    private String  media;

    public Painting(int height, int width, String media, String title, String author, Date dateAcquired, int purchasePrice, int askingPrice) {
        super(title, author, dateAcquired, purchasePrice, askingPrice);
        this.height = height;
        this.width = width;
        this.media = media;
    }

    Painting() {
        super();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
    
    
        /**************************************************
     * Method Name: printableString()
     * Method Author:  Mary Waite
     **************************************************
     * Purpose of the Method:  return object as printable line item
     * Method Inputs:  none
     * Return value:  String p
     **************************************************
     * Date:  30 September 2017
     * @return 
     **************************************************/
    @Override
    public String printableString()
    {
        String p = super.printableString()
                + "" + String.format("%-25s", "     ") 
                + "" + String.format("%-25s", "     ") 
                + "" + String.format("%-25s", "     ") 
                + "" + String.format("%-25s", "     ")
                + height + String.format("%-25s", " ") 
                + width + String.format("%-25s", " ") 
                + media + String.format("%-25s", " ")
                + "\n";
        
        return p;
    }
}
