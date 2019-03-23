//********************************************************************************
//  Coin.java      Author: Hyunryung Kim
//
//  Programming Projects 6.8, Chapter 6
//  Design a Java interface called Lockable that includes the following methods:
//  setKey, lock, unlock, and locked. The setKey, lock, and unlock methods take an
//  integer parameter that represents the key. The setKey method establishes the
//  key. The lock and unlock methods lock and unlock the object, but only if the
//  key passed in is correct. The locked method returns a boolean that indicates 
//  whether or not the object is locked. A Lockable object represents an object 
//  whose regular methods are protected: if the object is locked, the methods 
//  cannot be invoked; if it is unlocked, they can be invoked. Redesign and 
//  implement a version of the Coin class from Chapter 5 so that it is Lockable.
//********************************************************************************

public class Coin implements Lockable
{   
    private int passCode = 9999;
    private boolean locked = true;
    
    private final int HEADS = 0;
    private final int TAILS = 1;
    
    private int face = -1;
    
    //----------------------------------------------------------------------------
    //  Establishes the key.
    //----------------------------------------------------------------------------
    public void setKey (int key)
    {
        passCode = key;
    }
    
    //----------------------------------------------------------------------------
    //   Locks the object, only if the key passed in is correct.
    //----------------------------------------------------------------------------
    public void lock(int key)
    {
        if (key == passCode)
        {
            System.out.println("You locked Coin object. Methods cannot be invoked.");
            locked = true;
        }
        else
            System.out.println("ERROR: The key is incorrect.");
    }
    
    //----------------------------------------------------------------------------
    //   Unlocks the object, only if the key passed in is correct.
    //----------------------------------------------------------------------------
    public void unlock(int key)
    {
        if (key == passCode)
        {
            System.out.println("You unlocked Coin object. Methods can be invoked.");
            locked = false;
        }
        else
            System.out.println("ERROR: The key is incorrect.");
    }
    
    //----------------------------------------------------------------------------
    //  Returns a boolean that indicates whether or not the object is locked.
    //----------------------------------------------------------------------------
    public boolean locked()
    {
        return locked;
    }
    
    //----------------------------------------------------------------------------
    //  Sets up the coin by flipping it initially.
    //----------------------------------------------------------------------------
    public Coin ()
    {
            flip();
    }
    
    //----------------------------------------------------------------------------
    //  Flips the coin by randomly choosing a face value.
    //----------------------------------------------------------------------------
    public void flip ()
    {
        if (!locked)
            face = (int) (Math.random() * 2);
    }
    
    //----------------------------------------------------------------------------
    //  Returns true if the current face of the coin is heads.
    //----------------------------------------------------------------------------
    public boolean isHeads()
    {
        return (face == HEADS);
    }
    
    //----------------------------------------------------------------------------
    //  Returns the current face of the coin as a string
    //----------------------------------------------------------------------------
    public String toString()
    {
        String faceName;
        if (locked)
            faceName = "Coin object is locked. Methods cannot be invoked.";
        else
        {
            if (face == HEADS)
                faceName = "Heads";
            else
                faceName = "Tails";
        }
        return faceName;
    }
    
}
