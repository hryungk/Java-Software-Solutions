//********************************************************************************
//  TaskBody.java      Author: Hyunryung Kim
//
//  Programming Projects 6.5, Chapter 6
//  Design a Java interface called Priority that includes two methods: setPriority
//  and getPriority. The interface should define a way to establish numeric 
//  priority among a set of objects. Design and implement a class called Task that 
//  represents a task (such as on a to-do list) that implements the Priority
//  interface. Create a driver class to exercise some Task objects. 
//********************************************************************************

public class PP_6_5_TaskBody 
{
    //----------------------------------------------------------------------------
    //  Stores and modifies a list of tasks.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {   
        Task task1 = new Task("Do laundry.");
        Task task2 = new Task("Cook Scallops.");
        Task task3 = new Task("Go to the escape room.");
        Task task4 = new Task("Eat fried chicken for dinner.");
        Task task5 = new Task("Vacuum home.");
        
        System.out.println();
        System.out.println("To-do list:");
        Task.roll();
        System.out.println();
        
        task4.setPriority(0);
        task5.setPriority(1);
        System.out.println("Priority of task3 changed to " + task3.getPriority());
        System.out.println("Priority of task5 changed to " + task5.getPriority());
        
        System.out.println();
        System.out.println("New To-do list:");
        Task.roll();
          
    }
}
