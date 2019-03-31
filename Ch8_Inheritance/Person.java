//********************************************************************************
//  Person.java      @author: Hyunryung Kim
//
//  Programming Projects 8.5, Chapter 8
//  Design and implement a set of classes that keeps track of demographic
//  information about a set of people, such as age, nationality, occupation,
//  income, and so on. Design each class to focus on a particular aspect of data
//  collection. Create a main driver class to instantiate and exercise several of
//  the classes.
//********************************************************************************

public class Person 
{
    protected String name;
    protected int age;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the person with the specified information.
    //----------------------------------------------------------------------------
    Person(String personName, int ageNum)
    {
        name = personName;
        age = ageNum;
    }
    
    //----------------------------------------------------------------------------
    //  Age mutator.
    //----------------------------------------------------------------------------
    public void age(int ageNum)
    {
        age = ageNum;
    }

    //----------------------------------------------------------------------------
    //  Age accessor.
    //----------------------------------------------------------------------------
    public int getAge()
    {
        return age;
    }    
    //----------------------------------------------------------------------------
    //  Name mutator.
    //----------------------------------------------------------------------------
    public void setName(String personStr) 
    {   
        name = personStr;
    }
    
    //----------------------------------------------------------------------------
    //  Name accessor.
    //----------------------------------------------------------------------------
    public String getName() 
    {   
        return name;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this person as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        String result = "Name: " + name;
        result += "\nAge: " + age;
        
        return result;
    }
}
