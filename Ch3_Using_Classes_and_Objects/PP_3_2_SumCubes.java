//********************************************************************************
//  SumCubes.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 3
//  Write an application that prints the sum of cubes. Prompt for and read
//  two integer values and print the sum of each value raised to the third power.
//********************************************************************************

import java.util.Scanner;
import java.util.Random;

public class PP_3_2_SumCubes
{
    //----------------------------------------------------------------------------
    //  Reads two int values and prints the sum of cubes of each int.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        num1 = scan.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = scan.nextInt();
        
        num3 = (int) (Math.pow(num1,3) + Math.pow(num2,3));
        System.out.println("Sum of cubes: " + num3);
    }   
}
