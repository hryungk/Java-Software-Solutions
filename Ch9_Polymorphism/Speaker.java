//********************************************************************************
//  Speaker.java       Author: Lewis/Loftus
//
//  Represetns a generic speaker.
//********************************************************************************

public interface Speaker 
{
    //----------------------------------------------------------------------------
    //  Derived classes must define the speak method for each type of speaker.
    //----------------------------------------------------------------------------   
    public void speak();

    //----------------------------------------------------------------------------
    //  Derived classes must define the announce method for each type of speaker.
    //----------------------------------------------------------------------------    
    public void announce(String str);

}
