//********************************************************************************
//  MazeSearch.java       Author: Lewis/Loftus
//
//  Demostrates recursion.
//********************************************************************************

public class Listing_11_1_MazeSearch
{
    //----------------------------------------------------------------------------
    //  Creates a new maze, prints its original form, attempts to solve it, and 
    //  prints out its final form.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Maze labyrinth = new Maze();
        
        System.out.println(labyrinth);
        
        if (labyrinth.traverse(0, 0))
            System.out.println("The maze was successfully traversed!");
        else
            System.out.println("There is no possible path.");
        
        System.out.println(labyrinth);
    }
}
