//********************************************************************************
//  Novel.java      Author: HyunryungKim
//
//  Programming Projects 8.3, Chapter 8
//  Design and implement a set of classes that define various types of reading
//  material: books, novels, magazines, technical journals, textbooks, and so on.
//  Include data values that describe various attributes of the material, such as
//  the number of pages and the names of the primary characters. Include methods
//  that are names appropriately for each class and that print an appropriate 
//  message. Create a main driver class to instantiate and exercise several of the
//  classes.
//********************************************************************************

public class Novel extends BookPP
{
    private String[] Chars;
    
    public Novel(int numPages, String titleStr, String authorName, String[] chars)
    {
        super(numPages,titleStr, authorName);
        Chars = chars;
    }

    //----------------------------------------------------------------------------
    //  Primary character mutator.
    //----------------------------------------------------------------------------
    public void setChar(String[] chars) 
    {   
        Chars = chars;
    }
    
    //----------------------------------------------------------------------------
    //  Primary character accessor.
    //----------------------------------------------------------------------------
    public String[] getChar() 
    {   
        return Chars;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this novel.
    //----------------------------------------------------------------------------
    public void message ()
    {
        super.message();
        System.out.print("Primary characters: ");
        for (int i = 0; i < Chars.length-1;i++)
            System.out.print(Chars[i] + ", ");
        System.out.println(Chars[Chars.length-1]);
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this novel as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        String result = super.toString() + "\n";
        result += "Primary characters: ";
        
        for (int i = 0; i < Chars.length-1;i++)
            result += Chars[i] + ", ";
        result += Chars[Chars.length-1];
        
        return result;
    }    
}
