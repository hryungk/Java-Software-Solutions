//********************************************************************************
//  Blurb.java       Author: Hyunryung Kim
//
//  Creates a random Blurb.
//********************************************************************************

public class Blurb
{
    private String newBlurb;
    private int numWhatzitMax = 5;
    private int numyMax = 5;
    
    public Blurb()
    {
        newBlurb = whoozit();   // A Blurb is a Whoozit (plus one or more Whatzits)
        
        // The number of Whatzits chosen randomly within the specified range.
        int numWhatzit = (int)(Math.random()*numWhatzitMax) + 1;
        //System.out.println("Number of Whatzits in the Blurb: " + numWhatzit);
        
        // A Blurb is a Whoozit plus one or more Whatzits
        for (int i = 1; i <= numWhatzit; i++)
            newBlurb += whatzit();
    }

    public String whatzit ()
    {
        String result;
        
        // Randomly choose between "z" or "d"
        String[] zd = {"z", "d"};
        // Choose random integer between 0 and 1 (between "z" and "d")
        int numzd = (int)(Math.random() * zd.length);
        //System.out.println("z or d: " + zd[numzd]);
        
        result = "q" + zd[numzd] + whoozit();
        
        return result;
    }

    public String whoozit ()
    {
        String result;
        
        // The number of "y" chosen randomly within the specified range.
        int numy = (int)(Math.random()*(numyMax+1));
        //System.out.println("Number of y: " + numy);
        
        result = "x";   // A whoozit is a "x" (plus zero or more "y"s)
        
        // A whoozit is a "x" plus zero or more "y"s
        for (int i = 0; i < numy; i++)
            result += "y";
        
        return result;
    }    
    
    public String toString()
    {
        String result;
        result = newBlurb;
        return result;
    }
}
