//********************************************************************************
//  LeapYear.java      @author: Hyunryung Kim
//
//  Programming Projects 5.1, Chapter 5
//  Write a program that reads an integer value from the user representing a year.
//  The purpose of the program is to determine if the year is a leap year (and
//  therefore has 29 days in February) in the Gregorian calendar. A year is a leap
//  year if it is divisible by 4, unless it is also divisible by 100 but not 400. 
//  For example, the year 2003 is not a leap year, but 2004 is. The year 1900 is 
//  not a leap year because it is divisible by 100, but the year 2000 is a leap 
//  year because even though it is divisible by 100, it is also divisible by 400.
//  Produce an error message for any inptu value less than 1582 (the year the 
//  Gregorian calendar was adopted).
//********************************************************************************

import java.util.Scanner;

public class PP_5_1_LeapYear 
{
    //----------------------------------------------------------------------------
    // Reads the user's input of year and determine if the year is a leap year.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int LIMIT_LOW = 1582;
        int year;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter the year: ");
        year = scan.nextInt();
        
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
    }
}
