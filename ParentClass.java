package com.impetusits;

/**
 *
 * @author Akash
 */
public class ParentClass {
    
//    it is overridable and can also be overloaded
    public void foo(){
        System.out.println("Inside foo of Parentclass");
    }
    
    
//    cannot be overridden in subclass but it can be overloaded
    final public void baz(){
        System.out.println("Inside baz of Parentclass");
    }
    
}
