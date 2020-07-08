//********************************************************************************
//  BlurbTester.java       Author: Hyunryung Kim
//
//  Checks whether a string is a Blurb.
//********************************************************************************

public class BlurbTester
{
    private String testString;  // The string under the Blurb test.
    private boolean trueBlurb;
    
    public BlurbTester()
    {
        trueBlurb = false;   
    }

    public boolean isBlurb (String str)
    {
        testString = str;   // String to be tested
                
        int Ix = str.indexOf("x");  // Index of "x" in str if exists, otherwise -1
        int Iq = str.indexOf("q");  // Index of "q" in str if exists, otherwise -1
        
        if ((Ix == 0) && (Iq > -1))
            trueBlurb = (isWhoozit(str.substring(Ix,Iq)) 
                    && isWhatzit(str.substring(Iq,str.length())));
        
        return trueBlurb;
    }
    
    private boolean isWhatzit (String str)
    {
        boolean result;
        
        // true if str = "q___"
        result = str.startsWith("q");   
        // true if str = "qz___" or "qd_____"
        result = (result && ((str.charAt(1) == 'z') || (str.charAt(1) == 'd')));
        if (str.length() > 2)
            // true if str = "qz"+Whoozit or "qd"+Whoozit
            result = (result && isWhoozit(str.substring(2,str.length())));
        return result;
    }

    private boolean isWhoozit (String str)
    {
        boolean result = false;
        
        if (str.startsWith("x"))    
            if (str.length() == 1)  // if str = "x"
                result = true;
            else    // if str = "x_____"
                if (isys(str.substring(1, str.length())))   // if str = "x" + "y"s
                    result = true;
        return result;
    }    
    
    private boolean isys (String str)
    {
        boolean result = true;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'y')
                result = (result && true);
        }
        return result;
    }    
        
    public String toString()
    {
        String result;
        if (trueBlurb)
            result = "This string IS a Blurb";
        else
            result = "This string is NOT a Blurb";
        return result;
    }
}
