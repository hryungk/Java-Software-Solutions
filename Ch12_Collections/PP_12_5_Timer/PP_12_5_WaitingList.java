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
        }
    }    
    
    //----------------------------------------------------------------------------
    //  Creates a Queue object, adds several customers to the queue, then
    //  prints it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        // Maximum number of customers per day
        final int MAX_CUSTOMER = 10;    
        // Maximum number of customers today
        int numCust = (int) (Math.random() * MAX_CUSTOMER); 
        // Maximum time interval between customers [ms] (solely for the sake of  
        // running the program for a reasonable time.)
        final int MAX_INTERVAL = 10*1000;  
        // When the next customer arrives.
        long nextCust; 
        Timer timer = new Timer();
        QueueTimerTask task = new QueueTimerTask(); // Create a new queue
        //Queue task = new Queue();  
        
        // Seconds counter
        Timer counterTimer = new Timer();
        TimerTask counterTask = new CounterTimerTask();        
        counterTimer.scheduleAtFixedRate(counterTask, 0, 1*1000);
        
        for (int i = 0; i < numCust; i++)
        {
            nextCust = (long) (Math.random() * MAX_INTERVAL); 
            System.out.println("Next customer coming in " + (nextCust/1000) + " seconds.");
            timer.schedule(task, nextCust); // Wait until the next customer arrives
            //System.out.println("Previous customer leaving in " +
            //                (task.getCurCust().getTime()/1000) + " seconds.");
            System.out.println(task);

            //cancel after sometime
            try 
            {
                //Thread.sleep(nextCust + task.getCurCust().getTime());
                Thread.sleep(10*1000);
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            timer.cancel();
        }
        
        //cancel after sometime
        try 
        {
            Thread.sleep(numCust*MAX_INTERVAL*1*60*1000);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }        
        counterTimer.cancel();
             
    }
}
