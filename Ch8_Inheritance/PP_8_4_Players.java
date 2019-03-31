//********************************************************************************
//  Players.java      @author: Hyunryung Kim
//
//  Programming Projects 8.4, Chapter 8
//  Design and implement a set of classes that keeps track of various sports 
//  statistics. Have each low-level class represent a specific sport. Tailor the
//  services of the classes to the sport in question, and move common attributes
//  to the higher-level classes as appropriate. Create a main driver class to 
//  instantiate and exercise several of the classes.
//********************************************************************************

public class PP_8_4_Players 
{
    //----------------------------------------------------------------------------
    // Creates some sports statistics objects.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        BaseballStats player1 = new BaseballStats("Daeho Kim","Giants");  
        FootballStats player2 = new FootballStats("Doug Baldwin","Seahawks");  
        
        player1.score();
        player1.hit();
        player1.setError();
        player1.hit();
        player2.score();
        player2.gainYard(10);
        
        System.out.println(player1);
        System.out.println(player2);
    }
}
