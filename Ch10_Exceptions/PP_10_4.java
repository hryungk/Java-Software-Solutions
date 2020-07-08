//********************************************************************************
//  PP_10_4.java       Author: Hyunryung Kim
//
//  Modify the solution to PP 11.3 such that it catches and handles the exception 
//  if it is thrown. Handle the exception by printing an appropriate message, and 
//  then continue processing.
//********************************************************************************

import java.util.Scanner;

public class PP_10_4
{
    //----------------------------------------------------------------------------
    //  Creates an exception object and possibly throws it.
    //----------------------------------------------------------------------------
    public static void main(String[] args)
    {
        String charList = "UCP";
        String value;
        InvalidDocumentCodeException problem = 
                new InvalidDocumentCodeException();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a two-character designation " 
                        + "(Enter \"DONE\" to quit): ");
        value = scan.nextLine();      
        
        while (!value.equalsIgnoreCase("DONE"))
        {
            //  Determine if the exception should be thrown
            try 
            {
                if (charList.indexOf(value.charAt(0)) < 0)
                    throw problem;
            }
            catch (InvalidDocumentCodeException exception)
            {
                System.out.println("Improper designation for the document is "
                                    + "encountered.");
            }       
            System.out.print("Enter a two-character designation "   
                            + "(Enter \"DONE\" to quit): ");
            value = scan.nextLine();
        }   
        System.out.println("End of main method.");  // may never reach             
    }
}
