//********************************************************************************
//  SumEven.java      @author: Hyunryung Kim
//
//  Programming Projects 5.3, Chapter 5
//  Design and implement an application that reads an integer value and prints the 
//  sum of all even integers between 2 and the input value, inclusive. Print an 
//  error message if the input value is less than 2. Prompt accordingly.
//********************************************************************************

import java.util.Scanner;

public class PP_5_3_SumEven 
{
    //----------------------------------------------------------------------------
    // Reads the user's input and calculates the sum of even numbers up to input.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int num;
        int sum = 0;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        num = scan.nextInt();
        
        if (num < 2)
            System.out.println("ERROR: Invalid value. Input value is less than 2.");
        else
        {
            for (int i = 2; i <= num;i += 2)
                sum += i;
        
            System.out.println("Sum of even numbers between 2 and "+ num +": " + sum);
        }
    }
}
