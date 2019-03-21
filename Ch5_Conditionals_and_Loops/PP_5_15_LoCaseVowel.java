//********************************************************************************
//  LoCaseVowel.java      @author: Hyunryung Kim
//
//  Programming Projects 5.15, Chapter 5
//  Design and implement an application that reads a string from the user, then 
//  determines and prints how many of each lowercase vowel (a, e, i, o, and u)
//  appears in the entire string. Have a separate counter for each vowel. Also
//  count and print the number of nonvowel characters.
//********************************************************************************

import java.util.Scanner;

public class PP_5_15_LoCaseVowel 
{
    //----------------------------------------------------------------------------
    //  Counts lowercase vowels in the input string.
    //----------------------------------------------------------------------------
    public static void main(String[] arg)
    {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        int count = 0;
        String str;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = scan.next();
        
        System.out.println("Total number of characters in the string: " 
                            + str.length());
        
        while(count < str.length())
        {
            switch(str.charAt(count))
            {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
            count++;
        }
        
        System.out.println("Number of a in the string: " + a);
        System.out.println("Number of e in the string: " + e);
        System.out.println("Number of i in the string: " + i);
        System.out.println("Number of o in the string: " + o);
        System.out.println("Number of u in the string: " + u);
        System.out.println("Number of nonvowel in the string: " 
                + (str.length()-(a+e+i+o+u)));
    }
}
