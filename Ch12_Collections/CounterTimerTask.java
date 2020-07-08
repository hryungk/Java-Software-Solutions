import java.util.TimerTask;

public class CounterTimerTask extends TimerTask 
{
    private int i = 0; 
    
    @Override
    public void run() 
    {
        System.out.println(i++ + " s");
        //completeTask();
    }

    private void completeTask() 
    {
        try {
            //assuming it takes 1 sec to complete the task
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
