//********************************************************************************
//  SumProd.java      @author: Hyunryung Kim
//
//  Programming Projects 5.3, Chapter 5 (8th Edition)
//  Write a program that calculates and prints, the sum and product of all the
//  digits in an integer value read from the keyboard.
//********************************************************************************

import java.util.Scanner;

public class PP_5_3_SumProd 
{
    //----------------------------------------------------------------------------
    // Reads the user's input and calculates the sum and product of all digits.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int num, digt;
        int sum = 0, prod = 1;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        num = scan.nextInt();
        
        do
        {
        digt = num % 10;
        sum += digt;
        prod *= digt;
        num /= 10;
        } while(num > 0);
        
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + prod);
    }
}
