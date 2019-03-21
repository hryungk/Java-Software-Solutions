//********************************************************************************
//  Stars_d.java      @author: Hyunryung Kim
//
//  Programming Projects 5.13, Chapter 5
//  Create modified versions of the Stars program to print the following patterns.
//  Create a separate program to produce each pattern. Hint: Parts b, c, and d 
//  require several loops, some of which prints a specific number of spaces.
//********************************************************************************

public class PP_5_13_Stars_d 
{
    //----------------------------------------------------------------------------
    //  Prints a triangle shape using asterisk (star) characters.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX_ROWS = 10;
        
        for (int row = 1; row <= MAX_ROWS/2; row++)
        {
            for (int space = 1; space <= MAX_ROWS/2-row; space++)
                System.out.print(" ");
            for (int star = 1; star <= 2*row-1; star++)
                System.out.print("*");
            
            System.out.println();
        }
        for (int row = MAX_ROWS/2+1; row <= MAX_ROWS; row++)
        {
            for (int space = 1; space <= row-MAX_ROWS/2-1; space++)
                System.out.print(" ");
            for (int star = 1; star <= 2*MAX_ROWS-(2*row-1); star++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}
