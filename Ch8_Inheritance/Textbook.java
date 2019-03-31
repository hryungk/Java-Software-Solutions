//********************************************************************************
//  Textbook.java      Author: HyunryungKim
//
//  Programming Projects 8.3, Chapter 8
//  Design and implement a set of classes that define various types of reading
//  material: books, novels, magazines, technical journals, textbooks, and so on.
//  Include data values that describe various attributes of the material, such as
//  the number of pages and the names of the primary characters. Include methods
//  that are names appropriately for each class and that print an appropriate 
//  message. Create a isAns driver class to instantiate and exercise several of the
//  classes.
//********************************************************************************

public class Textbook extends BookPP
{
    private boolean answers;
    
    public Textbook(int numPages, String titleStr, String authorName,boolean isAns)
    {
        super(numPages,titleStr, authorName);
        answers = isAns;
    }

    //----------------------------------------------------------------------------
    //  Existance of answers mutator.
    //----------------------------------------------------------------------------
    public void setIsAnswer(boolean isAns) 
    {   
        answers = isAns;
    }
    
    //----------------------------------------------------------------------------
    //  Existance of answers accessor.
    //----------------------------------------------------------------------------
    public boolean getIsAnswer() 
    {   
        return answers;
    }
    
    //----------------------------------------------------------------------------
    // Prints a message appropriate for this textbook.
    //----------------------------------------------------------------------------
    public void message ()
    {
        super.message();
        System.out.print("The textbook has ");
        if (!answers)
            System.out.print("no ");
        System.out.println("answers provided.");
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this textbook as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        return super.toString() +"\tAnswers provided: " + answers;
    }    
}
