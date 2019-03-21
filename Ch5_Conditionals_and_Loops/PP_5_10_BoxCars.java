//********************************************************************************
//  BoxCars.java      @author: Hyunryung Kim
//
//  Programming Projects 5.10, Chapter 5
//  Using the PairOfDice class from PP 4.7, design and implement an application 
//  that rolls a pair of dice 1000 times, counting the number of box cars (two
//  sixes) that occur.
//********************************************************************************

public class PP_5_10_BoxCars 
{
    //----------------------------------------------------------------------------
    // Creates a PairOfDice object and rolls them, count the number of double 6.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 1000;
        PairOfDice dice;
        int count = 0;
        
        dice = new PairOfDice();
        
        for (int i = 1; i <= MAX; i++)
        {
           dice.roll();
           if (dice.sum() == 12)
               count++;
        }
        
        System.out.println("The number of box cars: " + count);
        
    }
    
}
