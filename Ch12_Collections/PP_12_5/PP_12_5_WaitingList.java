//********************************************************************************
//  WaitingList.java      Author: Hyunryung Kim
//
//  Programming Projects 12.5, Chapter 12 Collections
//  Design and implement an application that simulates the customers waiting in 
//  line at a bank. Use a queue data structure to represent the line. As customers 
//  arrive at the bank, customer objects are put in the rear of the queue with an 
//  enqueue operation. When the teller is ready to service another customer, the 
//  customer object is removed from the front of the queue with a dequeue 
//  operation. Randomly determine when new customers arrive at the bank and when 
//  current customers are finished at the teller window. Print a message each time 
//  an operation occurs during the simulation.
//********************************************************************************

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class PP_12_5_WaitingList
{
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
            ex.printStackTrace();
        }
    }    
    
    //----------------------------------------------------------------------------
    //  Creates a Queue object, adds several customers to the queue, then
    //  prints it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int totalTime = 20; // Duration to check the queue   
        Queue queue = new Queue();  // Create a new queue.
        TellerList tellers = new TellerList();  // Create a new teller list.
        // Create a Random object to decide whether a customer arrived or left.
        Random rand = new Random(); 
        
        // Seconds counter: Prints out current date every second.
        Timer counterTimer = new Timer();
        TimerTask counterTask = new MyTimerTask();        
        
        counterTimer.scheduleAtFixedRate(counterTask, 0, 1*1000);
        //wait(1000);
        
        // Check the queue and teller status every second.
        for (int i = 0; i < totalTime; i++) // loops every second
        {
            // Add a customer in queue if true
            if (rand.nextInt(2) == 1)
                queue.enqueue();
            else
                System.out.println("No new customer came in.");
            
            // Check the teller status if queue is occupied.
            if (!(queue.empty()))
            {
                if (tellers.isFull())   // If all tellers are occupied
                    System.out.println("All tellers are helping other customers." 
                                        + " Please wait.");
                else    // If there are available tellers
                {
                    // Assign the customer to the next available teller.
                    tellers.nextTeller().setClose(queue.getFirstCust()); 
                    // Remove the first customer from the queue.
                    queue.dequeue();
                } 
            }
            
            // Define an integer array of occupied tellers.
            int[] occupiedTellers = tellers.unavailableTellers();
            // For each occupied teller, check whether the customer left (randomly
            // decide for simulation purpose)
            for (int j = 0; j < occupiedTellers.length; j++)
                if (rand.nextInt(2) == 1)   // if true, the customer left and teller is open.
                {
                    System.out.println("Customer #" + 
                            tellers.getTeller(occupiedTellers[j]).getCustomer() 
                            + " left. Teller #" + (occupiedTellers[j]+1) + 
                            " is now open and ready for a new customer.");
                    tellers.getTeller(occupiedTellers[j]).setOpen();
                }
            
            System.out.println(queue);
            System.out.println(tellers);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            wait(1000);
        }
        counterTimer.cancel();
    }
}
