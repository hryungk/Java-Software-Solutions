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
    public static final int MAX_FACE = 13;
    public static final int MAX_SUIT = 4;
    private final String[] faceStrList = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final String[] suitStrList = {"Spade", "Heart", "Clove", "Diamd"};
    
    public String suitStr;
    public String faceStr;
    public int faceValue, suitValue;
    
    
    //----------------------------------------------------------------------------
    //  Sets up the Card by drawing it initially.
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
    // Setter/Mutator: Chage the face value.
    //----------------------------------------------------------------------------
    public void setFaceValue (int value)
    {
        if (1 <= value && value <= MAX_FACE)
        {
            faceValue = value;
            faceVal2Str(faceValue);
        }
        else
            System.out.println("ERROR: Invalid Value. Input ranges 1 to "
                    + MAX_FACE);
    }

    //----------------------------------------------------------------------------
    // Setter/Mutator: Chage the face.
    //----------------------------------------------------------------------------
    public void setFace (String valueStr)
    {
        int count = 0;
        for (String strElm : faceStrList) 
        {
            if (strElm == valueStr) 
            {
                faceStr = valueStr;
                faceStr2Val(faceStr);
            }
            else
                count++;
        }
        if (faceStrList.length == count)
            System.out.println("ERROR: Invalid String.");
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
    public String getFace()
    {
        return faceStr;
    }
    
    //----------------------------------------------------------------------------
    // Setter/Mutator: Chage the suit value.
    //----------------------------------------------------------------------------
    public void setSuitValue (int value)
    {
        if (0 <= value && value < MAX_SUIT)
        {
            suitValue = value;
            suitVal2Str(suitValue);
            
        }
    }

    //----------------------------------------------------------------------------
    // Setter/Mutator: Chage the suit.
    //----------------------------------------------------------------------------
    public void setSuit (String str)
    {        
        int count = 0;
        for (String strElm : suitStrList) 
        {
            if (strElm.equals(str))
            {
                suitStr = str;       
                suitStr2Val(suitStr);
            }
            else
                count++;
        }
        if (suitStrList.length == count)
            System.out.println("ERROR: Invalid String.");
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
    //  Returns the current face of the card as a string
    //----------------------------------------------------------------------------
    public String toString()
    {
        return (suitStr + " " + faceStr);
    }

    //----------------------------------------------------------------------------
    //  Flips the card by randomly choosing a face value.
    //----------------------------------------------------------------------------
    private void face ()
    {
        faceValue = (int) (Math.random() * MAX_FACE + 1);
        
        faceVal2Str(faceValue);
    }
    
    //----------------------------------------------------------------------------
    //  Sets string for the face value.
    //----------------------------------------------------------------------------
    private void faceVal2Str (int faceValue)
    {
        if (2 <= faceValue && faceValue <= 10)
                faceStr = "" + faceValue;
        else
        {
            switch(faceValue)
            {
                case 1:
                    faceStr = "A";
                    break;
                case 11:
                    faceStr = "J";
                    break;
                case 12:
                    faceStr = "Q";
                    break;
                case 13:
                    faceStr = "K";
                    break;
                default:
                    System.out.println("Error in Identification String.");
            }
        }    
    }
    
    //----------------------------------------------------------------------------
    //  Sets value for the face string.
    //----------------------------------------------------------------------------
    private void faceStr2Val (String facestr)
    {
        int count = 0;
        for (String strElm : faceStrList) 
        {
            if (strElm.equals(facestr))
            {
                if (facestr.equals("A"))
                        faceValue = 1;
                else
                {
                    if (facestr.equals("J"))
                        faceValue = 11;
                    else
                    {
                        if (facestr.equals("Q"))
                            faceValue = 12;
                        else
                        {
                            if (facestr.equals("K"))
                                faceValue = 13;
                            else
                                if (2 <= Integer.parseInt(facestr) 
                                        && Integer.parseInt(facestr) <= 10)
                                    faceValue = Integer.parseInt(facestr);
                        }
                    }
                }         
            }
            else
                count++;
        }
        if (faceStrList.length == count)
            System.out.println("ERROR: Invalid String.");
    }
    
    //----------------------------------------------------------------------------
    //  Flips the card by randomly choosing a suit.
    //----------------------------------------------------------------------------
    private void suit ()
    {
        suitValue = (int) (Math.random() * MAX_SUIT);
        suitVal2Str(suitValue);
    }
    
    //----------------------------------------------------------------------------
    //  Set string for the suit value.
    //----------------------------------------------------------------------------
    private void suitVal2Str(int suitValue)
    {
        switch (suitValue)
        {
            case 0:
               suitStr = suitStrList[0];
               break;
            case 1:
               suitStr = suitStrList[1];
               break;
            case 2:
               suitStr = suitStrList[2];
               break;
            case 3:
               suitStr = suitStrList[3];
               break;                
        }
    } 
    
    //----------------------------------------------------------------------------
    //  Set value for the suit string.
    //----------------------------------------------------------------------------
    private void suitStr2Val(String suitstr)
    {
        if (suitstr.equals("Spade"))
            suitValue = 0;
        else
        {
            if (suitstr.equals("Heart"))
                suitValue = 1;
            else
            {
                if (suitstr.equals("Club"))
                    suitValue = 2;
                else
                {
                if (suitstr.equals("Diamond"))
                    suitValue = 3;
                else
                    System.out.println("ERROR: Invalid string. Input belongs " 
                            + "to none of four suits.");
                }
            }
        }
    }
    
}
