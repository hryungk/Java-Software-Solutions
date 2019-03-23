//********************************************************************************
//  Course.java      @author: Hyunryung Kim
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

import java.util.ArrayList;

public class Course 
{
    ArrayList<Student> studentList = new ArrayList<Student>();
    String courseName;
    int studentNum;
    
    public Course(String str)
    {
        courseName = str;
    }
    
    public void addStudent(Student stdObj)
    {
        studentList.add(stdObj);
    }
    
    public double average()
    {
        double sum = 0.0;
        for (int i = 0; i < number(); i++)
        {
            sum += studentList.get(i).average();
        }
        
        return (sum / number());
    }
    
    public void roll()
    {
        for (int i = 0; i < number(); i++)
        {
            System.out.println(studentList.get(i));
            System.out.println();
        }
    }
    
    public int number()
    {
        studentNum = studentList.size();
        return studentNum;
    }
    
    public String toString()
    {
        String result = "";
        result += "Course Name: " + courseName + "\n";
        result += "Number of students: " + number() + "\n";
        result += "Course average: " + average();
        
        return result;
    }
    
}
