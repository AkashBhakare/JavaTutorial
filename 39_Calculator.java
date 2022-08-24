package com.impetusits;

/**
 *
 * @author Akash
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int EXPECTED_NUMBER_ARGS = 3;
        if (args.length != EXPECTED_NUMBER_ARGS) {
            System.err.println("Incorrect number of arguments supplied");
            System.err.println("Usage : java Calculater <value1> operator <value2>");
            System.exit(1);
        }
        try {
            float args1 = Float.parseFloat(args[0]);
            float args2 = Float.valueOf(args[2]);
            System.out.println("Sign"+ args[1].charAt(0));
            char op = args[1].charAt(0);
            var result = switch (op) {
                case '+' ->
                    args1 + args2;
                case '-' ->
                    args1 - args2;
                case 'x' ->
                    args1 * args2;
                case '/' ->
                    args1 / args2;
                case '%' ->
                    args1 % args2;

                default ->
                    "Unknown Operators";
            };
            System.out.println(args1 + " " + op + " " + args2 + " = " + result);
        } catch (NumberFormatException nfe) {
            System.out.println("Input format is invalid : " + nfe.getMessage());
        }
    }

}
