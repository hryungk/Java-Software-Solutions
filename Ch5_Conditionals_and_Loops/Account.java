//********************************************************************************
//  Account.java      @author: Hyunryung Kim
//
//  Programming Projects 5.33, Chapter 5
//  Modify the Account class from Chapter 4 so that it performs validity checks
//  on the deposit and withdraw operations. Specifically, don't allow the deposit
//  of a negative number or a withdrawal that exceeds the current balance. Print
//  appropriate error messages if these problems occur.
//********************************************************************************

import java.text.NumberFormat;

public class Account 
{
    private final double RATE = 0.035;  // interest rate of 3.5%
    
    private long acctNumber;
    private double balance;
    private String name;
    
    //----------------------------------------------------------------------------
    //  Sets up the account by defining its owner, account number,
    //  and initial balance.
    //----------------------------------------------------------------------------
    public Account (String owner, long account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    //----------------------------------------------------------------------------
    //  Deposits the specified amount into the account. Returns the
    //  new balance.
    //----------------------------------------------------------------------------
    public double deposit (double amount)
    {
        if (amount >= 0)
            balance = balance + amount;
        else
            System.out.println("ERROR: Invalid Input. The deposit is negative.");
        
        return balance;
    }
    
    //----------------------------------------------------------------------------
    //  Withdraws the specified amount from the account and applies 
    //  the fee. Returns the new balance.
    //----------------------------------------------------------------------------
    public double withdraw (double amount, double fee)
    {
        if (balance >= (amount + fee))
            balance = balance - amount - fee;
        else
            System.out.println("ERROR: Invalid Input. The amount and fee "
                                + "exceeds the balance.");
        
        return balance;
    }
    
    //----------------------------------------------------------------------------
    //  Adds interest to the account and returns the new balance.
    //----------------------------------------------------------------------------
    public double addInterest ()
    {
        balance += (balance * RATE);
        return balance;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the current balance of the account
    //----------------------------------------------------------------------------
    public double getBalance()
    {
        return balance;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a cone-line description of the account as a string.
    //----------------------------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name +"\t" + fmt.format(balance);
    }
    
}
