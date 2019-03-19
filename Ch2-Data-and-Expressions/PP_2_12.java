//********************************************************************************
//  PP_2_12.java      @author: Hyunryung Kim
//
//  Programming Projects, Chapter 2
//  Create a revised version of the Snowman applet with the follwing modifications:
//      Add two red buttons to the upper torso.
//      Make the snowman frown instead of smile.
//      Move the sun to the upper-right corner of the picture.
//      Display your name in the upper-left corner of the picture.
//      Shift the entire snowman 20 pixels to the right.
//********************************************************************************

import javax.swing.JFrame;
import java.awt.*;  // various graphics capabilities are defined
import javax.swing.JPanel;

// A class that defines an applet extends the JApplet class.
// Applet classes must be declared as public.
public class PP_2_12 extends JPanel
{
    // ADD THIS METHOD
    public PP_2_12() 
    {
        setPreferredSize(new Dimension(300,225)); 
    }

    //----------------------------------------------------------------------------
    //  Draws a snowman.
    //----------------------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
       // ADD THIS LINE
        super.paintComponent(page);
        
        final int MID = 130;
        final int TOP = 50;
        int PicWid = 300;
        int SunRad = 40;
        int HeadRad = 40;
        int UpTorWid = 70, UpTorHei = 50, Overlap = 5;
        int LoTorWid = 100, LoTorHei = 60;
        int EyeDist, EyeWid, Smile;
        int ButDist, ButWid;
        EyeDist = HeadRad/4;
        //EyeDist = 12;
        EyeWid = EyeDist/2;
        Smile = HeadRad/4;
        
        ButDist = UpTorHei/4;
        ButWid = UpTorHei/6;
        
        
        setBackground(Color.cyan);
        
        // Draw blue ground
        page.setColor(Color.blue);
        page.fillRect(0, 175, PicWid, 50);
        
        // Draw the sun
        page.setColor(Color.yellow);
        //page.fillOval(-SunRad, -SunRad, 2*SunRad, 2*SunRad);  // upper-left corner
        page.fillOval(PicWid-SunRad, -SunRad, 2*SunRad, 2*SunRad);  // upper-right corner       
        
        // Draw a head
        page.setColor(Color.white);
        page.fillOval(MID-HeadRad/2, TOP, HeadRad, HeadRad);
        // Draw a upper torso
        page.fillOval(MID-UpTorWid/2, TOP+(HeadRad-Overlap), UpTorWid, UpTorHei);
        // Draw a lower torso
        page.fillOval(MID-LoTorWid/2, TOP+(HeadRad-Overlap+UpTorHei-Overlap), 
                LoTorWid, LoTorHei);
        
        // Draw eyes
        page.setColor(Color.black);
        page.fillOval(MID-EyeDist/2-EyeWid, TOP+EyeDist, EyeWid, EyeWid);// left eye
        page.fillOval(MID+EyeDist/2, TOP+EyeDist, EyeWid, EyeWid);       // right eye
        
        // Draw frown face
        page.drawArc(MID-Smile, TOP+2*Smile, 2*Smile, Smile, 10, 160);
        
        // Draw arms
        page.drawLine(MID-25, TOP+60, MID-50, TOP+40);  // left arm
        page.drawLine(MID+25, TOP+60, MID+55, TOP+60);  // right arm
        
        // Draw a hat
        page.drawLine(MID-20, TOP+5, MID+20, TOP+5);    // brim of hat
        page.fillRect(MID-15, TOP-20, 30, 25);          // top of hat
        
        // Write your name in the upper-left corner of the picture.
        page.drawString("Hyunryung Kim", 5, 15);
        
         // Draw two red buttons to the upper torso
        page.setColor(Color.red);
        page.fillOval(MID-ButWid/2,TOP+(HeadRad-Overlap)+ButDist,ButWid,ButWid);
        page.fillOval(MID-ButWid/2,TOP+(HeadRad-Overlap)+ButDist*2,ButWid,ButWid);

        
    }   
}
