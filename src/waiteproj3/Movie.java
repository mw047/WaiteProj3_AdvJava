/*
The Movie class should have the properties that are unique to movies(title, 
    director, actors[], actresses[], etc.).  

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
 */
package waiteproj3;

import java.util.Date;

/**
 *
 * @author mw047
 */
public class Movie extends StoreItem 
{

    private String      director; 
    private String[]    actor;      //any actors associated with movie
    private String      genre;

    public Movie(String director, String[] actor, String genre, String title, String author, Date dateAcquired, int purchasePrice, int askingPrice) {
        super(title, author, dateAcquired, purchasePrice, askingPrice);
        this.director = director;
        this.actor = actor;
        this.genre = genre;
    }

    public Movie() {
        super();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String actor) {
        actor = actor.replaceAll("[\\p{Z}\\s]+", "");
        String[] a = actor.substring(1, actor.length() - 1).split(",");
        this.actor = a;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    /**************************************************
     * Method Name: setActor()
     * Method Author:  Mary Waite
     **************************************************
     * Purpose of the Method:  set width value
     * Method Inputs:  String ac
     * Return value:  none
     **************************************************
     * Date:  30 September 2017
     **************************************************
    public void setActor(String ac)
    {
        String[]    add = new String[toArray(ac).length];
        String[]    temp = new String[actor.length+add.length];
        
        //combine actor array with add array into new temp array to add new actors
        for(int i = 0; i < temp.length; i++)
        {
            if(i<actor.length)      //add all current actor array members first
                temp[i] = actor[i];
            else                    //then add new array members
                temp[i] = add[i];
        }  
        actor = new String[temp.length];    //set actor array to new, combined array length
        for(int i = 0; i < temp.length; i++)    //set each array item in actor array to temp array
        {
            actor[i] = temp[i];
        }
    }
    
    /**************************************************
     * Method Name: getActor()
     * Method Author:  Mary Waite
     **************************************************
     * Purpose of the Method:  return list of actors
     * Method Inputs:  none
     * Return value:  String
     **************************************************
     * Date:  30 September 2017
     **************************************************
    public String getActor()
    {
        String aList = "";
        for(int i = 0; i < actor.length; i++)
        {
            aList += actor[i] + "n/";
        }
        
        return aList;
    }

    /**************************************************
     * Method Name: toArray()
     * Method Author:  Mary Waite
     **************************************************
     * Purpose of the Method:  convert user input to array
     * Method Inputs:  none
     * Return value:  String[]
     **************************************************
     * Date:  30 September 2017
     **************************************************   
    public String[] toArray(String s)
    {       
        String[] arr = s.split(" , ");
        return arr;
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
                + genre + String.format("%-25s", " ")
                + director + String.format("%-25s", " ") 
                + actor[0] + String.format("%-25s", " ") 
                + "" + String.format("%-25s", "     ") 
                + "" + String.format("%-25s", "     ") 
                + "" + String.format("%-25s", "     ") 
                + "" + String.format("%-25s", "     ")
                + "\n";
        
        return p;
    }


}
