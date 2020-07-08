//********************************************************************************
//  PP_2_9.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Write an application that prompts for and reads a double value representing
//  a monetary amount. Then determine the fewest number of each bill and coin
//  needed to represent that amount, starting with the highest (assume that a ten
//  dollar bill is the maximum size needed). For example, if the value entered is 
//  47.63, (forty-seven dollars and sixty-three cents), then the program should 
//  print the equivalent amount as: 
//  4 ten dollar bills
//  1 five dollar bills
//  2 one dollar bills
//  2 quarters
//  1 dimes
//  0 nickels
//  3 pennies
//********************************************************************************

import java.util.Scanner;

public class PP_2_9 
{
    //----------------------------------------------------------------------------
    //  Conver the entered value in monetary amount.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int CONVERSION_FACTOR = 100; 
        
        double money;    // value to convert
        int dollars, cents, dollar10, dollar5, dollar1, qrts, dims, niks, pens;
        
        System.out.print("Enter the money in dollars.cents: ");
        Scanner scan = new Scanner(System.in);
        money = scan.nextDouble();
        dollars = (int) money;
        cents = (int) ((money - dollars)*CONVERSION_FACTOR);
        
        dollar1 = dollars % 10 % 5;
        dollar5 = (dollars % 10 - 1*dollar1) / 5;
        dollar10 = (dollars - dollars % 10) / 10;
        
        pens = cents % 25 % 10 % 5;
        niks = (pens % 25 % 10 - 1*pens) / 5;
        dims = (cents % 25 - 1*pens - 5*niks) / 10;
        qrts = (cents - cents % 25) / 25;
        
        System.out.println("Input money: " + money + " dollars");
        System.out.println(dollar10 + " ten collar bills");
        System.out.println(dollar5 + " five collar bills");
        System.out.println(dollar1 + " one collar bills");
        System.out.println(qrts + " qurters");
        System.out.println(dims + " dimes");
        System.out.println(niks + " nickels");
        System.out.println(pens + " pennies");
    }   
}
