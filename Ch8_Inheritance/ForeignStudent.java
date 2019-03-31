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

public class ForeignStudent extends Student
{
    protected String nationality;
    
    public ForeignStudent(String personName, int ageNum, String universityName,
                            String nationalityName)
    {
        super(personName, ageNum, universityName);
        nationality = nationalityName;
    }

    //----------------------------------------------------------------------------
    //  Nationality mutator.
    //----------------------------------------------------------------------------
    public void setNationality(String nationalityStr) 
    {   
        nationality = nationalityStr;
    }
    
    //----------------------------------------------------------------------------
    //  Nationality accessor.
    //----------------------------------------------------------------------------
    public String getNationality() 
    {   
        return nationality;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this foreign student as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {   
        String result = super.toString();
        result += "\nNationality: " + nationality;
        
        return result;
    }    
}
