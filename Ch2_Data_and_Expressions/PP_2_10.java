//********************************************************************************
//  PP_2_10.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Write an application that prompts for and reads an integer representing the 
//  length of a square's side, then prints the square's perimeter and area.
//********************************************************************************

import java.util.Scanner;

public class PP_2_10 
{
    //----------------------------------------------------------------------------
    //  Reads the length of a square and prints its perimeter and area.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {    
        int sqrLen;     // value to convert
        int perim, area;
        
        System.out.print("Enter the length of the square's side: ");
        Scanner scan = new Scanner(System.in);
        sqrLen = scan.nextInt();
        
        perim = sqrLen * 4;
        area = sqrLen * sqrLen;
        
        System.out.println("Perimeter of the square: " + perim);      
        System.out.println("Area of the square: " + area);
        
    }   
}
