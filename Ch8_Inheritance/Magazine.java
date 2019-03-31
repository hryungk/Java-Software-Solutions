//********************************************************************************
//  Magazine.java      Author: HyunryungKim
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

public class Magazine extends ReadingMaterial
{
    protected String editor;

    public Magazine(int numPages, String titleStr, String editorName)
    {
        super(numPages,titleStr);
        editor = editorName;
    }

    //----------------------------------------------------------------------------
    //  Author mutator.
    //----------------------------------------------------------------------------
    public void setEditor(String editorStr) 
    {   
        editor = editorStr;
    }
    
    //----------------------------------------------------------------------------
    //  Editor accessor.
    //----------------------------------------------------------------------------
    public String getEditor() 
    {   
        return editor;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this book.
    //----------------------------------------------------------------------------
    public void message ()
    {
        super.message();
        System.out.println("Magazine Editor: " + editor);
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this book as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() +"\t" + editor;
    }
}
