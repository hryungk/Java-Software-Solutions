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

import java.text.NumberFormat;

public class Employee extends Person
{
    protected String occupation;
    protected double income;
    
    public Employee(String personName, int ageNum, String occupationName,
                    double money)
    {
        super(personName, ageNum);
        occupation = occupationName;
        income = money;
    }

    //----------------------------------------------------------------------------
    //  Occupation mutator.
    //----------------------------------------------------------------------------
    public void setOccupation(String occupationStr) 
    {   
        occupation = occupationStr;
    }
    
    //----------------------------------------------------------------------------
    //  Occupation accessor.
    //----------------------------------------------------------------------------
    public String getOccupation() 
    {   
        return occupation;
    }
    
    //----------------------------------------------------------------------------
    //  Income mutator.
    //----------------------------------------------------------------------------
    public void setIncome(double money) 
    {   
        income = money;
    }
    
    //----------------------------------------------------------------------------
    //  Income accessor.
    //----------------------------------------------------------------------------
    public double getIncome() 
    {   
        return income;
    }
    
    //----------------------------------------------------------------------------
    // Returns a description of this employee as a string.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String result = super.toString();
        result += "\nOccupation: " + occupation;
        result += "\nIncome: " + fmt.format(income);
        
        return result;
    }    
}
