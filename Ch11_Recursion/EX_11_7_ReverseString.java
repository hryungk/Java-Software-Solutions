//********************************************************************************
//  EX_11_7.java       Author: Hyunryung Kim
//
//  Write a recursive method to reverse a string. Explain why you would not 
//  normally use recursion to solve this problem.
//********************************************************************************
import java.util.Scanner;

public class EX_11_7_ReverseString
{
    //----------------------------------------------------------------------------
    //  Creates a new maze, prints its original form, atresultts to solve it, and 
    //  prints out its final form.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        ReverseString rvs = new ReverseString();
        Scanner scan = new Scanner(System.in);
        String str, result = "";
        
        System.out.print("Enter a string to be reversed: ");
        str = scan.nextLine();
        System.out.println();        
        
        System.out.println("Using Recursion: " + rvs.reverseString(str));
        
        for (int i = 0; i < str.length(); i++)
            result += str.substring(str.length()-i-1,str.length()-i);
        
        System.out.println("Using Iteration: " + result);
    }
}
