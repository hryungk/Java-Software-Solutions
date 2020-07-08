//********************************************************************************
//  Question.java      Author: Hyunryung Kim
//
//  Represents a question.
//********************************************************************************

public class Question 
{
    private final String question, questioner;
    private String answer;
    private int QNum;
    private boolean QState = false;
    private boolean rejected = false;

    //----------------------------------------------------------------------------
    //  Creates a new question with the specified information.
    //----------------------------------------------------------------------------
    public Question (int num, String Q, String name)
    {
        QNum = num; // Question number
        question = Q;   // Question
        questioner = name;  // Name of the person who asked this question
    }
    
    //----------------------------------------------------------------------------
    //  Sets the answer to the question
    //----------------------------------------------------------------------------
    public void setAnswer(String str)
    {      
        answer = str;
        QState = true;
    }
    
         
    //----------------------------------------------------------------------------
    //  Reurns the question.
    //----------------------------------------------------------------------------
    public String getQ()
    {      
        return question;
    }
    
    //----------------------------------------------------------------------------
    //  Sets as a rejected question.
    //----------------------------------------------------------------------------
    public void setRejected()
    {      
        answer = "Rejected.";   
        rejected = true;
    }
    
    //----------------------------------------------------------------------------
    //  Sets the question number
    //----------------------------------------------------------------------------
    public void setQNum(int num)
    {      
        QNum = num;
    }
        
    //----------------------------------------------------------------------------
    //  Reurns the question number
    //----------------------------------------------------------------------------
    public int getQNum()
    {      
        return QNum;
    }

    //----------------------------------------------------------------------------
    //  Returns a string description of this CD.
    //----------------------------------------------------------------------------
    @Override
    public String toString()
    {      
        String description;
        
        //description = "Q"+ QNum + ". " + question + "\n";
        description = question + "\n";
        
        // Add questioner
        if (questioner.isEmpty())
            description += "    By annonymous\n";
        else
            description += "    By " + questioner + "\n";
        
        // Add answer (state)
        if (QState)
            description += "    Answer: " + answer + "\n";
        else
            if (rejected)
                description += "    " + answer + "\n";
            else
                description += "    Has not been answered.\n";
        
        return description;
    }
}
