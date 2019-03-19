//********************************************************************************
//  Flight.java      @author: Hyunryung Kim
//
//  Programming Projects 4.5, Chapter 4
//  Design and implement a class called Flight that represents an airline flight.
//  It should contain instance data that represents the airline name, flight 
//  number, and the flight's origin and destination cities. Define the Flight 
//  constructor to accept and initialize all instance data. Include getter and 
//  setter methods for all instance data. Include a toString method that returns
//  a one-line description of the flight. 
//********************************************************************************

public class Flight 
{   
    private String AirName;     // Airline name
    private int FltNum;         // Flight number
    private String Origin;      // Origin city of the flight
    private String Destin;      // Destination city of the flight
    
    
    //----------------------------------------------------------------------------
    //  Constructor: Initialize the flight by its airline name, flight number, 
    //               origin and desitnation cities.
    //----------------------------------------------------------------------------
    public Flight (String name, int num, String from, String to)
    {
        AirName = name;
        FltNum = num;
        Origin = from;
        Destin = to;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the airline name of the flight
    //----------------------------------------------------------------------------
    public String getAirline()
    {
        return AirName;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the airline name of the flight.
    //----------------------------------------------------------------------------
    public void setAirline(String newAirline)
    {
        AirName = newAirline;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the flight number of the flight.
    //----------------------------------------------------------------------------
    public int getFltNum()
    {
        return FltNum;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the flight number of the flight.
    //----------------------------------------------------------------------------
    public void setFltNum(int newNum)
    {
        FltNum = newNum;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the origin city of the flight.
    //----------------------------------------------------------------------------
    public String getOrigin()
    {
        return Origin;
    }
    
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the origin city of the flight.
    //----------------------------------------------------------------------------
    public void setOrigin(String newFrom)
    {
        Origin = newFrom;
    }
    
    //----------------------------------------------------------------------------
    //  Accessor/Getter: Returns the destination city of the flight.
    //----------------------------------------------------------------------------
    public String getDestin()
    {
        return Destin;
    }
 
    //----------------------------------------------------------------------------
    //  Mutator/Setter: Assigns the destination city of the flight.
    //----------------------------------------------------------------------------
    public void setDestin(String newTo)
    {
        Destin = newTo;
    }
    
    //----------------------------------------------------------------------------
    //  Returns a one-line description of the flight as a string.
    //----------------------------------------------------------------------------
    public String toString()
    {
        return "Flight info: " + AirName + " " + FltNum + ", from " + Origin
                + " to " + Destin;
    }
    
}
