//********************************************************************************
//  Quiz.java      Author: Hyunryung Kim
//
//  Programming Projects 7.10, Chapter 7
//  Use the Queestion class from Chapter 6 to define a Quiz class. A quiz can be
//  composed of up to 25 questions. Define the add method of the Quiz class to add
//  a question to a quiz. Define the giveQuiz method of the Quiz class to present
//  each question in turn to the user, accept an answer for each one, and keep 
//  track of the results. Define a class called QuizTime with a main method that
//  populates a quiz, presents it, and prints the final results.
//
//  Programming Projects 7.11, Chapter 7
//  Modify your answer to PP 7.10 so that the complexity level of the questions
//  given in the quiz is taken into account. Overload the giveQuiz method so that
//  it accepts two integer parameters that specify the minimum and maximum 
//  complexity levels for the quiz questions and only presents questions in that
//  complexity range. Modify the main method to demonstrate this feature.
//********************************************************************************

import java.util.Scanner;

public class Quiz 
{
    private final int MAX = 25; // Maximum number of questions
    private Question[] quizes = new Question[MAX];
    private Boolean[] results = new Boolean[MAX];
    private int numQ = 0, numValidQ = 0;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the Quiz.
    //----------------------------------------------------------------------------
    public Quiz()
    {
    }

    //----------------------------------------------------------------------------
    //  Adds a qustion to the quiz.
    //----------------------------------------------------------------------------
    public void add(String query, String result)
    {
        if (numQ < MAX)
        {
            quizes[numQ] = new Question(query, result);
            numQ++;
        }
        else
            System.out.println("ERROR: Maximum number of question is reached."
                    + "The question is not added.");
        
    }
    //----------------------------------------------------------------------------
    //  Adds a qustion to the quiz with complexity level.
    //----------------------------------------------------------------------------
    public void add(String query, String result, int level)
    {
        if (numQ < MAX)
        {
            quizes[numQ] = new Question(query, result);
            quizes[numQ].setComplexity(level);
            numQ++;
        }
        else
            System.out.println("ERROR: Maximum number of question is reached."
                    + "The question is not added.");
        
    }
    //----------------------------------------------------------------------------
    //  Presents quiz, accepts answers, and keeps trcack of the result.
    //----------------------------------------------------------------------------
    public void giveQuiz()
    {
        Scanner scan = new Scanner(System.in);
        String possible;
        for (int i = 0; i < quizes.length;i++)
            if (quizes[i] != null)
            {
                System.out.println("Q" + (i+1) + ": " + quizes[i].getQuestion());
                System.out.print("   Answer: ");
                possible = scan.nextLine();
                results[i] = quizes[i].answerCorrect(possible);
            }
            else
                break;
    }
    //----------------------------------------------------------------------------
    //  Presents quiz, accepts answers, and keeps trcack of the result,
    //  considering the complexity of the question.
    //----------------------------------------------------------------------------
    public void giveQuiz(int low, int high)
    {
        Scanner scan = new Scanner(System.in);
        String possible;
        for (int i = 0; i < quizes.length;i++)
            if (quizes[i] != null)
            {
                int level = quizes[i].getComplexity();
                if (low <= level && level <= high)
                {
                    System.out.println("Q" + (numValidQ+1) + ": " + quizes[i].getQuestion());
                    System.out.print("   Answer: ");
                    possible = scan.nextLine();
                    results[numValidQ] = quizes[i].answerCorrect(possible);
                    numValidQ++;
                }
//                else
//                    System.out.println("ERROR: complexity level out of range.");
            }
            else
                break;
    }
    //----------------------------------------------------------------------------
    //  Returns the result of the quiz as a string.
    //----------------------------------------------------------------------------
    public String toString()
    {
        String result = "Result\n---------------\n";

        for (int i = 0; i < quizes.length;i++)
            if (results[i] != null)
            {
                if (results[i])
                    result += "Q" + (i+1) + ": Correct\n";
                else
                    result += "Q" + (i+1) + ": Incorrect\n";
            }
//            else
//                break;        
        
        return result;
    }

}
