package com.impetusits;

/**
 *
 * @author Akash
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        //raw_hash_set_demo();
        //generic_hash_set_demo();
        //generic_treeset_demo();
        linked_hashset_demo();
    }

    private static void generic_treeset_demo() {
//      Set interface is implemented by concrete class TreeSet (Natural Ordering)
        Set<String> tset = new TreeSet<>();
        tset.add("ccc");
        tset.add("aaa");
        tset.add("ddd");
        tset.add("bbb");
        //  tset.add(12);
        System.out.println(tset);

        tset.stream().forEach(System.out::println);
    }

    private static void generic_hash_set_demo() {
//        Set interface is implemented by concrete
//        class HashSet (Unordered collection)
        Set<Object> aSet;
        aSet = new HashSet<>();
        aSet.add("one");
        aSet.add("second");
        aSet.add("3rd");
        aSet.add(4);
        aSet.add(5.0F);
        aSet.add("second"); // duplicate, not added
        aSet.add(4); // duplicate, not added
        System.out.println(aSet);
        System.out.println("Iterating using iterator");
        Iterator<Object> i = aSet.iterator();
        while (i.hasNext()) {
            System.out.println("* " + i.next());
        }
        System.out.println("Iterating using stream");
        aSet.stream().forEach(System.out::println);
    }

    private static void raw_hash_set_demo() {
        Set rawSetRef;
        rawSetRef = new HashSet();
        rawSetRef.add(1);  //Integer
        rawSetRef.add(2);  //Integer
        rawSetRef.add("Three3"); //String
        rawSetRef.add(4.5F);    //Float
        rawSetRef.add(5.0);     //Double
        rawSetRef.add(1);  //Integer (Noduplicate)
        for (Object element : rawSetRef) {
            System.out.println("Element :" + element);
        }
    }

    private static void linked_hashset_demo() {

//        Set interface is also implemented by 
//        concrete class LinkedHashSet (ordered Set)
        Set<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("One");
        orderedSet.add("Two");
        orderedSet.add("99");
        orderedSet.add("Three");
        orderedSet.add("Four");

        System.out.println("\nOrdered Collection (Set)");
        orderedSet.stream().forEach(System.out::println);
    }
}
