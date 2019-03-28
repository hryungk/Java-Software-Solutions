//********************************************************************************
//  ZipBody.java      @author: Hyunryung Kim
//
//  Programming Projects 7.9, Chapter 7
//  Modify the program you created in PP 7.8 to accomplish the following:
//  - Support the storing of additional user information: street address (string),
//      city (string), state (string), and 10 digit phone number (long integer, 
//      contains area code and does not include special characters such as (,), or
//      -).
//  - Store the data in an ArrayList object.
//********************************************************************************

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class PP_7_9_ZipBody 
{
    //----------------------------------------------------------------------------
    // Creates some bank zip codes and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args)  throws IOException
    {
        final int MAX = 25;
        String line, first, last, street, city, state;
        int zip, count = 0;
        long phone;
        //Zip1[] zipCodes = new Zip1[MAX];
        ArrayList<Zip1> zipCodes = new ArrayList<Zip1>();
        Scanner fileScan, lineScan;
        
        fileScan = new Scanner(new File("PP_7_9.inp"));
        while (fileScan.hasNext() && count < MAX)
        {
            line = fileScan.nextLine();
            lineScan = new Scanner(line);
            lineScan.useDelimiter("\t");
            
            first = lineScan.next();        // First name
            last = lineScan.next();         // Last name
            
            street = lineScan.next();       // Street address
            city = lineScan.next();         // City
            state = lineScan.next();        // State
            zip = lineScan.nextInt();       // Zip code
            phone = lineScan.nextLong();    // Phone number
            Address address = new Address(street,city,state,zip);
            
            zipCodes.add(new Zip1(first,last,address,phone));
            count++;
            if (count == MAX)
                System.out.println("You have reached the maximum number of "
                        + "input. New data will be neither scanned nor stored.");
        }
        
        for (int i = 0; i < count; i++)
            System.out.println(zipCodes.get(i));
    }
}
