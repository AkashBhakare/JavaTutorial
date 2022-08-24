/*
 Understand usefulness of Wrapper classes
 */
package com.impetusits;

/**
 *
 * @author Akash
 */
public class WrapperClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        check_integer_attributes();
//        conversion_demo();  //String ot int
//        to_string_demo();     //int to String
        comparision_demo();

    }

    private static void check_integer_attributes() {
        System.out.println("Largest Integer  : " + Integer.MAX_VALUE);
        System.out.println("Smallest Integer : " + Integer.MIN_VALUE);
        System.out.println("Integer Size     : " + Integer.SIZE + " Bits");
        System.out.println("Type             : " + Integer.TYPE);
    }

    private static void conversion_demo() {
        String data = "12";
        //Invokes String.valueof(10) to convert the 10 to string before concatenation
        System.out.println("12 + 10 = " + (data + 10));

        //conversion of String to int
        System.out.println("12 + 10 = " + (Integer.parseInt(data) + 10));
        System.out.println("12 + 10 = " + (Integer.valueOf(data) + 10));
        System.out.println("12 + 10 = " + (Integer.decode(data) + 10));

        data = "0144"; //Oct
        System.out.println("100 + 10 = " + (Integer.parseInt(data) + 10)); //incorrect
        System.out.println("100 + 10 = " + (Integer.parseInt(data, 8) + 10)); //Correct
        System.out.println("100 + 10 = " + (Integer.valueOf(data) + 10)); // incorrect
        System.out.println("100 + 10 = " + (Integer.valueOf(data, 8) + 10)); // incorrect
        System.out.println("100 + 10 = " + (Integer.decode(data) + 10));

        data = "64"; //Hex
        System.out.println("100 + 10 = " + (Integer.parseInt(data) + 10)); //Incorrect
        System.out.println("100 + 10 = " + (Integer.parseInt(data, 16) + 10)); //Correct
        System.out.println("100 + 10 = " + (Integer.valueOf(data) + 10)); // incorrect
        System.out.println("100 + 10 = " + (Integer.valueOf(data, 16) + 10)); // incorrect
        data = "0x64"; //Hex
        System.out.println("100 + 10 = " + (Integer.decode(data) + 10));
    }

    private static void to_string_demo() {
        int data = 255;
//      String str = data;
        String str = String.valueOf(data);
        System.out.println("str = " + str);
//      Returns a String object representing this Integer's value.
        System.out.println("Decimal representation    : " + Integer.toString(data));
//      Returns a string representation of the integer argument as an unsigned integer in base 2.
        System.out.println("Binary representation     : " + Integer.toBinaryString(data));
//      Returns a string representation of the integer argument as an unsigned integer in base 8.
        System.out.println("Octal  representation     : " + Integer.toOctalString(data));
//      Returns a string representation of the integer argument as an unsigned integer in base 16.
        System.out.println("Hexadecimal representation: " + Integer.toHexString(data));

        System.out.println("Binary representation +255: " + Integer.toBinaryString(255));
        System.out.println("Binary representation ~255: " + Integer.toBinaryString(~255));
        System.out.println("Binary representation -255: " + Integer.toBinaryString(-255));
        //Returns a string representation of the argument as an unsigned decimal value.
        System.out.println("Unsigned representation   : " + Integer.toUnsignedString(255));
        System.out.println("Unsigned representation   : " + Integer.toUnsignedString(-255));
    }

    private static void comparision_demo() {
        int num1 = 1;
        int num2 = -1;
        //signed comparasion
        String result = (num1 == num2) ? "$Same" : "$Different";
        System.out.println("Result : " + result);
        //un-signed comparasion
        result = (Math.abs(num1) == Math.abs(num2)) ? "~Same" : "~Different";
        System.out.println("Result : " + result);

//      negative int values are mapped to a long value equal 
//      to the input plus 2^32
        System.out.println("Value = " + Integer.toUnsignedLong(num2));

        if (Integer.toUnsignedLong(num2) == Integer.toUnsignedLong(num1)) {
            System.out.println("#Same");
        } else {
            System.out.println("#Different");
        }

        result = Integer.compareUnsigned(num1, num2) == 0 ? "@Same" : "@Different";
        System.out.println("Result : " + result);
    }

}
