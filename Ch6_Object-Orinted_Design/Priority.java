//********************************************************************************
//  Priority.java      Author: Hyunryung Kim
//
//  Programming Projects 6.5, Chapter 6
//  Design a Java interface called Priority that includes two methods: setPriority
//  and getPriority. The interface should define a way to establish numeric 
//  priority among a set of objects. Design and implement a class called Task that 
//  represents a task (such as on a to-do list) that implements the Priority
//  interface. Create a driver class to exercise some Task objects. 
//********************************************************************************

public interface Priority 
{
    public void setPriority (int index);
    public int getPriority();
}
