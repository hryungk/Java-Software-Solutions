//********************************************************************************
//  BaseballStats.java      @author: Hyunryung Kim
//
//  Programming Projects 8.4, Chapter 8
//  Design and implement a set of classes that keeps track of various sports 
//  statistics. Have each low-level class represent a specific sport. Tailor the
//  services of the classes to the sport in question, and move common attributes
//  to the higher-level classes as appropriate. Create a main driver class to 
//  instantiate and exercise several of the classes.
//********************************************************************************

public class BaseballStats extends PlayerStats
{    
    protected int hits, errors;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the baseball statistics with the specified information.
    //----------------------------------------------------------------------------
    BaseballStats(String playerName, String teamName)
    {
        super(playerName, teamName);
        hits = 0;
        errors = 0;
    }
    
    //----------------------------------------------------------------------------
    //  Score mutator.
    //----------------------------------------------------------------------------
    public void score()
    {
        score += 1;
    }
    
    //----------------------------------------------------------------------------
    //  Hits mutator.
    //----------------------------------------------------------------------------
    public void hit()
    {
        hits += 1;
    }
    
    //----------------------------------------------------------------------------
    //  Hits accessor.
    //----------------------------------------------------------------------------
    public int getHit()
    {
        return hits;
    }
    
    //----------------------------------------------------------------------------
    //  Error mutator.
    //----------------------------------------------------------------------------
    public void setError()
    {
        errors += 1;
    }
    
    //----------------------------------------------------------------------------
    //  Error accessor.
    //----------------------------------------------------------------------------
    public int getError()
    {
        return errors;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this player statistics as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        String result = super.toString();
        result += "\nHits: " + hits;
        result += "\nErrors: " + errors;
        
        return result;
    }
}
