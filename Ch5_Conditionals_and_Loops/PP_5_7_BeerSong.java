//********************************************************************************
//  BeerSong.java      @author: Hyunryung Kim
//
//  Programming Projects 5.7, Chapter 5
//  Design and implement an application that prints the first few verses of the 
//  traveling song "One Hundred Bottles of Beer." Use a loop such that each
//  iteration prints one verse. Read the number of verses to print from the user. 
//  Validate the input. 
//********************************************************************************

import java.util.Scanner;

public class PP_5_7_BeerSong 
{
    //----------------------------------------------------------------------------
    // Reads the user's input value and prints that number of verses of the song.
    //----------------------------------------------------------------------------
    
    public static void main(String[] arg)
    {
        final int MAX = 100;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = scan.nextInt();
        
        if (num <= 0 || num > MAX)
            System.out.println("ERROR: Invalidi input. Value is less than or "
                                + "equal to 0 or grater than " + MAX + ".");
        else
        {
            for (int i = 1; i <= num; i++)
            {
                System.out.println((MAX-i+1) + " bottles of beer on the wall");
                System.out.println((MAX-i+1) + " bottles of beer");
                System.out.println("If one of those bottles should happen to fall");
                System.out.println((MAX-i) + " bottles of beer on the wall");
            }
        }
    }
}
