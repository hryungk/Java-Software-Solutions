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
public class Zip1 
{
    private String firstName, lastName, streetAddress, city, state;
    private int zipCode;
    private long phoneNum;
    
    //----------------------------------------------------------------------------
    //  Sets up the Zip with first, last name and zipcode.
    //----------------------------------------------------------------------------
    public Zip1 (String first, String last, int num)
    {
        firstName = first;
        lastName = last;
        zipCode = num;
    }
    //----------------------------------------------------------------------------
    //  Sets up the Zip with first, last name, zipcode, address, city, state, 
    //  and phone number.
    //----------------------------------------------------------------------------
    public Zip1 (String first, String last, Address address, long num)
    {
        firstName = first;
        lastName = last;
        zipCode = address.zipCode;
        streetAddress = address.streetAddress;
        city = address.city;
        state = address.state;
        phoneNum = num;
    }

    //----------------------------------------------------------------------------
    //  Returns a description of this Zip1 object.
    //----------------------------------------------------------------------------
    public String toString ()
    {
        String result;
        
        result = firstName + " " + lastName + ": \n";
        result += streetAddress + "\n";
        result += city + "," + state + "  " + zipCode + "\n";
        //result += phoneNum;
        
        long lastDgt = phoneNum % 10000;    // Last 4 digits
        String lastStr; // String for the last 4 digits
        if (lastDgt%1000 == lastDgt)    // if the last 4 digits start with 0
            lastStr = "0" + lastDgt;    // add 0 in the front
        else
            lastStr = "" + lastDgt; 

        long firstDgt = (phoneNum/10000) % 1000;    // first 3 digits
        long areaCode = (phoneNum/10000/1000);      // 3-digit area code
        
        result += "(" + areaCode + ") " + firstDgt + "-" + lastStr;
        
        return result;
    }
    
}
