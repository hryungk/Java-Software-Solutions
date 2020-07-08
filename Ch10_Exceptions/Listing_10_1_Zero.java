//********************************************************************************
//  Zero.java       Author: Lewis/Loftus
//
//  Demostrates an uncaught exception.
//********************************************************************************

public class Listing_10_1_Zero
{
    //----------------------------------------------------------------------------
    //  Deliberately divides by zero to produce an exception.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int numerator = 10;
        int denominator = 0;
        
        System.out.println(numerator / denominator);
        
        System.out.println("This text will not be printed.");
    }
}