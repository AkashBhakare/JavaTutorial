/*
Understand how array of primitive types are created and accessed
 */
package com.impetusits;
/*
This class contains various methods for manipulating arrays 
(such as sorting and searching). 
This class also contains a static factory that allows arrays to be viewed as lists.
*/
import java.util.Arrays;


/**
 *
 * @author Akash
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Creates an array type reference 
        int[] arrayRef = null;
        System.out.println("Array reference = " + arrayRef);
        final int SIZE = 5;
//        Creates an array object
        arrayRef = new int[SIZE];
        System.out.println("Array reference = " + arrayRef);
//        int a;
//        arrayRef = new int [a=5];
        displayArray(arrayRef);
        displayArray(arrayRef);

        storeValues(arrayRef);
        showArray(arrayRef);
        displayArray(arrayRef);
        printArray(arrayRef);
        printArrayContent(arrayRef);
    }

    private static void displayArray(int[] arrRef) {
        System.out.println("Contents of the array (Traditional For loop)");
        for (int i = 0; i < arrRef.length; i++) {
            System.out.println(arrRef[i]); // Read
            arrRef[i] = i + 55;   //Write
        }
    }

    private static void storeValues(int[] arr) {
        //arr.length = 44;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;  //write to array
        }
    }

    private static void showArray(int[] arr) {
        System.out.println("Contents of the array (For Each Loop)");
        for (int element : arr) {
            System.out.println(element);
            element = 99; //will not change the content of array
     //       System.out.println(element);
        }
        System.out.println("");
    }

    private static void printArray(int[] arr) {
        System.out.println("Contents of the array ");
        System.out.println(Arrays.toString(arr));
        System.out.println("");
    }

    private static void printSquare(int a) {
        System.out.println(a * a);
    }

    //Functional Programming
    private static void printArrayContent(int[] arrayRef) {
        System.out.println("Content of array using Stream");
        Arrays.stream(arrayRef).forEach(System.out::println);
       // Arrays.stream(arrayRef).forEach(ArrayDemo::printSquare);
    }

}
