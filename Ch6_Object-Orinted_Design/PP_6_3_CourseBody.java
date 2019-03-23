//********************************************************************************
//  CourseBody.java      Author: Hyunryung Kim
//
//  Programming Projects 6.3, Chapter 6
//  Design and implement a class called Course that represents a course taken at a
//  school. A course object should keep track of up to five students, as 
//  represented by the modified Student class from the previous programming 
//  project. The constructor of the Course class should accept only the name of
//  the course. Provide a method called addStudent that accepts one Student 
//  parameter (the Course object should keep track of how many valid students have
//  been added to the course). Provide a method called average that computes and 
//  returns the average of all students' test score averages. Provide a method 
//  called roll that prints all students in the course. Create a driver class with
//  a main method that creates a course, adds several students, prints a roll, and
//  prints the overall course test average.
//********************************************************************************

public class PP_6_3_CourseBody 
{
    //----------------------------------------------------------------------------
    //  Stores and modifies a list of students.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        Course course = new Course("Solid Mechanics");
        
        Address school = new Address ("800 Lancaster Ave.", "Villanova",
                                      "PA", 19085);
        Address jHome = new Address ("21 Jump Street", "Lynchburg",
                                      "VA", 24551);
        Student john = new Student ("John", "Smith", jHome, school, 100, 90, 85);
        
        Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                                     44132);
        Student marsha = new Student ("Marsha", "Jones", mHome, school);
        
        marsha.setTestScore(1,80);
        marsha.setTestScore(2,100);
        marsha.setTestScore(3,70);
        
        Address gHome = new Address ("550 NE Northgate Way", "Seattle",
                                      "WA", 98125);
        Student green = new Student ("Green", "Lake", gHome, school, 100, 99, 100);
        
        Address fHome = new Address ("131 NW 13th Ave", "Portland",
                                      "OR", 97209);
        Student fat = new Student ("Fat", "Head", fHome, school, 50, 75, 68);
        
        Address miHome = new Address ("34 Mason Street", "San Francisco",
                                      "CA", 94102);
        Student mik = new Student ("Mikkeller", "Bar", miHome, school, 72, 83, 59);
        
        course.addStudent(john);
        course.addStudent(marsha);
        course.addStudent(green);
        course.addStudent(fat);
        course.addStudent(mik);
        
        course.roll();
        
        System.out.println("Overall course test average: " + course.average());
        
        System.out.println();
        System.out.println(course);
    }
}
