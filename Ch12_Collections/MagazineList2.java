//********************************************************************************
//  MagazineList2.java       Author: Hyunryung Kim
//
//  Represents a collection of magazine.
//********************************************************************************

public class MagazineList2
{
    private MagazineNode list;
    
    //----------------------------------------------------------------------------
    //  Sets up an initially empty list of magazines.
    //----------------------------------------------------------------------------    
    public MagazineList2 ()
    {
        list = null;
    }

    //----------------------------------------------------------------------------
    //  Creates a new MagazineNode object and adds it to the end of the linked 
    //  list.
    //----------------------------------------------------------------------------    
    public void add(Magazine2 mag)
    {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;
        
        if (list == null)
            list = node;
        else
        {
            current = list;
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
    }

    //----------------------------------------------------------------------------
    //  Deletes a MagazineNode object from the linked list.
    //----------------------------------------------------------------------------    
    public void delete(Magazine2 mag)
    {
        MagazineNode prev, current;
        
        prev = list;
        current = list;
        
        if (mag.equals(list.magazine))  // If the first magazine is to be deleted
        {
            list = list.next;
        }
        else
        {
            prev = current;
            current = current.next;            
            while (current.next != null)
            {
                if (mag.equals(current.magazine))    // Find mag
                {
                    prev.next = current.next;
                    break;
                }          
                prev = current;
                current = current.next;                
            }
            // If the last magazine is to be deleted
            if ((current.next == null) && (mag.equals(current.magazine)))
            {
                prev.next = null;
            }            
        }
    }
    
    //----------------------------------------------------------------------------
    //  Inserts a new MagazineNode object to the linked list.
    //----------------------------------------------------------------------------    
    public void insert(Magazine2 mag)
    {
        MagazineNode newNode = new MagazineNode(mag);
        MagazineNode current, prev;
        
        prev = list;
        
        if (list == null)
            list = newNode;
        else
        {
            current = list;
            if (mag.compareTo(current.magazine) < 0)    // Insert in the front
            {
                newNode.next = current;
                list = newNode;
            }
            else
            {
                while (current.next != null)
                {
                    prev = current;
                    current = current.next;                    
                    if (mag.compareTo(current.magazine) < 0)
                    {
                        prev.next = newNode;
                        newNode.next = current;
                        break;
                    }
                }
                if (current.next == null)   // Insert to the last
                    current.next = newNode;                
            }
        }
    }
    
    //----------------------------------------------------------------------------
    //  Returns this list of magazines as a string.
    //----------------------------------------------------------------------------        
    public String toString()
    {
        String result = "";
        MagazineNode current = list;
        
        while (current != null)
        {
            result += current.magazine + "\n";
            current = current.next;
        }
        
        return result;
    }
    
    //****************************************************************************
    //  An innner class that represents a node in the magazine list.
    //  The public varaibles are accessed by the MagazineList class.
    //****************************************************************************
    public class MagazineNode
    {
        public Magazine2 magazine;
        public MagazineNode next;
        //----------------------------------------------------------------------------
        //  Sets up the node
        //----------------------------------------------------------------------------    
        public MagazineNode(Magazine2 mag)
        {
            magazine = mag;
            next = null;
        }
    }    
}
