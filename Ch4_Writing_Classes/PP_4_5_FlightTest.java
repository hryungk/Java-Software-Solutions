//********************************************************************************
//  FlightTest.java      @author: Hyunryung Kim
//
//  Programming Projects 4.4, Chapter 4
//  Create a driver class called FlightTest, whose main method instantiates and
//  updates several Flight objects..
//********************************************************************************

public class PP_4_5_FlightTest 
{
    //----------------------------------------------------------------------------
    // Creates some flight information and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Flight flight1 = new Flight("Alaska",827,"Seattle","Hawaii");
        Flight flight2 = new Flight("Delta",35,"Los Angeles","Atlanta");
        
        String flight1Airline = flight1.getAirline();
        String flight2Airline = flight2.getAirline();
        
        int flight1Number = flight1.getFltNum();
        int flight2Number = flight2.getFltNum();
        
        System.out.println("Flight1: " + flight1Airline + " " + flight1Number);
        System.out.println("Flight2: " + flight2Airline + " " + flight2Number);

        flight1.setFltNum(872);
        int flight1NewNumber = flight1.getFltNum();
        flight2.setAirline("Gamma");
        String flight2NewAirline = flight2.getAirline();
        
        System.out.println("Flight1's new flight number: " + flight1NewNumber);
        System.out.println("Flight2's new airline name: " + flight2NewAirline);
        
        
        String flight1Origin = flight1.getOrigin();
        String flight2Origin = flight2.getOrigin();
        
        System.out.println("Flight1's origin city: " + flight1Origin);
        System.out.println("Flight2's origin city: " + flight2Origin);
        
        flight1.setDestin("Birmingham");
        String flight1Destin = flight1.getDestin();
        String flight2Destin = flight2.getDestin();
        System.out.println("Flight1's destination city: " + flight1Destin);
        System.out.println("Flight2's destination city: " + flight2Destin);
        
        
        System.out.println();
        System.out.println(flight1);
        System.out.println(flight2);        
    }
    
}
