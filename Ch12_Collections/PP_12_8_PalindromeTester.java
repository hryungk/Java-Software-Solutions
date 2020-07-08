//********************************************************************************
//  PalindromeTester.java       Author: Hyunryung Kim
//
//  Programming Projects 12.8, Chapter 12 Collections
//  Design and  implement a program that prompts the user to enter a string and 
//  then performs two palindrome tests. The first should use a single stack to 
//  test whether the string is a palindrome. The second should use two stacks to 
//  test whether the string is a palindrome when capitalization, spaces, 
//  punctuation, and other non-alphanumeric characters are ignored. The program 
//  should print the results of both tests.
//********************************************************************************

import java.util.*;

public class PP_12_8_PalindromeTester
{
    //----------------------------------------------------------------------------
    //  Performs palindrome tests to a message by reversing a string.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Stack word = new Stack();
        
        // Prompts the user to enter a string       
        Scanner scan = new Scanner(System.in);
        String message;
                
        System.out.println("Enter a string: ");
        message = scan.nextLine();
        
        System.out.print("Reversed string using a single stack: ");
        // Using a single stack
        PalindromeTester1 tester1 = new PalindromeTester1(message);
        tester1.testPalindrome();
        System.out.println(tester1);

        // Using two stacks
        System.out.print("Reversed string using two stacks: ");
        PalindromeTester2 tester2 = new PalindromeTester2(message);
        tester2.testPalindrome();
        System.out.println(tester2);
    }
}
