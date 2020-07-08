//********************************************************************************
//  Employee2.java       Author: Hyunryung Kim
//
//  Represents a general paid employee.
//********************************************************************************

public class Employee2 extends StaffMember2
{
    protected String socialSecurityNumber;
    protected double payRate;
    protected double numVacation = 14.0;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up this employee with the specified information.
    //---------------------------------------------------------------------------- 
    public Employee2(String eName, String eAddress, String ePhone, 
                    String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);
        
        this.socialSecurityNumber = socSecNumber;
        this.payRate = rate;
    }
    
    //----------------------------------------------------------------------------
    //  Returns information about an employee as a stirng
    //----------------------------------------------------------------------------    
    public String toString()
    {
        String result = super.toString();
        
        result += "\nSocial Security Number: " + socialSecurityNumber;
        
        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the pay rate for this employee.
    //----------------------------------------------------------------------------    
    public double pay()
    {
        return payRate;
    }   

    //----------------------------------------------------------------------------
    //  Returns the number of vacation for this employee.
    //----------------------------------------------------------------------------    
    public double vacation()
    {
        return numVacation;
    }  
}
