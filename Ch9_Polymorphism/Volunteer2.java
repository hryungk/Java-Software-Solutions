//********************************************************************************
//  Volunteer.java       Author: Lewis/Loftus
//
//  Represents a staff member that works as a volunteer.
//********************************************************************************

public class Volunteer2 extends StaffMember2
{   
    //----------------------------------------------------------------------------
    //  Constructor: Sets up this volunteer using the specified information.
    //----------------------------------------------------------------------------
    public Volunteer2 (String eName, String eAddress, String ePhone)
    {
        super(eName,eAddress,ePhone);
    }

    //----------------------------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //----------------------------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }
    
    //----------------------------------------------------------------------------
    //  Returns zero vacation day for this volunteer.
    //----------------------------------------------------------------------------    
    public double vacation()
    {
        return 0.0;
    }      
}
