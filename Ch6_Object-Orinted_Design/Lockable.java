//********************************************************************************
//  Lockable.java      Author: Hyunryung Kim
//
//  Programming Projects 6.8, Chapter 6
//  Design a Java interface called Lockable that includes the following methods:
//  setKey, lock, unlock, and locked. The setKey, lock, and unlock methods take an
//  integer parameter that represents the key. The setKey method establishes the
//  key. The lock and unlock methods lock and unlock teh object, but only if the
//  key passed in is correct. The locked method returns a boolean that indicates 
//  whether or not the object is locked. A Lockable object represents an object 
//  whose regular methods are protected: if the object is locked, the methods 
//  cannot be invoked; if it is unlocked, they can be invoked. Redesign and 
//  implement a version of the Coin class from Chapter 5 so that it is Lockable.
//********************************************************************************

public interface Lockable 
{
    public void setKey (int key);
    public void lock(int key);
    public void unlock(int key);
    public boolean locked();
}
