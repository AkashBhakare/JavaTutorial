
package com.impetusits;

import java.util.Arrays;


/**
 *
 * @author Akash
 */
public class ArrayPassingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        double[] arr = {2.3, 5.6, 7.9, 66.7, 1.2, 1.3};

        System.out.println("Contents = " + Arrays.toString(arr));
//        Arrays.asList(arr).stream().forEach(System.out::println);

//        printMin(arr);
//         System.out.println("Contents = " + Arrays.toString(arr));
//        printMin(4.5, 6.7, 7.1, 2.1, 6.7); // Error
        printMax( 34, 3, 3, 2.1, 67.7, 7.1, 4.6);
        printMax(arr);
    }

    private static void printMin(double[] numbers) {
        //if array is empty
        if (numbers == null) {
            System.err.println("Array is Empty!");
            return;
        }
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Smallest number is " + min);
        numbers[0] = 99999.99;
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.err.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
