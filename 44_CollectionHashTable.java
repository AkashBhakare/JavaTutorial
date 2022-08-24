package com.impetusits;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Akash
 */
public class CollectionHashTable {

    public static void main(String[] args) {
        // create and populate hash table
        Dictionary<Integer, String> dict_courses;
        dict_courses = new Hashtable<>();

        dict_courses.put(101, "C Language");
        dict_courses.put(102, "Java");
        dict_courses.put(104, "Databases");
        dict_courses.put(103, "Java");
        dict_courses.put(101, "C++ Language");

        System.out.println("Values before remove: " + dict_courses);
        /* Returns an enumeration of the keys in this hashtable.   */
        Enumeration<Integer> keys = dict_courses.keys();
        System.out.println("Keys in the Table are :");
        while (keys.hasMoreElements()) {
            System.out.println("Element : " + keys.nextElement());
        }

        /*Returns an enumeration of the values in this hashtable.*/
        Enumeration<String> e = dict_courses.elements();
        System.out.println("Values in the Table are :");
        while (e.hasMoreElements()) {
            System.out.println("Element : " + e.nextElement());
        }

        //Map<Integer,String> ht = (Hashtable)dict_courses;
        Hashtable<Integer, String> ht = (Hashtable) dict_courses;

        /*Returns a Set view of the mappings contained in this map.*/
        Set<Map.Entry<Integer, String>> set = ht.entrySet();
        for (Map.Entry<Integer, String> element : set) {
            System.out.print("Key : " + element.getKey() + "\t");
            System.out.println("Value : " + element.getValue());

        }
        // Remove value for key 102
        ht.remove(102);
        System.out.println("Values after remove: " + ht);

    }

}
