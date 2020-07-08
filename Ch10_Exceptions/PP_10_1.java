//********************************************************************************
//  PP_10_1.java       Author: Hyunryung Kim
//
//  Write a program that creates an exception class called StringTooLongException, 
//  designed to be thrown when a string is discovered that has too many characters 
//  in it. In the main driver of the program, read strings from the user until the 
//  user enters "DONE". If a string is entered that has too many characters (say 
//  20), throw the exception. Allow the thrown exception to terminate the program.
//********************************************************************************

import java.util.Scanner;

public class PP_10_1
{
    //----------------------------------------------------------------------------
    //  Creates an exception object and possibly throws it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) throws StringTooLongException
    {
        final int MAX = 20;
        String value;
        
        Scanner scan = new Scanner(System.in);
        
        StringTooLongException problem = 
                new StringTooLongException("Input string has too many characters.");
        
        System.out.print("Enter a string with a length less than " + MAX
                        + ", inclusive (Enter \"DONE\" to quit): ");
        value = scan.nextLine();      
        System.out.println("Length of the string: " + value.length());
        
        while (!value.equalsIgnoreCase("DONE"))
        {
            //  Determine if the exception should be thrown
            if (value.length() > MAX)
                throw problem;
                    
            System.out.print("Enter a string with a length less than " + MAX
                            + ", inclusive (Enter \"DONE\" to quit): ");
            value = scan.nextLine();
        }   
        System.out.println("End of main method.");  // may never reach        
    }
}
