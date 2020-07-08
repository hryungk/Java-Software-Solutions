//********************************************************************************
//  PP_2_3.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Write an application that reads two floating point numbers and 
//  prints their sum, difference, and product.
//********************************************************************************

import java.util.Scanner;

public class PP_2_3 
{
    //----------------------------------------------------------------------------
    //  Scans two integers, calculate their sum, difference, and product, 
    //  and print them out.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        double fp1, fp2;
        double Sum, Diff, Prod;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 1st floating point: ");
        fp1 = scan.nextDouble();
        
        System.out.print("Enter 2nd floating point: ");
        fp2 = scan.nextDouble();
               
        System.out.println("You entered: " + fp1 + " and " + fp2);
        
        Sum = fp1 + fp2;
        Diff = fp1 - fp2;
        Prod = fp1 * fp2;
        
        System.out.println("The sum of two numbers: " + Sum);
        System.out.println("The difference of two numbers: " + Diff);
        System.out.println("The product of two numbers: " + Prod);
             
    }   
}
