//********************************************************************************
//  LockableCoin.java      @author: Hyunryung Kim
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

public class PP_6_8_LockableCoin 
{
    //----------------------------------------------------------------------------
    // Creates a Coin object, flips it, and prints the results.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Coin myCoin = new Coin();
        
        myCoin.flip();
        System.out.println (myCoin);
        
        // set the passcode
        myCoin.setKey(1234);
        
        // unlock the Coin object
        myCoin.unlock(1234);
        
        myCoin.flip();
        System.out.println (myCoin);
        
        
        if (!myCoin.locked())
        {
            if (myCoin.isHeads())
                System.out.println("You win.");
            else
                System.out.println("Better luck next time.");
        }
        
    }
    
}
