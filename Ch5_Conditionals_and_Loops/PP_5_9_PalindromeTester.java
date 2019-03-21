//********************************************************************************
//  PalindromeTester.java      @author: Hyunryung Kim
//
//  Programming Projects 5.9, Chapter 5
//  Create a modified version of the PalindromeTester program so that the spaces,
//  punctuation, and changes in uppercase and lowercase are not considered when
//  determining whether a string is palindrome. Hint: These issues can be handled 
//  in several ways. Think carefully about your design. 
//********************************************************************************

import java.util.Scanner;

public class PP_5_9_PalindromeTester 
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
            System.out.println("Enter a potential palindrome:");
            strNew = scan.nextLine();
            
            Scanner strScan = new Scanner(strNew);
            strScan.useDelimiter("[ ,;.']");
            String strRaw = "";
            
            while(strScan.hasNext())
            {
                strRaw +=strScan.next();
            }
            
            str = strRaw.toLowerCase();
            System.out.println(str);
            
            left = 0;
            right = str.length() - 1;
            
            while (str.charAt(left) == str.charAt(right) && left < right)
            {
                left++;
                right--;
            }
            
            System.out.println();
            
            if (left < right)
                System.out.println("That string is NOT a palindrome.");
            else
                System.out.println("That string IS a palindrome.");
            
            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }
}
