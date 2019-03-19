//********************************************************************************
//  Bookshelf.java      @author: Hyunryung Kim
//
//  Programming Projects 4.4, Chapter 4
//  Create a driver class called Bookshelf, whose main method instantiates and
//  updates several Book objects.
//********************************************************************************

public class PP_4_4_Bookshelf 
{
    //----------------------------------------------------------------------------
    // Creates some book information and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Book book1 = new Book("java software solutions","Lewis & Loftus","Addison Wesley",2009);
        Book book2 = new Book("Flexible bars","R. Frisch-Fay","London Butterworths",1962);
        
        String book1Title = book1.getTitle();
        String book2Title = book2.getTitle();
        
        String book1Author = book1.getAuthor();
        String book2Author = book2.getAuthor();
        
        System.out.println("Book1: " + book1Title + " by " + book1Author);
        System.out.println("Book2: " + book2Title + " by " + book2Author);

        book1.setAuthor("John Lewis & William Loftus");
        String book1NewAuthor = book1.getAuthor();
        book2.setTitle("Flexible Bars");
        String book2NewTitle = book2.getTitle();
        
        System.out.println("Book1's new author: " + book1NewAuthor);
        System.out.println("Book2's new title: " + book2NewTitle);
        
        
        String book1Publisher = book1.getPublisher();
        String book2Publisher = book2.getPublisher();
        
        System.out.println("Book1's publisher: " + book1Publisher);
        System.out.println("Book2's publisher: " + book2Publisher);
        
        book1.setDate(2012);
        int book1Date = book1.getDate();
        int book2Date = book2.getDate();
        System.out.println("Book1's copyright date: " + book1Date);
        System.out.println("Book2's copyright date: " + book2Date);
        
        
        System.out.println();
        System.out.println(book1);
        System.out.println(book2);        
    }
    
}
