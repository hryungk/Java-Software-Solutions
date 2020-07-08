//********************************************************************************
//  EuclidAlgorithm.java      author: Hyunryung Kim
//
//  Programming Projects 11.2, Chapter 11 Recursion
//  Design and implement a program that implements Euclid’s algorithm for finding 
//  the greatest common divisor of two positive integers. The greatest common 
//  divisor is the largest integer that divides both values without producing a 
//  remainder. An iterative version of this method was part of the RationalNumber 
//  class presented in Chapter 7. In a class called DivisorCalc, define a static 
//  method called gcd that accepts two integers, num1 and num2. Create a driver to 
//  test your implementation.
//********************************************************************************

import java.util.Scanner;

public class PP_11_2_EuclidAlgorithm 
{
    //----------------------------------------------------------------------------
    // Find the greatest common divisor using Euclid's algorithm.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int num1, num2, gcdValue;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
                
        gcdValue = DivisorCalc.gcd(num1, num2);
        
        System.out.println("GCD of " + num1 + " and " + num2 + ": " + gcdValue);
    }
}
