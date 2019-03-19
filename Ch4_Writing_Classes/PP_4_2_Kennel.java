//********************************************************************************
//  Kennel.java      @author: Hyunryung Kim
//
//  Programming Projects 4.2, Chapter 4
//  Create a driver class called Kennel, whose main method instantiates and
//  updates several Dog objects.
//********************************************************************************

public class PP_4_2_Kennel 
{
    //----------------------------------------------------------------------------
    // Creates some dogs ID and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Dog dog1 = new Dog("Dori", 5);
        Dog dog2 = new Dog("Nimo", 2);
        
        String dog1Name = dog1.getName();
        String dog2Name = dog2.getName();
        
        dog1.setAge(3);
        int dog1Age = dog1.getAge();
        int dog2Age = dog2.getAge();
        
        System.out.println(dog1Name + "'s age: " + dog1Age);
        System.out.println(dog2Name + "'s age: " + dog2Age);
        
        dog2.setName("MungMung");
        String dog2NewName = dog2.getName();
        
        System.out.println(dog2Name + "'s new name: " + dog2NewName);
        
        
        int dog1PA = dog1.getPersonAge();
        int dog2PA = dog2.getPersonAge();
        
        System.out.println(dog1Name + "'s age in person years: " + dog1PA);
        System.out.println(dog2NewName + "'s age in person years: " + dog2PA);        
        
        System.out.println();
        System.out.println(dog1);
        System.out.println(dog2);        
    }
    
}
