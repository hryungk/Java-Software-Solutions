//********************************************************************************
//  Transactions.java      @author: Hyunryung Kim
//
//  Programming Projects 6.1, Chapter 6
//  Modify the Account class from Chapter 4 so that it also permits an account to
//  be opened with just a name and an account number, assuming an initial balance
//  of zero. Modify the main method of the Transactions class to demonstrate this
//  new capability.
//********************************************************************************

public class PP_6_1_Transactions 
{
    //----------------------------------------------------------------------------
    // Creates some bank accounts and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Account acct1 = new Account("Ted Murphy", 72354);
        Account acct2 = new Account("Jane Smith", 69713, 40.00);
        Account acct3 = new Account("Edward Demsey", 93757, 759.32);
        
        acct1. deposit(25.85);
        double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith balance after deposit: " + smithBalance);
        
        System.out.println("Smith balance after withdrawal: " + 
                    acct2.withdraw(430.75, 1.50));
        
        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();
        
        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
    
}
