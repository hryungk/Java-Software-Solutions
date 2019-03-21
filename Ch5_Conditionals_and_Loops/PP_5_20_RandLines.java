//********************************************************************************
//  RandLines.java      @author: Hyunryung Kim
//
//  Programming Projects 5.20, Chapter 5
//  Design and implement a program that draws 20 horizontal, evenly spaced 
//  parallel lines of random length.
//********************************************************************************

import java.util.Random;
public class PP_5_20_RandLines 
{
    //----------------------------------------------------------------------------
    // Draws 20 lines with random lengths.
    //----------------------------------------------------------------------------
    public static void main(String[] args)
    {
        final int MAX = 100, LINE = 20;
        int num;
        Random generator = new Random();
        
        for (int i = 1; i <= LINE; i++)
        {
            num = generator.nextInt(MAX) + 1;
            for (int j = 1; j <= num; j++)
                System.out.print("-");
            
            System.out.println();
        }
    }
}
