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

public class FootballStats extends PlayerStats
{    
    protected int yards;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the baseball statistics with the specified information.
    //----------------------------------------------------------------------------
    FootballStats(String playerName, String teamName)
    {
        super(playerName, teamName);
        yards = 0;
    }
    
    //----------------------------------------------------------------------------
    //  Score mutator.
    //----------------------------------------------------------------------------
    public void score()
    {
        score += 6;
    }
    
    //----------------------------------------------------------------------------
    //  Yards mutator.
    //----------------------------------------------------------------------------
    public void gainYard(int numYards)
    {
        yards += numYards;
    }
    
    //----------------------------------------------------------------------------
    //  Yards accessor.
    //----------------------------------------------------------------------------
    public int getYard()
    {
        return yards;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this player statistics as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        String result = super.toString();
        result += "\nYards: " + yards;
        
        return result;
    }
}
