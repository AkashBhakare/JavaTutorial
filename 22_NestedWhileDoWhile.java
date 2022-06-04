package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class NestedWhileDoWhile {
/*Accept a integer and display its reverse continue the process till 
      a palindorme is not encountered
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        long reverse;
        do {
            System.out.print("Please enter an integer : ");
            number = scan.nextInt();
            int t_number = number;
            reverse = 0;
            while (t_number != 0) {
                int digit = t_number % 10;
                reverse = (reverse * 10) + digit;
                t_number = t_number / 10;
            }
            System.out.println("Reverse of " + number + " = " + reverse);
        } while (number != reverse);
    }
    
}
