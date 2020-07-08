import java.util.Date;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask 
{
    @Override
    public void run() 
    {
        System.out.println("Current status at " + new Date());
        completeTask();
    }

    private void completeTask() 
    {
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
