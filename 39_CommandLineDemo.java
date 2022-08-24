package com.impetusits;

/**
 *
 * @author Akash
 */
public class CommandLineDemo {

    public static void main(String[] args) {
        // System.out.println("args    : "+ args);
        // System.out.println("args[0] : "+ args[0]);
        // System.out.println("args[1] : "+ args[1]);
        for (int idx = 0; idx < args.length; ++idx) {
            System.out.println("args[" + idx + "] = " + args[idx]);
        }

        for (String element : args) {
            System.out.println(element);
        }
    }
}
