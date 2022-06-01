package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class ContinueDemo {
    public static void main(String[] args) {
       //unlabelled_continue_1();
       unlabelled_continue_2();
    }
    
    /*
    Accept an alphabet and check whether its vowel or Consonant
    Contiune this process for 3 alphabets
     */
    private static void unlabelled_continue_1() {
        final int MAX_TIMES = 3;
        int alpha_counter = 1;
        Scanner scan = new Scanner(System.in);
        do {
//            String alpha =  scan.next();
//            char alphabet = alpha.charAt(0);
            System.out.print("Please enter a Alphabet : ");
            char alphabet = scan.next().charAt(0);
            if (Character.isAlphabetic(alphabet)) {
                switch (Character.toLowerCase(alphabet)) {
                    case 'a','e','i','o','u' ->
                        System.out.println("'" + alphabet + "' is a Vowel");
                    default ->
                        System.out.println("'" + alphabet + "' is a Consonant");
                }
                alpha_counter++;
            }

        } while (alpha_counter <= MAX_TIMES);
    }

    private static void unlabelled_continue_2() {
        final int MAX_TIMES = 3;
        int alpha_counter = 1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Please enter a Alphabet : ");
            char alphabet = scan.next().charAt(0);
            if (!Character.isAlphabetic(alphabet)) {
                System.err.println("entered Character '"+alphabet+"' isnot a alphabet!");
                continue;
            }
            switch (Character.toLowerCase(alphabet)) {
                case 'a','e','i','o','u' ->
                    System.out.println("'" + alphabet + "' is a Vowel");
                default ->
                    System.out.println("'" + alphabet + "' is a Consonant");
            }
            alpha_counter++;

        } while (alpha_counter <= MAX_TIMES);
    }
    
}
