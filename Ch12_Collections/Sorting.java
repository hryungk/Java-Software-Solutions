//********************************************************************************
//  Sorting.java       Author: Hyunryung Kim
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************************

public class Sorting
{    
    //----------------------------------------------------------------------------
    //  Sorts the specified array of objects using the selection sort algorithm.
    //---------------------------------------------------------------------------- 
    public static Comparable[] selectionSort(CDCollection.CDCollectionNode CDColNodeList)
    {
         //  Create a Comparable array from the CDColNodeList
        Comparable[] list = createComp(CDColNodeList);

        int min;
        Comparable temp;
         
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            
            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;           
        }        
        
        return list;
    }
    
    //----------------------------------------------------------------------------
    //  Create a Comparable array from the CDColNodeList
    //----------------------------------------------------------------------------     
    private static Comparable[] createComp(CDCollection.CDCollectionNode current)
    {
        //  Count the number of nodes in the CDColNodeList
        int CDlistSize = countNode(current);
        
        //  Create a Comparable array from the CDColNodeList
        Comparable[] list = new Comparable[CDlistSize];
        
        // We should end the for loop before reaching the last element because 
        // there is current.next in the loop.
        for (int i = 0; i < CDlistSize-1; i++)
        {
            list[i] = current.cd;
            current = current.next;            
        }
        list[CDlistSize-1] = current.cd;
        
        return list;
    }

    //----------------------------------------------------------------------------
    //  Count the number of nodes in the CDCollectionNode list
    //----------------------------------------------------------------------------     
    private static int countNode(CDCollection.CDCollectionNode current)
    {
        int CDlistSize;
        if (current == null)    // If the node is empty
            CDlistSize = 0;
        else
        {
            CDlistSize = 1; // Count the current node
            while (current.next != null)    // If there is more node next
            {
                current = current.next;
                CDlistSize++;
            }
        }
        return CDlistSize;
    }
    
    
    //----------------------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion sort algorithm.
    //----------------------------------------------------------------------------    
    public static Comparable[] insertionSort(CDCollection.CDCollectionNode CDColNodeList)
    {
        //  Create a Comparable array from the CDColNodeList
        Comparable[] list = createComp(CDColNodeList);
        
        for (int index = 1; index < list.length; index++)
        {
            Comparable key = list[index];
            int position = index;
            
            // Shift larger values to the right
            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }
            list[position] = key;
        }
        
        return list;
    }
}
