//********************************************************************************
//  Factorial.java       Author: Hyunryung Kim
//
//  Summation using recursion.
//********************************************************************************

public class Factorial
{
    public int factorial (int N)
    {
        int result;
        
        if (N == 1)
            result = 1;
        else
            result = N * factorial(N-1);
        
        return result;
    }
    
}
