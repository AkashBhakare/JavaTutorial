package com.impetusits;

/**
 *
 * @author Akash
 */
public class SwitchCaseDemo {

    public static void main(String[] args) {
     // demonstrateTraditionalSwitchStatement();
     // demonstrateEnhancedSwitchStatement();
     // demonstrateSwitchExpressionWithBreaks();
     // demonstrateSwitchExpressionWithArrows();
     // demonstrateSwitchExpressionWithMultipaleLabel();
     // demonstrateSwitchExpressionString();
      demonstrateSwitchExpressionWithYield();
    }
    public static void demonstrateTraditionalSwitchStatement() {
        System.out.println("Traditional Switch Statement:");
        final int integer = 2;
        String numericString;
        switch (integer) {
            case 1:
                numericString = "one";
                break;
            case 2:
                numericString = "two";
                break;
            case 3:
                numericString = "three";
                break;
            default:
                numericString = "N/A";
        }
        System.out.println("\t" + integer + " ==> " + numericString);
    }

    /**
     * Demonstrate enhanced switch statement used to assign a local variable.
     */
    public static void demonstrateEnhancedSwitchStatement() {
        System.out.println("Enhanced Switch Statement:");
        final int integer = 1;
        String numericString;
        switch (integer) {
            case 1 -> {
                numericString = "one";
                System.out.println("I am here! One");
            }

            case 2 ->
                numericString = "two";
            case 3 ->
                numericString = "three";
            default ->
                numericString = "N/A";
        }
        System.out.println("\t" + integer + " ==> " + numericString);
    }

    /**
     * Demonstrate switch expression using colons and breaks.
     */
    /*
   public static void demonstrateSwitchExpressionWithBreaks() {
        final int integer = 1;
        System.out.println("Switch Expression with Colons/Breaks:");
        final String numericString = switch (integer) {
            case 1:
                break "one";
            case 2:
                break "two";
            case 3:
                break "three";
            default:
                break "N/A";
        };
        System.out.println("\t" + integer + " ==> " + numericString);
    }
   *
    /**
     * Demonstrate switch expressions using "arrow" syntax.
     */
    public static void demonstrateSwitchExpressionWithArrows() {
        final int integer = 12;
        System.out.println("Switch Expression with Arrows:");
        var result = switch (integer) {
            case 1 ->
                "one";  //String
            case 2 ->
                89.9F;  //Float
            case 3 ->
                3 + 3;  //Integer
            case 4 ->
                4.0;    //double
            default ->
                "N/A";  //String
        };

        System.out.println("\t" + integer + " ==> " + result);
    }

    private static void demonstrateSwitchExpressionWithMultipaleLabel() {
        final int integer = 7;
        System.out.println("Switch Expression with Muliple Label:");
        var result = switch (integer) {
            case 1,3,7 -> 
                "odd";
            case 2,4,6,8 ->
                "even";
            default ->
                "N/A";
        };
        System.out.println("\t" + integer + " ==> " + result);
    }

    private static void demonstrateSwitchExpressionString() {
        final String country = "India";
        System.out.println("Switch Expression with String:");
        final String result = switch (country.toUpperCase()) {
            case "INDIA", "BRAZIL", "RUSSIA" , "CHINA" ->
                "BRIC Country";

            default ->
                "Not a BRIC Country";
        };
       
        System.out.println("\t" + country + " ==> " + result);
    }

    //    Expression label of ‘case L -> expression;
    private static void demonstrateSwitchExpressionWithYield() {
        int x = 5;
        var result = switch (x) {
            case 1,2,3,4,5 -> {
                double sqr  = x * x;
                yield sqr;

            }
            case 6,7,8,9,10 -> {
                double root = Math.sqrt(x); 
                yield root;
            }
            default -> {yield 0;}
        };
        System.out.println("Result : " + result);
    }
}
