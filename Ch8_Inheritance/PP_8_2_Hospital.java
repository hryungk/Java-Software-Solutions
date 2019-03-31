//********************************************************************************
//  Hospital.java      @author: Hyunryung Kim
//
//  Programming Projects 8.2, Chapter 8
//  Design and implement a set of classes that define the employees of a hospital:
//  doctor, nurse, administrator, surgeon, receptionist, janitor, and so on. 
//  Include methods in each class that are names according to the services 
//  provided by that person and that print an appropriate message. Create a main
//  driver class to instantiate and exercise several of the classes.
//********************************************************************************

public class PP_8_2_Hospital 
{
    //----------------------------------------------------------------------------
    // Creates some objects derived from HospitalEmployees class.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        HospitalEmployees[] employees = new HospitalEmployees[6];
        
        employees[0] = new Doctor("Michael Shur", 19471, "03/01/17", "orthopedics");
        employees[1] = new Surgeon("Catrina Smith", 26141, "12/01/15",
                            "cardiovascular", true);
        employees[2] = new Nurse("John Meyer", 33710, "01/01/09", 15);
        employees[3] = new Administrator("Mark Spensor", 41183, "04/17/98",
                                    "Public relations");
        employees[4] = new Janitor("Clara Baek", 51203, "11/13/12", 
                            "Operation room", false);
        employees[5] = new Receptionist("Kyle Johnson", 68192, "03/11/10",
                                    "Emergency room", true);
        
        // Print the employees
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i]);
        
        System.out.println();

        // Print the messages
        for (int i = 0; i < employees.length; i++)
            employees[i].message();
    }
}
