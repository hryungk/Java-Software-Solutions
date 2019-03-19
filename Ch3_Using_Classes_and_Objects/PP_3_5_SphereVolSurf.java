//********************************************************************************
//  SphereVolSurf.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 3
//  Write an application that reads the radius of a sphere and prints its volume
//  and surface area. Use the following formulas. Print the output to four decimal
//  places. r represents the radius.
//  Volum = 4/3*pi*r^3
//  Surface area = 4*pi*r^2
//********************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class PP_3_5_SphereVolSurf
{
    //----------------------------------------------------------------------------
    //  Reads a radius of a sphere and prints its volume and surface area.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        double r, Vol, Surf;
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.####");
        System.out.print("Enter the radius of the sphere: ");
        r = scan.nextDouble();
        
        Vol = 4.0/3.0 * Math.PI * Math.pow(r,3);    // Volume of the sphere
        Surf = 4 * Math.PI * Math.pow(r,2);     // Area of the sphere
        
        System.out.println("Volume of the sphere: " + fmt.format(Vol));
        System.out.println("Surface area of the sphere: " + fmt.format(Surf));        
    }   
}
