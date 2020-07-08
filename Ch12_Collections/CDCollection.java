//********************************************************************************
//  CDCollection.java      Author: Hyunryung Kim
//
//  Represents a collection of compact discs.
//********************************************************************************

import java.text.NumberFormat;

public class CDCollection 
{
    private CDCollectionNode collection;
    private int count;
    private double totalCost;
    
    //----------------------------------------------------------------------------
    //  Constructor: Creates an initially empty collection
    //----------------------------------------------------------------------------
    public CDCollection ()
    {
        collection = null;
        count = 0;
        totalCost = 0.0;
    }
    
    //----------------------------------------------------------------------------
    //  Adds a CD to the collection, increasing the size of the
    //  collection if necessary.
    //----------------------------------------------------------------------------
    public void addCD (String title, String artist, double cost, int tracks)
    {
        CD newCD = new CD (title, artist, cost, tracks);
        CDCollectionNode node = new CDCollectionNode(newCD);
        CDCollectionNode current;
        
        if (collection == null)
            collection = node;
        else
        {
            current = collection;
            while(current.next != null)
                current = current.next;
            current.next = node;
        }
        
        totalCost += cost;
        count++;
        sortByTitle();
    }

    //----------------------------------------------------------------------------
    //  Returns a report describing the CD collection.
    //----------------------------------------------------------------------------
    public String toString()
    {
        CDCollectionNode current = collection;
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "My CD Collection\n\n";
        
        report += "Number of CDs: " + count + "\n";
        report += "Total cost: " + fmt.format(totalCost) + "\n";
        report += "Average cost: " + fmt.format(totalCost/count);
        
        report += "\n\nCD List:\n\n";
        
        while (current != null)
        {
            report += current.cd + "\n";
            current = current.next;
        }
        return report;
    }    
    
    //----------------------------------------------------------------------------
    //  Sorts the linked list in alphabetical order of the title.
    //----------------------------------------------------------------------------    
    private void sortByTitle()
    {
        CDCollectionNode temp = collection;
        
        //Comparable[] list = Sorting.selectionSort(temp);
        Comparable[] list = Sorting.insertionSort(temp);
        CDCollectionNode sortedNode = CompToNode(list);
        
        collection = sortedNode;  
    }    
    
    //----------------------------------------------------------------------------
    //  Convert a Comparable list to a CDCollectionNode and return it.
    //----------------------------------------------------------------------------
    private CDCollectionNode CompToNode (Comparable[] list)
    {
        CDCollectionNode nodeList = null;
        
        for (Comparable obj : list)
            nodeList = addCD((CD)obj, nodeList);
        
        return nodeList;
    }    

    //----------------------------------------------------------------------------
    //  Adds a CD to the collection, only for sorting the node list.
    //----------------------------------------------------------------------------
    private CDCollectionNode addCD (CD newCD, CDCollectionNode nodeList)
    {
        CDCollectionNode node = new CDCollectionNode(newCD);
        CDCollectionNode current;
        
        if (nodeList == null)
            nodeList = node;
        else
        {
            current = nodeList;
            while(current.next != null)
                current = current.next;
            current.next = node;
        }
        
        return nodeList;
    }    

    //****************************************************************************
    //  An innner class that represents a node in the CDCollection list.
    //  The public varaibles are accessed by the CDCollection class.
    //****************************************************************************
    public class CDCollectionNode
    {
        public CD cd;
        public CDCollectionNode next;
        //----------------------------------------------------------------------------
        //  Sets up the node
        //----------------------------------------------------------------------------    
        public CDCollectionNode(CD newCD)
        {
            cd = newCD;
            next = null;
        }
    } 
}
