/*
 Understanding array of primitive types
 */
package com.impetusits;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akash
 */
class X{
    public int[] array_ref; // array type reference as class field (instance data)
}

public class ArraySinglePrimitive {

    private final static Scanner scan = new Scanner(System.in);
    //Array type reference
    private static int[] marks;

    public static void main(String[] args) {
        understand_default_value();
        int no_student;
        no_student = askForStudentCount();
        //create array object
        marks = createArrayOfMarks(no_student);
        displayMarks(no_student);
        acceptMarks();
        showMarks();
        printMarks();
        util_array_demo();
        printWorstPerformers(3);
        printWorstPerformer(5);
        printTopPerformers(5);
    }

    private static void util_array_demo() {
        System.out.println("Marks : " + marks);
        System.out.println("Marks : " + marks.toString());
        System.out.println("Marks : " + Arrays.toString(marks));
        Arrays.sort(marks);
        System.out.println("Marks : " + Arrays.toString(marks));

    }
    
    
    private static void understand_default_value() {
           X a = new X();
           System.out.println("Array Reference which is field of class X  = " 
                   + a.array_ref);

            /*Array type reference local to the function
             Local variables do not have default values
             Local variables need to be initialized
           */
            int [] array_ref ; 
         //   System.out.println("Array reference = "+ array_ref);
            }
    
    public static int askForStudentCount() {
        System.out.print("Please enter number of Students:");
        int no_student = scan.nextInt();
        return no_student;
    }

    /*
    Creates an array object and returns its reference
     */
    private static int[] createArrayOfMarks(int no_students) {
       return new int[no_students];
        
    }

    private static void displayMarks(int no_student) {
        System.out.println("The marks are :");
        for (int i = 0; i < no_student; i++) {
            System.out.println("Marks = " + marks[i]);
        }
    }

    private static void acceptMarks() {
        for (int i = 0; i < marks.length; ++i) {
            System.out.print("Please enter the marks of student no." + (i + 1) + ":");
            marks[i] = scan.nextInt();
        }
    }

    private static void showMarks() {
        System.out.println("The marks are :");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks = " + marks[i]);
        }
    }

    private static void printMarks() {
        System.out.println("The marks are :");
        //for each loop
        for (int element : marks) {
            System.out.println("Marks = " + element);
        }
    }

    private static void printWorstPerformers(int numberOfStudent) {
        Arrays.sort(marks);
        System.out.println("Worst performers are:");
        if (numberOfStudent <= marks.length) {
            for (int i = 0; i < numberOfStudent; i++) {
                System.out.println(marks[i]);
            }
        } else {
            System.err.println("Numbers of students are less");
        }

    }

    private static void printWorstPerformer(int numberOfStudent) {
        Arrays.sort(marks);
        int[] wrostPerformers = Arrays.copyOf(marks, numberOfStudent);
        System.out.println(Arrays.toString(wrostPerformers));
    }

    private static void printTopPerformers(int numberOfStudent) {
        Arrays.sort(marks);
        System.out.println("Top performers are:");
        int[] topPerformers = Arrays.copyOfRange(marks,
                (marks.length - numberOfStudent),  marks.length);
        System.out.println(Arrays.toString(topPerformers));
  
    }


}
