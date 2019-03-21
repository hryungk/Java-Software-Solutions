//********************************************************************************
//  CountNumber.java      @author: Hyunryung Kim
//
//  Programming Projects 5.19, Chapter 5
//  Design and implement a program that counts the number of integer values in a 
//  text input file. Produce a table listing the values you identify as integers
//  from the input file.
//********************************************************************************

import java.util.Scanner;
import java.io.*;

public class PP_5_19_CountNumber 
{
    //----------------------------------------------------------------------------
    // Reads texts from a file and prints a table listing integers.
    //----------------------------------------------------------------------------
    public static void main(String[] args) throws IOException
    {
        int count = 0;
        String url;
        Scanner fileScan, urlScan;
        
        fileScan = new Scanner (new File("urls.inp"));
        
        //  Read and process each line of the file
        while (fileScan.hasNext())
        {
            url = fileScan.nextLine();
            
            urlScan = new Scanner(url);
            urlScan.useDelimiter("[ ,;.'/]");
            
            //  Print each part of the url
            while (urlScan.hasNextInt())
            {
                System.out.println("   " + urlScan.nextInt());
                count++;
            }
        }
        System.out.println("Number of integers in the file: " + count);
    }
}
