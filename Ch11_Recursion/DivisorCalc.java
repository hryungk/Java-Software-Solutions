//********************************************************************************
//  DivisorCalc.java       Author: Hyunryung Kim
//
//  Find the greatest common divisor using recursion.
//********************************************************************************
public class DivisorCalc
{
    //----------------------------------------------------------------------------
    //  Find the greatest common divisor using Euclid's algorithm.
    //----------------------------------------------------------------------------        
    public static int gcd(int num1, int num2)
    {
        int result;
        if (num1%num2 == 0)
            result = num2;
        else
            result = gcd(num2,num1%num2);
        return result;
    }
}
