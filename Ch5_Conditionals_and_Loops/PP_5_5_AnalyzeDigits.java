//********************************************************************************
//  AnalyzeDigits.java      @author: Hyunryung Kim
//
//  Programming Projects 5.5, Chapter 5
//  Design and implement an application that determines and prints the number of 
//  odd, even, and zero digits in an integer value read from the keyboard.
//********************************************************************************

import java.util.Scanner;

public class PP_5_5_AnalyzeDigits 
{
    //----------------------------------------------------------------------------
    // Reads the user's input value and counts its odd, even, and zero digits.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int num, digt;
        int odd = 0, even = 0, zero = 0;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        num = scan.nextInt();
        
        do
        {
            digt = num % 10;
            if (digt == 0)
                zero++;
            else
                if (digt % 2 == 0)
                    even++;
                else
                    odd++;
            num /= 10;
        } 
        while(num > 0);
        
        System.out.println("Number of odd digits: " + odd);
        System.out.println("Number of even digits: " + even);
        System.out.println("Number of zero digits: " + zero);
    }
}
