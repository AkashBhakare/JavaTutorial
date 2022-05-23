package com.impetusits;

/**
 *
 * @author Akash
 */
public class bitwisedemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        print();
        compliment(); // ~
        bitAnd(); // &
        bitOr(); // |
        shiftLeft(); // <<
        shiftRight(); // >> 
        zeroRightShift(); // >>>
        bitXor(); // ^
        positiveRightShift();

    
    }
    
    private static void compliment() {
        /*
         a = 10;   00001010
         a = ~a;   11110101 
         */
        int a = 15;
        System.out.println("Original Value of a = " + a);
        System.out.println("Binary = " + Integer.toBinaryString(a));
        a = ~a;
        System.out.println("Later Value of a = " + a);
        System.out.println("Binary = " + Integer.toBinaryString(a));
        //Byte b;
    }

    private static void bitAnd() {
        /* 1) check the bit state
        
         bit position 5
         a = 100     01100100
         b = 16      00010000
         ----------
         c = a & b;  00000000
        
         */
        int a = 100;
        int bitpos = 5;
        int b = (int) Math.pow(2, (bitpos - 1));
        int c = a & b;
//        if (c == b) { //(c!=0)
//            System.out.println(" The bit is on");
//        } else {
//            System.out.println(" The bit is off");
//        }

        /*      
         2) Turn off the bit
         bit position to turn off : 6
         a = 100     01100100
         b =         11011111
         ----------
         a = a & b;  01000100
        
         b = 2$5 32  00100000
         b = ~b;     11011111
         */
        a = 100;
        bitpos = 6;
        b = (int) Math.pow(2, bitpos - 1);
        b = ~b;
        System.out.println("Original Value of a = " + a);
        System.out.println("binary = " + Integer.toBinaryString(a));
        a = a & b;

        System.out.println("binary = " + Integer.toBinaryString(a));
        System.out.println("Later Value of a = " + a);
    }

    private static void bitOr() {
        /*
         1) Turn a bit on
         bit position to turn on = 4
         b = 2$(bitpos -1)
        
         a = 100;       01100100
         b = 8;         00001000  
         ____________
         a = a | b;     01101100
         */
        int bitPos = 4;
        int a = 100;
        int b = (int) Math.pow(2, bitPos - 1);

        System.out.println("Original Value of a = " + a);
        System.out.println("binary = " + Integer.toBinaryString(a));
//        a = a | b;
//        System.out.println("Later Value of a = " + a);
//        System.out.println("binary = " + Integer.toBinaryString(a));

        /*
         2) Check bit status
         bitpos  = 5
         a = 100;       01100100
         b = 16         00010000  
         ____________
         c = a | b;     01110100

        if ( c == a )
            on
        else
            off

         bitpos  = 6
         a = 100;       01100100
         b = 32         00100000  
         ____________
         c = a | b;     01100100
        
         */
        a = 100;
        bitPos = 6;
        b = (int) Math.pow(2, bitPos - 1);
        int c = a | b;
        if (c == a) {
            System.out.println(" The bit is on");
        } else {
            System.out.println(" The bit is off");
        }
        System.out.println("Binary Representation :"+Integer.toBinaryString(c));
    }

    private static void print() {
        int a = 1000;
        System.out.println("Decimal = " + Integer.toString(a));
        System.out.println("Binary = " + Integer.toBinaryString(a));
        System.out.println("Hex = " + Integer.toHexString(a));
        System.out.println("Octal = " + Integer.toOctalString(a));

    }

    private static void shiftLeft() {
        int a = 1;
        System.out.println("Binary = "
                + Integer.toBinaryString(a)
                + "\tDecimal = " + a);
        //max 31 bits since 1 bit is reserved for sign
        int pos = 33;
        a = a << pos;
        System.out.println("Binary = "
                + Integer.toBinaryString(a)
                + "\tDecimal = " + a);
    }

    private static void shiftRight() {
        int a = -10;
        System.out.println("Binary = "
                + Integer.toBinaryString(a)
                + "\tDecimal = " + a);
        a = a >> 2;
        System.out.println("Binary = "
                + Integer.toBinaryString(a)
                + "\tDecimal = " + a);

    }

    private static void zeroRightShift() {
        int a = -10;
        System.out.println("Binary = "
                + Integer.toBinaryString(a) + "\tDecimal = " + a);
        a = a >>> 1;
        System.out.println("Binary = " + Integer.toBinaryString(a)
                + "\tDecimal = " + a);
    }

    private static void bitXor() {
        /*
         Toggle the bit status
         */
        int a = 10;
        int pos = 3;

        System.out.println("Binary = "
                + Integer.toBinaryString(a)
                + "\tDecimal = " + a);
        int b = (int) Math.pow(2, pos - 1);
        a = a ^ b;

        System.out.println("Binary = "
                + Integer.toBinaryString(a)
                + "\tDecimal = " + a);
    }

     private static void positiveRightShift() {
        int i = -10;
        i = (i >>> 1);
        System.out.println("i = " + i);
    }
    
}
