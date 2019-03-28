//********************************************************************************
//  Transactions.java      @author: Hyunryung Kim
//
//  Programming Projects 7.6, Chapter 7
//  The L&L Bank can handle up to 30 customers who have savings accounts. Design
//  and implement a program that manages the accounts. Keep track of key 
//  information and allow each customer to make deposits and withdrawals. Produce
//  appropriate error messages for invalid transactions. Hint: you may want to 
//  base your accounts on the Account class from Chapter 4. Also provide a method
//  to add 3 percent interest to all accounts whenever the method is invoked.
//********************************************************************************

public class PP_7_6_Transactions 
{
    //----------------------------------------------------------------------------
    // Creates some bank accounts and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int MAX = 30;
        Account[] acctList = new Account[MAX];
        
        Account acct1 = new Account("Ted Murphy", 72354, 1423);
        
        // unlock
        acct1.unlock(1423);
        
        System.out.println(acct1);
        
        Account acct2 = new Account("Jane Smith", 69713, 40.00, 1234);
        Account acct3 = new Account("Edward Demsey", 93757, 759.32, 7890);
        
        // unlock
        acct2.unlock(1234);
        acct3.unlock(7890);
        
        acct1. deposit(25.85);
        double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith balance after deposit: " + smithBalance);
        
        System.out.println("Smith balance after withdrawal: " + 
                    acct2.withdraw(430.75, 1.50));
        
        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
        
        acctList[0] = acct1;
        acctList[1] = acct2;
        acctList[2] = acct3;
        Account.addInterest(acctList);
        
        System.out.println();
        System.out.println("After adding interest:");
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
    
}
