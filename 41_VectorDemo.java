package com.impetusits;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Akash
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        System.out.println("Size of Vector1= " + v1.size());
        char ch = 'A';
        v1.add(ch);

        v1.add(6.5F);
        int[] arrayRef = {2, 4, 1, 5};
        v1.add(arrayRef);

        System.out.println("Size of Vector1= " + v1.size());
        System.out.println("Capacity of Vector1= " + v1.capacity());

        for (Object element : v1) {
            System.out.println(element);
        }

        System.out.println("1st position :" + v1.elementAt(0));

        System.out.println("Values=" + Arrays.toString(arrayRef));
        Object obj = v1.elementAt(2);
        System.out.println("4th Position :" + obj);
        System.out.println("Values=" + Arrays.toString((int[]) obj));
        Vector v2 = new Vector();
        v2.add("impetus");
        v2.addAll(v1); //add()
        v2.add(1, "Anil");
        v2.add(2, "Jaya");
        Integer iRef = new Integer(4);
        v2.add(iRef);
        System.out.println("V2 size = " + v2.size());

//        traverse the vector using for each loop
        for (Object element : v2) {
            System.out.println(element);
        }

        System.out.println("Size of Vector 2= " + v2.size());
        System.out.println("Capacity of  Vector = " + v2.capacity());

        String name = "Anil";
        if (v2.contains(name)) {
            System.out.println(name + " is found");
        } else {
            System.out.println(name + " is not found");
        }

        v2.add(100);
        v2.add(200);
        v2.add(300);
        v2.add(400);
        v2.add(500);
        v2.add(600);
        v2.add(700);

        System.out.println("Size of Vector 2= " + v2.size());
        System.out.println("Capacity of  Vector = " + v2.capacity());

        System.out.println("Contents of the vector v2 is as follows");

        for (Object element : v2) {
            System.out.println(element);
        }

        System.out.println("Is deleted ?" + v2.remove(0));
        System.out.println("Is deleted ?" + v2.remove("Jaya"));
        System.out.println("Is deleted ?" + v2.remove(new Integer(4)));
        System.out.println("Is deleted ?" + v2.remove(4));
        System.out.println("pos 2:" + v2.elementAt(2));
        System.out.println("After deleting element");

        System.out.println("Using Iterator:");
        Iterator e = v2.iterator();
        while (e.hasNext()) {
            System.out.println(e.next());

        }

        System.out.println("Using Enumeration:");

        Enumeration<Object> e1 = v2.elements();
        while (e1.hasMoreElements()) {
            System.out.println("Element = " + e1.nextElement());

        }
        System.out.println("Using For Each loop using lambda");
        v2.forEach((element) -> System.out.println(element));

        //Using Functional interface
        System.out.println("Using method reference");
        v2.forEach(System.out::println);

    }

}
