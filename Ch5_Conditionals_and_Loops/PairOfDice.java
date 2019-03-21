//********************************************************************************
//  PairOfDice.java      @author: Hyunryung Kim
//
//  Programming Projects 4.7, Chapter 4
//  Using the Die class defined in this chapter, design and implement a class 
//  called PirOfDice, composed of two Die objects. Include methods to set and get
//  the individual die values, a method to roll the dice, and a method that 
//  returns the current sum of the two die values. 
//********************************************************************************

public class PairOfDice 
{
    Die die1 = new Die();
    Die die2 = new Die();

    //----------------------------------------------------------------------------
    // Constructor: Sets the initial face value.
    //----------------------------------------------------------------------------
    public PairOfDice()
    {
        die1.setFaceValue(1);
        die2.setFaceValue(1);
    }
    
    //----------------------------------------------------------------------------
    // Rolls the dice and returns the result.
    //----------------------------------------------------------------------------
    public void roll()
    {
        die1.roll();
        die2.roll();
    }
    
    //----------------------------------------------------------------------------
    // Face value of die 1 mutator.
    //----------------------------------------------------------------------------
    public void setFaceValue1 (int value)
    {
        die1.setFaceValue(value);
    }
    //----------------------------------------------------------------------------
    // Face value of die 2 mutator.
    //----------------------------------------------------------------------------
    public void setFaceValue2 (int value)
    {
        die2.setFaceValue(value);
    }
    
    //----------------------------------------------------------------------------
    // Face value of die 1 accesor.
    //----------------------------------------------------------------------------
    public int getFaceValue1()
    {
        return die1.getFaceValue();
    }
    //----------------------------------------------------------------------------
    // Face value of die 2 accesor.
    //----------------------------------------------------------------------------
    public int getFaceValue2()
    {
        return die2.getFaceValue();
    }
    
    //----------------------------------------------------------------------------
    // Current sum of the face value of dice.
    //----------------------------------------------------------------------------
    public int sum()
    {
        return (die1.getFaceValue() + die2.getFaceValue());
    }
    
    //----------------------------------------------------------------------------
    // Returns a string representation of this die.
    //----------------------------------------------------------------------------
    public String toString()
    {
        String result = Integer.toString(die1.getFaceValue()) 
                        + " and " + Integer.toString(die2.getFaceValue());
        
        return result;
    }
    
}
