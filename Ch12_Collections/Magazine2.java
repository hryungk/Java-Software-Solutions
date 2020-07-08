//********************************************************************************
//  Magazine2.java       Author: Hyunryung Kim
//
//  Represents a single magazine.
//********************************************************************************

public class Magazine2 implements Comparable
{
    private String title;
    
    //----------------------------------------------------------------------------
    //  Sets up the new magazine with its title.
    //----------------------------------------------------------------------------    
    public Magazine2 (String newTitle)
    {
        title = newTitle;
    }

    //----------------------------------------------------------------------------
    //  Defines the compareTo method.
    //----------------------------------------------------------------------------    
    public int compareTo (Object other)
    {
        int result;

        result = title.compareTo(((Magazine2)other).title);
        
        return result;
    }

    //----------------------------------------------------------------------------
    //  Returns true if the title of this CD matchs that of the parameter.
    //----------------------------------------------------------------------------    
    public boolean equals (Object other)
    {
        boolean result;

        result = title.equals(((Magazine2)other).title);
        
        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Returns this magazine as a string.
    //----------------------------------------------------------------------------        
    public String toString()
    {
        return title;
    }
}
