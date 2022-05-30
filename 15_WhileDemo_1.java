package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class WhileDemo_1 {
    /**
     * Print all integers in the range of 1 to n
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a integer : ");
        int limit = scan.nextInt();
        int counter = 1;
        System.out.println("The Integers in acending order in  the range of 1 to "
                +limit+" are");
        
        while (counter <= limit) {
            System.out.println("\t"+counter);
            ++counter;
        }
        
        System.out.println("Done!");
    }
    
}
