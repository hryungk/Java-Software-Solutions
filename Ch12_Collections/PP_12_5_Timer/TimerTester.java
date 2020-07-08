import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTester
{
    public static void main(String args[])
    {
        TimerTask timerTask = new MyTimerTask();
        TimerTask counterTask = new CounterTimerTask();
        
        //running timer task as daemon thread
        Timer timer = new Timer();
        Timer counterTimer = new Timer();
        
        //timer.scheduleAtFixedRate(timerTask, 0, 1*1000);
        timer.schedule(timerTask, 5*1000);
        counterTimer.scheduleAtFixedRate(counterTask, 0, 1*1000);
        
        System.out.println("TimerTask started");
        
        //cancel after sometime
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counterTimer.cancel();
        timer.cancel();
        System.out.println("TimerTask cancelled");
        
        //try {
        //    Thread.sleep(3000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
    }

}
