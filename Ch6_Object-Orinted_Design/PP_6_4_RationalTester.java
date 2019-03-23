//********************************************************************************
//  RationalTester.java      Author: Hyunryung Kim
//
//  Programming Projects 6.4, Chapter 6
//  Modify the RationalNumber class so that it implements the Comparable interface
//  . To perform the comparison, compute an equivalent floating point value from 
//  the numerator and denominator for both RationalNumber objects, then compare 
//  them using a tolerance value of 0.0001. Write a main driver to test your
//  modifications. 
//********************************************************************************

public class PP_6_4_RationalTester 
{
    //----------------------------------------------------------------------------
    //  Creates some rational number objects and performs various 
    //  operations on them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        RationalNumber r1 = new RationalNumber (6, 8);
        RationalNumber r2 = new RationalNumber (1, 3);
        RationalNumber r3;
        RationalNumber r4, r5, r6, r7;
        
        System.out.println ("First rational number: " + r1);
        System.out.println ("Second rational number: " + r2);
        
        if (r1.isLike(r2))
            System.out.println ("r1 and r2 are equal.");
        else
            System.out.println ("r1 and r2 are NOT equal.");
        
        r3 = r1.reciprocal();
        System.out.println ("The reciprocal of r1 is: " + r3);
        
        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);
        
        System.out.println ("r1 + r2: " + r4);
        System.out.println ("r1 - r2: " + r5);
        System.out.println ("r1 * r2: " + r6);
        System.out.println ("r1 / r2: " + r7);
        
        int result = r1.compareTo(r2); 
        if (result < 0)
            System.out.println(r1 + " comes before " + r2);
        else
            if (result == 0)
                System.out.println("The numbers are equal.");
            else
                System.out.println(r1 + " follows " + r2);
    }
}
