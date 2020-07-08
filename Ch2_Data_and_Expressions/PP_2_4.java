//********************************************************************************
//  PP_2_4.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Create a version of the TempConverter application to convert 
//  from Fahrenheit to Celsius. Read the Fahrenheit temperature from the user.
//********************************************************************************

import java.util.Scanner;

public class PP_2_4 
{
    //----------------------------------------------------------------------------
    //  Computes the Celsius equivalent of a specific Fahrenheit
    //  value using the forula C = (F - 32)*(5/9).
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int BASE = 32;    // declaration with initialization
        final double CONVERSION_FACTOR = 9.0 / 5.0; 
        
        int fahrenheitTemp;     // value to convert
        double celsiusTemp;
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        Scanner scan = new Scanner(System.in);
        fahrenheitTemp = scan.nextInt();
        
        celsiusTemp = (fahrenheitTemp - BASE)/CONVERSION_FACTOR ;
        
        System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);      
        System.out.println("Celsius Equivalent: " + celsiusTemp);
        
    }   
}
