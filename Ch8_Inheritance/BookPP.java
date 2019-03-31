//********************************************************************************
//  BookPP.java      Author: HyunryungKim
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

public class BookPP extends ReadingMaterial
{
    protected String author;

    public BookPP(int numPages, String titleStr, String authorName)
    {
        super(numPages,titleStr);
        author = authorName;
    }

    //----------------------------------------------------------------------------
    //  Author mutator.
    //----------------------------------------------------------------------------
    public void setAuthor(String authorStr) 
    {   
        author = authorStr;
    }
    
    //----------------------------------------------------------------------------
    //  Author accessor.
    //----------------------------------------------------------------------------
    public String getAuthor() 
    {   
        return author;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this book.
    //----------------------------------------------------------------------------
    public void message ()
    {
        super.message();
        System.out.println("Author: " + author);
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this book as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() +"\t" + author;
    }
}
