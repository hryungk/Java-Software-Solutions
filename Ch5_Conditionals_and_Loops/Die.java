//********************************************************************************
//  Die.java      @author: Lewis/Loftus
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.
//********************************************************************************

public class Die 
{
    private final int MAX = 6;  // maixmum face value
    
    private int faceValue;      // current value showing on the die
    
    //----------------------------------------------------------------------------
    // Constructor: Sets the initial face value.
    //----------------------------------------------------------------------------
    public Die()
    {
        faceValue = 1;
    }
    
    //----------------------------------------------------------------------------
    // Rolls the die and returns the result.
    //----------------------------------------------------------------------------
    public int roll()
    {
        faceValue = (int) (Math.random() * MAX) + 1;
        
        return faceValue;
    }
    
    //----------------------------------------------------------------------------
    // Face value mutator.
    //----------------------------------------------------------------------------
    public void setFaceValue (int value)
    {
        //faceValue = value;
        // PP 5.32 Does nothing when invalid value is input.
        if (1 <= value && value <= MAX)
            faceValue = value;        
    }
    
    //----------------------------------------------------------------------------
    // Face value accesor.
    //----------------------------------------------------------------------------
    public int getFaceValue()
    {
        return faceValue;
    }
    
    //----------------------------------------------------------------------------
    // Returns a string representation of this die.
    //----------------------------------------------------------------------------
    public String toString()
    {
        String result = Integer.toString(faceValue);
        
        return result;
    }
    
}
