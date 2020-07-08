//********************************************************************************
//  Executive2.java       Author: Lewis/Loftus
//
//  Represents an executive staff member, who can earn a bonus.
//********************************************************************************

public class Executive2 extends Employee2
{
    private double bonus;
    private int bonusVacation = 10;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up this executive with the specified information.
    //---------------------------------------------------------------------------- 
    public Executive2(String eName, String eAddress, String ePhone, 
                     String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        bonus = 0;  // bonus has yet to be awarded
    }
    
    //----------------------------------------------------------------------------
    //  Awards the specified bonus to this executive.
    //----------------------------------------------------------------------------    
    public void awardBonus(double execBonus)
    {
        bonus = execBonus;
    }
    
    //----------------------------------------------------------------------------
    //  Computes and returns the pay for an exectuvie, which is the regular 
    //  employee payment plus a one-time bonus.
    //----------------------------------------------------------------------------    
    public double pay()
    {
        double payment = super.pay() + bonus;
        
        bonus = 0;
        
        return payment;
    }

    //----------------------------------------------------------------------------
    //  Returns the number of vacation for this executive.
    //----------------------------------------------------------------------------    
    public double vacation()
    {
        return super.vacation() + bonusVacation;
    }  
}
