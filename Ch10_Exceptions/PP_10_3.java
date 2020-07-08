//********************************************************************************
//  PP_10_3.java       Author: Hyunryung Kim
//
//  Suppose in a particular business all documents are given a two- character 
//  designation starting with either U, C, or P, standing for unclassified, 
//  confidential, or proprietary. Create an excep- tion class called 
//  InvalidDocumentCodeException, designed to be thrown when an improper 
//  designation for a document is encoun- tered during processing. If a document 
//  designation is encoun- tered that doesn’t fit that description, the exception 
//  is thrown. Create a driver program to test the exception, allowing it to 
//  terminate the program.
//********************************************************************************

import java.util.Scanner;

public class PP_10_3
{
    //----------------------------------------------------------------------------
    //  Creates an exception object and possibly throws it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) throws InvalidDocumentCodeException
    {
        String charList = "UCP";
        String value;
        
        Scanner scan = new Scanner(System.in);
        
        InvalidDocumentCodeException problem = 
                new InvalidDocumentCodeException("Improper designation for the"
                                             + " document is encountered.");
        
        System.out.print("Enter a two-character designation " 
                        + "(Enter \"DONE\" to quit): ");
        value = scan.nextLine();      
        
        while (!value.equalsIgnoreCase("DONE"))
        {
            //  Determine if the exception should be thrown
            if (charList.indexOf(value.charAt(0)) < 0)
                throw problem;
                    
            System.out.print("Enter a two-character designation "   
                            + "(Enter \"DONE\" to quit): ");
            value = scan.nextLine();
        }   
        System.out.println("End of main method.");  // may never reach             
    }
}
