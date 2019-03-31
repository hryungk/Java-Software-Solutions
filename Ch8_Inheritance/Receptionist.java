//********************************************************************************
//  Receptionist.java      @author: Hyunryung Kim
//
//  Programming Projects 8.2, Chapter 8
//  Design and implement a set of classes that define the receptionists of a hospital:
//  receptionist, receptionist, administrator, surgeon, receptionist, receptionist, and so on. 
//  Include methods in each class that are names according to the services 
//  provided by that person and that print an appropriate message. Create a main
//  driver class to instantiate and exercise several of the classes.
//********************************************************************************

public class Receptionist extends Administrator
{
    protected boolean answering;
    
    //----------------------------------------------------------------------------
    // Sets up this receptionist with the specified information.
    //----------------------------------------------------------------------------
    public Receptionist (String name, int id, String date, String dept, boolean isAnswering)
    {
        super(name, id, date, dept);
        answering = isAnswering;
    }
    
    //----------------------------------------------------------------------------
    // Sets this receptionist's response status.
    //----------------------------------------------------------------------------
    public void setIsAnswering(boolean isAnswering)
    {
        answering = isAnswering;
    }
    
    //----------------------------------------------------------------------------
    // Returns this receptionist's response status.
    //----------------------------------------------------------------------------
    public boolean getIsAnswering()
    {
        return answering;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this receptionist as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() + "\tReceptionist\tAnswering:" + answering;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this receptionist.
    //----------------------------------------------------------------------------
    public void message ()
    {
        System.out.print("Receptionist " + empName + " is");
        if (!answering)
            System.out.print(" not");
        System.out.println(" answering the phone.");
    }
}
