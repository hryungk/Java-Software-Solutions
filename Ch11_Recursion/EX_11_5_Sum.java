//********************************************************************************
//  Ex_11_5.java       Author: Hyunryung Kim
//
//  Modify the method that calculates the sum of the integers between 1 and N 
//  shown in this chapter. Have the new version match the following recursive 
//  definition: The sum of 1 to N is the sum of 1 to (N/2) plus the sum of 
//  (N/2 + 1) to N. Trace your solution using an N of 7.
//********************************************************************************

public class EX_11_5_Sum
{
    //----------------------------------------------------------------------------
    //  Creates a new maze, prints its original form, attempts to solve it, and 
    //  prints out its final form.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int N = 7;
        Summation sumOp = new Summation();
        
        System.out.println("Summation from 1 to N using sum: " + sumOp.sum(N));
        System.out.println("Summation from 1 to N using sum: " + sumOp.sum2(N));
    }
}
