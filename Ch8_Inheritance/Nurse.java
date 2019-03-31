//********************************************************************************
//  Nurse.java      @author: Hyunryung Kim
//
//  Programming Projects 8.2, Chapter 8
//  Design and implement a set of classes that define the nurses of a hospital:
//  nurse, nurse, administrator, surgeon, receptionist, janitor, and so on. 
//  Include methods in each class that are names according to the services 
//  provided by that person and that print an appropriate message. Create a main
//  driver class to instantiate and exercise several of the classes.
//********************************************************************************

public class Nurse extends HospitalEmployees
{
    protected int numPatient;
    
    //----------------------------------------------------------------------------
    // Sets up this nurse with the specified information.
    //----------------------------------------------------------------------------
    public Nurse (String name, int id, String date, int num)
    {
        super(name, id, date);
        numPatient = num;
    }
    
    //----------------------------------------------------------------------------
    // Sets this nurse's number of patient.
    //----------------------------------------------------------------------------
    public void setNumPatient(int num)
    {
        numPatient = num;
    }
    
    //----------------------------------------------------------------------------
    // Returns this nurse's number of patient.
    //----------------------------------------------------------------------------
    public int getNumPatient()
    {
        return numPatient;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this nurse as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() + "\tNurse\tPatients:" + numPatient;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this nurse.
    //----------------------------------------------------------------------------
    public void message ()
    {
        System.out.println("Nurse " + empName + " takes care of " + numPatient 
                            + " patients.");
    }
}
