//********************************************************************************
//  PP_2_8.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Write an application that determines the value of the coins in a jar and
//  prints the total in dollars and cents. Read integer values that represent the
//  number of quarters, dimes, nickels, and pennies.
//********************************************************************************

import java.util.Scanner;

public class PP_2_8 
{
    //----------------------------------------------------------------------------
    //  Convert the coins into dollar values.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int CONVERSION_FACTOR = 100; 
        
        int qrts, dims, niks, pens;     // value to convert
        int dollars, centsAll, cents;
        
        System.out.print("Enter the number of quarters: ");
        Scanner scan = new Scanner(System.in);
        qrts = scan.nextInt();
        
        System.out.print("Enter the number of dimes: ");
        dims = scan.nextInt();
        
        System.out.print("Enter the number of nickels: ");
        niks = scan.nextInt();
        
        System.out.print("Enter the number of pennies: ");
        pens = scan.nextInt();
        
        centsAll = 25*qrts + 10*dims + 5*niks + 1*pens;
        cents = centsAll % CONVERSION_FACTOR;
        dollars = (centsAll - cents) / CONVERSION_FACTOR;
        
        System.out.println("Input coins: " + qrts + " quarter(s) " + dims + 
                " dime(s) " + niks + " nickel(s) " + pens + " penny(ies)");      
        System.out.println("Total value: " + dollars + " dollar(s) " + 
                cents + " cent(s)");
        
    }   
}
