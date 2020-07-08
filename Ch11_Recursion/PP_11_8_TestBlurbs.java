//********************************************************************************
//  TestBlurbs.java      Author: Hyunryung Kim
//
//  Programming Projects 11.8, Chapter 11 Recursion
//  Design and implement a recursive program to determine whether a string is a 
//  valid Blurb as defined in PP 11.7.
//********************************************************************************

public class PP_11_8_TestBlurbs 
{
    //----------------------------------------------------------------------------
    // Solves the Non-Attacking Queens problem using recursion.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        BlurbTester BlurbTester = new BlurbTester();
        
        Blurb Blurb1 = new Blurb();
        System.out.print("A Blurb created from the Blurb class: ");
        System.out.println(Blurb1);
        BlurbTester.isBlurb(Blurb1.toString());
        System.out.println(BlurbTester);
        
        String str = "xqdxq";
        System.out.print("A random string: ");
        System.out.println(str);
        BlurbTester.isBlurb(str);        
        System.out.println(BlurbTester);
    }
}
