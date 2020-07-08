//********************************************************************************
//  Queue.java      Author: Hyunryung Kim
//
//  Represents a queue that stores the questions (unanswered).
//********************************************************************************

import java.util.LinkedList;

public class QuestionQueue extends Queue
{
    private LinkedList<Question> questionList = new LinkedList<Question>();
    private int count;  // Total number of questions for this queue
    Question newQuestion;
    
    //----------------------------------------------------------------------------
    //  Constructor: Initializes the counter.
    //----------------------------------------------------------------------------
    public QuestionQueue ()
    {
        count = 0;
    }
    
    //----------------------------------------------------------------------------
    //  Puts a question in the rear of the queue.
    //----------------------------------------------------------------------------
    public void enqueue ()
    {
        count++;
        questionList.add(newQuestion);
        //System.out.println("Question #"+ totNumQ + " is added to the queue.");
    }
    
    //----------------------------------------------------------------------------
    //  Puts a question in the rear of the queue.
    //----------------------------------------------------------------------------
    public void addQ (Question Q)
    {
        newQuestion = Q;
        
        enqueue();
    }
    
    //----------------------------------------------------------------------------
    //  Removes a question from the front of the queue.
    //----------------------------------------------------------------------------    
    public void dequeue()
    {
        System.out.println("Question #"+ questionList.get(0).getQNum()
                            + " is removed from the queue.");
        questionList.remove(0);
        count--;
    }    
    
    //----------------------------------------------------------------------------
    //  Returns the first question in queue.
    //----------------------------------------------------------------------------    
    public Question getFirstQ()
    {
        return questionList.get(0);
    }       

    //----------------------------------------------------------------------------
    //  Returns the size of the queue
    //----------------------------------------------------------------------------    
    public int getSize()
    {
        return questionList.size();
    }

    //----------------------------------------------------------------------------
    //  Returns true if the queue is empty.
    //----------------------------------------------------------------------------
    public boolean empty()
    {
        return questionList.isEmpty();
    }

    //----------------------------------------------------------------------------
    //  Returns a report describing the current queue.
    //----------------------------------------------------------------------------
    public String toString()
    {    
        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "Numbered Question Queue\n\n";
        
        //for (int i = 0; i < questionList.size();i++)
        //    report += questionList.get(i) + "\n";
        
        for (int i = 0; i < questionList.size();i++)
            report += "Q." + (i+1) + " " + questionList.get(i) + "\n";
        
        return report;
    }    
}
