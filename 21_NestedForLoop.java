
package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class NestedForLoop {
/*Print all Prime Numbers in the range of 1 to n*/
    public static void main(String[] args) {
        boolean is_factor_found;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer : ");
        int limit = scan.nextInt();
        System.out.println("Prime numbers in the range of 1 to " + limit + " are :");
        for (int number = 1; number <= limit; ++number) {
            is_factor_found = false; //reset the false for every new number
            for (int counter = 2; counter <= (int) Math.sqrt(number); ++counter) {
                if (number % counter == 0) {
                    is_factor_found = true;
                    break;
                }
            }
            if (is_factor_found == false) {
                System.out.println("Number " + number + " is Prime");
            }
        }
    }
}
