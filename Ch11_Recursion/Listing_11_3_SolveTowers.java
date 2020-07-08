//********************************************************************************
//  SolveTowers.java       Author: Lewis/Loftus
//
//  Demostrates recursion.
//********************************************************************************

public class Listing_11_3_SolveTowers
{
    //----------------------------------------------------------------------------
    //  Creates a TowersOfHanoi puzzle and solves it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        TowersOfHanoi towers = new TowersOfHanoi(4);
        
        towers.solve();
    }
}
