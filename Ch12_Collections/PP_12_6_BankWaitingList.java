//********************************************************************************
//  BankWaitingList.java      Author: Hyunryung Kim
//
//  Programming Projects 12.6, Chapter 12 Collections
//  Modify the solution to the PP 12.5 so that it represents eight tellers and 
//  therefore eight customer queues. Have new customers go to the shortest queue. 
//  Determine which queue had the shortest waiting time per customer on average.
//********************************************************************************

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class PP_12_6_BankWaitingList
{
    //----------------------------------------------------------------------------
    //  Pauses for ms miliseconds.
    //----------------------------------------------------------------------------
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
    //  Creates a Queue array, adds customers to the shortest queue, then
    //  prints it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int totalTime = 50; // Duration to check the queue   
        int custNum = 0;  // Total number of customers
        TellerQueue tellers = new TellerQueue();  // Create a new teller list.
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
            // Add a customer to the shortest queue if true
            if (rand.nextInt(2) == 1)
            {
                custNum++;
                Teller curTeller = tellers.nextTeller();
                curTeller.setCurCustNum(custNum);
                curTeller.enqueue();
            }
            else
                System.out.println("No new customer came in.");
            
            // Check the teller status if someone is waiting in queues.
            if (!(tellers.empty())) // if the queue is not empty (ie someone waiting)
            {
                for (Teller teller : tellers.queuedTellers())   // For tellers who have someone in thier queue
                {                
                    if (teller.getStatus())   // If this teller is open
                    {
                        System.out.println("ATTENTION Customer # " + 
                                teller.getFirstCust() + ", Teller #" + 
                                teller.getTellerNum() + " is ready for you.");
                        teller.setClose(teller.getFirstCust()); // Occupy this teller with the first customer in their queue
                        teller.dequeue();   // Remove the first customer from the queue.
                    }

                    //else    // If this teller is currently occupied
                    //    System.out.println("Attention Customer # " + 
                    //            teller.getFirstCust() + ", Teller #" + 
                    //            teller.getTellerNum() + " is currently helping a " 
                    //            + "customer and will be ready for you shortly. "
                    //            + "Thank you for your patience.");
                    
                }
            }
            
            // Define an integer array of occupied tellers.
            int[] occupiedTellers = tellers.unavailableTellers();
            // For each occupied teller, check whether the customer left (randomly
            // decide for simulation purpose)
            for (int j = 0; j < occupiedTellers.length; j++)
                if (rand.nextInt(200) == 1)   // if true, the customer left and teller is open.
                {
                    System.out.println("Customer #" + 
                            tellers.getTeller(occupiedTellers[j]).getCustomer() 
                            + " left. Teller #" + (occupiedTellers[j]+1) + 
                            " is now open and ready for a new customer.");
                    tellers.getTeller(occupiedTellers[j]).setOpen();
                }
            
            //System.out.println(queue);
            System.out.println(tellers);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            wait(1000);
        }
        counterTimer.cancel();
    }
}
