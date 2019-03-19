//********************************************************************************
//  Einstein.java      @author: Lewis/Loftus
//
//  Demonstrates a basic applet.
//********************************************************************************

import javax.swing.JFrame;
import java.awt.*;  // various graphics capabilities are defined
import javax.swing.JPanel;

// A class that defines an applet extends the JApplet class.
// Applet classes must be declared as public.
public class JavaPaintViewer
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Listing_2_10_Einstein panel = new Listing_2_10_Einstein();
        //Listing_2_11_Snowman_v2 panel = new Listing_2_11_Snowman_v2();
        //PP_2_12 panel = new PP_2_12();
        PP_Pusheen panel = new PP_Pusheen();
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}