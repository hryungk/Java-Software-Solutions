//********************************************************************************
//  BoxTest.java      @author: Hyunryung Kim
//
//  Programming Projects 4.3, Chapter 4
//  Create a driver class called BoxTest, whose main method instantiates and
//  updates several Box objects. 
//********************************************************************************

public class PP_4_3_BoxTest 
{
    //----------------------------------------------------------------------------
    // Creates some box information and requests various services.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Box box1 = new Box(1,2,3);
        Box box2 = new Box(4,5,6);
        
        double box1Height = box1.getHeight();
        double box2Height = box2.getHeight();
        
        double box1Width = box1.getWidth();
        double box2Width = box2.getWidth();
        
        System.out.println("Box1's height: " + box1Height + ", width: " + box1Width);
        System.out.println("Box2's height: " + box2Height + ", width: " + box2Width);

        box1.setWidth(3);
        double box1NewWidth = box1.getWidth();
        box2.setHeight(7);
        double box2NewHeight = box2.getHeight();
        
        System.out.println("Box1's new width: " + box1NewWidth);
        System.out.println("Box2's new height: " + box2NewHeight);
        
        
        double box1Depth = box1.getDepth();
        double box2Depth = box2.getDepth();
        
        System.out.println("Box1's depth: " + box1Depth);
        System.out.println("Box2's depth: " + box2Depth);
        
        boolean box1Full = box1.getBoolean();
        box2.setBoolean(true);
        boolean box2Full = box2.getBoolean();
        System.out.println("Box1 is full (true) or empty (false): " + box1Full);
        System.out.println("Box2 is full (true) or empty (false): " + box2Full);
        
        
        System.out.println();
        System.out.println(box1);
        System.out.println(box2);        
    }
    
}
