//********************************************************************************
//  RationalTester.java      Author: Lewis/Loftus
//
//  Driver to exercise the use of multiple Rational objects. 
//********************************************************************************

public class Listing_6_3_RationalTester 
{
    //----------------------------------------------------------------------------
    //  Creates some rational number objects and performs various 
    //  operations on them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        RationalNumber_L r1 = new RationalNumber_L (6, 8);
        RationalNumber_L r2 = new RationalNumber_L (1, 3);
        RationalNumber_L r3;
        RationalNumber_L r4, r5, r6, r7;
        
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
    }
}
