//********************************************************************************
//  Dog.java      @author: Hyunryung Kim
//
//  Programming Projects 4.2, Chapter 4
//  Design and implement a class called Dog that contains instance data that 
//  represents the dog's name and age. Define the Dog constructor to accept and 
//  initialize instance data. Include getter and setter methods for the name and 
//  age. Include a method to compute and return the age of the dog in "person
//  years" (seven times the dogs age). Include a toString method that returns a 
//  one-line description of the dog. 
//********************************************************************************

import java.text.NumberFormat;

public class Dog 
{
    private final int DOG2PRS = 7;  //  1 person year = 7 * dogs age
    
    private String name;    // Dog's name
    private int age;        // Dog's age
    
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the dog's ID by defining its age and name
    //----------------------------------------------------------------------------
    public Dog (String DogName, int DogAge)
    {
        name = DogName;
        age = DogAge;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the age of the dog.
    //----------------------------------------------------------------------------
    public int getAge()
    {
        return age;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the age of the dog.
    //----------------------------------------------------------------------------
    public void setAge(int num)
    {
        age = num;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the name of the dog.
    //----------------------------------------------------------------------------
    public String getName()
    {
        return name;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the name of the dog.
    //----------------------------------------------------------------------------
    public void setName(String str)
    {
        name = str;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the age of the dog in person years.
    //----------------------------------------------------------------------------
    public int getPersonAge()
    {
        return age * DOG2PRS;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a one-line description of the dog as a string.
    //----------------------------------------------------------------------------
    public String toString()
    {
        return "Dog's name: " + name + "\t age: " + age;
    }
    
}
