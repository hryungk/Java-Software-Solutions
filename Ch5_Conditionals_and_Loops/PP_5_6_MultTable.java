//********************************************************************************
//  MultTable.java      @author: Hyunryung Kim
//
//  Programming Projects 5.6, Chapter 5
//  Design and implement an application that produces a multiplication table, 
//  showing the results of multiplying the integers 1 through 12 by themselves.
//********************************************************************************

public class PP_5_6_MultTable 
{
    //----------------------------------------------------------------------------
    // Creates a multiplcation table 1 through 12.
    //----------------------------------------------------------------------------
    
    public static void main(String[] arg)
    {
        final int END = 12;
        
        for (int i = 0; i <= END; i++)
        {
            if (i == 0)
            {
                System.out.print("x\t");
                for (int j = 1; j <= END; j++)
                {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
            else
            {
                System.out.print(i + "\t");
            
                for (int j = 1; j <= END; j++)
                {
                    System.out.print(i*j + "\t");
                }
                System.out.println();
            }
        }
    }
    
}
