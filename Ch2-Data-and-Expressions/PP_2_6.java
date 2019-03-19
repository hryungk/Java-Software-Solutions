//********************************************************************************
//  PP_2_6.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Write an application that reads values representing a time duration
//  in hours, minutes, and seconds, and then prints the equivalent total number 
//  of seconds. (For example, 1 hour, 28 minutes, and 42 seconds is equivalent to
//  5322 seconds.)
//********************************************************************************

import java.util.Scanner;

public class PP_2_6 
{
    //----------------------------------------------------------------------------
    //  Conver the time entered in hours/minutes/seconds to seconds.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int CONVERSION_FACTOR = 60; 
        
        int hrs, mins, secs;     // value to convert
        int seconds;
        
        System.out.print("Enter the time, hours: ");
        Scanner scan = new Scanner(System.in);
        hrs = scan.nextInt();
        
        System.out.print("Enter the time, minutes (0-59): ");
        mins = scan.nextInt();
        
        System.out.print("Enter the time, seconds (0-59): ");
        secs = scan.nextInt();
        
        seconds = CONVERSION_FACTOR*CONVERSION_FACTOR*hrs + CONVERSION_FACTOR*mins+ secs;
        
        System.out.println("Input time: " + hrs + " hour(s) " + mins + 
                " minute(s) " + secs + " second(s)");      
        System.out.println("Total: " + seconds + " seconds");
        
    }   
}
