//********************************************************************************
//  Card.java      @author: Hyunryung Kim
//
//  Programming Projects 5.41, Chapter 5
//  Design and implement a class called Card that represents a standard playing
//  card. Each card has a suit and a face value. Create a program that deals 5
//  random cards.
//********************************************************************************

public class Card 
{   
    private final int MAX_FACE = 12;
    private final int MAX_SUIT = 4;
    
    private String suitStr;
    private char faceChar;
    private int faceValue, suitValue;
    
    //----------------------------------------------------------------------------
    //  Sets up the coin by flipping it initially.
    //----------------------------------------------------------------------------
    public Card ()
    {
        draw();
    }
    
    //----------------------------------------------------------------------------
    //  Draws a card by randomly choosing a face value and a suit.
    //----------------------------------------------------------------------------
    public void draw ()
    {
        face();
        suit();
    }
    
    //----------------------------------------------------------------------------
    //  Flips the card by randomly choosing a face value.
    //----------------------------------------------------------------------------
    public void face ()
    {
        faceValue = (int) (Math.random() * MAX_FACE + 1);
        
        if (faceValue > 1 && faceValue < 10)
            faceChar = (char) (faceValue + '0');
        else
        {
            switch(faceValue)
            {
                case 1:
                    faceChar = 'A';
                    break;
                case 10:
                    faceChar = 'J';
                    break;
                case 11:
                    faceChar = 'Q';
                    break;
                case 12:
                    faceChar = 'K';
                    break;
                default:
                    System.out.println("Error in Identification Character.");
            }
        }    
    }
    
    //----------------------------------------------------------------------------
    //  Flips the card by randomly choosing a suit.
    //----------------------------------------------------------------------------
    public void suit ()
    {
        suitValue = (int) (Math.random() * MAX_SUIT);
        switch (suitValue)
        {
            case 0:
               suitStr = "Spade";
               break;
            case 1:
               suitStr = "Heart";
               break;
            case 2:
               suitStr = "Club";
               break;
            case 3:
               suitStr = "Diamond";
               break;                
        }
    }
    
    //----------------------------------------------------------------------------
    // Setter/Mutator: Chage the face value.
    //----------------------------------------------------------------------------
    public void setFaceValue (int value)
    {
        if (1 <= value && value <= MAX_FACE)
            faceValue = value;        
    }

    //----------------------------------------------------------------------------
    // Setter/Mutator: Chage the face.
    //----------------------------------------------------------------------------
    public void setFace (char valueChar)
    {
        faceChar = valueChar;        
    }

    //----------------------------------------------------------------------------
    // Getter/Accessor: Obtain the face value.
    //----------------------------------------------------------------------------
    public int getFaceValue()
    {
        return faceValue;
    }
    
    //----------------------------------------------------------------------------
    // Getter/Accessor: Obtain the face.
    //----------------------------------------------------------------------------
    public char getFace()
    {
        return faceChar;
    }
    
    //----------------------------------------------------------------------------
    // Setter/Mutator: Chage the suit value.
    //----------------------------------------------------------------------------
    public void setSuitValue (int value)
    {
        if (0 <= value && value < MAX_SUIT)
            suitValue = value;        
    }

    //----------------------------------------------------------------------------
    // Setter/Mutator: Chage the suit.
    //----------------------------------------------------------------------------
    public void setSuit (String str)
    {
        suitStr = str;        
    }
    
    //----------------------------------------------------------------------------
    // Getter/Accessor: Obtain the face value.
    //----------------------------------------------------------------------------
    public int getSuitValue()
    {
       return suitValue;
    }
        
    //----------------------------------------------------------------------------
    // Getter/Accessor: Obtain the face.
    //----------------------------------------------------------------------------
    public String getSuit()
    {
       return suitStr;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the current face of the coin as a string
    //----------------------------------------------------------------------------
    public String toString()
    {
        return (suitStr + " " + faceChar);
    }
    
}
