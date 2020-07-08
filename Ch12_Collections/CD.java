//********************************************************************************
//  CD.java      Author: Hyunryung Kim
//
//  Represents a compact disc.
//********************************************************************************

import java.text.NumberFormat;

public class CD implements Comparable
{
    private String title, artist;
    private double cost;
    private int tracks;

    //----------------------------------------------------------------------------
    //  Creates a new CD with the specified information.
    //----------------------------------------------------------------------------
    public CD (String name, String singer, double price, int numTracks)
    {
        title = name;
        artist = singer;
        cost = price;
        tracks = numTracks;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a string description of this CD.
    //----------------------------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String description;
        
        description = fmt.format(cost) + "\t" + tracks + "\t";
        description += title + "\t" + artist;
        
        return description;
    }
    //----------------------------------------------------------------------------
    //  Returns true if the first and last names of this contact match those of 
    //  the parameter.
    //----------------------------------------------------------------------------    
    public boolean equals(Object other)
    {
        return (title.equals(((CD)other).title));
    }   
    
    //----------------------------------------------------------------------------
    //  Uses both last and first names to determine ordering.
    //----------------------------------------------------------------------------    
    public int compareTo(Object other)
    {
        int result;

        result = title.compareTo(((CD)other).title);
        
        return result;
    }    
}
