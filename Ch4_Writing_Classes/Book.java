//********************************************************************************
//  Book.java      @author: Hyunryung Kim
//
//  Programming Projects 4.4, Chapter 4
//  Design and implement a class called Book that contains instance data for the 
//  title, author, publisher, and copyright date. Define the Book constructor to
//  accept and initialize this data. Include setter and getter methods for all 
//  instance data. Include a toString method that returns a nicely formatted, 
//  multi-line description of the book. 
//********************************************************************************

public class Book 
{   
    private String title;       // Title of book
    private String author;      // Author of book
    private String publisher;   // Publisher of book
    private int CRDate;      // Copyright date of book
    
    
    //----------------------------------------------------------------------------
    //  Constructor: Initialize the book by its title, author, publisher, and 
    //               copyright date.
    //----------------------------------------------------------------------------
    public Book (String T, String A, String P, int date)
    {
        title = T;
        author = A;
        publisher = P;
        CRDate = date;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the title of the book.
    //----------------------------------------------------------------------------
    public String getTitle()
    {
        return title;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the title of the book.
    //----------------------------------------------------------------------------
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the author of the book.
    //----------------------------------------------------------------------------
    public String getAuthor()
    {
        return author;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the author of the book.
    //----------------------------------------------------------------------------
    public void setAuthor(String newAuthor)
    {
        author = newAuthor;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the publisher of the book.
    //----------------------------------------------------------------------------
    public String getPublisher()
    {
        return publisher;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the depth of the book.
    //----------------------------------------------------------------------------
    public void setPublisher(String newPub)
    {
        publisher = newPub;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the copyright date of the book.
    //----------------------------------------------------------------------------
    public int getDate()
    {
        return CRDate;
    }
 
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the copyright date of the book.
    //----------------------------------------------------------------------------
    public void setDate(int newDate)
    {
        CRDate = newDate;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a nicely formatted, multi-line description of the book as a string.
    //----------------------------------------------------------------------------
    public String toString()
    {
        return "Book's title: " + title + "\n Author: " + author + "\n " + 
                "Publisher: " + publisher + "\n Copyright Date: " + CRDate;
    }
    
}
