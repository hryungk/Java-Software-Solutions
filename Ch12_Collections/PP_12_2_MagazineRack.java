//********************************************************************************
//  MagazineRack.java      Author: Hyunryung Kim
//
//  Programming Projects 12.2, Chapter 12 Collections
//  Modify the MagazineRack program presented in this chapter by adding delete and 
//  insert operations into the MagazineList class. Have the Magazine class 
//  implement the Comparable interface, and base the processing of the insert 
//  method on calls to the compareTo method in the Magazine class that determines 
//  whether one Magazine title comes before another alpha- betically. In the 
//  driver, exercise various insertion and deletion operations. Print the list of 
//  magazines when complete.
//********************************************************************************

public class PP_12_2_MagazineRack
{
    //----------------------------------------------------------------------------
    //  Creates a MagazineList object, adds several magazines to the list, then
    //  prints it.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        MagazineList2 rack = new MagazineList2();
        
        Magazine2 mag1 = new Magazine2("Time");
        Magazine2 mag2 = new Magazine2("Woodworking Today");
        Magazine2 mag3 = new Magazine2("Communications of the ACM");
        Magazine2 mag4 = new Magazine2("House and Garden");
        Magazine2 mag5 = new Magazine2("CQ");
        Magazine2 mag6 = new Magazine2("Zero Waste Life");
        
        rack.add(mag1);
        rack.add(mag2);
        rack.add(mag3);
        rack.add(mag4);
        rack.add(mag5);
        
        System.out.println("List of Magazines in the rack:");
        System.out.println("-------------------------------");
        System.out.println(rack);
        
        // Delete a magazine
        rack.delete(mag3);
        System.out.println("Delete Communications of the ACM:");
        System.out.println("-------------------------------");
        System.out.println(rack);
        
        // Delete a magazine
        rack.delete(mag1);
        System.out.println("Delete Time:");
        System.out.println("-------------------------------");
        System.out.println(rack);
        
        // Delete a magazine
        rack.delete(mag3);
        System.out.println("Delete Communications of the ACM: (should do nothing)");
        System.out.println("-------------------------------");
        System.out.println(rack);
        
        // Insert a magazine
        rack.insert(mag3);
        System.out.println("Insert Communications of the ACM:");
        System.out.println("-------------------------------");
        System.out.println(rack);
        
        // Insert a magazine
        rack.insert(mag6);
        System.out.println("Insert Zero Waste Life:");
        System.out.println("-------------------------------");
        System.out.println(rack);
        
        // Insert a magazine
        rack.insert(new Magazine2("Apple Products"));
        System.out.println("Insert Apple Products:");
        System.out.println("-------------------------------");
        System.out.println(rack);       
    }
}
