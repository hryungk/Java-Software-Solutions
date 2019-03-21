//********************************************************************************
//  PrintChar.java      @author: Hyunryung Kim
//
//  Programming Projects 5.4, Chapter 5
//  Design and implement an application that reads a string from the user and 
//  prints it one characer per line.
//********************************************************************************

import java.util.Scanner;

public class PP_5_4_PrintChar 
{
    //----------------------------------------------------------------------------
    // Reads the user's input string and prints one character per line.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        String str;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a string: ");
        str = scan.next();
        
        for (int i = 0;i < str.length();i++)
            System.out.println(str.charAt(i));
    }
}
