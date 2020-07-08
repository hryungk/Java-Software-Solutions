//********************************************************************************
//  PalindromeTester.java      @author: Hyunryung Kim
//
//  Programming Projects 11.1, Chapter 11 Recursion
//  Design and implement a recursive version of the PalindromeTester program from 
//  Chapter 5.
//********************************************************************************

import java.util.Scanner;

public class PP_11_1_PalindromeTester 
{
    //----------------------------------------------------------------------------
    // Tests strings to see if they are palindromes.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        String strNew, str, another = "y";
        int left, right;
        
        Scanner scan = new Scanner(System.in);
        
        while (another.equalsIgnoreCase("y")) // allows y or Y
        {
            System.out.print("Enter a potential palindrome: ");
            strNew = scan.nextLine();
            
            PalindromeTester palinTest = new PalindromeTester(strNew);            
            palinTest.testPalindrome();
            System.out.println(palinTest);
            
            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }
}
