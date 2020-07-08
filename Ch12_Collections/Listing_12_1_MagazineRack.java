//********************************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//********************************************************************************

public class Listing_12_1_MagazineRack
{
    //----------------------------------------------------------------------------
    //  Creates a MagazineList object, adds several magazines to the list, then
    //  prints it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        MagazineList rack = new MagazineList();
        
        rack.add(new Magazine("Time"));
        rack.add(new Magazine("Woodworking Today"));
        rack.add(new Magazine("Communications of the ACM"));
        rack.add(new Magazine("House and Garden"));
        rack.add(new Magazine("CQ"));
        
        System.out.println(rack);
    }
}
