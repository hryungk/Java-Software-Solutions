//********************************************************************************
//  MonetaryDriver.java      @author: Hyunryung Kim
//
//  Programming Projects 8.1, Chapter 8
//  Design and implement a class called MonetaryCoin that is derived from the 
//  Coin class presented in Chapter 5. Store a value in the monetary coin that 
//  represents its value and add a method that returns its value. Create a main
//  driver class to instantiate and compute the sum of several MonetaryCoin 
//  objects. Demonstrate that a monetary coin inherits its parent's ability to be
//  flipped.
//********************************************************************************

import java.text.NumberFormat;

public class PP_8_1_MonetaryDriver 
{
    //----------------------------------------------------------------------------
    // Creates several MonetaryCoin objects and request some services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        double sum = 0;
        String[] nameCoin = {"Penny", "Nickel", "Dime", "Quarter"};
        int[] numCoin = {328, 41, 15, 12};
        MonetaryCoin[] coins = new MonetaryCoin[4];
        
        coins[0] = new MonetaryCoin(0.01);
        coins[1] = new MonetaryCoin(0.05);
        coins[2] = new MonetaryCoin(0.1);
        coins[3] = new MonetaryCoin(0.25);
        
        for (int i = 0; i < numCoin.length; i++)
        {
            System.out.print (nameCoin[i] + "\t" + numCoin[i] + "\t");
            System.out.println(coins[i]);
        }
        
        for (int i = 0; i < numCoin.length; i++)
            sum += numCoin[i] * coins[i].getValue();
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Total value of coins: " + fmt.format(sum));
        
        System.out.println("Toss coins:");
        for (int i = 0; i < nameCoin.length; i++)
        {
            coins[i].flip();
//            System.out.println(nameCoin[i] + " is tossed.");
            if (coins[i].isHeads())
                System.out.println(nameCoin[i] + " is on Heads.");
            else
                System.out.println(nameCoin[i] + " is on Tails.");
        }
        
    }
}
