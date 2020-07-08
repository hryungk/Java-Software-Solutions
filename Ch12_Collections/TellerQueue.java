//********************************************************************************
//  TellerQueue.java      Author: Hyunryung Kim
//
//  Represents a list of queues.
//********************************************************************************

import java.util.ArrayList;

public class TellerQueue
{
    //private ArrayList<Teller> tellerList = new ArrayList<Teller>();
    private final int MAX_TELLER = 8;  // Number of tellers
    private final Teller[] tellerList;
    
    //----------------------------------------------------------------------------
    //  Constructor: Creates an initially empty list with open status.
    //----------------------------------------------------------------------------
    public TellerQueue ()
    {
        tellerList = new Teller[MAX_TELLER];
        for (int i = 0; i < MAX_TELLER; i++)
        {
            tellerList[i] = new Teller(i);
            //tellerList[i].setOpen();
        }
    }
    
    //----------------------------------------------------------------------------
    //  Returns true if all tellers are occupied.
    //----------------------------------------------------------------------------
    public boolean isFull()
    {
        boolean result = false;
        
        // if everything is false, the final result is false (all tellers occupied)
        for (int i = 0; i < MAX_TELLER; i++)
            result = (result || tellerList[i].getStatus());
        
        return !result;            
    }
    
    //----------------------------------------------------------------------------
    //  Returns true if all tellers have an empty queue.
    //----------------------------------------------------------------------------
    public boolean empty()
    {
        boolean result = true;
        
        // if everything is true, the final result is true (no customer waiting)
        for (int i = 0; i < MAX_TELLER; i++)
            result = (result && tellerList[i].getQueue().isEmpty());
        
        return result;            
    }
    
    //----------------------------------------------------------------------------
    //  Returns tellers that have someone in their queue.
    //----------------------------------------------------------------------------
    public ArrayList<Teller> queuedTellers()
    {
        
        ArrayList<Teller> result = new ArrayList<Teller>();
        
        for (Teller teller : tellerList)
        {
            if (!(teller.empty()))
                result.add(teller);
        }
        
        return result;            
    }
    
    //----------------------------------------------------------------------------
    //  Returns tellers that have no one in their queue.
    //----------------------------------------------------------------------------
    public ArrayList<Teller> noQueueTellers()
    {
        
        ArrayList<Teller> result = new ArrayList<Teller>();
        
        for (Teller teller : tellerList)
        {
            if ((teller.empty()))
                result.add(teller);
        }
        
        return result;            
    }
    
    //----------------------------------------------------------------------------
    //  Returns a specific teller.
    //----------------------------------------------------------------------------
    public Teller getTeller(int idx)
    {        
        return tellerList[idx];
    } 

    //----------------------------------------------------------------------------
    //  Returns the indices of available teller.
    //----------------------------------------------------------------------------
    public int[] availableTellersIdx()
    {
        ArrayList<Integer> availableList = new ArrayList<Integer>();
        
        // Adds indices of available tellers
        for (int i = 0; i < MAX_TELLER; i++)
        {
            if (tellerList[i].getStatus())
                availableList.add(tellerList[i].getTellerNum());
                //availableList.add(i);
        }
        
        int[] result = new int[availableList.size()];
        
        for (int i = 0; i < availableList.size(); i++)
            result[i] = availableList.get(i);
        
        return result;
    }

    //----------------------------------------------------------------------------
    //  Returns the indices of available teller.
    //----------------------------------------------------------------------------
    public ArrayList<Teller> availableTellers()
    {
        ArrayList<Teller> result = new ArrayList<Teller>();
        
        // Adds indices of available tellers
        for (int i = 0; i < MAX_TELLER; i++)
        {
            if (tellerList[i].getStatus())
                result.add(tellerList[i]);
        }
        
        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the indices of available teller.
    //----------------------------------------------------------------------------
    public int[] unavailableTellers()
    {
        ArrayList<Integer> unavailableList = new ArrayList<Integer>();
        
        // Adds indices of available tellers
        for (int i = 0; i < MAX_TELLER; i++)
        {
            if (!(tellerList[i].getStatus()))
                unavailableList.add(i);
        }
        
        int[] result = new int[unavailableList.size()];
        
        for (int i = 0; i < unavailableList.size(); i++)
            result[i] = unavailableList.get(i);
        
        return result;
    }

    //----------------------------------------------------------------------------
    //  Returns the teller that has the shortest queue.
    //----------------------------------------------------------------------------
    public Teller shortestQueueTeller()
    {
        // minimum queue length, teller number for shortest queue, current queue length
        int minQLen = tellerList[0].getQueue().size(), minIdx = 0, curQLen;    
        int[] sizes = new int[MAX_TELLER];  // queue size for each teller
        ArrayList<Integer> minSizeIdx = new ArrayList<Integer>();  // indices for minimum size queue
        
        // Find the teller with the shortest queue
        for (int i = 0; i < MAX_TELLER; i++)
        {
            curQLen = tellerList[i].getQueue().size();
            sizes[i] = curQLen;
            if (curQLen <= minQLen)
                minQLen = curQLen;
        }
        
        for (int i = 0; i < MAX_TELLER; i++)
            if (sizes[i] == minQLen)
                minSizeIdx.add(i);
        minIdx = (int) (Math.random() * minSizeIdx.size()); // Randomly choose a teller with minimum size queue
        
        return tellerList[minSizeIdx.get(minIdx)];
    }
    

    //----------------------------------------------------------------------------
    //  Returns the next teller (that has the shortest queue).
    //----------------------------------------------------------------------------
    public Teller nextTeller()
    {
        Teller result;  // teller with shortest queue
        
        // If all tellers are occupied, select the one with shortest queue
        if (isFull())
        {
            if (!(noQueueTellers().isEmpty()))  // if there are tellers with empty queue
            {
                result = noQueueTellers().get((int) (Math.random() * noQueueTellers().size()));
            }
            else    // if all tellers have someone in their queue
            {
                // Find the teller with the shortest queue
                result = shortestQueueTeller();
            }
        }
        else    // If not all are occupied, randomly select one from available tellers
        {
            ArrayList<Teller> tellerList = availableTellers();
            int Idx = (int) (Math.random() * tellerList.size());
            result = tellerList.get(Idx);
        }
        
        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a report describing the current queue.
    //----------------------------------------------------------------------------
    public String toString()
    {    
        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "Current Teller Status\n";
        
        for (int i = 0; i < MAX_TELLER; i++)
        {
            if (tellerList[i].getStatus())
                report += "\nTeller #" + (i+1) + " is available.";
            
            else
                report += "\nTeller #" + (i+1) + " is meeting with Customer #" 
                        + tellerList[i].getCustomer() + ".";
            
            report += " Queue: " + tellerList[i].getQueue();
        }
        
        return report;
    }    
}
