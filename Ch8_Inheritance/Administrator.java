//********************************************************************************
//  Administrator.java      @author: Hyunryung Kim
//
//  Programming Projects 8.2, Chapter 8
//  Design and implement a set of classes that define the administrators of a hospital:
//  administrator, administrator, administrator, surgeon, receptionist, janitor, and so on. 
//  Include methods in each class that are names according to the services 
//  provided by that person and that print an appropriate message. Create a main
//  driver class to instantiate and exercise several of the classes.
//********************************************************************************

public class Administrator extends HospitalEmployees
{
    protected String department;
    
    //----------------------------------------------------------------------------
    // Sets up this administrator with the specified information.
    //----------------------------------------------------------------------------
    public Administrator (String name, int id, String date, String dept)
    {
        super(name, id, date);
        department = dept;
    }
    
    //----------------------------------------------------------------------------
    // Sets this administrator's department.
    //----------------------------------------------------------------------------
    public void setDepartment(String dept)
    {
        department = dept;
    }
    
    //----------------------------------------------------------------------------
    // Returns this administrator's department.
    //----------------------------------------------------------------------------
    public String getDepartment()
    {
        return department;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this administrator as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() + "\tAdministrator\t" + department;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this administrator.
    //----------------------------------------------------------------------------
    public void message ()
    {
        System.out.println("Administrator " + empName + " works in the " 
                            + department + " department.");
    }
}
