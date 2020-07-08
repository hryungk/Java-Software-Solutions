//********************************************************************************
//  Payable.java       Author: Lewis/Loftus
//
//  Represetns a generic staff member.
//********************************************************************************

public interface Payable 
{
    //----------------------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //----------------------------------------------------------------------------   
    public String toString();

    //----------------------------------------------------------------------------
    //  Derived classes must define the pay method for each type of employee.
    //----------------------------------------------------------------------------    
    public double pay();

}
