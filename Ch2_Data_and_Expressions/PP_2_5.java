//********************************************************************************
//  PP_2_5.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Write an application that converts miles to kilometers. (One mile equals 
//  1.60935 kilometers.) Read the miles value from the user as a floating point 
//  value.
//********************************************************************************

import java.util.Scanner;

public class PP_2_5 
{
    //----------------------------------------------------------------------------
    //  Computes the kilometers equivalent of a specific miles
    //  value using the formula mile = 1.60935 km.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final double CONVERSION_FACTOR = 1.60935; 
        
        double km;     // value to convert
        double miles;
        
        System.out.print("Enter the length in miles: ");
        Scanner scan = new Scanner(System.in);
        miles = scan.nextDouble();
        
        km = CONVERSION_FACTOR*miles;
        
        System.out.println("Miles: " + miles);      
        System.out.println("Kilometer Equivalent: " + km);
        
    }   
}
