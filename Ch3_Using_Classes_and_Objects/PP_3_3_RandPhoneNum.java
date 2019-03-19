//********************************************************************************
//  RandPhoneNum.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 3
//  Write a program that creates and prints a random phone number of the form 
//  XXX–XXX–XXXX. Include the dashes in the output. Do not let the first three 
//  digits contain an 8 or 9 (but don’t be more restrictive than that), and make 
//  sure that the second set of three digits is not greater than 742. Hint: Think 
//  through the easiest way to construct the phone number. Each digit does not 
//  have to be determined separately.
//********************************************************************************

import java.util.Random;
import java.text.DecimalFormat;

public class PP_3_3_RandPhoneNum
{
    //----------------------------------------------------------------------------
    //  Creates a random phone number.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int num1_1, num1_2, num1_3, num2 ,num3;
        Random rand = new Random();
        DecimalFormat fmt1 = new DecimalFormat("000");
        DecimalFormat fmt2 = new DecimalFormat("0000");
        
        num1_1 = rand.nextInt(8);
        num1_2 = rand.nextInt(8);
        num1_3 = rand.nextInt(8);
        
        num2 = rand.nextInt(742);
        
        num3 = rand.nextInt(10000);
        
        System.out.print(num1_1);
        System.out.print(num1_2);
        System.out.println(num1_3 + "-" + fmt1.format(num2) + "-" 
                + fmt2.format(num3));
                
    }   
}
