//********************************************************************************
//  PalindromeTester.java       Author: Hyunryung Kim
//
//  Test a string whether it is a palindrome using recursion.
//********************************************************************************

import java.util.Scanner;

public class PalindromeTester
{
    private String strToTest;
    private boolean isPalindrome;
    
    //----------------------------------------------------------------------------
    //  Sets up the string to be tested for a palindrome ignoring spaces,
    //  punctuation, and changes in uppercase and lowercase.
    //----------------------------------------------------------------------------    
    public PalindromeTester (String strNew)
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
        boolean result;
        if (strToTest.length() <= 1)
            result = true;
        else
        {
            result = (strToTest.charAt(0) == strToTest.charAt(strToTest.length()-1));
            if (result && strToTest.length() > 2)
            {
                strToTest = strToTest.substring(1, strToTest.length()-1);
                result = testPalindrome();
            }
        }
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
