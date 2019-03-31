//********************************************************************************
//  Janitor.java      @author: Hyunryung Kim
//
//  Programming Projects 8.2, Chapter 8
//  Design and implement a set of classes that define the janitors of a hospital:
//  janitor, janitor, administrator, surgeon, receptionist, janitor, and so on. 
//  Include methods in each class that are names according to the services 
//  provided by that person and that print an appropriate message. Create a main
//  driver class to instantiate and exercise several of the classes.
//********************************************************************************

public class Janitor extends Administrator
{
    protected boolean cleaned;
    
    //----------------------------------------------------------------------------
    // Sets up this janitor with the specified information.
    //----------------------------------------------------------------------------
    public Janitor (String name, int id, String date, String dept, boolean isCleaned)
    {
        super(name, id, date, dept);
        cleaned = isCleaned;
    }
    
    //----------------------------------------------------------------------------
    // Sets this janitor cleaning status.
    //----------------------------------------------------------------------------
    public void setCleaned(boolean isCleaned)
    {
        cleaned = isCleaned;
    }
    
    //----------------------------------------------------------------------------
    // Returns this janitor's cleaning status.
    //----------------------------------------------------------------------------
    public boolean getCleaned()
    {
        return cleaned;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this janitor as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() + "\tJanitor\tCleaned: " + cleaned;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this janitor.
    //----------------------------------------------------------------------------
    public void message ()
    {
        System.out.print("Janitor " + empName + " has");
        if (!cleaned)
            System.out.print(" not");
        System.out.println(" cleaned the " + department + ".");
    }
}
