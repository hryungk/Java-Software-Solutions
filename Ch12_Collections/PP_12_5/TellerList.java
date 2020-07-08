//********************************************************************************
//  Queue.java      Author: Hyunryung Kim
//
//  Represents a queue list.
//********************************************************************************

import java.util.ArrayList;

public class TellerList
{
    //private ArrayList<Teller> tellerList = new ArrayList<Teller>();
    private final int MAX_TELLER = 1;  // Number of tellers
    private Teller[] tellerList = new Teller[MAX_TELLER];
    
    //----------------------------------------------------------------------------
    //  Constructor: Creates an initially empty list with open status.
    //----------------------------------------------------------------------------
    public TellerList ()
    {
        for (int i = 0; i < MAX_TELLER; i++)
        {
            tellerList[i] = new Teller();
            //tellerList[i].setOpen();
        }
    }
    
    //----------------------------------------------------------------------------
    //  Returns true if all tellers are full.
    //----------------------------------------------------------------------------
    public boolean isFull()
    {
        boolean result = false;
        
        // if everything is false, the final result is false (all tellers closed)
        for (int i = 0; i < MAX_TELLER; i++)
            result = (result || tellerList[i].getStatus());
        
        return !result;            
    }
    
    //----------------------------------------------------------------------------
    //  Returns a specific teller.
    //----------------------------------------------------------------------------
    public Teller getTeller(int idx)
    {        
        return tellerList[idx];
    }
    
    //----------------------------------------------------------------------------
    //  Returns the next available teller randomly among the available tellers.
    //----------------------------------------------------------------------------
    public Teller nextTeller()
    {   
        int[] availableList = availableTellers();
        int nextTellerIdx = availableList[(int) (Math.random()*availableList.length)];
        System.out.print("Teller #" + (nextTellerIdx+1));
        return tellerList[nextTellerIdx];
    }

    //----------------------------------------------------------------------------
    //  Returns the indices of available teller.
    //----------------------------------------------------------------------------
    private int[] availableTellers()
    {
        ArrayList<Integer> availableList = new ArrayList<Integer>();
        
        // Adds indices of available tellers
        for (int i = 0; i < MAX_TELLER; i++)
        {
            if (tellerList[i].getStatus())
                availableList.add(i);
        }
        
        int[] result = new int[availableList.size()];
        
        for (int i = 0; i < availableList.size(); i++)
            result[i] = availableList.get(i);
        
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
        }
        
        return report;
    }    
}
