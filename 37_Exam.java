
package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] marks;
        int numberOfStudents = getStudentCount();
        marks = createArray(numberOfStudents);
        acceptMarks(marks);
        displayMarks(marks);
        printMarks(marks);
    }

    private static void acceptMarks(int[][] mark) {
        /* would like to store marks of n students in varing no. of subject  */
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < mark.length; i++) {
            System.out.print("Enter number of subject for student no:" + (i + 1) + " :");
            int no_subject = scan.nextInt();
//            Create a array object containing integers
            mark[i] = new int[no_subject];
            
            // Accept marks of  student
            for (int j = 0; j < mark[i].length; j++) {
                System.out.print("Enter Marks in subject no " + (j + 1) + ":");
                mark[i][j] = scan.nextInt();

            }
        }

    }

    private static void printMarks(int[][] mark) {
        /*For each element of array_type_reference in mark*/
        for (int[] student : mark) {
            System.out.println("Marks :");
            for (int subject : student) {
                System.out.print(subject + ",");
            }
            System.out.println("");
        }
    }

    private static void displayMarks(int[][] marks) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student No " + (i + 1));
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("\tMarks = " + marks[i][j]);
            }
        }
    }

    private static int getStudentCount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Students :");
        int no_student = scan.nextInt();
        return no_student;
    }

    private static int[][] createArray(int numberOfStudents) {
        //Returns an array object containing numberOfStudents array type ref
        return (new int[numberOfStudents][]);

    }

}
