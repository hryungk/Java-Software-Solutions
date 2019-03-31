//********************************************************************************
//  Employee.java      @author: Hyunryung Kim
//
//  Programming Projects 8.5, Chapter 8
//  Design and implement a set of classes that keeps track of demographic
//  information about a set of people, such as age, nationality, occupation,
//  income, and so on. Design each class to focus on a particular aspect of data
//  collection. Create a main driver class to instantiate and exercise several of
//  the classes.
//********************************************************************************

public class Student extends Person
{
    protected String university;
    
    public Student(String personName, int ageNum, String universityName)
    {
        super(personName, ageNum);
        university = universityName;
    }

    //----------------------------------------------------------------------------
    //  University mutator.
    //----------------------------------------------------------------------------
    public void setUniversity(String universityStr) 
    {   
        university = universityStr;
    }
    
    //----------------------------------------------------------------------------
    //  University accessor.
    //----------------------------------------------------------------------------
    public String getUniversity() 
    {   
        return university;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this student as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {   
        String result = super.toString();
        result += "\nUniversity: " + university;
        
        return result;
    }    
}
