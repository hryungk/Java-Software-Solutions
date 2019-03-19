//********************************************************************************
//  PP_2_7.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Create a version of the previous project that reverses the computation.
//  That is, read a value representing a number of seonds, then print the
//  equivalent amount of time as a combination of hours, minutes, and seconds.
//  (For example, 9999 seconds is equivalent to 2 hours, 46 minutes, and 39 seconds.
//********************************************************************************

import java.util.Scanner;

public class PP_2_7 
{
    //----------------------------------------------------------------------------
    //  Conver the time entered in seconds to hours/minutes/seconds.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int CONVERSION_FACTOR = 60; 
        
        int seconds;    // value to convert
        int hrs, minquot, mins, secs;     
        
        System.out.print("Enter the time in seconds: ");
        Scanner scan = new Scanner(System.in);
        seconds = scan.nextInt();
        
        secs = seconds % CONVERSION_FACTOR;
        minquot = (seconds - secs)/CONVERSION_FACTOR;
        mins = minquot % CONVERSION_FACTOR;
        hrs = (minquot - mins)/CONVERSION_FACTOR;
        
        System.out.println("Input time: " + seconds + " seconds");
        System.out.println("Equivalent to: " + hrs + " hour(s) " + mins + 
                " minute(s) " + secs + " second(s)");      
        
        
    }   
}
