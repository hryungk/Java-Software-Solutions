//********************************************************************************
//  QuizTime.java      Author: Hyunryung Kim
//
//  Programming Projects 7.11, Chapter 7
//  Modify your answer to PP 7.10 so that the complexity level of the questions
//  given in the quiz is taken into account. Overload the giveQuiz method so that
//  it accepts two integer parameters that specify the minimum and maximum 
//  complexity levels for the quiz questions and only presents questions in that
//  complexity range. Modify the main method to demonstrate this feature.
//********************************************************************************

public class PP_7_11_QuizTime 
{
    //----------------------------------------------------------------------------
    //  Presents a short quiz.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        Quiz quiz = new Quiz();
                
        quiz.add("What is the capital of Jamaica?", "Kingston", 3);
        quiz.add("Which is worse, ignorance or apathy?",
                           "I don't know and I don't care", 5);
        quiz.add("What is the capital of Korea?", "Seoul",1);
        quiz.add("What is the capital of Washington state?", "Olympia",7);
            
        
        quiz.giveQuiz(3,7);
        
        System.out.println();
        System.out.println(quiz);   // Print the test result.
        
    }
}
