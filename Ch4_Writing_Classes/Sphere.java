//********************************************************************************
//  Sphere.java      @author: Hyunryung Kim
//
//  Programming Projects 4.1, Chapter 4
//  Design and implement a class called Sphere that contains instance data that
//  represents the sphere's diameter. Define the Sphere constructor to accept and 
//  initialize the diameter, and include getter and setter methods for the 
//  diameter. Include methods that calculate and return the volumn and surface
//  area of the sphere (see PP 3.5 for the formulas). Include a toString method
//  that returns a one-line description of the sphere.
//********************************************************************************

import java.text.DecimalFormat;

public class Sphere 
{   
    private double diameter;      // diameter of the sphere
    private double SA, Vol;     // surface area and volume of the sphere
    
    //----------------------------------------------------------------------------
    // Constructor: Sets the initial diameter value.
    //----------------------------------------------------------------------------
    public Sphere(double diaIn)
    {
        diameter = diaIn;
    }
    
    //----------------------------------------------------------------------------
    //  Face value mutator/setter.
    //----------------------------------------------------------------------------
    public void setDiaValue (double value)
    {
        diameter = value;
    }
    
    //----------------------------------------------------------------------------
    //  Face value accesor/getter.
    //----------------------------------------------------------------------------
    public double getDiaValue()
    {
        return diameter;
    }
    
    //----------------------------------------------------------------------------
    //  Calculates volume of the sphere with diameter of "diameter".
    //----------------------------------------------------------------------------
    public double volume()
    {
        Vol = 4.0 / 3.0 * Math.PI * Math.pow(diameter/2.0, 3);
        return Vol;
    }
    
    //----------------------------------------------------------------------------
    //  Calculates surface area of the sphere with diameter of "diameter"
    //----------------------------------------------------------------------------
    public double surfArea()
    {
        SA = 4.0*Math.PI*Math.pow(diameter/2.0, 2);
        return SA;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a string that describes the sphere.
    //----------------------------------------------------------------------------
    public String toString()
    {
        DecimalFormat fmt = new DecimalFormat("0.###");
        String result = "The sphere of diameter " + diameter + " - surface area: "
                + fmt.format(SA) + "/ volume: " + fmt.format(Vol);
        return result;
    }
    
}
