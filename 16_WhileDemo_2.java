/*
Accept an integer and display its square if its even and cube if its odd
Stop the process only when user enters zero
 */


package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class WhileDemo_2 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        while (true) {  //infinite loop
            System.out.print("Please enter a integer : ");
            number = scan.nextInt();

            if (number == 0) { //condition to exit the loop
                break; //transfers the control to the next statement after the body of the loop
            }
            /*
            when the remainder operation returns a nonzero
            result, it has the same sign as its left operand
            */
            if (number % 2 == 0) {
                System.out.println("Square of even number " + number
                        + " is = " + ((long)number * number));
            } else {
                System.out.println("Cube of odd number " + number
                        + " is = " + ((long)number * number * number));
            }
        }
        System.out.println("Finished with the operation!");
    }
}
