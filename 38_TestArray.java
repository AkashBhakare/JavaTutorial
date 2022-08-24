/*
 Understand scenarios when exceptions are thrown
 and also understand how array are passed to functions
 */
package com.impetusits;

import java.awt.Point;

/**
 *
 * @author Akash
 */
public class TestArray {

    public static void main(String[] args) {
        array_out_of_bound();
        null_pointer_exception();
        array_store_exception();
//        ArrayStoreException
//        exceptionDemo();
//       passing array to functions
//        System.out.println("array (Main):" + pointArray);
//        foo(pointArray);
//        System.out.println("array (Main):" + pointArray);
//
//        pointArray[0] = new Point(1, 1);
//        pointArray[1] = new Point(2, 2);
//        pointArray[2] = new Point(3, 3);
//        System.out.println("In main");
//        for (Point element : pointArray) {
//            System.out.println(element);
//        }
//
//        baz(pointArray);
//
//        System.out.println("\nBack to Main");
//        for (Point element : pointArray) {
//            System.out.println(element);
//        }
    }

    private static void array_out_of_bound() {
        //     A Single Array type Refercence
        Point[] pointArray;
//     Create a single array boject containing
//     3 Point class type references
        pointArray = new Point[3];
        System.out.println("1st element :" + pointArray[0]);
//      java.lang.ArrayIndexOutOfBoundsException
        // System.out.println("4th element :" + pointArray[3]);
        System.out.println("-1th element :" + pointArray[-1]);
    }

    private static void null_pointer_exception() {
//     A Single Array type Refercence
        Point[] pointArray;
//     Create a single array boject containing 3 Point class type references
        pointArray = new Point[3];
        for (Point element : pointArray) {
            System.out.println("Point : " + element);
        }
//     java.lang.NullPointerException:
//        System.out.println("The First point" + pointArray[0].getX());

        pointArray[0] = new Point(10, 20);
        System.out.println("The First point : " + pointArray[0].getX());
        System.out.println("The First point" + pointArray[0]);
        System.out.println("The First point" + pointArray[0].toString());
    }

    private static void foo(Point[] pointArray) {
        System.out.println("array (foo) :" + pointArray);
        pointArray = null;
        System.out.println("array (foo) :" + pointArray);

    }

    private static void baz(Point[] pointArray) {
        System.out.println("\nInside Baz");
        for (Point element : pointArray) {
            element.setY(300);
        }
        for (Point element : pointArray) {
            System.out.println(element);
        }
        System.out.println("\nLeaving Baz");
    }

    private static void array_store_exception() {
        //      Creates a Array type reference
        Number[] objArr;
        //Creates an Array object containing 5 Integer class references
        objArr = new Integer[5];

//      Assigning a Integer value which is correct
        objArr[0] = new Integer(33);
        objArr[1] = 44;
        System.out.println("objArr[0]: " + objArr[0]);
        System.out.println("objArr[1]: " + objArr[1]);
//      Assigning a Float value - which results in the ArrayStoreException
        objArr[1] = new Float("23.4");
    }

}
