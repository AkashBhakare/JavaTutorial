/*
A simple Collection : Map<string,objects>
 */
package com.impetusits;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Akash
 */
public class CollectionMap {

    public static void main(String args[]) {
        Map<String, Object> aMap;
        aMap = new HashMap<>();
//        Associates the specified value with the specified key in this map 
        aMap.put("One", 1);
        aMap.put("Second", 2.5F);
        aMap.put("Third", 3.0);
        aMap.put("Four", "IV");
        aMap.put("Second", 2.0F);
        // Returns set view of keys
        Set<String> keySet = aMap.keySet();
        System.out.println("Keys=" + keySet);

        // Returns Collection view of values
        Collection<Object> collection = aMap.values();
        System.out.println("Values=" + collection);

        String data = (String) aMap.get("four");
        System.out.println("Third = " + data);
        System.out.println("Third = " + aMap.get("Four"));
//    
        // Returns set view of key value mappings
        Set<Map.Entry<String, Object>> set2;
        set2 = aMap.entrySet();
        System.out.println("Map:\n" + set2);
        System.out.println("Iterating using KeySet");
        iterateUsingKeys(aMap);
        System.out.println("Iteating using Map.Entry");
        iterateUsingEntrySet(aMap);
    }

    public static void iterateUsingKeys(Map<String, Object> aMap) {
        Set<String> keySet = aMap.keySet();
        // using Iterator to traverse set of keys
        Iterator<String> iter = keySet.iterator();
        System.out.println("Keys:");
        while (iter.hasNext()) {
            String key = iter.next();
            /*Returns the value to which the specified key is mapped*/
            System.out.println(key + ": " + aMap.get(key) + " ");
        }
        System.out.println("");
    }

    public static void iterateUsingEntrySet(Map<String, Object> aMap) {
        Iterator<Map.Entry<String, Object>> iterEntry;
        /* Returns a Set view of the mappings <K,V> contained in this map. */
        Set<Map.Entry<String, Object>> entrySet = aMap.entrySet();
        iterEntry = entrySet.iterator();
        while (iterEntry.hasNext()) {
            Map.Entry<String, Object> entry = iterEntry.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("");
    }

}
