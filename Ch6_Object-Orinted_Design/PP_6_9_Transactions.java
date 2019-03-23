//********************************************************************************
//  Transactions.java      @author: Hyunryung Kim
//
//  Programming Projects 6.9, Chapter 6
//  Redesign and implement a version of the Account class from Chapter 4 so that
//  it is Lockable as defined by PP 6.8.
//********************************************************************************

public class PP_6_9_Transactions 
{
    //----------------------------------------------------------------------------
    // Creates some bank accounts and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Account acct1 = new Account("Ted Murphy", 72354, 1423);
        
        System.out.println(acct1);
        
        //unlock
        acct1.unlock(1423);
        
        Account acct2 = new Account("Jane Smith", 69713, 40.00, 1234);
        Account acct3 = new Account("Edward Demsey", 93757, 759.32, 7890);
        
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
