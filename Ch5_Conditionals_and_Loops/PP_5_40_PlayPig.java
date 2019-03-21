//********************************************************************************
//  PlayPig.java      @author: Hyunryung Kim
//
//  Programming Projects 5.40, Chapter 5
//  Using the PairOfDice class from PP 4.7, design and implement a class to play a
//  game called Pig. In this game, the user competes against the computer. On each
//  turn, the current player rolls a pair of dice and accumulates points. The goal
//  is to reach 100 points before your opponent does. If, on any turn, the player
//  rolls a 1, all points accumulated for that round are forfeited and control of
//  the dice moves to the other player. If the player rolls two 1s in one turn, 
//  the player loses all points accumulated thus far in the game and loses control
//  of the dice. The player may voluntarily turn over the dice after each roll. 
//  Therefore the player must decide to either roll again (be a pig) and risk
//  losing points, or relinquish control of the dice, possibly allowing the other
//  player to win. Implement the computer player such that it always relinquishes
//  the dice after accumulating 20 or more points in any given round.
//********************************************************************************

import java.util.Scanner;

public class PP_5_40_PlayPig 
{
    //----------------------------------------------------------------------------
    // Plays the Pig game with the computer.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int GOAL = 100;
        PairOfDice diceUser, diceComp;
        int totUser = 0, totComp = 0;
        String another;
        Scanner scan = new Scanner(System.in);
        
        diceUser = new PairOfDice();
        diceComp = new PairOfDice();
        while (totComp < GOAL && totUser < GOAL)
        {
            System.out.println("Computer's turn:");
            int rndComp = 0;
            do
            {
                diceComp.roll();
                System.out.println(diceComp);

                if (diceComp.getFaceValue1() == 1 && diceComp.getFaceValue2() == 1)
                {
                    System.out.println("Two 1s are rolled. I lose all my "
                             + totComp + " points.");
                    totComp = 0;
                    break;
                }
                else
                {
                    if (diceComp.getFaceValue1() == 1 || diceComp.getFaceValue2() == 1)
                    {
                        System.out.println("A 1 is rolled. I lose the current "
                                +"round's point " + rndComp + ".");
                        rndComp = 0;
                        break;
                    }
                    else
                    {
                        rndComp += diceComp.sum();
                    }
                }
            } while (rndComp < 20);
            totComp += rndComp;
            System.out.println("Computer ends the round with " + totComp 
                    + " point(s).");
            if (totComp >= GOAL)
            {
                System.out.println("Computer won!");
                break;
            }

            System.out.println("User's turn:");
            int rndUser = 0;
            do
            {
                diceUser.roll();
                System.out.println(diceUser);

                if (diceUser.getFaceValue1() == 1 && diceUser.getFaceValue2() == 1)
                {   
                    System.out.println("Two 1s are rolled. You lose all your "
                             + totUser + " points.");
                    totUser = 0;
                    break;
                }
                else
                {
                    if (diceUser.getFaceValue1() == 1 || diceUser.getFaceValue2() == 1)
                    {
                        System.out.println("A 1 is rolled. I lose the current "
                                +"round's point " + rndUser + ".");
                        rndUser = 0;
                        break;
                    }
                    else
                    {
                        rndUser += diceUser.sum();
                        System.out.print("Roll again (y/n)?: ");
                        another = scan.next();
                    }
                }

            } while (another.equalsIgnoreCase("y"));
            totUser += rndUser;        
            System.out.println("User ends the round with " + totUser + " point(s).");
            if (totUser >= GOAL)
                System.out.println("You won!");
        }
        
    }
}
