// Java program to demonstrate  
// working of TimerTask class 
import java.util.TimerTask; 
  
public class Helper extends TimerTask 
{ 
    public static int i = 0; 
    public void run() 
    { 
        System.out.println("Timer ran" + ++i); 
        
//        if(i == 4) 
//        { 
            synchronized(Test.obj) 
            { 
                Test.obj.notify(); 
            } 
//        } 
    } 
      
} 