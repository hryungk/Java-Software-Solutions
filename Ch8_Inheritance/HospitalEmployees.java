//********************************************************************************
//  HospitalEmployees.java      @author: Hyunryung Kim
//
//  Programming Projects 8.2, Chapter 8
//  Design and implement a set of classes that define the employees of a hospital:
//  doctor, nurse, administrator, surgeon, receptionist, janitor, and so on. 
//  Include methods in each class that are names according to the services 
//  provided by that person and that print an appropriate message. Create a main
//  driver class to instantiate and exercise several of the classes.
//********************************************************************************

public class HospitalEmployees 
{
    protected String empName, hireDate, service;
    protected int empNumber;

    //----------------------------------------------------------------------------
    // Sets up hospital employees with name and ID number.
    //----------------------------------------------------------------------------
    public HospitalEmployees (String name, int id, String date)
    {
        empName = name;
        empNumber = id;
        hireDate = date;
    }
    
    //----------------------------------------------------------------------------
    // Sets the name for this employee.
    //----------------------------------------------------------------------------
    public void setName (String name)
    {
        empName = name;
    }

    //----------------------------------------------------------------------------
    // Returns this employee's name.
    //----------------------------------------------------------------------------
    public String getName ()
    {
        return empName;
    }

    //----------------------------------------------------------------------------
    // Sets the employee ID number for this employee.
    //----------------------------------------------------------------------------
    public void setNumber (int num)
    {
        empNumber = num;
    }   

    //----------------------------------------------------------------------------
    // Returns this employee's ID number.
    //----------------------------------------------------------------------------
    public int getNumber ()
    {
        return empNumber;
    }
    
    //----------------------------------------------------------------------------
    // Returns this employee's hire date.
    //----------------------------------------------------------------------------
    public void setDate (String date)
    {
        hireDate = date;
    }
    
    //----------------------------------------------------------------------------
    // Returns this employee's ID number.
    //----------------------------------------------------------------------------
    public String getDate ()
    {
        return hireDate;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this employee as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return empName + "\t" + empNumber + "\t" + hireDate;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this employee.
    //----------------------------------------------------------------------------
    public void message ()
    {
        System.out.println(empName + "(" + empNumber + ") has been working since "
                            + hireDate + ".");
    }
}
