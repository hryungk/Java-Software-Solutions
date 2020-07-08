//********************************************************************************
//  ReverseString.java       Author: Hyunryung Kim
//
//  Reverse a String using recursion.
//********************************************************************************

public class ReverseString
{
    public String reverseString (String str)
    {
        String result;
        
        if (str.length() <= 2)
        {
            if (str.length() == 1)
                result = str;
            else
                result = str.substring(1, 2) + str.substring(0, 1);
        }
        else
        {
            result = str.substring(str.length()-1,str.length())
                    + reverseString(str.substring(1, str.length()-1))
                    + str.substring(0, 1);
        }
        return result;
    }    
}
