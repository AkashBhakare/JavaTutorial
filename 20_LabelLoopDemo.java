/*
 Labelled Statement with continue
 */
package com.impetusits;

/**
 *
 * @author Akash
 */
public class LabelLoopDemo {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        int numOfRows = 5;
        outer:
        for (row = 1; row <= numOfRows; row++) {
            System.out.print(" ");
            inner:
            for (col = 1;col <= numOfRows;col++) {
                if (row == col)  {
                    break outer;
                }
                System.out.println(" "+col);
            } //end of inner for loop
           
        } //end of outer for loop
        System.out.println("\nThe End");
        
    } //end of main()
    
} // end of the class definition
