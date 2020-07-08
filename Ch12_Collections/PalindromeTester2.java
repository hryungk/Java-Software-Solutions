//********************************************************************************
//  PalindromeTester2.java       Author: Hyunryung Kim
//
//  Test a string whether it is a palindrome using two stacks.
//********************************************************************************

import java.util.Scanner;
import java.util.Stack;

public class PalindromeTester2
{
    private String strToTest;
    private boolean isPalindrome;
    
    //----------------------------------------------------------------------------
    //  Sets up the string to be tested for a palindrome ignoring spaces,
    //  punctuation, and changes in uppercase and lowercase.
    //----------------------------------------------------------------------------    
    public PalindromeTester2 (String strNew)
    {
        Scanner strScan = new Scanner(strNew);
        strScan.useDelimiter("[ ,;.']");
        String strRaw = "";

        while(strScan.hasNext())
        {
            strRaw +=strScan.next();
        }

        strToTest = strRaw.toLowerCase();
    }

    //----------------------------------------------------------------------------
    //  Test whether the conditioned string is a palindrome using recursion.
    //----------------------------------------------------------------------------        
    public boolean testPalindrome()
    {
        boolean result = true;
        Stack word = new Stack();
        int index = 0;
        char curChar;
        while (index < strToTest.length())
        {
            // Push word onto stack
            word.push(strToTest.charAt(index));
            index++;             
        }
        
        // Print word in reverse
        index = 0;
        // char curChar;
        while (!word.empty())
        {
            curChar = (Character)word.pop();
            result = result && (curChar == strToTest.charAt(index));
            System.out.print(curChar);
            index++;
        }
        System.out.println();
        
        isPalindrome = result;
        return result;
    }

    //----------------------------------------------------------------------------
    //  Prints out the palindrome test result.
    //----------------------------------------------------------------------------        
    public String toString()
    {
        String result;
        if (isPalindrome)
                result = "That string IS a palindrome.";
            else
                result = "That string is NOT a palindrome.";
        return result;
    }
}
