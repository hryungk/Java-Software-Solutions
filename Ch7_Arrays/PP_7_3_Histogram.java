//********************************************************************************
//  Histogram.java      @author: Hyunryung Kim
//
//  Programming Projects 7.3, Chapter 7
//  Design and implement an application that creates a histogram that allows you 
//  to visually inspect the frequency distribution of a set of values. The program
//  should read in an arbitrary number of integers that are in the range 1 to 100 
//  inclusive; then produce a chart similar to the one below that indicates how
//  many input values fell in the range 1 to 10, 11 to 20, and so on. Print one
//  asterisk for each value entered.
//********************************************************************************

import java.util.Scanner;

public class PP_7_3_Histogram 
{
    //----------------------------------------------------------------------------
    // Reads random number of integers, count, and print them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 100, SECTIONS = 10, RANGESPACE = 10;
        int inc = MAX / SECTIONS;
        int num;
        int[] numList = new int[MAX];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter random integers between 1 and " + MAX + 
                " (values over " + MAX + " will stop accepting numbers):");
        num = scan.nextInt();
        
        while (num <= MAX)
        {
            numList[num-1] += 1;
            num = scan.nextInt();
        }
        
        for (int i = 0; i < SECTIONS; i++)
        {
            int sum = 0;
            for (int j = i*inc; j < (i+1)*inc; j++)
            {
                sum += numList[j];
            }
            
            // Create string of the left column
            String range = "" + (i*inc + 1);    // lower bound of the range
            if (range.length() < 2)
                range += " ";   // Add a space after the  number if it's 1 digit.
            range += " - " + ((i+1)*inc);   // Add the upper bound of the range
            // Length of space to be added
            int spaceLen = RANGESPACE - range.length(); 
            for (int s = 1; s <= spaceLen; s++)
                range += " ";   // Add space at the end of the string
            System.out.print(range + "|  ");
            
            // Show histogram with asterisks
            for (int k = 1; k <= sum; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
// 1 1 4 10 10 11 20 21 21 22 22 23 23 24 24 25 25 26 26 27 27 28 28 29 29 30 30
// 41 45 50 51 52 52 53 55 57 58 60 61 70 71 73 75 79 80 
// 81 83 84 85 86 88 90 91 92 93 94 95 96 97 100
// 101