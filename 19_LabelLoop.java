
package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class LabelLoop {
    public static void main(String[] args) {
        //doBreak();
        //doBreak1();
        //doContinue();
        //doLabelBreak();
        doLabelContinue();
    }
    
    /*
    Accept an integer and display its digits; perform this operatoin 3 times
    Stop perfroming this operation when digit zero is encountered
    */
    private static void doLabelBreak() {
        final int MAX_TIMES = 3;
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        int num;
        int dig;
        //label for outer loop
        outerLoop:
        do {
            System.out.print("Please enter a integer :");
            num = in.nextInt();
            
            innerLoop: //Label for inner loop
            do {
                dig = num % 10;
                if (dig == 0) {
                    break outerLoop;
//                    Transfers the control outside 
//                    the outer loop
                }
                num = num / 10;
                System.out.println(" Digit = " + dig);
            } while (num > 0); // end of inner loop
            
            cnt++;
        } while (cnt < MAX_TIMES); // end of outer loop
        
        System.out.println("\nThe End!");
    }

    private static void doLabelContinue() {
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            
            innerLoop:
            for (int j = 1; j <= 5; j++) {
                if(j > i){
                    continue outerLoop;
                }
                System.out.print(j + " ");
            }
        }
        
        System.out.println("");
       
    }

    private static void doBreak() {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        int num;
        int dig;

        do {
            System.out.print("Please enter a integer :");
            num = in.nextInt();
            do {
                dig = num % 10;
                System.out.println(" Digit = " + dig);
                num = num / 10;
                if (dig == 0) {
                    break;
//               Transfers the control outside the inner loop
                }
            } while (num > 0); // end of inner loop
            cnt++;
        } while (cnt < 3); // end of outer loop
        System.out.println("\nThe End!");
    }

    private static void doContinue() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    continue;
                }
                System.out.print(j + " ");
            }
        }
        System.out.println("");
    }

    private static void doBreak1() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            for (int j = 0; j <= 5; j++) {
                if (i == 3) {
                    break;
                }
                System.out.print(" " + j);
            }
        }
        System.out.println("");

    }
    
}
