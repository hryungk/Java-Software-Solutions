//********************************************************************************
//  StudentBody.java      Author: Lewis/Loftus
//
//  Demonstrates the use of an aggregate class.
//********************************************************************************

public class Listing_6_5_StudentBody 
{
    //----------------------------------------------------------------------------
    //  Creates some Address and Student_L objects and prints them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        Address school = new Address ("800 Lancaster Ave.", "Villanova",
                                      "PA", 19085);
        Address jHome = new Address ("21 Jump Street", "Lynchburg",
                                      "VA", 24551);
        Student_L john = new Student_L ("John", "Smith", jHome, school);
        
        Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                                     44132);
        Student_L marsha = new Student_L ("Marsha", "Jones", mHome, school);
        
        System.out.println (john);
        System.out.println ();
        System.out.println (marsha);
    }
}
