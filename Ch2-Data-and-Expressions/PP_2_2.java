//********************************************************************************
//  PP_2_2.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Write an application that reads three integers and prints their average.
//********************************************************************************

import java.util.Scanner;

public class PP_2_2 
{
    //----------------------------------------------------------------------------
    //  Scans three integers, calculate their average, and print it out.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int Int1, Int2, Int3;
        double avg;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1st integer: ");
        Int1 = scan.nextInt();
        
        System.out.println("Enter 2nd integer: ");
        Int2 = scan.nextInt();
        
        System.out.println("Enter 3rd integer: ");
        Int3 = scan.nextInt();
        
        System.out.println("You entered: " + Int1 + ", " + Int2 + ", " + Int3);
        
        avg = (Int1 + Int2 + Int3)/3;
        System.out.println("The average of three integers: " + avg);
             
    }   
}
