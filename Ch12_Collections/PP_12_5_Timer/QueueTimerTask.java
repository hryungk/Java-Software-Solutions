//********************************************************************************
//  QueueTimerTask.java      Author: Hyunryung Kim
//
//  Represents a customer at a bank.
//********************************************************************************

import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;

public class QueueTimerTask extends TimerTask
{
    // Customer queue list
    private ArrayList<Customer> waitList = new ArrayList<Customer>();
    final int NUM_TELLER = 5;  // Number of tellers
    // Tellers currently available 1 or not available 0
    private int[] tellerStatus = new int[NUM_TELLER];    
    private int count = 0;  // Total number of customers visited
    private int curCount = 0;   // Current number of customers in queue.
    private int curEngaged = 0; // Number of customers currently taken care of
    Customer newCustomer;   // New Customer
    

    //----------------------------------------------------------------------------
    //  Puts a customer in the rear of the queue.
    //----------------------------------------------------------------------------
    public QueueTimerTask ()
    {
        //  Initialize tellers to be available
        for (int i = 0; i < NUM_TELLER; i++)
            tellerStatus[i] = 1;
    }    
    //----------------------------------------------------------------------------
    //  Puts a customer in the rear of the queue.
    //----------------------------------------------------------------------------
    public void enqueue ()
    {
        count++;
        newCustomer = new Customer(count);
        waitList.add(newCustomer);
        System.out.println("A customer #"+ count + " is added to the queue.");
        curCount = waitList.size();
        
    }

    //----------------------------------------------------------------------------
    //  Removes a customer from the front of the queue.
    //----------------------------------------------------------------------------    
    public void dequeue()
    {
        System.out.println("Customer #" + waitList.get(0) 
                            + " is removed from the queue.");
        waitList.remove(0);
        curCount = waitList.size();
        curEngaged++;
    }    
    
    //----------------------------------------------------------------------------
    //  Returns true if the list is empty.
    //----------------------------------------------------------------------------
    public boolean empty()
    {
        return waitList.isEmpty();
    }

    //----------------------------------------------------------------------------
    //  Returns the current wait list
    //----------------------------------------------------------------------------
    public ArrayList<Customer> getWaitList()
    {
        return waitList;
    }

    //----------------------------------------------------------------------------
    //  Returns the current wait list
    //----------------------------------------------------------------------------
    public Customer getCurCust()
    {
        return newCustomer;
    }

    //----------------------------------------------------------------------------
    //  Returns a report describing the current queue.
    //----------------------------------------------------------------------------
    public String toString()
    {    
        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "Current Queue Status\n\n";
        
        report += "Lastest customer number: " + count + "\n";
        report += "Number of customers in queue: " + curCount;
        
        report += "\n\nCustomer List: ";
        
        for (Customer cust : waitList)
            report += cust.toString();
        
        return report;
    }    
    
    //----------------------------------------------------------------------------
    //  Run the TimerTask.
    //----------------------------------------------------------------------------
    public void run()
    {
        enqueue();
        int sum = 0;    // sum of availability
        for (int i = 0; i < tellerStatus.length; i++)
        {
            sum += tellerStatus[i];
            if (tellerStatus[i] == 1)
            {
                dequeue();
                closeTeller(i);
                openTeller(i,newCustomer);
                break;
            }   
            
            if (sum == 0)
                System.out.println("Wait until the next teller is available.");                        
        }
        
    }
    
    //----------------------------------------------------------------------------
    //  Open a teller once it's doned.
    //----------------------------------------------------------------------------
    public void openTeller(int i, Customer cust)
    {
        wait(cust.getTime());
        tellerStatus[i] = 1;
        System.out.println("Teller #" + (i+1) + " is now open for a customer.");
    }    
    
    //----------------------------------------------------------------------------
    //  Close a teller for the new customer.
    //----------------------------------------------------------------------------
    public void closeTeller(int i)
    {
        tellerStatus[i] = 0;
        System.out.println("Teller #" + (i+1) + " is currently meeting a customer, " + 
                "will be available in " + (newCustomer.getTime()/1000) + 
                " seconds.");
    } 
    
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }        
}
