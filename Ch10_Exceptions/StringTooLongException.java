//********************************************************************************
//  StringTooLongException.java       Author: Hyunryung Kim
//
//  Represents an exceptional condition in which a value is out of some particular
//  range.
//********************************************************************************

public class StringTooLongException extends Exception
{
    //----------------------------------------------------------------------------
    //  Sets up the exception object with a particular message.
    //----------------------------------------------------------------------------
    StringTooLongException(String message)
    {
        super(message);
    }
    //----------------------------------------------------------------------------
    //  Sets up the exception object with a particular message.
    //----------------------------------------------------------------------------
    StringTooLongException()
    {
        super();
    }    
}