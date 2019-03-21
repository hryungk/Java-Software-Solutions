//********************************************************************************
//  CountFlips.java      @author: Hyunryung Kim
//
//  Programming Projects 5.11, Chapter 5
//  Using the Coin class defined in this chapter, design and implement a driver
//  class called CountFlips whose main method flips a coin 100 times and counts 
//  how many times each side comes up. Print the results.
//********************************************************************************

public class PP_5_11_CountFlips 
{
    //----------------------------------------------------------------------------
    // Creates a Coin object, flips it 100 times, and prints the results.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 100;
        int countHeads = 0;
        Coin myCoin = new Coin();
        
        for (int i = 1; i <= MAX; i++)
        {
           myCoin.flip(); 
           if (myCoin.isHeads())
               countHeads++;
        }
        
        System.out.println ("Number of heads: " + countHeads);
        System.out.println ("Number of tails: " + (MAX-countHeads));   
    }
}
