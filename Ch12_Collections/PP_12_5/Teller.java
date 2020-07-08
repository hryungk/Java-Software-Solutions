//********************************************************************************
//  Teller.java      Author: Hyunryung Kim
//
//  Represents a teller at a bank.
//********************************************************************************

public class Teller 
{
    private int customerNumber;
    private boolean isOpen;
    private final int MAX_TIME = 20*1000; // Maximum service time per customer [ms]

    //----------------------------------------------------------------------------
    //  Creates a new teller with an open status.
    //----------------------------------------------------------------------------
    public Teller ()
    {
        isOpen = true;
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
        customerNumber = num;   // Customer who this teller is meeting with
        System.out.print(" is now helping Customer #" + customerNumber + ". ");
    }    

    //----------------------------------------------------------------------------
    //  Returns this teller's status.
    //----------------------------------------------------------------------------
    public boolean getStatus()
    {
        return isOpen;
    }

    //----------------------------------------------------------------------------
    //  Returns this teller's status.
    //----------------------------------------------------------------------------
    public int getCustomer()
    {
        return customerNumber;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a string of this customer number.
    //----------------------------------------------------------------------------
    public String toString()
    {   
        return customerNumber + " ";
    }
}
