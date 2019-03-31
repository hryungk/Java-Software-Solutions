//********************************************************************************
//  Surgeon.java      @author: Hyunryung Kim
//
//  Programming Projects 8.2, Chapter 8
//  Design and implement a set of classes that define the surgeons of a hospital:
//  surgeon, nurse, administrator, surgeon, receptionist, janitor, and so on. 
//  Include methods in each class that are names according to the services 
//  provided by that person and that print an appropriate message. Create a main
//  driver class to instantiate and exercise several of the classes.
//********************************************************************************

public class Surgeon extends Doctor
{
    protected boolean operating;
    
    //----------------------------------------------------------------------------
    // Sets up this surgeon with the specified information.
    //----------------------------------------------------------------------------
    public Surgeon (String name, int id, String date, String special,boolean isOn)
    {
        super(name, id, date, special);
        operating = isOn;
    }
    
    //----------------------------------------------------------------------------
    // Sets this surgeon's operation status.
    //----------------------------------------------------------------------------
    public void setIsOperating(boolean isOn)
    {
        operating = isOn;
    }
    
    //----------------------------------------------------------------------------
    // Returns this surgeon's oepration status.
    //----------------------------------------------------------------------------
    public boolean getIsOperating()
    {
        return operating;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this surgeon as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() + "\tOperating: " + operating;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this surgeon.
    //----------------------------------------------------------------------------
    public void message ()
    {
        System.out.print("Dr. " + empName + " is ");
        if (!operating)
            System.out.print("not ");
        System.out.println("operating on " + specialty + " surgery.");
    }
}
