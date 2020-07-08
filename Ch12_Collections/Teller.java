//********************************************************************************
//  Teller.java      Author: Hyunryung Kim
//
//  Represents a teller at a bank.
//********************************************************************************

public class Teller extends BankQueue
{
    private int curCustNum, tellerNum;
    private boolean isOpen;
    private final int MAX_TIME = 20*1000; // Maximum service time per customer [ms]

    //----------------------------------------------------------------------------
    //  Creates a new teller with an open status.
    //----------------------------------------------------------------------------
    public Teller (int num)
    {
        isOpen = true;
        tellerNum = num+1;    // Teller number
    }

    //----------------------------------------------------------------------------
    //  Sets this teller's status open.
    //----------------------------------------------------------------------------
    public void setOpen()
    {
        isOpen = true;
    }

    //----------------------------------------------------------------------------
    //  Sets this teller's status close.
    //----------------------------------------------------------------------------
    public void setClose(int num)
    {
        isOpen = false;
        curCustNum = num;   // Customer who this teller is meeting with
        System.out.println("Teller #" + tellerNum + " is now helping Customer #" 
                        + curCustNum + ". ");
    }    

    //----------------------------------------------------------------------------
    //  Returns this teller's status.
    //----------------------------------------------------------------------------
    public boolean getStatus()
    {
        return isOpen;
    }

    //----------------------------------------------------------------------------
    //  Returns the customer number that this teller is currently meeting with.
    //----------------------------------------------------------------------------
    public int getCustomer()
    {
        return curCustNum;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the teller number.
    //----------------------------------------------------------------------------
    public int getTellerNum()
    {
        return tellerNum;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a string of this customer number.
    //----------------------------------------------------------------------------
    public String toString()
    {   
        return tellerNum + " ";
    }
}
