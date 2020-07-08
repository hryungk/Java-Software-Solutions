//********************************************************************************
//  Hourly2.java       Author: Lewis/Loftus
//
//  Represents an employee that gets paid by the hour.
//********************************************************************************

public class Hourly2 extends Employee2
{
    protected int hoursWorked;
    private final double VACATION_PER_HOUR = 0.0109; // Vacation days per working hour
    private double vacationEarned;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified information.
    //---------------------------------------------------------------------------- 
    public Hourly2(String eName, String eAddress, String ePhone, 
                  String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);     
        
        hoursWorked = 0;
    }
    
    //----------------------------------------------------------------------------
    //  Adds the specified number of hours to this employee's accumulated hours.
    //----------------------------------------------------------------------------    
    public void addHours(int moreHours)
    {
        hoursWorked += moreHours;
    }
    
    //----------------------------------------------------------------------------
    //  Computes and returns the pay for this hourly employee.
    //----------------------------------------------------------------------------    
    public double pay()
    {
        double payment = payRate * hoursWorked;

        vacationEarned += VACATION_PER_HOUR * hoursWorked;   
        hoursWorked = 0;

        
        return payment;
    }
    
    //----------------------------------------------------------------------------
    //  Returns information about this hourly employee as a string.
    //----------------------------------------------------------------------------    
    public String toString()
    {
        String result = super.toString();
        
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }

    //----------------------------------------------------------------------------
    //  Returns the number of vacation for this hourly employee.
    //----------------------------------------------------------------------------    
    public double vacation()
    {
        return  super.vacation() + vacationEarned;
    }  
}
