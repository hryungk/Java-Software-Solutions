//********************************************************************************
//  Queue.java      Author: Hyunryung Kim
//
//  Represents a queue list.
//********************************************************************************
import java.util.ArrayList;

public abstract class Queue
{
    private int count = 0;  // Total number of customers for this queue
    private ArrayList<Object> waitingList;  // Queue
    private int queueSize;  // Size of the queue
    
    //----------------------------------------------------------------------------
    //  Puts an object in the rear of the queue.
    //----------------------------------------------------------------------------
    public abstract void enqueue ();

    //----------------------------------------------------------------------------
    //  Removes an object from the front of the queue.
    //----------------------------------------------------------------------------    
    public abstract void dequeue();

    //----------------------------------------------------------------------------
    //  Returns the size of the queue
    //----------------------------------------------------------------------------    
    public abstract int getSize();

    
    //----------------------------------------------------------------------------
    //  Returns true if the queue is empty.
    //----------------------------------------------------------------------------
    public abstract boolean empty(); 
    
    //----------------------------------------------------------------------------
    //  Returns a report describing the current queue.
    //----------------------------------------------------------------------------
    public abstract String toString();
}
