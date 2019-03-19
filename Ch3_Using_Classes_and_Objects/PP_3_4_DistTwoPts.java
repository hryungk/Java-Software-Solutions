//********************************************************************************
//  DistTwoPts.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 3
//  Write an application that reads the (x,y) coordinates for two points.
//  Compute the distance between the two points using the following formula:
//  Distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
//********************************************************************************

import java.util.Scanner;

public class PP_3_4_DistTwoPts
{
    //----------------------------------------------------------------------------
    //  Reads two pairs of numbers (x1,y1) and (x2,y2) and calculates the distance.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        double x1, y1, x2, y2, Dist;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1: ");
        x1 = scan.nextDouble();
        System.out.print("Enter y1: ");
        y1 = scan.nextDouble();
        System.out.print("Enter x2: ");
        x2 = scan.nextDouble();
        System.out.print("Enter y2: ");
        y2 = scan.nextDouble();
        
        Dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("Distance between two points: " + Dist);
    }   
}
