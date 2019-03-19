//********************************************************************************
//  GenUserName.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 3
//  Write a program that prompts for and reads the user’s first and last name 
//  (separately). Then print a string composed of the first letter of the 
//  user’s first name, followed by the first five characters of the user's last 
//  name, followed by a random number in the range 10 to 99. Assume that the last 
//  name is at least five letters long. Similar algorithms are sometimes used to 
//  generate usernames for new computer accounts.
//********************************************************************************

import java.util.Scanner;
import java.util.Random;

public class PP_3_1_GenUserName
{
    //----------------------------------------------------------------------------
    //  Reads a character string from the user, creates a user name, and prints it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter your first name: ");
        String firstName = scan.next();
        System.out.print("Enter your last name: ");
        String lastName = scan.next();
        System.out.println(firstName.charAt(0) + lastName.substring(0,5) 
                + (rand.nextInt(90)+10));
    }   
}
