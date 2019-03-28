//********************************************************************************
//  Account.java      @author: Hyunryung Kim
//
//  Programming Projects 6.1, Chapter 6
//  Modify the Account class from Chapter 4 so that it also permits an account to
//  be opened with just a name and an account number, assuming an initial balance
//  of zero. Modify the main method of the Transactions class to demonstrate this
//  new capability.
//  Programming Projects 6.9, Chapter 6
//  Redesign and implement a version of the Account class from Chapter 4 so that
//  it is Lockable as defined by PP 6.8.
//********************************************************************************

import java.text.NumberFormat;

public class Account implements Lockable
{
    private int passCode = 9999;
    private boolean locked = true;
    
    private static final double RATE = 0.03;  // interest rate of 3%
    
    private long acctNumber;
    private double balance;
    private String name;
    
    //----------------------------------------------------------------------------
    //  Establishes the key.
    //----------------------------------------------------------------------------
    public void setKey (int key)
    {
        passCode = key;
    }
    
    //----------------------------------------------------------------------------
    //   Locks the object, only if the key passed in is correct.
    //----------------------------------------------------------------------------
    public void lock(int key)
    {
        if (key == passCode)
        {
            System.out.println("You locked " + name + "'s Account. " 
                                + "Methods cannot be invoked.");
            locked = true;
        }
        else
            System.out.println("ERROR: The key is incorrect.");
    }
    
    //----------------------------------------------------------------------------
    //   Unlocks the object, only if the key passed in is correct.
    //----------------------------------------------------------------------------
    public void unlock(int key)
    {
        if (key == passCode)
        {
            System.out.println("You unlocked " + name + "'s Account."
                                + " Methods can be invoked.");
            locked = false;
        }
        else
            System.out.println("ERROR: The key is incorrect.");
    }
    
    //----------------------------------------------------------------------------
    //  Returns a boolean that indicates whether or not the object is locked.
    //----------------------------------------------------------------------------
    public boolean locked()
    {
        return locked;
    }
        
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the account by defining its owner, account number,
    //               and initial balance.
    //----------------------------------------------------------------------------
    public Account (String owner, long account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    //----------------------------------------------------------------------------
    //  Sets up the account by defining its owner, account number.
    //----------------------------------------------------------------------------
    public Account (String owner, long account)
    {
        name = owner;
        acctNumber = account;
        balance = 0;
    }
    //----------------------------------------------------------------------------
    //  Sets up the account by defining its owner, account number, initial balance
    //  , and passcode.
    //----------------------------------------------------------------------------
    public Account (String owner, long account, double initial, int key)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
        this.setKey(key);
    }
    //----------------------------------------------------------------------------
    //  Sets up the account by defining its owner, account number, and passcode.
    //----------------------------------------------------------------------------
    public Account (String owner, long account, int key)
    {
        name = owner;
        acctNumber = account;
        balance = 0;
        this.setKey(key);
    }
    
    //----------------------------------------------------------------------------
    //  Deposits the specified amount into the account. Returns the
    //  new balance.
    //----------------------------------------------------------------------------
    public double deposit (double amount)
    {
        if (!locked)
        {
            if (amount >= 0)
                balance = balance + amount;
            else
                System.out.println("ERROR: Invalid Input. The deposit is negative.");

            return balance;
        }
        else
        {
            System.out.println(name + "'s Account is locked. Deposit is denied.");
            return balance;
        }
    }
    
    //----------------------------------------------------------------------------
    //  Withdraws the specified amount from the account and applies 
    //  the fee. Returns the new balance.
    //----------------------------------------------------------------------------
    public double withdraw (double amount, double fee)
    {
        if (!locked)
        {
            if (balance >= (amount + fee))
                balance = balance - amount - fee;
            else
                System.out.println("ERROR: Invalid Input. The amount and fee "
                                    + "exceeds the balance.");

            return balance;
        }
        else
        {
            System.out.println(name + "'s Account is locked. Widthraw is denied.");
            return balance;
        }
    }
    
    //----------------------------------------------------------------------------
    //  Adds interest to the account and returns the new balance.
    //----------------------------------------------------------------------------
    public double addInterest ()
    {
        if (!locked)
        {
            balance += (balance * RATE);
            return balance;
        }
        else
        {
            System.out.println(name + "'s Account is locked. Adding interest is denied.");
            return balance;
        }
    }
    //----------------------------------------------------------------------------
    //  Adds interest to all accounts and returns the new balance.
    //----------------------------------------------------------------------------
    public static void addInterest (Account[] acctList)
    {
        for (Account acct : acctList)
        {
            if (acct != null)
            acct.balance += (acct.balance * RATE);
        }
    }
    
    //----------------------------------------------------------------------------
    //  Returns the current balance of the account
    //----------------------------------------------------------------------------
    public double getBalance()
    {
        if (!locked)
            return balance;
        else
        {
            System.out.println(name + "'s Account is locked. Access to the balance is denied.");
            return 0;
        }
    }
    
    //----------------------------------------------------------------------------
    //  Returns a cone-line description of the account as a string.
    //----------------------------------------------------------------------------
    public String toString()
    {
        if (!locked)
        {
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            return acctNumber + "\t" + name +"\t" + fmt.format(balance);
        }
        else
            return name + "'s Account is locked. Methods cannot be invoked.";
    }
    
}
