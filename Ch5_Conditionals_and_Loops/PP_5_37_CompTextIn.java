//********************************************************************************
//  CompTextIn.java      @author: Hyunryung Kim
//
//  Programming Projects 5.37, Chapter 5
//  Design and implement a program that compares two text input files, line by 
//  line, for equality. Print any lines that are not equilvalent. 
//********************************************************************************
import java.util.Scanner;
import java.io.*;

public class PP_5_37_CompTextIn 
{
    //----------------------------------------------------------------------------
    // Reads two files and compare line by line.
    //----------------------------------------------------------------------------
    public static void main(String[] args) throws IOException
    {
        String line1, line2;
        Scanner fileScan1, fileScan2;
        
        fileScan1 = new Scanner (new File("PP_5_37_1.inp"));
        fileScan2 = new Scanner (new File("PP_5_37_2.inp"));
        
        //  Read and process each line of the file
        while (fileScan1.hasNext())
        {
            line1 = fileScan1.nextLine();
            line2 = fileScan2.nextLine();
            
            if (!(line1.equals(line2)))
            {
                System.out.println(line1);
                System.out.println(line2);
            }
        }
    }
}
