//********************************************************************************
//  TriArea.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 3
//  Write an application that reads the lengths of the sides of a triangle from
//  the user. Compute the area of the triangle using Heron's formula (below), 
//  in which s represents half of the perimeter of the triangle, and a, b, and c
//  represent the lengths of the three sides. Print the area to three decimal places.
//  Area = sqrt(s(s - a)(s - b)(s - c))
//********************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class PP_3_6_TriArea
{
    //----------------------------------------------------------------------------
    //  Reads lengths of triangle sides and prints its area.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        double a, b, c, s, area;
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        System.out.print("Enter the length of the traingle, side 1: ");
        a = scan.nextDouble();
        System.out.print("Enter the length of the traingle, side 2: ");
        b = scan.nextDouble();
        System.out.print("Enter the length of the traingle, side 3: ");
        c = scan.nextDouble();
        
        s = (a + b + c)/2;  // half of the perimeter of the triangle
        
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("Area of the triangle: " + fmt.format(area));
    }   
}
