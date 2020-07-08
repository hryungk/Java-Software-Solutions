//********************************************************************************
//  Philosopher.java       Author: Lewis/Loftus
//
//  Represents a philosopher speaker.
//********************************************************************************

public class Philosopher implements Speaker
{
    //----------------------------------------------------------------------------
    //  Prints out a string from a philosopher.
    //----------------------------------------------------------------------------    
    public void speak()
    {
        System.out.println("All roads lead to Rome.");
    }
    
    //----------------------------------------------------------------------------
    //  Prints out the input string for this philosopher.
    //----------------------------------------------------------------------------    
    public void announce(String str)
    {
        System.out.println(str);
    }
    
    //----------------------------------------------------------------------------
    //  Prints out the input string for this philosopher.
    //----------------------------------------------------------------------------    
    public void pontificate()
    {
        System.out.println("I disagree with your opinion.");
    }    
}
