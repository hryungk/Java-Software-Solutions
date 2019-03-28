//********************************************************************************
//  RandCount.java      @author: Hyunryung Kim
//
//  Programming Projects 7.1, Chapter 7
//  Design and implement an application that reads an arbitrary number of integers
//  that are in the range 0 to 50 inclusive and counts how many occurrences of
//  each are entered. After all input has been processed, print all of the values
//  (with the number of occurrences) that were entered one or more times.
//********************************************************************************

import java.util.Scanner;

public class PP_7_1_RandCount 
{
    //----------------------------------------------------------------------------
    // Reads random number of integers, count, and print them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 50;
        int num;
        int[] numList = new int[MAX+1];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter random integers between 0 and " + MAX 
                + " (values over " + MAX + " will stop accepting numbers):");
        num = scan.nextInt();
        
        while (num <= MAX)
        {
            numList[num] += 1;
            num = scan.nextInt();
        }
        
        System.out.println("Integer  count");
        for (int i = 0; i < numList.length; i++)
        {
            if (numList[i] != 0)
                System.out.println("   " + i + "\t   " + numList[i]);
        }
    }
}
