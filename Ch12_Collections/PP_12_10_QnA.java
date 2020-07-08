//********************************************************************************
//  QnA.java      author: Hyunryung Kim
//
//  Programming Projects 12.10, Chapter 12 Collections
//  Design and implement an application to support a moderated question-and-answer 
//  session in which audience members submit questions to a queue. The question at 
//  the front of the queue may be answered by the speaker or panel, and a list of 
//  answered or unanswered questions may be retrieved at any time.
//  The program should accept the following simple commands: ‘Q’ will allow an 
//  audience member to submit a question, along with their name; ‘A’ will allow 
//  the speaker to enter an answer to the question currently at the top of the 
//  queue; ‘P’ will allow the speaker to pass on a question, moving it from the 
//  front of the queue to the end of the queue; ‘R’ will allow the speaker to mark 
//  a question as rejected, removing it from the queue; ‘LA’ will print a numbered 
//  list of answered questions, along with the answers; ‘LU’ will print a numbered 
//  list of unanswered questions; finally, ‘X’ will print numbered lists of 
//  answered and unanswered questions, then exit the program.
//  You should create a Question class to store each question, its answer, and any 
//  other question state information. The answered and unanswered queues should be 
//  implemented using the java.util.LinkedList class. You must use only the 
//  methods in the class that provide Queue functionality: remove the first 
//  element, append an element to the end, retrieve the queue size, and iterate 
//  over the list.
//********************************************************************************

import java.util.Scanner;

public class PP_12_10_QnA 
{
    //----------------------------------------------------------------------------
    // Accepts commands from an audience and executes services accordingly.
    //----------------------------------------------------------------------------
    public static void main(String[] args)
    {
        UnansweredQueue unansweredQueue = new UnansweredQueue();
        AnsweredQueue answeredQueue = new AnsweredQueue();
        QuestionQueue questionQueue = new QuestionQueue();
        String nextInput ;   // Input string
        Scanner inputScan = new Scanner (System.in);    // Input letter scanner
        
        
        //  Accept inputs from the user. "X" to end the loop.
        do
        {
            if (!unansweredQueue.empty())
            {
                String current = unansweredQueue.getFirstQ().getQ();
                System.out.println("Current question: " + current);
            }
            
            System.out.println("Enter the desired code:");
            System.out.println("Q: Submits a question.");
            System.out.println("A: Speaker enters an answer to the question.");
            System.out.println("P: Speaker passes on a question.");
            System.out.println("R: Speaker rejects a question.");
            System.out.println("LA: Prints a list of answered questions.");
            System.out.println("LU: Prints a list of unanswered questions.");
            System.out.println("X: Prints all questions and exit.");    

            nextInput = inputScan.nextLine();
            if (nextInput.equalsIgnoreCase("Q"))
            {
                // Add new question to the unanswered queue
                unansweredQueue.newQuestion();  
                // Add new question to the entire question queue
                questionQueue.addQ(unansweredQueue.getLastQ());  
            }
            else
            {
                if (nextInput.equalsIgnoreCase("A"))
                {
                    unansweredQueue.answer();   // answer the first question
                    // Add the answered question to the answered queue
                    answeredQueue.addAnsweredQ(unansweredQueue.getFirstQ());
                    unansweredQueue.dequeue();  // remove from the unanswered queue
                }
                else
                {
                    if (nextInput.equalsIgnoreCase("P"))
                        unansweredQueue.pass(); // passes on the current question.
                    else
                    {
                        if (nextInput.equalsIgnoreCase("R"))
                            unansweredQueue.reject(); // Remove the current question.
                        else
                        {
                            if (nextInput.equalsIgnoreCase("LA"))
                                System.out.println(answeredQueue);
                            else
                            {
                                if (nextInput.equalsIgnoreCase("LU"))
                                    System.out.println(unansweredQueue);
                                else
                                {
                                    if (nextInput.equalsIgnoreCase("X"))
                                        System.out.println(questionQueue);
                                    else
                                        System.out.println("<<Wrong code input>>");
                                }
                            }
                        }
                    }
                                
                }
            }
            
            System.out.println();
        } while (!nextInput.equalsIgnoreCase("X"));
        
    }
}
