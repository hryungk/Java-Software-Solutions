//********************************************************************************
//  RandCount.java      @author: Hyunryung Kim
//
//  Programming Projects 7.2, Chapter 7
//  Modify the program from PP 7.1 so that it works for numbers in the range 
//  between -25 and 25.
//********************************************************************************

import java.util.Scanner;

public class PP_7_2_RandCount 
{
    //----------------------------------------------------------------------------
    // Reads random number of integers, count, and print them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 25;
        int num;
        int[] numList = new int[2*MAX+1];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter random integers between " + (-MAX) + " and " 
                + MAX + " (values over " + MAX + " will stop accepting numbers):");
        num = scan.nextInt();
        
        while (num <= MAX && -MAX <= num)
        {
            numList[num+MAX] += 1;
            num = scan.nextInt();
        }
        
        System.out.println("Integer  count");
        for (int i = 0; i < numList.length; i++)
        {
            if (numList[i] != 0)
                System.out.println("   " + (i-MAX) + "\t   " + numList[i]);
        }
    }
}
