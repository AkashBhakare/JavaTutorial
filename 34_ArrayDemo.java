/*
 Demonstrates how to handle array of object referencec
 */
package com.impetusits;

/**
 *
 * @author Akash
 */
import java.awt.Point;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        array_of_strings_demo();
        createArrayOfClassType();
        defineAndInitializeArray();
        specifyArraySizeDynamically();

    }

    private static void array_of_strings_demo() {
        /*Creates a class type reference called "My_best_friend" */
        String my_best_friend = "Ravi";
        System.out.println("Name : " + my_best_friend);

        /*Creates a reference of array_type called "friends" */
        String[] friends = {"Mandar", "Rajeev", "Shekhar", "Mili"};
        System.out.print("Names of friends : ");
        for (String name : friends) {
            System.out.print(name + ", ");
        }
        System.out.println("");

        friends = new String[4];
        friends[0] = "Sudhir";
        friends[1] = new String("Jitu");

        System.out.print("Names of new friends : ");
        for (String name : friends) {
            System.out.print(name + ", ");
        }
        System.out.println("");
        System.out.println("Number of Friends : "+friends.length);
        System.out.println("Length of first name : "+ friends[0].length());
        String first_friend = friends[0];
        System.out.println("First Name : "+first_friend);
         System.out.println("Length of first name : "+ first_friend.length());
    }

    public static void createArrayOfClassType() {
        /*  Define an array type reference called parr
            referering to array object containing Point class type reference*/
        Point[] parr;

        /* Creates array of class type reference
        Creates an array containing 3 Point class type references*/
        parr = new Point[3];

//        System.out.println("X cordinate of 3rd point : " + parr[2].getX());
        printArray(parr);
        System.out.println(parr[0]);
        /*Create a object of class Point and assign to array elements which 
        are Point class type references*/
        parr[0] = new Point(10, 20);
        parr[1] = new Point(20, 30);
        parr[2] = new Point(40, 50);

        System.out.println("X cordinate of 3rd point : " + parr[2].getX());
        printArray(parr);

    }

    public static void defineAndInitializeArray() {

        Point[] arr = {
            new Point(100, 200),
            new Point(300, 400),
            new Point(500, 600)
        };
        printArray(arr);

        Point p = arr[2];
        System.out.println("Point : " + p);
        System.out.println("X cordinate of 3rd point : " + arr[2].getX());
    }

    private static void printArray(Point[] arrayRef) {
        System.out.println("Inside the function");
        for (Point element : arrayRef) {
            System.out.println(element);
//            element.displayCoordinates();
        }
    }

    public static void specifyArraySizeDynamically() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Points do you want to store ? ");
        int no_of_points = scan.nextInt();
        //createPointArray returns an Array (array type refrerence)
        Point[] arr = createPointArray(no_of_points);
        //Pass array to function
        printArray(arr);
    }

    private static Point[] createPointArray(int size) {
        Point[] array_ref = new Point[size];
        for (int idx = 0; idx < array_ref.length; idx++) {
            array_ref[idx] = new Point(idx + 10, idx + 11);
        }
        return array_ref;
    }
}
