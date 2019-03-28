//********************************************************************************
//  Histogram.java      @author: Hyunryung Kim
//
//  Programming Projects 7.4, Chapter 7
//  The lines in the histogram in PP 7.3 will be too long if a large number of 
//  values is entered. Modify the program so that it prints an asterisk for every
//  five values in each category. Ignore leftovers. For example, if a category had
//  17 values, print three asterisks in that row. If a category had 4 values, do
//  not print any asterisks in that row.
//********************************************************************************

import java.util.Scanner;

public class PP_7_4_Histogram 
{
    //----------------------------------------------------------------------------
    // Reads random number of integers, count, and print them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 100, SECTIONS = 10, RANGESPACE = 10;
        final int EVERY = 5;    // print one * every 5 counts
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
            for (int k = 1; k <= (sum - sum % EVERY)/EVERY; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
