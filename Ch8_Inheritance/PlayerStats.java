//********************************************************************************
//  PlayStats.java      @author: Hyunryung Kim
//
//  Programming Projects 8.4, Chapter 8
//  Design and implement a set of classes that keeps track of various sports 
//  statistics. Have each low-level class represent a specific sport. Tailor the
//  services of the classes to the sport in question, and move common attributes
//  to the higher-level classes as appropriate. Create a main driver class to 
//  instantiate and exercise several of the classes.
//********************************************************************************

public abstract class PlayerStats 
{
    protected String player, team;
    protected int score;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the player statistics with the specified information.
    //----------------------------------------------------------------------------
    PlayerStats(String playerName, String teamName)
    {
        player = playerName;
        team = teamName;
        score = 0;
    }
    
    //----------------------------------------------------------------------------
    //  Score mutator.
    //----------------------------------------------------------------------------
    public abstract void score(); 

    //----------------------------------------------------------------------------
    //  Score accessor.
    //----------------------------------------------------------------------------
    public int getScore()
    {
        return score;
    }    
    //----------------------------------------------------------------------------
    //  Player mutator.
    //----------------------------------------------------------------------------
    public void setPlayer(String playerStr) 
    {   
        player = playerStr;
    }
    
    //----------------------------------------------------------------------------
    //  Player accessor.
    //----------------------------------------------------------------------------
    public String getPlayer() 
    {   
        return player;
    }
    
    //----------------------------------------------------------------------------
    //  Team mutator.
    //----------------------------------------------------------------------------
    public void setTeam(String teamStr) 
    {   
        team = teamStr;
    }
    
    //----------------------------------------------------------------------------
    //  Team accessor.
    //----------------------------------------------------------------------------
    public String getTeam() 
    {   
        return team;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this player statistics as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        String result = "Player: " + player;
        result += "\nTeam: " + team;
        result += "\nScore: " + score;
        
        return result;
    }
}
