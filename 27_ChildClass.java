package com.impetusits;

/**
 *
 * @author Akash
 */
public class ChildClass extends ParentClass {
        
    @Override
    public void foo() {
        System.out.println("Inside foo of ChildClass");
    }
    
    /* Overloading inherited method */
    public void foo(String arg) {
        System.out.println("Inside foo of Childclass : " + arg);
    }
    
    /* Overloading inherited method */
    public void baz(String arg) {
        System.out.println("Inside baz of Childclass : " + arg);
    }
    
    
//    @Override
//    public void baz() {
//        System.out.println("Inside baz of ChildClass");
//    }
   
}
