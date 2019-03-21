//********************************************************************************
//  FlipRace.java      @author: Hyunryung Kim
//
//  Programming Projects 5.12, Chapter 5
//  Using the Coin class defined in this chapter, design and implement a driver
//  class called FlipRace whose main method creates two coin objects, then 
//  continually flips them both to see which coin first comes up heads three flips
//  in a row. Continue flipping the coins until one of the coins wins the race, 
//  and consider the possibility that they might tie. Print the results of each
//  turn, and at the end print the winner and total number of flips that were
//  required.
//********************************************************************************

public class PP_5_12_FlipRace 
{
    //----------------------------------------------------------------------------
    // Creates two Coin objects, flips them until one wins 3 heads in a row.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        boolean i1, i2, i3, j1, j2, j3;
        int count = 3;
        Coin Coin1 = new Coin();
        Coin Coin2 = new Coin();
        
        Coin1.flip();
        i1 = Coin1.isHeads();
        Coin2.flip();
        j1 = Coin2.isHeads();
        System.out.println("Flip 1) Coin 1: " + Coin1 + ", Coin 2: " + Coin2);
        Coin1.flip();
        i2 = Coin1.isHeads();
        Coin2.flip();
        j2 = Coin2.isHeads();
        System.out.println("Flip 2) Coin 1: " + Coin1 + ", Coin 2: " + Coin2);
        Coin1.flip();
        i3 = Coin1.isHeads();
        Coin2.flip();
        j3 = Coin2.isHeads();
        System.out.println("Flip 3) Coin 1: " + Coin1 + ", Coin 2: " + Coin2);
        
        while(!(i1&&i2&&i3) && !(j1&&j2&&j3))
        {
        i1 = i2;
        j1 = j2;
        i2 = i3;
        j2 = j3;
        Coin1.flip();
        i3 = Coin1.isHeads();
        Coin2.flip();
        j3 = Coin2.isHeads();
        count++;
        System.out.println("Flip " + count + ") Coin 1: " + Coin1 + ", Coin 2: " 
                            + Coin2);
        }
        
        if ((i1&&i2&&i3) && (j1&&j2&&j3))
            System.out.println("Coin 1 and Coin 2 tie after " + count + " flips.");
        else
        {
            if (i1&&i2&&i3)
                System.out.println("Coin 1 wins after " + count + " flips.");
            if (j1&&j2&&j3)
                System.out.println("Coin 2 wins after " + count + " flips.");            
        }
    }
}
