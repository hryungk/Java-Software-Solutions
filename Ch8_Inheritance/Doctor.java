//********************************************************************************
//  Doctor.java      @author: Hyunryung Kim
//
//  Programming Projects 8.2, Chapter 8
//  Design and implement a set of classes that define the doctors of a hospital:
//  doctor, nurse, administrator, surgeon, receptionist, janitor, and so on. 
//  Include methods in each class that are names according to the services 
//  provided by that person and that print an appropriate message. Create a main
//  driver class to instantiate and exercise several of the classes.
//********************************************************************************

public class Doctor extends HospitalEmployees
{
    protected String specialty;
    
    //----------------------------------------------------------------------------
    // Sets up this doctor with the specified information.
    //----------------------------------------------------------------------------
    public Doctor (String name, int id, String date, String special)
    {
        super(name, id, date);
        specialty = special;
    }
    
    //----------------------------------------------------------------------------
    // Sets this doctor's specialty.
    //----------------------------------------------------------------------------
    public void setSpecialty(String special)
    {
        specialty = special;
    }
    
    //----------------------------------------------------------------------------
    // Returns this doctor's specialty.
    //----------------------------------------------------------------------------
    public String getSpecialty()
    {
        return specialty;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this doctor as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() + "\tDoctor\tSpecialty: " + specialty;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this doctor.
    //----------------------------------------------------------------------------
    public void message ()
    {
        System.out.println("Dr. " + empName + " specializes " + specialty + ".");
    }
}
