//********************************************************************************
//  ZipBody.java      @author: Hyunryung Kim
//
//  Programming Projects 7.8, Chapter 7
//  Design and implement an application that reads a sequence of up to 25 pairs of
//  names and postal (ZIP) codes for individuals. Store the data in an object
//  designed to store a first name (string), last name (string), and postal code
//  (integer). Assume each line of input will contain two strings followed by an 
//  integer value, each separated by a tab character. Then, after the input has 
//  been read in, print the list in an appropriate format to the screen.
//********************************************************************************
public class Zip 
{
    private String firstName, lastName, streetAddress, city, state;
    private int zipCode;
    private long phoneNum;
    
    //----------------------------------------------------------------------------
    //  Sets up the Zip with first, last name and zipcode.
    //----------------------------------------------------------------------------
    public Zip (String first, String last, int num)
    {
        firstName = first;
        lastName = last;
        zipCode = num;
    }

    //----------------------------------------------------------------------------
    //  Returns a description of this Zip object.
    //----------------------------------------------------------------------------
    
    public String toString()
    {
        return (firstName + " " + lastName + ": " + zipCode);
    }       
}
