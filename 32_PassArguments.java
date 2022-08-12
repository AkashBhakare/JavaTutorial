package com.impetusits;

/**
 *
 * @author Akash
 */
public class PassArguments {
    
    public static void changeVal(int x) {
        x = 99;

    }

    public static void displayVal(int x) {
        System.out.println("Value of num = " + x);

    }

    public static void changeObjRef(DateClass obj) {
        obj = new DateClass(13, 8, 2009);

    }

    public static void changeObjAttr(DateClass obj) {
        int day = 30;
        obj.setDay(day);

    }

    public static void main(String[] args) {
        int num = 19;
        displayVal(num);
        changeVal(num);
        displayVal(num);

        DateClass today = new DateClass(12, 7, 2008);
        today.displayDate();
        changeObjRef(today);
        today.displayDate();

        today.displayDate();
        changeObjAttr(today);
        today.displayDate();

    }
    
}
