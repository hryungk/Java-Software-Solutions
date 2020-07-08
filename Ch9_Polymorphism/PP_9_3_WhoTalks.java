//********************************************************************************
//  WhoTalks.java       Author: Hyunryung Kim
//
//  Implement the Speaker interface described in Section 10.3, and create three 
//  classes that implement Speaker in various ways. Create a driver class whose 
//  main method instantiates some of these objects and tests their abilities.
//********************************************************************************

public class PP_9_3_WhoTalks 
{

    //----------------------------------------------------------------------------
    //  Creates a staff of empolyees for a firm and pays them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Speaker special = new Philosopher();
        ((Philosopher)special).pontificate();
        
        Speaker guest;
        guest = new Philosopher();
        guest.speak();
        guest = new Dog();
        guest.speak();
        
    }
}
