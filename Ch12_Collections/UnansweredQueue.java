//********************************************************************************
//  Queue.java      Author: Hyunryung Kim
//
//  Represents a queue that stores the questions (unanswered).
//********************************************************************************

import java.util.LinkedList;
import java.util.Scanner;

public class UnansweredQueue extends Queue
{
    private LinkedList<Question> waitingList = new LinkedList<Question>();
    private int count;  // Total number of questions for this queue
    private int totNumQ;   // Total number of questions
    Question newQuestion;
    
    //----------------------------------------------------------------------------
    //  Constructor: Initializes counters.
    //----------------------------------------------------------------------------
    public UnansweredQueue ()
    {
        totNumQ = 0;
        count = 0;
    }
    
    //----------------------------------------------------------------------------
    //  Puts a question in the rear of the queue.
    //----------------------------------------------------------------------------
    public void enqueue ()
    {
        count++;
        waitingList.add(newQuestion);
        System.out.println("Question #"+ totNumQ + " is added to the unanswered " 
                            + "queue.");
    }
    
    //----------------------------------------------------------------------------
    //  Creates a new question.
    //----------------------------------------------------------------------------
    public void newQuestion ()
    {
        totNumQ++;
        Scanner QScan = new Scanner (System.in);    // Question and name scanner
        
        System.out.print("Enter a question: ");
        String question = QScan.nextLine();
        System.out.print("Enter your name: ");
        String name = QScan.nextLine();
        newQuestion = new Question(totNumQ, question, name);
        
        enqueue();
    }
    
    //----------------------------------------------------------------------------
    //  Removes a question from the front of the queue.
    //----------------------------------------------------------------------------    
    public void dequeue()
    {
        System.out.println("Question #"+ waitingList.get(0).getQNum()
                            + " is removed from the unanswered queue.");
        waitingList.remove(0);
        count--;
    }    
    
    //----------------------------------------------------------------------------
    //  Sets an answer to the first question in queue.
    //----------------------------------------------------------------------------    
    public void answer()
    {
        Scanner strScan = new Scanner(System.in);   //  Answer scanner
        String answer;  // Answer string from the speaker
        
        System.out.print("Enter your answer: ");
        answer = strScan.nextLine();
        getFirstQ().setAnswer(answer);
    }
    
    //----------------------------------------------------------------------------
    //  Passes on a question, moving it from the front of the queue to the end of 
    //  the queue.
    //----------------------------------------------------------------------------    
    public void pass()
    {
        Question current = getFirstQ(); // current question to answer
        waitingList.remove(0);  // Move the question from the front
        waitingList.add(current);   // to the end of the queue.
        System.out.println("Current question is passed and move to the back. " 
                            + "Moving on to the next question.");
    }
    
    //----------------------------------------------------------------------------
    //  Marks a question as rejected, removing it from the queue.
    //----------------------------------------------------------------------------    
    public void reject()
    {
        getFirstQ().setRejected(); // Mark as rejected.
        waitingList.remove(0);  // Remove the current question.
        System.out.println("Current question is rejected.");
    }
    
    //----------------------------------------------------------------------------
    //  Returns the first question in queue.
    //----------------------------------------------------------------------------    
    public Question getFirstQ()
    {
        return waitingList.getFirst();
    }  
    
    //----------------------------------------------------------------------------
    //  Returns the first question in queue.
    //----------------------------------------------------------------------------    
    public Question getLastQ()
    {
        return waitingList.getLast();
    } 

    //----------------------------------------------------------------------------
    //  Returns the size of the queue
    //----------------------------------------------------------------------------    
    public int getSize()
    {
        return waitingList.size();
    }

    //----------------------------------------------------------------------------
    //  Returns true if the queue is empty.
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
        report += "Current Unanswered Queue Status\n\n";
        
        //for (int i = 0; i < waitingList.size();i++)
        //    report += waitingList.get(i) + "\n";
        
        for (int i = 0; i < waitingList.size();i++)
            report += "Q." + (i+1) + " " + waitingList.get(i) + "\n";
        
        return report;
    }    
}
