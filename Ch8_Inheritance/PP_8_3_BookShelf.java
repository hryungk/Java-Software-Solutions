//********************************************************************************
//  BookShelf.java      @author: Hyunryung Kim
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

public class PP_8_3_BookShelf 
{
    //----------------------------------------------------------------------------
    // Creates some objects derived from ReadingMaterial class.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        ReadingMaterial[] bookshelf = new ReadingMaterial[3];
        
        String[] chars = {"Sherlock Holms", "John Watson"};
        bookshelf[0] = new Novel(130, "A Study in Scarlet","Arthur Conan Doyle", chars);
        bookshelf[1] = new Textbook(540, "Java software solution", "Lewis & Loftus", true);
        bookshelf[2] = new Magazine(30, "Wired", "Mark Spensor");
        
        // Print the reading materials
        for (int i = 0; i < bookshelf.length; i++)
            System.out.println(bookshelf[i]);
        
        System.out.println();

        // Print the messages
        for (int i = 0; i < bookshelf.length; i++)
            bookshelf[i].message();        
    }
}
