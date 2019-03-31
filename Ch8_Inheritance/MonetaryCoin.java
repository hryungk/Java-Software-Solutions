//********************************************************************************
//  MonetaryCoin.java      Author: Hyunryung Kim
//
//  Programming Projects 8.1, Chapter 8
//  Design and implement a class called MonetaryCoin that is derived from the 
//  Coin class presented in Chapter 5. Store a value in the monetary coin that 
//  represents its value and add a method that returns its value. Create a main
//  driver class to instantiate and compute the sum of several MonetaryCoin 
//  objects. Demonstrate that a monetary coin inherits its parent's ability to be
//  flipped.
//********************************************************************************

import java.text.NumberFormat;

public class MonetaryCoin extends Coin
{   
    private double value;
    
    //----------------------------------------------------------------------------
    //  Sets up the monetary coin by storing a value.
    //----------------------------------------------------------------------------
    public MonetaryCoin (double money)
    {
        super();
        value = money;
    }

    //----------------------------------------------------------------------------
    //  Value mutator.
    //----------------------------------------------------------------------------
    public void setValue (double money)
    {   
        value = money;
    }
    
    //----------------------------------------------------------------------------
    //  Value accessor.
    //----------------------------------------------------------------------------
    public double getValue ()
    {   
        return value;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the status and the value of the monetary coin.
    //----------------------------------------------------------------------------
    public String toString()
    {
        String valueStr;
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        valueStr = fmt.format(value);
        valueStr += "\t" + super.toString();
        return valueStr;
    }
}
