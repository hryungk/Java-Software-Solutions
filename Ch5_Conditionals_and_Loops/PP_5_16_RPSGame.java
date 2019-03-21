//********************************************************************************
//  RPSGame.java      @author: Hyunryung Kim
//
//  Programming Projects 5.16, Chapter 5
//  Design and implement an application that plays the Rock-Paper-Scissors game
//  against the computer. When played between two people, each person picks one of
//  three options (usually shown by a hand gesture) at the same time, and a winner
//  is determined. In the game, Rock beats Scissors, Scissors beats Paper, and 
//  Paper beats Rock. The program should randomly choose one of the three options
//  (without revealing it), then prompt for the user's selection. At that point, 
//  the program reveals both choices and prints a statement indicating if the user
//  won, the computer won, or if it was a tie. Continue playing until the user 
//  chooses to stop, then print the number of user wins, losses, and ties.
//********************************************************************************

import java.util.Scanner;

public class PP_5_16_RPSGame 
{
    //----------------------------------------------------------------------------
    // Plays Rock-Paper-Scissors game with the user.
    //----------------------------------------------------------------------------
    public static void main(String[] arg)
    {
        int comp, user;
        int tie = 0, userWin = 0, compWin = 0;
        String another = "y";
        
        while (another.equalsIgnoreCase("y")) // allows y or Y
        {
            comp = (int) (Math.random() * 3);

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter 0 for Rock, 1 for Paper, or 2 for Scissors: ");
            user = scan.nextInt();

            System.out.println("Computer: " + comp + ", User: " + user);

            if (comp == user)
            {
                tie++;
                System.out.println("We tied.");
            }
            else
            {
                switch (comp)
                {
                    case 0:  // Rock
                        switch (user)
                        {
                            case 1: // Paper
                                userWin++;
                                System.out.println("You won!");
                                break;
                            case 2: // Scissors
                                compWin++;
                                System.out.println("I won!");
                                break;
                            default:
                                System.out.println("Error in Identification Character.");
                        }
                        break;
                    case 1:  // Paper
                        switch (user)
                        {
                            case 2: // Scissors
                                userWin++;
                                System.out.println("You won!");
                                break;
                            case 0: // Rock
                                compWin++;
                                System.out.println("I won!");
                                break;
                            default:
                                System.out.println("Error in Identification Character.");
                        }
                        break;
                    case 2:   // Scissors
                        switch (user)
                        {
                            case 0:  // Rock
                                userWin++;
                                System.out.println("You won!");
                                break;
                            case 1:  // Paper
                                compWin++;
                                System.out.println("I won!");
                                break;
                            default:
                                System.out.println("Error in Identification Character.");
                        }
                        break;
                    default:
                        System.out.println("Error in Identification Character.");
                }
            }
            
            System.out.println();
            System.out.print("Play another game (y/n)? ");
            another = scan.next();
        }
        System.out.println();
        System.out.println("User won " + userWin + " time(s), lost " + compWin 
                + " time(s), tied " + tie + " time(s)");
    }
}
