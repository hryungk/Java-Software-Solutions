//********************************************************************************
//  WordTree.java      author: Hyunryung Kim
//
//  Programming Projects 12.9, Chapter 12 Collections
//  Design and implement a class named StringTree, a binary tree for storing 
//  String objects in alphabetic order. Each node in the tree should be 
//  represented by a Node class, which stores the string value and pointers to the 
//  right and left child nodes. For any node value in the tree, the value of its 
//  left child should come before that value, and the value of its right child 
//  should come after that value. The StringTree class should contain both a 
//  method for adding strings to the tree and a method for printing the tree’s 
//  value in alphabetic order. Write a driver program that reads strings from a 
//  file (one per line) and adds them to the tree. After processing the input, 
//  print the tree values.
//********************************************************************************

import java.util.Scanner;
import java.io.*;

public class PP_12_9_WordTree 
{
    //----------------------------------------------------------------------------
    // Reads nextStrings from a file and prints their path components.
    //----------------------------------------------------------------------------
    public static void main(String[] args) throws IOException
    {
        StringTree tree = new StringTree();
        String nextString;
        Scanner fileScan;
        
        fileScan = new Scanner (new File("PP_12_9.inp"));
        
        //  Reads strings from a file (one per line) 
        int index = 0;
        while (fileScan.hasNext())
        {
            nextString = fileScan.nextLine();
            //System.out.println("Line # " + ++index + ": " + nextString);
            tree.add(nextString);
        }
        
        System.out.println(tree);
        
    }
}
