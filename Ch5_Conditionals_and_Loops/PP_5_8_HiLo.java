//********************************************************************************
//  HiLo.java      @author: Hyunryung Kim
//
//  Programming Projects 5.8, Chapter 5
//  Write a program that plays the Hi-Lo guessing game with numbers. The program
//  should pick a random nubmer between 1 and 100 (inclusive), then repeatedly
//  prompt the user to guess the number. On each guess, report to the user that he
//  or she is correct or that the guess is high or low. Continue accepting guesses
//  until the user guesses correctly or chooses to quit. Use a sentinel value to 
//  determine whether the use rwants to quit. Count the number of guesses and
//  report that value when the user guesses correctly. At the end of each game (by
//  quitting or a correct guess), prompt to determine whether the user wants to
//  play again. Continue playing games until the user chooses to stop.
//********************************************************************************

import java.util.*;

public class PP_5_8_HiLo 
{
    //----------------------------------------------------------------------------
    // Plays a simple guessing game with the user.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 100, SENTI = 0;
        int answer, guess;
        
        Scanner scan = new Scanner (System.in);
        Random generator = new Random();
        
        answer = generator.nextInt(MAX) + 1;        
        
        System.out.print("I'm thinking of a number between 1 and "
        + MAX + ". Guess what it is: ");
        
        guess = scan.nextInt();  
        
        while(guess != answer && guess != 0)
        {
            if (guess < answer)
                System.out.print("Your guess is Low. Try again (" +
                        SENTI + " to quit): ");
            else
                System.out.print("Your guess is High. Try again (" +
                        SENTI + " to quit): ");
            guess = scan.nextInt();
        }
        
        if (guess == answer)
            System.out.println("Your guess is correct!");
    }
}
