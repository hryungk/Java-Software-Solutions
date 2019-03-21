//********************************************************************************
//  SlotMachine.java      @author: Hyunryung Kim
//
//  Programming Projects 5.18, Chapter 5
//  Design and implement an application that simulates a simple slot machine in 
//  which three numbers between 0 and 9 are randomly selected and printed side by 
//  side. Print an appropriate statement if all three of the numbers are the same,
//  or if any two of the numbers are the same. Continue playing until the user 
//  chooses to stop.
//********************************************************************************

import java.util.Scanner;

public class PP_5_18_SlotMachine 
{
    //----------------------------------------------------------------------------
    // Plays slot machine games that randomly select three numbers.
    //----------------------------------------------------------------------------
    public static void main(String[] arg)
    {
        int num1, num2, num3;
        String another = "y";
        Scanner scan = new Scanner(System.in);
        
        while (another.equalsIgnoreCase("y")) // allows y or Y
        {
            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);
            num3 = (int) (Math.random() * 10);
            
            System.out.println("Three numbers randomly selected: " 
                                + num1 + ", " + num2 + ", " + num3);

            if (num1==num2 && num2==num3)
                System.out.println("All three are matching. You won!");
            else
            {
                if (num1 == num2 || num2 == num3 || num1 == num3)
                    System.out.println("Two of three are maching. So close!");
                else
                    System.out.println("No matching numbers. Good luck next time!");
            }
            
            System.out.println();
            System.out.print("Play another game (y/n)? ");
            another = scan.next();
        }        
    }
}
