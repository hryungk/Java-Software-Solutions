//********************************************************************************
//  Queue.java      Author: Hyunryung Kim
//
//  Represents a queue list.
//********************************************************************************

import java.util.ArrayList;

public class Queue
{
    private ArrayList<Customer> waitingList = new ArrayList<Customer>();
    private int count = 0;  // Total number of customers
    private final int MAX_TELLER = 10;  // Number of tellers
    
    //----------------------------------------------------------------------------
    //  Constructor: Creates an initially empty collection
    //----------------------------------------------------------------------------
    public Queue ()
    {

    }
    
    //----------------------------------------------------------------------------
    //  Puts a customer in the rear of the queue.
    //----------------------------------------------------------------------------
    public void enqueue ()
    {
        count++;
        Customer newCustomer = new Customer(count);
        waitingList.add(newCustomer);
        System.out.println("A customer #"+ count + " is added to the queue.");
    }

    //----------------------------------------------------------------------------
    //  Removes a customer from the front of the queue.
    //----------------------------------------------------------------------------    
    public void dequeue()
    {
        System.out.println("Customer #"+ waitingList.get(0) 
                            + " is removed from the queue.");
        waitingList.remove(0);
    }    
    
    //----------------------------------------------------------------------------
    //  Convert a Comparable list to a CDCollectionNode and return it.
    //----------------------------------------------------------------------------
    public boolean empty()
    {
        return waitingList.isEmpty();
    }

    //----------------------------------------------------------------------------
    //  Returns a report describing the current queue.
    //----------------------------------------------------------------------------
    public String toString()
    {    
        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "Current Queue Status\n\n";
        
        report += "Lastest customer number: " + count + "\n";
        report += "Number of customers in queue: " + waitingList.size();
        
        report += "\n\nCustomer List: ";
        
        for (Customer cust : waitingList)
            report += cust.toString();
        
        return report;
    }    
}
