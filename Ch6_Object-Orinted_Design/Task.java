//********************************************************************************
//  Task.java      Author: Hyunryung Kim
//
//  Programming Projects 6.5, Chapter 6
//  Design a Java interface called Priority that includes two methods: setPriority
//  and getPriority. The interface should define a way to establish numeric 
//  priority among a set of objects. Design and implement a class called Task that 
//  represents a task (such as on a to-do list) that implements the Priority
//  interface. Create a driver class to exercise some Task objects. 
//  Programming Projects 6.6, Chapter 6
//  Modify the Task class from PP 6.5 so that it also implements the Complexity
//  interface defined in this chapter. Modify the driver class to show these new
//  features of Task objects.
//  Programming Projects 6.7, Chapter 6
//  Modify the Task class from PP 6.5 and 6.6 so that it also implements the 
//  Comparable interface from the Java standard class library. Implement the 
//  interface such that th etasks are ranked by priority. Create a driver class 
//  whose main method shows these new features of Task objects.
//********************************************************************************

import java.util.ArrayList;

public class Task implements Priority, Complexity, Comparable<Task>
{
    private String taskStr;
    static ArrayList<Task> ToDoList = new ArrayList<Task>();
    private int complexityLevel;
    
    //----------------------------------------------------------------------------
    //  Constructor: Sets up the task and add it to list with a default priority.
    //----------------------------------------------------------------------------
    public Task (String str)
    {
        taskStr = str;
        complexityLevel = 1;
        ToDoList.add(this);
    }

    //----------------------------------------------------------------------------
    //  Sets the priority level for this task.
    //----------------------------------------------------------------------------
    public void setPriority (int index)
    {
        ToDoList.remove(this);
        ToDoList.add(index,this);
    }
    
    //----------------------------------------------------------------------------
    //  Returns the priority level for this task.
    //----------------------------------------------------------------------------
    public int getPriority()
    {
        return ToDoList.indexOf(this);
    }
    
    //----------------------------------------------------------------------------
    //  Sets the complexity level for this task.
    //----------------------------------------------------------------------------
    public void setComplexity (int level)
    {
        complexityLevel = level;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the complexity level for this task.
    //----------------------------------------------------------------------------
    public int getComplexity()
    {
        return complexityLevel;
    }

    //----------------------------------------------------------------------------
    //  Compares two Task objects and returns an integer value.
    //----------------------------------------------------------------------------
    public int compareTo(Task op2)
    {
        int result;
        int num1 = this.getPriority();
        int num2 = op2.getPriority();
        if (num1 < num2)
            result = -1;
        else
            if (num1 == num2)
                result = 0;
            else 
                result = 1;
        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Returns this task as a string.
    //----------------------------------------------------------------------------
    public String toString()
    {
        return "Priority " + ToDoList.indexOf(this) + ": " + taskStr + "(Complexity"
                +" level: " + complexityLevel+ ")";
    }

    //----------------------------------------------------------------------------
    //  Returns the to-do list.
    //----------------------------------------------------------------------------
    public static void roll()
    {
        for (int i = 0; i < ToDoList.size();i++)
            System.out.println(ToDoList.get(i));
    }
}
