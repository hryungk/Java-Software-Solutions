//********************************************************************************
//  Decode.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the Stack class.
//********************************************************************************

import java.util.*;

public class Listing_12_4_Decode
{
    //----------------------------------------------------------------------------
    //  Decodes a message by reversing each word in a string.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        Stack word = new Stack();
       
        String message;
        int index = 0;
        
        System.out.println("Enter the coded message:");
        message = scan.nextLine();
        System.out.println("The decoded message is: ");
        
        while (index < message.length())
        {
            // Push word onto stack
            while (index < message.length() && message.charAt(index) != ' ')
            {
                word.push(message.charAt(index));
                index++;
            }
            // Print word in reverse
            char curChar;
            while (!word.empty())
            {
                curChar = (Character)word.pop();
                System.out.print(curChar);
            }

            System.out.print(" ");
            index++;     
        }
    }
}
