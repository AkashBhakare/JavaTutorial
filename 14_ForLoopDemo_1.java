
package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class ForLoopDemo_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a integer : ");
        int limit = scan.nextInt();
      
        System.out.println("The Integers in acending order in  the range of 1 to "
                + limit + " are");
        
        for (int counter = 1; counter <= limit; ++counter) {
             System.out.println("\t" + counter);
        }
     

        System.out.println("Done with for loop!");

    }
    
}
