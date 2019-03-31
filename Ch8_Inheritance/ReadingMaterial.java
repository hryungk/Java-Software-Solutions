//********************************************************************************
//  ReadingMaterial.java      Author: HyunryungKim
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

public class ReadingMaterial 
{
    protected int pages;
    protected String title;
//    protected double price;

    //----------------------------------------------------------------------------
    //  Constructor: Sets up the reading material with the specified information.
    //----------------------------------------------------------------------------
    public ReadingMaterial (int numPages, String titleStr)
    {   
        pages = numPages;
        title = titleStr;
    }
    
    //----------------------------------------------------------------------------
    //  Pages mutator.
    //----------------------------------------------------------------------------
    public void setPages(int numPages) 
    {   
        pages = numPages;
    }
    
    //----------------------------------------------------------------------------
    //  Pages accessor.
    //----------------------------------------------------------------------------
    public int getPages() 
    {   
        return pages;
    }
    
    //----------------------------------------------------------------------------
    //  Title mutator.
    //----------------------------------------------------------------------------
    public void setTitle(String titleStr) 
    {   
        title = titleStr;
    }
    
    //----------------------------------------------------------------------------
    //  Title accessor.
    //----------------------------------------------------------------------------
    public String getTitle() 
    {   
        return title;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this reading material.
    //----------------------------------------------------------------------------
    public void message ()
    {
        System.out.println("Title: " + title + "\nPage number: " + pages);
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this reading material as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return title + "\t" + pages + " pages";
    }
    
}
