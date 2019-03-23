//********************************************************************************
//  TaskBody.java      Author: Hyunryung Kim
//
//  Programming Projects 6.6, Chapter 6
//  Modify the Task class from PP 6.5 so that it also implements the Complexity
//  interface defined in this chapter. Modify the driver class to show these new
//  features of Task objects.
//********************************************************************************

public class PP_6_6_TaskBody 
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

        task1.setComplexity(3);
        task2.setComplexity(7);
        task3.setComplexity(10);        

        System.out.println("Complexity of task1: " + task1.getComplexity());
        System.out.println("Complexity of task2: " + task2.getComplexity());
 
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
