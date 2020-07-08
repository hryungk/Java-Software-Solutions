// Java program to demonstrate  
// working of TimerTask class 
import java.util.Timer; 
import java.util.TimerTask;   
  
public class Test 
{ 
    public static Test obj; 
    public static void main(String[] args) throws InterruptedException 
    { 
        obj = new Test(); 
          
        // creating an instance of timer class 
        Timer timer = new Timer(); 
          
        // creating an instance of task to be scheduled 
        TimerTask task = new Helper(); 
          
        // scheduling the timer instance 
        //timer.schedule(task, 1000, 3000); 
        timer.schedule(task, 3000); 
        
        // fetching the scheduled execution time of  
        // the most recent actual execution of the task 
        //System.out.println(task.scheduledExecutionTime()); 
          
        synchronized(obj) 
        { 
            //this thread waits until i reaches 4 
            obj.wait(); 
        } 
          
        //canceling the task assigned  
        System.out.println("Cancel the timer task: " + task.cancel()); 
          
        // at this point timer is still running  
        // without any task assigned to it 
      
        // canceling the timer instance created 
        timer.cancel(); 
    } 
} 