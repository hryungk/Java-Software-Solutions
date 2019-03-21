//********************************************************************************
//  MultLeapYear.java      @author: Hyunryung Kim
//
//  Programming Projects 5.2, Chapter 5
//  Modify the solution to the previous project so that the user can evaluate 
//  multiple years. Allow the user to terminate the program using an appropriate
//  sentinel value. Validate each input value to ensure it is greater than or 
//  equal to 1582.
//********************************************************************************

import java.util.Scanner;

public class PP_5_2_MultLeapYear 
{
    //----------------------------------------------------------------------------
    // Reads the user's input of year and determine if the year is a leap year.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int LIMIT_LOW = 1582, SENTI = 0;
        int year;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter the year (" + SENTI + " to quit): ");
        year = scan.nextInt();        
        while (year != 0)
        {
            if (year % 4 == 0)
                if (year % 100 == 0 && year % 400 != 0)
                    System.out.println("The year " + year + " is not a leap year.");
                else
                    System.out.println("The year " + year + " is a leap year.");
            else
                System.out.println("The year " + year + " is not a leap year.");    

            if (year < LIMIT_LOW)
                System.out.println("ERROR: Invalid input. Value is less than " 
                                    + LIMIT_LOW + ".");

            System.out.print("Enter the year (" + SENTI + " to quit): ");
            year = scan.nextInt();
        }
    }
}
