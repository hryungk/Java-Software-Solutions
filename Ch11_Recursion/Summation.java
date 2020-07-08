//********************************************************************************
//  Summation.java       Author: Hyunryung Kim
//
//  Summation using recursion.
//********************************************************************************

public class Summation
{
    public int sum (int N)
    {
        int result;
        
        if (N == 1)
            result = 1;
        else
            result = N + sum(N-1);
        
        return result;
    }
    
    public int sum2 (int N)
    {
        int result;
        
        if (N == 1)
            result = 1;
        else
            result = sum2(N/2) + sum2(N-N/2) + N/2*(N-N/2);
        
        return result;
    }
}
