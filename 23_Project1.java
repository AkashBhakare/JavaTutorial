
package com.impetusits.Projects;

/**
 *
 * @author Akash
 */
public class Project1 {
     public void do_task(){
        Project2 p2 = new Project2();
        System.out.println("From do_task of Project1:\n\t"+p2.toString());
    }
    @Override
    public String toString() {
        return "This is a Project-1 Class";
    }
    
}

//public class X{
//    
//}
    

