//********************************************************************************
//  Student.java      Author: Hyunryung Kim
//
//  Programming Projects 6.2, Chapter 6
//  Modify the Student class presented in this chapter as follows. Each student 
//  object should also contain the scores for three tests. Provide a constructor
//  that sets all instance values based on parameter values. Overload the 
//  constructor such that each test score is assumed to be initially zero. Provide
//  a method called setTestScore that accepts two parameters: the test number (1
//  through 3) and the score. Also provide a method called getTestScore that
//  accepts the test number and returns the appropriate score. Provide a method
//  called average that computes and returns the average test score for this 
//  student. Modify toString method such that the test scores and average are 
//  included in the description of the student. Modify the driver class main 
//  method to exercise the new Student methods.
//********************************************************************************

public class Student 
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int score1, score2, score3;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up this student with the specified values.
    //----------------------------------------------------------------------------
    public Student (String first, String last, Address home, Address school,
            int scoreVal1, int scoreVal2, int scoreVal3)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        score1 = scoreVal1;
        score2 = scoreVal2;
        score3 = scoreVal3;
    }
    //----------------------------------------------------------------------------
    //  Constructor Overload: Sets up this student with the specified values,  
    //  assuming initial test scores are zero.
    //----------------------------------------------------------------------------
    public Student (String first, String last, Address home, Address school)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        score1 = 0;
        score2 = 0;
        score3 = 0;
    }

    //----------------------------------------------------------------------------
    //  Setter: Sets a score value for a test.
    //----------------------------------------------------------------------------
    public void setTestScore(int testNum, int scoreVal)
    {
        switch (testNum)
        {
            case 1:
                score1 = scoreVal;
                break;
            case 2:
                score2 = scoreVal;
                break;
            case 3:
                score3 = scoreVal;
                break;
            default:
                System.out.println("ERROR: Invalid test number. "
                                   + "Expected 1, 2, or 3, accepted other.");
        }
    }
    
    //----------------------------------------------------------------------------
    //  Getter: Returns a score value for a test.
    //----------------------------------------------------------------------------
    public int getTestScore(int testNum)
    {
        int result = 0;
        switch (testNum)
        {
            case 1:
                result = score1;
                break;
            case 2:
                result = score2;
                break;
            case 3:
                result = score3;
                break;
            default:
                System.out.println("ERROR: Invalid test number. "
                                   + "Expected 1, 2, or 3, accepted other.");
        }
        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Returns an average of the three test scores.
    //----------------------------------------------------------------------------
    public double average()
    {
        return (score1 + score2 + score3) / 3.0;
    }
    
    //----------------------------------------------------------------------------
    // Returns a string description of this Student object.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        String result;
        
        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test scores: " + score1 + ", " + score2 + ", " + score3 + "\n";
        result += "Average: " + average();
        
        return result;
    }
}
