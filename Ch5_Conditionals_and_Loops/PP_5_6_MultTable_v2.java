//********************************************************************************
//  MultTable.java      @author: Hyunryung Kim
//
//  Programming Projects 5.6, Chapter 5
//  Design and implement an application that produces a multiplication table, 
//  showing the results of multiplying the integers 1 through 12 by themselves.
//********************************************************************************

public class PP_5_6_MultTable_v2 
{
    //----------------------------------------------------------------------------
    // Creates a multiplcation table 1 through 12.
    //----------------------------------------------------------------------------
    
    public static void main(String[] arg)
    {
        final int END = 12;
        
        for (int i = 0; i <= END; i++)
        {
            for (int j = 1; j <= END; j++)
            {
                if (i == 0)
                {
                    if (j == 1)
                        System.out.print("x\t");
                    System.out.print(j + "\t");
                }
                else
                {
                    if (j == 1)
                        System.out.print(i + "\t");
                    System.out.print(i*j + "\t");
                }
            }
            System.out.println();
        }
    }
    
}
