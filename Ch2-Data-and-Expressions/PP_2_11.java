//********************************************************************************
//  PP_2_11.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Write an application that prompts for and reads the numerator and denominator
//  or a fraction as integers, then prints the decimal equivalent of the fraction.
//********************************************************************************

import java.util.Scanner;

public class PP_2_11 
{
    //----------------------------------------------------------------------------
    //  Reads numerator and denominator of a fraction and prints the decimal equivalent.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        int nom, denom;     // value to convert
        double fract;
        
        System.out.print("Enter the nominator of the fraction: ");
        Scanner scan = new Scanner(System.in);
        nom = scan.nextInt();
        
        System.out.print("Enter the denominator of the fraction: ");
        denom = scan.nextInt();
        
        fract = (double) nom / denom;
        System.out.println("Fraction in decimal equivalent: " + fract);
        
    }   
}
