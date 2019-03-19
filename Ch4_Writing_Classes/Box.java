//********************************************************************************
//  Box.java      @author: Hyunryung Kim
//
//  Programming Projects 4.3, Chapter 4
//  Design and implement a class called Box that contains instance data that 
//  represents the height, weidth, and depth of the box. Also include a boolean
//  variable called full as instance data that represents if the box is full or 
//  not. Define the Box constructor to accept and initialize the height, width,
//  and depth of the box. Each newly created Box is empty (the constructor should 
//  initialize full to false). Include getter and setter methods for all instance 
//  data. Include a toString method that returns a one-line description of the 
//  box. 
//********************************************************************************

public class Box 
{   
    private double height;      // Height of box
    private double width;       // Width of box
    private double depth;       // Depth of box
    private boolean full;       // Boolean if the box is full or not
    
    
    //----------------------------------------------------------------------------
    //  Constructor: Initialize the box by its height, width, and depth
    //----------------------------------------------------------------------------
    public Box (double H, double W, double D)
    {
        height = H;
        width = W;
        depth = D;
        full = false;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the height of the box.
    //----------------------------------------------------------------------------
    public double getHeight()
    {
        return height;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the height of the box.
    //----------------------------------------------------------------------------
    public void setHeight(double num)
    {
        height = num;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the width of the box.
    //----------------------------------------------------------------------------
    public double getWidth()
    {
        return width;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the width of the box.
    //----------------------------------------------------------------------------
    public void setWidth(double num)
    {
        width = num;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the depth of the box.
    //----------------------------------------------------------------------------
    public double getDepth()
    {
        return depth;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the depth of the box.
    //----------------------------------------------------------------------------
    public void setDepth(double num)
    {
        depth = num;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns boolean value whether the box is full or empty.
    //----------------------------------------------------------------------------
    public boolean getBoolean()
    {
        return full;
    }
 
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns boolean value whether the box is full or empty.
    //----------------------------------------------------------------------------
    public void setBoolean(boolean TF)
    {
        full = TF;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a one-line description of the box as a string.
    //----------------------------------------------------------------------------
    public String toString()
    {
        return "Box's Height: " + height + ", Width: " + width + ", Depth: " 
                + depth + ", " + full;
    }
    
}
