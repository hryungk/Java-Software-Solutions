//********************************************************************************
//  PP_10_2.java       Author: Hyunryung Kim
//
//  Modify the solution to PP 11.1 such that it catches and handles the exception 
//  if it is thrown. Handle the exception by printing an appropriate message, and 
//  then continue processing more strings.
//********************************************************************************

import java.util.Scanner;

public class PP_10_2
{
    //----------------------------------------------------------------------------
    //  Creates an exception object and possibly throws it.
    //----------------------------------------------------------------------------
    public static void main(String[] args)
    {
        final int MAX = 20;
        String value;
        StringTooLongException problem = new StringTooLongException();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string with a length less than " + MAX
                        + ", inclusive (Enter \"DONE\" to quit): ");
        value = scan.nextLine();      
        
        while (!value.equalsIgnoreCase("DONE"))
        {
            try
            {
                if (value.length() > 20)
                    throw problem;
            }
            catch (StringTooLongException exception)
            {
                System.out.println("Input string has too many characters.");
            }
                    
            System.out.print("Enter a string with a length less than " + MAX
                            + ", inclusive (Enter \"DONE\" to quit): ");
            value = scan.nextLine();
        }   
        System.out.println("End of main method.");        
    }
}
