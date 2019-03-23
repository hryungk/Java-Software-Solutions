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

public class PP_6_2_StudentBody 
{
    //----------------------------------------------------------------------------
    //  Creates some Address and Student objects and prints them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        Address school = new Address ("800 Lancaster Ave.", "Villanova",
                                      "PA", 19085);
        Address jHome = new Address ("21 Jump Street", "Lynchburg",
                                      "VA", 24551);
        Student john = new Student ("John", "Smith", jHome, school, 100, 90, 85);
        
        Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                                     44132);
        Student marsha = new Student ("Marsha", "Jones", mHome, school);
        
        marsha.setTestScore(1,80);
        marsha.setTestScore(2,100);
        marsha.setTestScore(3,70);
        
        System.out.println("Marsha's test score average: " + marsha.average());
        
        System.out.println("John's 1st test score: " + john.getTestScore(1));
        
        System.out.println (john);
        System.out.println ();
        System.out.println (marsha);
    }
}
