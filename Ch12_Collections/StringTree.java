//********************************************************************************
//  StringTree.java       Author: Hyunryung Kim
//
//  Representsa binary tree for storing String objects in alphabetic order.
//********************************************************************************
import java.util.Scanner;

public class StringTree
{
    private Node list;
    
    //----------------------------------------------------------------------------
    //  Sets up an initially empty list of strings.
    //----------------------------------------------------------------------------    
    public StringTree ()
    {
        list = null;
    }

    //----------------------------------------------------------------------------
    //  Adds a new string to the tree.
    //----------------------------------------------------------------------------    
    public void add(String newStr)
    {
        Node node = new Node(newStr);
        //Node current;
        
        if (list == null)
            list = node;
        else
        {
            //current = list;
            //while (current.right != null)
            //    current = current.right;
            //current.right = node;
            sort(newStr, list);
        }
    }

    //----------------------------------------------------------------------------
    //  Returns the list
    //----------------------------------------------------------------------------    
    public Node getList()
    {
        return list;
    }

    //----------------------------------------------------------------------------
    //  Sorts the linked list in alphabetical order.
    //----------------------------------------------------------------------------    
    private void sort(String newStr, Node current)
    {
        if (newStr.compareToIgnoreCase(current.strVal) > 0)
        {
            if (current.right == null)
                current.right = new Node(newStr);
            else
            {
                current = current.right;
                sort(newStr, current);
            }
        }
        else
        {
            if (current.left == null)
                current.left = new Node(newStr);
            else
            {
                current = current.left;
                sort(newStr,current);
            }
        }
    }   


    //----------------------------------------------------------------------------
    //  Returns a String that contains words in the tree in alphabetical order.
    //----------------------------------------------------------------------------    
    private String sortedList(String prevResult, Node current)
    {   
        String result, resultL = "", resultR = "";
        // Anything in the left branch should go first
        if (current.left != null)   // if something in the left branch
            resultL = sortedList(prevResult,current.left);
        
        if (current.right != null)  // if something on the right branch
            resultR = sortedList(prevResult,current.right);

        result = resultL + " " + current.strVal + " " + resultR;
        return result;
    }   
    
    //----------------------------------------------------------------------------
    //  Returns the string with single space gap.
    //----------------------------------------------------------------------------            
    private String removeGaps(String str)
    {
        Scanner strScan = new Scanner(str);
        String result = "";

        while(strScan.hasNext())
            result += strScan.next() + " ";

        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Returns this list of strings as a string.
    //----------------------------------------------------------------------------        
    public String toString()
    {
        String result = "";
        result += sortedList(result, list);
        result = removeGaps(result);
        result = "Words in the tree sorted in alphabetic order:\n" + result;
        return result;
    }
     
}
