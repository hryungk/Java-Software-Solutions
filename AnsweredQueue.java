//********************************************************************************
//  AnsweredQueue.java      Author: Hyunryung Kim
//
//  Represents a queue that stores answered questions.
//********************************************************************************

import java.util.LinkedList;

public class AnsweredQueue extends Queue
{
    private LinkedList<Question> answeredList = new LinkedList<Question>();
    private int count;  // Total number of questions for this queue
    Question answeredQ;
    
    //----------------------------------------------------------------------------
    //  Constructor: Initializes the counter.
    //----------------------------------------------------------------------------
    public AnsweredQueue ()
    {
        count = 0;
    }
    
    //----------------------------------------------------------------------------
    //  Puts a question in the rear of the queue.
    //----------------------------------------------------------------------------
    public void enqueue ()
    {
        count++;
        answeredList.add(answeredQ);
        int numQ = answeredQ.getQNum();
        System.out.println("Question #"+ numQ + " is added to the answered queue.");
    }
    
    //----------------------------------------------------------------------------
    //  Puts a question in the rear of the queue.
    //----------------------------------------------------------------------------
    public void addAnsweredQ (Question Q)
    {
        answeredQ = Q;
        
        enqueue();
    }
    
    //----------------------------------------------------------------------------
    //  Removes a question from the front of the queue.
    //----------------------------------------------------------------------------    
    public void dequeue()
    {
        System.out.println("Question #"+ answeredList.get(0) 
                            + " is removed from the answered queue.");
        answeredList.remove(0);
        count--;
    }    
    

    //----------------------------------------------------------------------------
    //  Returns the size of the queue
    //----------------------------------------------------------------------------    
    public int getSize()
    {
        return answeredList.size();
    }

    //----------------------------------------------------------------------------
    //  Returns true if the queue is empty.
    //----------------------------------------------------------------------------
    public boolean empty()
    {
        return answeredList.isEmpty();
    }

    //----------------------------------------------------------------------------
    //  Returns a report describing the current queue.
    //----------------------------------------------------------------------------
    public String toString()
    {    
        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "Current Answered Queue Status\n\n";
        
        //for (Question question : answeredList)
        //    report += question.toString() + " ";
        
        for (int i = 0; i < answeredList.size();i++)
            report += "Q." + (i+1) + " " + answeredList.get(i) + "\n";
        
        return report;
    }    
}
