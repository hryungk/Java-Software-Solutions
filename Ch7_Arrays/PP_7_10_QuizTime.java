//********************************************************************************
//  QuizTime.java      Author: Hyunryung Kim
//
//  Programming Projects 7.10, Chapter 7
//  Use the Queestion class from Chapter 6 to define a Quiz class. A quiz can be
//  composed of up to 25 questions. Define the add method of the Quiz class to add
//  a question to a quiz. Define the giveQuiz method of the Quiz class to present
//  each question in turn to the user, accept an answer for each one, and keep 
//  track of the results. Define a class called QuizTime with a main method that
//  populates a quiz, presents it, and prints the final results.
//********************************************************************************

public class PP_7_10_QuizTime 
{
    //----------------------------------------------------------------------------
    //  Presents a short quiz.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        Quiz quiz = new Quiz();
                
        quiz.add("What is the capital of Jamaica?", "Kingston");
        quiz.add("Which is worse, ignorance or apathy?",
                           "I don't know and I don't care");
        
        for (int i = 0; i < 2; i++)
            quiz.add("What is the capital of Jamaica?", "Kingston");
        
        
        
        quiz.giveQuiz();
        
        System.out.println();
        System.out.println(quiz);   // Print the test result.
        
    }
}
