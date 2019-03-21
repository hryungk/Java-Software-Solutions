//********************************************************************************
//  FindPunc.java      @author: Hyunryung Kim
//
//  Programming Projects 5.38, Chapter 5
//  Design and implement a program that counts the number of punctuation marks in
//  a text input file. Produce a tale that shows how many times each symbol 
//  occurred.
//********************************************************************************
import java.util.Scanner;
import java.io.*;

public class PP_5_38_FindPunc 
{
    //----------------------------------------------------------------------------
    // Reads two files and compare line by line.
    //----------------------------------------------------------------------------
    public static void main(String[] args) throws IOException
    {
        String line;
        Scanner fileScan;
        int prd = 0, semcln = 0, comma = 0, aps = 0;
        
        fileScan = new Scanner (new File("PP_5_38.inp"));
        
        //  Read and process each line of the file
        while (fileScan.hasNext())
        {
            line = fileScan.nextLine();
           
            for (int i = 0; i < line.length(); i++)
            {
                switch (line.charAt(i))
                {
                    case '.':
                        prd++;
                        break;
                    case ';':
                        semcln++;
                        break;
                    case ',':
                        comma++;
                        break;
                    case '\'':
                        aps++;
                        break;                }
            }
        }
        System.out.println("Marks\tOccurance");
        System.out.println(".\t" + prd);
        System.out.println(";\t" + semcln);
        System.out.println(",\t" + comma);
        System.out.println("'\t" + aps);
    }
}
