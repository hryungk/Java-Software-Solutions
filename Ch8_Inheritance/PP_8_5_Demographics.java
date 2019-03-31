//********************************************************************************
//  Demographics.java      @author: Hyunryung Kim
//
//  Programming Projects 8.5, Chapter 8
//  Design and implement a set of classes that keeps track of demographic
//  information about a set of people, such as age, nationality, occupation,
//  income, and so on. Design each class to focus on a particular aspect of data
//  collection. Create a main driver class to instantiate and exercise several of
//  the classes.
//********************************************************************************

public class PP_8_5_Demographics 
{
    //----------------------------------------------------------------------------
    // Creates some objects derived from ReadingMaterial class.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Person[] people = new Person[3];
        
        people[0] = new Employee("Sherlock Holms",45,"Private investigator",100000);
        people[1] = new Student("John Watson",42,"Oxford");
        people[2] = new ForeignStudent("Mary Hopkins",39,"Cambridge","Ireland");
        
        // Print the reading materials
        for (int i = 0; i < people.length; i++)
            System.out.println(people[i]);
    }
}
