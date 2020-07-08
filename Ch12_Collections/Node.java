//********************************************************************************
//  Node.java       Author: Hyunryung Kim
//
//  An innner class that represents a node in the StringTree.
//  The public varaibles are accessed by the StringTree class.
//********************************************************************************
public class Node
{
    public String strVal;
    public Node left, right;
    //----------------------------------------------------------------------------
    //  Sets up the node
    //----------------------------------------------------------------------------    
    public Node(String str)
    {
        strVal = str;
        left = null;
        right = null;
    }
}  

