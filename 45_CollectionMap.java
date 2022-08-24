/*
 * MAP : Stores key value pair
 */
package com.impetusits;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Akash
 */
public class CollectionMap {

    public static void main(String[] args) {
        Product p = new Product("Pen", 12.50F);
        System.out.println("" + p.toString());
        System.out.println("" + p);

        Map< String, Product> items;
        items = new HashMap<>();
//        Map< String, Product> items;

        items.put("TV1", new Product("Sony Flat TV", 21000));
        items.put("TV2", new Product("Panasonic Flat TV", 25000));
        items.put("TV3", new Product("Samsung TV", 18000));
        items.put("TV4", new Product("Sony Flat TV", 21000));
        Product product = new Product("Onida");
        items.put("TV5", product);
        System.out.println(items);
        System.out.println("\nList All entries");

//        printMap_using_for_loop(items);
//        printMap_using_stream(items);
        printMap_using_iterator(items);

        //delete a value from map using key
        items.remove("TV1");
//        System.out.println(items);
//
        //finding the sum of hash code
//        System.out.println(items.hashCode());
//        //check for a key
        System.out.println("Do we have TV1 ? :" + items.containsKey("TV1"));
//
//        // to get the key set
        System.out.println(items.keySet());
//
//        //size of collection
        System.out.println("Number of Products = " + items.size());
//
//        //returns the value associated with a key
        System.out.println("TV3 Details : " + items.get("TV3"));
//

    }

    public static void printMap_using_iterator(Map<String, Product> items) {
        System.out.println("Traversing using Iterator");
        Set<Map.Entry<String, Product>> set = items.entrySet();
        Iterator<Map.Entry<String, Product>> iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Product> entry = iter.next();
            System.out.print("key = " + entry.getKey());
            System.out.print(", Value = " + entry.getValue());
        }
        System.out.println("");
    }

    public static void printMap_using_for_loop(Map<String, Product> items) {

        //traversing through the map
        Set<Map.Entry<String, Product>> set = items.entrySet();

        for (Map.Entry<String, Product> element : set) {
            System.out.print("Key : " + element.getKey() + "\t");
            System.out.println("Value :" + element.getValue());
        }

        System.out.println("\nAlternative");
        //Alternative
        for (Map.Entry<String, Product> e : items.entrySet()) {
            System.out.print("\nKey : " + e.getKey()
                    + "\tValue : " + e.getValue());
        }

    }

    private static void printMap_using_stream(Map<String, Product> items) {
        System.out.println("Printing Map using Stream");
        items.entrySet().stream().forEach(System.out::print);
    }
}
