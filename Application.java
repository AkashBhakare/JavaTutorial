package com.impetusits;

import com.impetusits.Projects.Project3;
import java.awt.Color;
import java.util.Currency;

/*
Non-Public class cannot be imported
import in.impetusits.projects.Project2;
 */

/**
 *
 * @author Akash
 */
public class Application {
    public static void main(String[] args) {
        class_modifier_public();
        class_modifier_abstract();
    }

    public static void class_modifier_public() {
        /*We can access a public class by giving its fully qualified name
        without importing the class
         */
        //com.impetusits.Projects.Project1 p1 = new com.impetusits.Projects.Project1();

        //  in.impetusits.projects.Project2 p2;
        //Only Public classes can be imported
        //Project3 p3 = new Project3();

        /*Classes are directly accisible within their own package*/
        //Color c1 = new Color();
        //System.out.println("c1" + c1);

        //java.util.Scanner scan;
        //Currency curr;
    }

    private static void class_modifier_abstract() {
        /*We can create a reference of Abstract class*/
        //Car acar;
        /*We Cannot instantiate an abstract class i.e. we cannot create its objects
        acar = new Car();
         */
        //Micra mcar = new Micra();
        /*Reference of Abstract class can refer to object of its subclass(spcialized version)*/
        //acar = new Micra(); //since Micra is a kind of Car
    }
    
}
