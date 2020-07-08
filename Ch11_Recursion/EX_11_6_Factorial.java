//********************************************************************************
//  EX_11_6.java       Author: Hyunryung Kim
//
//  Write a recursive method that returns the value of N! (N factorial) using the 
//  definition given in this chapter. Explain why you would not normally use 
//  recursion to solve this problem.
//********************************************************************************

public class EX_11_6_Factorial
{
    //----------------------------------------------------------------------------
    //  Creates a new maze, prints its original form, attempts to solve it, and 
    //  prints out its final form.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int N = 4;
        int result = 1;
        Factorial factOp = new Factorial();
        
        System.out.println("Using Recursion: N! = " + factOp.factorial(N));
        
        for (int i = 1; i <= N; i++)
            result *= i;
        System.out.println("Using Iteration N! = " + result);
    }
}
