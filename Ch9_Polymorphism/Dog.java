//********************************************************************************
//  Dog.java       Author: Lewis/Loftus
//
//  Represents a dog speaker.
//********************************************************************************

public class Dog implements Speaker
{
    //----------------------------------------------------------------------------
    //  Prints out a string from a dog.
    //----------------------------------------------------------------------------    
    public void speak()
    {
        System.out.println("Rrrrr Mung Mung!");
    }
    
    //----------------------------------------------------------------------------
    //  Prints out the input string for this dog.
    //----------------------------------------------------------------------------    
    public void announce(String str)
    {
        System.out.println(str);
    }
}
