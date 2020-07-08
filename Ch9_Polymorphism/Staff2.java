//********************************************************************************
//  Staff2.java       Author: Lewis/Loftus
//
//  Represents the personnel staff of a particular business.
//********************************************************************************

import java.text.DecimalFormat;

public class Staff2
{
    private StaffMember2[] staffList;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //----------------------------------------------------------------------------
    public Staff2()
    {
        staffList = new StaffMember2[6];
        
        staffList[0] = new Executive2("Sam", "123 Main Line", "555-0469", "123-456789", 2423.07);
        staffList[1] = new Employee2("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee2("Woody", "789 Off Rocker","555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly2("Diane", "678 Fifth Ave.","555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer2("Norm", "987 Suds Blvd.","555-8374");
        staffList[5] = new Volunteer2("Cliff", "321 Duds Lane","555-7282");
        
        ((Executive2)staffList[0]).awardBonus(500.00);
        
        ((Hourly2)staffList[3]).addHours(40);
                
    }
    //----------------------------------------------------------------------------
    //  Pays all staff members.
    //----------------------------------------------------------------------------    
    public void payday()
    {
        double amount;
        DecimalFormat fmt = new DecimalFormat("0.0");
        
        for (int count = 0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);
            
            amount = staffList[count].pay();
            
            if (amount == 0.0)
                System.out.println("Thanks!");
            else
            {
                System.out.println("Paid: " + amount);
                System.out.println("Number of vacation days: " 
                        + fmt.format(staffList[count].vacation()));
            }
            System.out.println("---------------------------------------");
        }
    }
}
