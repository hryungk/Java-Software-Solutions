//********************************************************************************
//  Customer.java      Author: Hyunryung Kim
//
//  Represents a customer at a bank.
//********************************************************************************

public class Customer 
{
    private int customerNumber;
    private final int MAX_TIME = 20*1000; // Maximum service time per customer [ms]

    //----------------------------------------------------------------------------
    //  Creates a new CD with the specified information.
    //----------------------------------------------------------------------------
    public Customer (int num)
    {
        customerNumber = num;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the customer number.
    //----------------------------------------------------------------------------    
    public int getNum()
    {
        return customerNumber;
    }  
                
    //----------------------------------------------------------------------------
    //  Returns a string of this customer number.
    //----------------------------------------------------------------------------
    public String toString()
    {   
        return customerNumber + "";
    }
}
