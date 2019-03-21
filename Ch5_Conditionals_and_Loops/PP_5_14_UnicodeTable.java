//********************************************************************************
//  Unicodetable.java      @author: Hyunryung Kim
//
//  Programming Projects 5.14, Chapter 5
//  Design and implement an application that prints a table showing a subset of 
//  the Unicode characters and their numeric values. Print five number/character
//  pairs per line, separated by tab characters. Print the table for numeric
//  values from 32 (the space character) to 126 (the ~ character), which 
//  corresponds to the printable ASCII subset of the Unicode character set. 
//  Compare your output to the table in Appendix C. Unlike the table in Appendix
//  C, the values in your table can increase as they go across a row.
//********************************************************************************
public class PP_5_14_UnicodeTable 
{
    //----------------------------------------------------------------------------
    //  Prints a table of printable Unicode (from 32 to 126).
    //----------------------------------------------------------------------------
    public static void main (String[] arg)
    {
        final int START = 32, END = 126, DIV = 5;
        int count = 0;
        
        for (int i = 1; i <= DIV; i++)
            System.out.print("Value\tChar\t");
        
        System.out.println();
        
        for (int i = START; i <= END; i++)
        {
            System.out.print(i + "\t" + (char)i + "\t");
            count++;
            if (count % DIV == 0)
                System.out.println();
        }
    }
    
}
