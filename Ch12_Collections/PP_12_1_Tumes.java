//********************************************************************************
//  Tunes.java      Author: Hyunryung Kim
//
//  Programming Projects 12.1, Chapter 12 Collections
//  Consistent with the example from Chapter 7, design and implement an 
//  application that maintains a collection of compact discs using a linked list. 
//  In the main method of the driver class, add various CDs to the collection and 
//  print the list when complete.
//********************************************************************************

public class PP_12_1_Tumes 
{
    //----------------------------------------------------------------------------
    //  Creates a CDCollection object and adds some CDs to it. Prints
    //  reports on the status of the collection.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        CDCollection music = new CDCollection ();
        
        music.addCD("Storm Front", "Billy Joel", 14.95, 10);
        music.addCD("Come On Over", "Shania Twain", 14.95, 16);
        music.addCD("Soundtrack", "Les Miserables", 17.95, 33);
        music.addCD("Graceland", "Paul Simon", 13.90, 11);
        
        System.out.println (music);
        
        music.addCD("Double Live", "Garth Brooks", 19.99, 26);
        music.addCD("Greatest Hits", "Jimmy Buffet", 15.95, 13);
        
        System.out.println (music);
    }
}
