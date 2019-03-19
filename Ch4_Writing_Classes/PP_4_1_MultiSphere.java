//********************************************************************************
//  MultiSphere.java      @author: Hyunryung Kim
//
//  Programming Projects 4.1, Chapter 4
//  Create a driver class called MultiSphere, whose main method instantiates and
//  updates several Sphere objects.
//********************************************************************************

import java.text.DecimalFormat;
public class PP_4_1_MultiSphere 
{
    //----------------------------------------------------------------------------
    // Creates some spheres and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Sphere sphr1 = new Sphere(3);
        Sphere sphr2 = new Sphere(6);
        
        sphr1. setDiaValue(2);
        double sphr1Dia = sphr1.getDiaValue();
        double sphr2Dia = sphr2.getDiaValue();
       
        System.out.println("Sphere 1 diameter: " + sphr1Dia);
        System.out.println("Sphere 2 diameter: " + sphr2Dia);
        
        double sphr1Vol = sphr1.volume();
        double sphr2Vol = sphr2.volume();
        
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        System.out.println("Sphere 1 volume: " + fmt.format(sphr1Vol));
        System.out.println("Sphere 2 volume: " + fmt.format(sphr2Vol));
        
        
        double sphr1SA = sphr1.surfArea();
        double sphr2SA = sphr2.surfArea();
        
        System.out.println("Sphere 1 surface area: " + fmt.format(sphr1SA));
        System.out.println("Sphere 2 surface area: " + fmt.format(sphr2SA));
        
        
        System.out.println();
        System.out.println(sphr1);
        System.out.println(sphr2);        
    }
    
}
