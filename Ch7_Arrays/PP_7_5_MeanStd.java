//********************************************************************************
//  MeanStd.java      @author: Hyunryung Kim
//
//  Programming Projects 7.5, Chapter 7
//  Design and implement an application that computes and prints the mean and 
//  standard deviation of a list of integers x1 through xn. Assume that there will
//  be no more than 50 input values. Compute both the mean and standard deviation
//  as floating point values.
//********************************************************************************

import java.util.Random;

public class PP_7_5_MeanStd 
{
    //----------------------------------------------------------------------------
    // Reads random number of integers, count, and print them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 50;
        int listLen, sum = 0;
        double mean, dev = 0.0, std;
        
        int[] x = new int[MAX];
        
        Random generator = new Random();
        
        listLen = generator.nextInt(MAX+1);
        for (int i = 0; i < listLen; i++)
            x[i] = generator.nextInt();
        
        for (int i = 0; i < listLen; i++)
            sum += x[i];
        mean = (double)sum / listLen;
        
        for (int i = 0; i < listLen; i++)
            dev += Math.pow(x[i] - mean,2);
        std = Math.sqrt(dev);
        
        System.out.println("Total number of integers in the list: " + listLen);
        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + std);
    }
}
