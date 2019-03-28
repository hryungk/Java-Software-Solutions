//********************************************************************************
//  ZipBody.java      @author: Hyunryung Kim
//
//  Programming Projects 7.8, Chapter 7
//  Design and implement an application that reads a sequence of up to 25 pairs of
//  names and postal (ZIP) codes for individuals. Store the data in an object
//  designed to store a first name (string), last name (string), and postal code
//  (integer). Assume each line of input will contain two strings followed by an 
//  integer value, each separated by a tab character. Then, after the input has 
//  been read in, print the list in an appropriate format to the screen.
//********************************************************************************

import java.util.Scanner;
import java.io.*;

public class PP_7_8_ZipBody 
{
    //----------------------------------------------------------------------------
    // Creates some bank zip codes and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args)  throws IOException
    {
        final int MAX = 25;
        String line, first, last;
        int zip;
        int count = 0;
        Zip[] zipCodes = new Zip[MAX];
        Scanner fileScan = new Scanner(new File("PP_7_8.inp"));
        Scanner lineScan;
        
        
        while (fileScan.hasNext() && count < MAX)
        {
            line = fileScan.nextLine();
            lineScan = new Scanner(line);
            lineScan.useDelimiter("\t");
            
            first = lineScan.next();
            last = lineScan.next();
            zip = lineScan.nextInt();
            zipCodes[count] = new Zip(first,last,zip);
            count++;
            if (count == MAX)
                System.out.println("You have reached the maximum number of "
                        + "input. New data will be neither scanned nor stored.");
        }
        
        for (int i = 0; i < count; i++)
            System.out.println(zipCodes[i]);
    }
}
