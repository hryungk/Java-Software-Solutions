//********************************************************************************
//  PP_Pusheen.java      @author: Hyunryung Kim
//
//  Draw a Pusheen
//********************************************************************************

import javax.swing.JFrame;
import java.awt.*;  // various graphics capabilities are defined
import javax.swing.JPanel;

// A class that defines an applet extends the JApplet class.
// Applet classes must be declared as public.
public class PP_Pusheen extends JPanel
{
    // ADD THIS METHOD
    public PP_Pusheen() 
    {
        int PicWid = 500;
        setPreferredSize(new Dimension(PicWid,PicWid)); 
    }

    //----------------------------------------------------------------------------
    //  Draws a snowman.
    //----------------------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
       // ADD THIS LINE
        super.paintComponent(page);
        
        final int MID = 250;
        final int TOP = 50;
        int BodyWid = 200, BodyHei = 300;
        int EyeDist, EyeWid, Smile;
        EyeDist = BodyWid/5;
        //EyeDist = 12;
        EyeWid = 15;
        Smile = 10;
        
        setBackground(new Color(255, 240, 228));
        Color PusheenGray = new Color(179, 169, 157);
        Color PusheenPattern = new Color(104, 92, 74);
        Color PusheenOutline = new Color(68, 40, 18);
        
        
        // Draw body
        page.setColor(PusheenGray);
        page.fillOval(MID-BodyWid/2, TOP, BodyWid, BodyHei);
        page.setColor(PusheenOutline);
        page.drawOval(MID-BodyWid/2, TOP, BodyWid, BodyHei);
        
        // Draw eyes
        page.setColor(PusheenOutline);
        page.fillOval(MID-EyeDist/2-EyeWid, TOP+EyeDist, EyeWid, EyeWid);// left eye
        page.fillOval(MID+EyeDist/2, TOP+EyeDist, EyeWid, EyeWid);       // right eye
        
        // Draw smile
        page.drawArc(MID-Smile, TOP+EyeDist, Smile, Smile, 190, 200);
        page.drawArc(MID, TOP+EyeDist, Smile, Smile, 150, 200);
        
        // Draw ears
        //page.drawArc(MID-Smile, TOP+2*Smile, 2*Smile, Smile, 10, 160);
        
        
    }   
}
