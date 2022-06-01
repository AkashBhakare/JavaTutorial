package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class BreakDemo {
public static void main(String[] args) {
        //unlabelled_break_1();
        //unlabelled_break_2();
        //unlabelled_break_3();
        unlabelled_break_4();
    }
    
    /*
      Accept a integer and display its square
      Stop this operation only whne user enters zero
     */
    private static void unlabelled_break_1() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a integer to calculate its square or enter 0 to stop : ");
            int number = scan.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println("Square of " + number + " is " + (number * number));

        }
        System.out.println("That's all Folks!");
    }

    /*
    Check if the given number is prime
     */
    private static void unlabelled_break_2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Integer to check whether it's a Prime number : ");
        int number = scan.nextInt();
        int factor_counter = 0;

        for (int counter = 1; counter <= number; ++counter) {
            if (number % counter == 0) {
                ++factor_counter;
            }
        }
        if (factor_counter <= 2) {
            System.out.println("The number " + number + " is Prime");
        } else {
            System.out.println("The number " + number + " NOT is Prime");
        }
    }

    private static void unlabelled_break_3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Integer to check whether it's a Prime number : ");
        int number = scan.nextInt();
        boolean is_factor_found = false;

        for (int counter = 2; counter <= (number / 2); ++counter) {
            if (number % counter == 0) {
                is_factor_found = true;
                break;
            }
        }
        if (is_factor_found) {
            System.out.println("The number " + number + " NOT is Prime");
        } else {
            System.out.println("The number " + number + " is Prime");
        }
    }

    private static void unlabelled_break_4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Integer to check whether it's a Prime number : ");
        int number = scan.nextInt();
        boolean is_factor_found = false;

        int sqroot = (int) Math.sqrt(number);

        for (int counter = 2; counter <= sqroot; ++counter) {
            if (number % counter == 0) {
                is_factor_found = true;
                break;
            }
        }
        if (is_factor_found) {
            System.out.println("The number " + number + " NOT is Prime");
        } else {
            System.out.println("The number " + number + " is Prime");
        }
    }
}
