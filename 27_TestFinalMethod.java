package com.impetusits;

/**
 *
 * @author Akash
 */
public class TestFinalMethod {
    public static void main(String[] args) {
       
//        ParentClass pcRef = new ParentClass();
//        pcRef.baz();
//        pcRef.foo();
       
        ChildClass ccRef = new ChildClass();
        ccRef.foo();
        ccRef.foo("Bye");
        ccRef.baz();
        ccRef.baz("Hi");
//        
//        ParentClass pref = new ChildClass();
//        pref.foo();
//        pref.baz();
    }
    
}
