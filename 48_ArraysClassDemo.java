/*
 * Understanding Arrays class
 */
package com.impetusits;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class ArraysClassDemo {

    public static void main(String[] args) {
        // array_comparision();
        // printing_array_content();
        // array_copy_demo();
        // arrayClassBasic();
        // sort();

        // sort_partial();
        // searching();
        // parallel_prefix_demo();
         fill_set_demo();
    }

    private static void array_comparision() {
        int[] a = {1, 12, 33, 4, 5};
        int[] b = a;

        if (a == b) {
            System.out.println("Equal a&b");
        } else {
            System.out.println("Different a&b");
        }
        System.out.println(a + ", " + b);

        int[] c = {1, 12, 33, 4, 5};

        if (a == c) {
            System.out.println("Equal a&c");
        } else {
            System.out.println("Different a&c");
        }
        System.out.println(a + ", " + c);

//      Arrays.equals(T[],T[]);
//      Compares the contents of two arrays instead of
//      their references, returns boolean value
        if (Arrays.equals(a, c)) {
            System.out.println("Equal a&c");
        } else {
            System.out.println("Different a&c");
        }

        int[][] m1 = {{2, 3, 5}, {4, 5, 6}};
        int[][] m2 = {{2, 3, 5}, {4, 5, 6}};

        /*Comparison of two dimensional arrays using == operator*/
        System.out.println("While comparing 2D array using == operator");
        if (m1 == m2) {
            System.out.println("\tBoth the matrices are identical");
        } else {
            System.out.println("\tBoth the matrices are not identical");
        }

        /*Comparison of two dimensional arrays using equals method*/
        System.out.println("While comparing 2D array using equals() method");
        if (Arrays.equals(m1, m2)) {
            System.out.println("\tBoth the matrices are identical");
        } else {
            System.out.println("\tBoth the matrices are not identical");
        }

        /*Comparison of multidimensional dimensional arrays using deepequals method*/
        System.out.println("While comparing multidimensional array using deepequals() method");
        if (Arrays.deepEquals(m1, m2)) {
            System.out.println("\tBoth the matrices are identical");
        } else {
            System.out.println("\tBoth the matrices are not identical");
        }

    }

    private static void printing_array_content() {
        int[] array = {12, 45, 67, 78, 89, 99};

        //Method-I
        System.out.println("Printing 1D array content using range based for loop");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("");

        //Method-II
        System.out.println("Printing 1D array content using Arrays Class");
        System.out.println(Arrays.toString(array));

        int[][] matrix = {{2, 4, 6}, {3, 6, 8}, {5, 8, 2}};
        System.out.println("Printing multidimensional array content using toString() from Arrays Class");
        /*Prints the content of the array referred to by matrix
        matrix is pointing to array object containing 3 array type references */
        System.out.println(Arrays.toString(matrix));

        System.out.println("Printing multidimensional array content using toString() from Arrays Class");
        /*Prints the content of the array referred to by matrix
        matrix is pointing to array object containing 3 array type references */
        System.out.println(Arrays.toString(matrix));

        /*Returns a string representation of the "deep contents" of the specified array.*/
        System.out.println("Printing multidimensional array content using deepToString() from Arrays Class");
        System.out.println(Arrays.deepToString(matrix));

        /*using the stream Api*/
        System.out.println("Printing 1D array content using stream() from Arrays Class");
        //method reference of 
        Arrays.stream(array).forEach(System.out::println);

        //method reference of user defined method
        Arrays.stream(array).forEach(ArraysClassDemo::print);
        System.out.println("");

        Arrays.stream(array).forEach(element -> System.out.print(element + ", ")); // Lambda
        System.out.println("");
    }

    private static void print(int element) {
        System.out.print(element + ", ");
    }

    private static void array_copy_demo() {
        int[] src = {2, 5, 7, 8, 9, 12};
        print_array(src, "Source Array");

        int[] dest = new int[src.length];
        print_array(dest, "Destination Array Before copying");

        /*Copy array manually */
        for (int idx = 0; idx < src.length; idx++) {
            dest[idx] = src[idx];
        }
        print_array(dest, "Destination Array After copying manually");

        /*Using Arrays class copyof()*/
        dest = Arrays.copyOf(src, src.length);
        print_array(dest, "Destination Array After copying using Arrays.copyof() ");

        dest = Arrays.copyOf(src, 3);
        print_array(dest, "Destination Array After copying 3 elements using Arrays.copyof() ");

        /*Creates a destination array of the specified length and then copies the 
          content from src  */
        dest = Arrays.copyOf(src, 10); // count is more than the src.length
        print_array(dest, "Destination Array After copying 10 elements using Arrays.copyof() ");

        int[] src_array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] dest_array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        print_array(src_array, "Source Array");
        print_array(dest_array, "Destination Array");

        System.arraycopy(src_array, 3, dest_array, 0, 5);
        print_array(dest_array, "Copy 5 elements from src starting from position 3 and "
                + " store them into dest starting from position 0 ");

        /*Copies the specified range of the specified array into a new array*/
        int from = 3;
        int to = 7;
        /* from is inclusive whereas to is exclusive*/
        dest_array = Arrays.copyOfRange(src_array, from, to);
        print_array(dest_array, "Copying range of element using copyOfRange()");

    }

    private static void print_array(int[] src, String message) {
        System.out.println(message);
        Arrays.stream(src).forEach(element -> System.out.print(element + ", "));
        System.out.println("");
    }

    private static void arrayClassBasic() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Array content :" + Arrays.toString(arr));

        int[] a = {1, 12, 33, 4, 5};
        int[] b = a;

        if (a == b) {
            System.out.println("Equal");
            System.out.println(a + ", " + b);
        } else {
            System.out.println("Different");
        }

        b = new int[a.length];
//      Such  Manual copying should be avoided
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
//      Compares references and not the content
        if (a == b) {
            System.out.println("Equal");
            System.out.println(a + ", " + b);
        } else {
            System.out.println("Different");
            System.out.println(a + ", " + b);
        }

//      Arrays.equals(T[],T[]);
//      Compares the contents of two arrays instead of
//      their references, returns boolean value
//        b[0] = 77;
        System.out.println(a + ", " + b);
        if (Arrays.equals(a, b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Different");
        }

//      Arrays.toString(T[]) 
//      returns the string equivalent of the contents of the array
        System.out.println("a :" + Arrays.toString(a));
        System.out.println("b :" + Arrays.toString(b));

//      Arrays.copyOf(src_Array, number_of_elements_to_copy)
//      copyOf() returns a new array object containing
//      specified number of elements from source array
        int[] c = Arrays.copyOf(a, a.length);
        System.out.println("a : " + a);
        System.out.println("c : " + c);
        System.out.println("c : " + Arrays.toString(c));

//      Arrays.copyOfRange(src, from, to)
//      src : source array
//      from : index position to begin copy (inclusive)
//      to : index of the last element to copy(exclusive)
        c = Arrays.copyOfRange(a, 1, 4);
        System.out.println("c : " + Arrays.toString(c));
        System.out.println("c =" + System.identityHashCode(c));
        c = Arrays.copyOf(a, a.length);
        System.out.println("c =" + System.identityHashCode(c));

//      Arrays.sort(T[]) :
//      sorts the array in ascending order
        Arrays.sort(a);
        System.out.println("Contents After Sorting:\n"
                + Arrays.toString(a));

//      Arrays.binarySearch( array, element_to_be_searched)
//      returns the index of the element if it is found 
//      or -1 if search fails
        int pos = Arrays.binarySearch(a, 33);
        System.out.println("pos " + pos);

//      Arrays.fill(array, value_to_be_filled)
//      fills all positions in the array with the specified value
        Arrays.fill(a, 99);

        System.out.println("a : " + Arrays.toString(a));

//      Arrays.fill(array, starting_index, end_index, value)
//      starting_index is inclusive,
//      end_index is exclusive
//      value is the data used to fill the arrays
        Arrays.fill(a, 2, 4, 5);
        System.out.println("a : " + Arrays.toString(a));
        c = new int[10];
        Arrays.fill(c, 55);
        int[] d = {10, 20, 30, 40, 50};

//      System.arraycopy(src, start_copying_from, dest,
//                  start_storing_in_dest_from_position,
//                  number_of_values_to_copy_from_src)
        System.arraycopy(d, 2, c, 1, 3);
        System.out.println("C:" + Arrays.toString(c));
    }

    private static void sort() {
        Random randomGenerator = new Random();
        randomGenerator.setSeed(System.currentTimeMillis());
        final int SIZE = 1000_000_00;

//        int[] array1 = new int[SIZE];
//        
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = randomGenerator.nextInt();
//        }
//        System.out.println("Regular Sorting");
//        long startTime = System.currentTimeMillis();
//        print_array(array1, "Before Sorting");
//        Arrays.sort(array1);
//        print_array(array1, "After Sorting");
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time take in serial: " + (endTime - startTime) / 1000.0);
//        array1 = null;
        int[] array2 = new int[SIZE];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = randomGenerator.nextInt();
        }

        System.out.println("Better Sorting");
        long startTime = System.currentTimeMillis();
        Arrays.parallelSort(array2);
        long endTime = System.currentTimeMillis();
        System.out.println("Time take in parallel: " + (endTime - startTime) / 1000.0);
    }

    private static void sort_partial() {
        Random randomGenerator = new Random();
        randomGenerator.setSeed(System.currentTimeMillis());
        final int SIZE = 20;
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt() % 100;
        }

        print_array(array, "Original Array");
        Arrays.sort(array, 0, 10);
        print_array(array, "Sorted Array");
        Arrays.parallelSort(array, 5, 15);
        print_array(array, "Sorted Array");
    }

    private static void searching() {
//      Arrays.binarySearch( array, element_to_be_searched)
//      returns the index of the element if it is found 
//      or -1 if search fails
        int[] array = {1, 4, 2, 6, 8, 34, 56, 7};
        int element_to_search = 7;
        Scanner scan = new Scanner(System.in);

        /*The range must be sorted prior to making this call. 
        If it is not sorted, the results are undefined.      */
        Arrays.sort(array);
        print_array(array, "Sorted array");
        System.out.print("Enter integer to search : ");
        element_to_search = scan.nextInt();
        int pos = Arrays.binarySearch(array, 0, array.length, element_to_search);
        if (pos < 0) {
            System.out.println(element_to_search + " is not present in the array");
        } else {
            System.out.println(element_to_search + " is found at position " + (pos + 1));
        }

    }

    private static void parallel_prefix_demo() {
        int[] array = {2, 3, 4, 5, 6, 7, 8};

        print_array(array, "Original Array");
        // Cumulates, in parallel, each element of the given array in place, 
        // using the supplied function
        Arrays.parallelPrefix(array, (n1, n2) -> n1 + n2);
        print_array(array, "After Applying Parallel Prefix on Array");
        Arrays.parallelPrefix(array, (n1, n2) -> n2 - n1);
        print_array(array, "After Applying Parallel Prefix on Array");
        Arrays.parallelPrefix(array, ArraysClassDemo::multiply);
        print_array(array, "After Applying Parallel Prefix on Array");

    }

    private static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    private static void fill_set_demo() {
        int[] array = new int[20];
        print_array(array, "Initial State of the array");
        /*Assigns the specified int value to each element of the specified array of int.*/
        Arrays.fill(array, 5);
        print_array(array, "After filling  the array");
        /*  Set all elements of the specified array, 
            using the provided generator function to compute each element.*/
        Arrays.setAll(array, (index) -> ((index + 1) * 10));
        print_array(array, "After setting all element in the array");
        Arrays.setAll(array, (index) -> (array[index] + 5));
        print_array(array, "After setting all element in the array");
    }

}
