package com.impetusits;

/**
 *
 * @author Akash
 */
import java.util.Arrays;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Map;

/**
 *
 * @author Hrishi
 */
public class CollectionsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
//        demonstrateCopyList();
//        System.out.println("");
//        demonstrateSubList();
//        System.out.println("");
//        demonstrateEmptyCollection();
//        System.out.println("");
//        demonstrateSingletonCollection();
//        System.out.println("");
//        demonstrateEnumerationToList();
//        System.out.println("");
//        demonstrateCollectionToEnumeration();
//        System.out.println("");
//        demonstrateReverseList();
//        System.out.println("");
//        demonstrateSortList();
//        System.out.println("");
//        demonstrateShuffle();
//        System.out.println("");
//        demonstrateFrequency();
//        System.out.println("");
//        demonstrateSwap();
//        System.out.println("");
//            demonstrateUnModifiable();
//        System.out.println("");
        } catch (Exception err) {
            System.out.println("Error of type : " + err.getClass());
        }
    }

    /**
     * Provide an empty set. Returns an empty set (immutable).
     */
    static public void demonstrateEmptyCollection() {
        System.out.println("== DEMONSTRATING EMPTY SET ==");
        final Set<String> emptySet = Collections.emptySet();
        System.out.println("Size of returned emptySet(): " + emptySet.size());
//        final Set<String> emptySet2 = null;
//        System.out.println("Size of returned emptySet2(): " + emptySet2.size());
        System.out.println("== DEMONSTRATING EMPTY LIST ==");
        final List<String> emptyList1 = Collections.emptyList();
        System.out.println("Size of returned emptyList(): " + emptyList1.size());
        final List<String> emptyList2 = Collections.emptyList();
        if (emptyList1 == emptyList2) {
            System.out.println("Both the lists are same");
        }

        System.out.println("--- Adding String to Collections.emptySet() returned Set ---");
        //  emptySet.add("A new String to add.");

        Set<String> aset = null;
        //    print_set(aset);
        print_set(emptySet);
    }

    private static void print_set(Set aset) {
        if (aset == Collections.emptySet()) {
            System.out.println("Set is empty");
        } else {
            aset.stream().forEach(System.out::println);
        }
    }

    /**
     * Provide a Collection with a single element.
     */
    static public void demonstrateSingletonCollection() {
        System.out.println("== DEMONSTRATING SINGLETON LIST ==");
        final List<String> singleElementList
                = Collections.singletonList("A single String to add.");
        System.out.println("Size of returned singletonList(): "
                + singleElementList.size() + "\n");
//        System.out.println("--- Adding String to Collections.singletonList() returned List ---");
//        singleElementList.add("Another String to add.");

        System.out.println("== DEMONSTRATING SINGLETON SET ==");
        final Set<String> singleElementSet
                = Collections.singleton("A single String to add.");
        System.out.println("Size of returned singletonSet(): "
                + singleElementSet.size() + "\n");

        System.out.println("== DEMONSTRATING SINGLETON MAP ==");
        final Map<Integer, String> singleElementMap
                = Collections.singletonMap(45, "A single String to add.");
        System.out.println("Size of returned singletonMap(): "
                + singleElementMap.size() + "\n");

    }

    /**
     * Demonstrate use of Collections.list(Enumeration).
     */
    @SuppressWarnings("unchecked")
    static public void demonstrateEnumerationToList() {
        System.out.println("=== Demonstrate Collections.list(Enumeration) ===");
        Properties property = System.getProperties();
//        property.list(System.out);
        final Enumeration<?> properties_enum = property.propertyNames();

        final List<?> propertiesList = Collections.list(properties_enum);
        System.out.println("****Property names");
        System.out.println(propertiesList.toString());
        propertiesList.stream().forEach(System.out::println);

        System.out.println("####Set of Properties");
        Set<String> set = property.stringPropertyNames();
        set.stream().forEach(System.out::println);
    }

    /**
     * Demonstrate use of Collections.enumeration(Collection).
     */
    static public void demonstrateCollectionToEnumeration() {
        Set<String> bookset = new LinkedHashSet<>();
        String[] booklist = {"aaa", "bbb", "ccc"};
        bookset.addAll(Arrays.asList(booklist));
        System.out.println("=== Demonstrate Collections.enumeration(Collection) ===");
        final Enumeration<String> books = Collections.enumeration(bookset);

        while (books.hasMoreElements()) {
            System.out.println(books.nextElement());
        }

        while (books.hasMoreElements()) {
            System.out.println(books.nextElement());
        }
    }

    /**
     * Demonstrate use of Collections.reverse(List). To reverse order of
     * elements in a list,
     */
    static public void demonstrateReverseList() {
        List<String> nameList = new ArrayList<>();
        String[] names = {"AAA", "DDD", "CCC", "BBBB"};
        nameList.addAll(Arrays.asList(names));
        System.out.println("=== Demonstrate Collections.reverse(List) ===");
        System.out.println("List BEFORE reverse:\n" + nameList);
        Collections.reverse(nameList); // Only ordered collection can be reversed
        System.out.println("List AFTER reverse:\n" + nameList);
    }

    /**
     * Demonstrate Collections.shuffle(List). To randomly permute elements in a
     * list
     */
    static public void demonstrateShuffle() {
        System.out.println("=== Demonstrate Collections.shuffle(List) and Sort ===");
        List<String> nameList = new ArrayList<>();
        String[] names = {"AAA", "DDD", "CCC", "BBBB"};
        nameList.addAll(Arrays.asList(names));
        System.out.println("Original List : " + nameList);
        Collections.sort(nameList);
        System.out.println("Sorted List : " + nameList);
        System.out.println("List BEFORE shuffle: " + nameList);
        Collections.shuffle(nameList);
        System.out.println("List AFTER shuffle: " + nameList);
    }

    /*
     The subList(fromIndex, toIndex) allows us to get a portion of the 
     list between the specified fromIndex (inclusive) and toIndex (exclusive). 
     */
    private static void demonstrateSubList() {
        List<String> listNames = Arrays.asList("Jay", "Jaya", "Jayesh", "Jitu", "Jignesh", "Jaggu");
        System.out.println("Original list: " + listNames);

        List<String> subList = listNames.subList(2, 5);
        System.out.println("Sub list: " + subList);
    }

    /*
     Copying one list into another
     Collections.copyList(dest, src) 
     static method allows us to copy all elements from the source list into 
     the destination one. 
     Note that the destination list must be large enough to contain the 
     entire source list otherwise it throws an exception
     */
    private static void demonstrateCopyList() {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("A");
        sourceList.add("B");
        sourceList.add("C");
        sourceList.add("D");
//        sourceList.add("E");
//        sourceList.add("F");

        List<String> destList = new ArrayList<>();
        destList.add("V");
        destList.add("W");
        destList.add("X");
        destList.add("Y");
        destList.add("Z");

        System.out.println("destList before copy: " + destList);
        try {
            Collections.copy(destList, sourceList);
            System.out.println("destList after copy: " + destList);
        } catch (IndexOutOfBoundsException err) {
            System.err.println(err.getMessage());
        }

    }

    /* Collections.sort() static method which sorts the specified list into 
     ascending order, based on the natural ordering of its elements
     */
    private static void demonstrateSortList() {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("D");
        listStrings.add("C");
        listStrings.add("E");
        listStrings.add("A");
        listStrings.add("B");

        System.out.println("listStrings before sorting: " + listStrings);

        Collections.sort(listStrings);

        System.out.println("After sorting List in ascending order: "
                + listStrings);
        /*
        Returns a comparator that imposes the reverse of the natural 
        ordering on a collection of objects 
         */
        Collections.sort(listStrings, Collections.reverseOrder());
        System.out.println("After sorting List in descending order: "
                + listStrings);
    }

    private static void demonstrateFrequency() {
        List<String> listNames = Arrays.asList("Jay", "Jaya", "Jay", "Jitu", "Jaya", "Jignesh", "Jaggu", "Jay");
        System.out.println("Original list: " + listNames);
        int freq = Collections.frequency(listNames, "Jay");
        System.out.println("Freq of \"Jay\" :" + freq);
        freq = Collections.frequency(listNames, "Jaya");
        System.out.println("Freq of \"Jaya\":" + freq);
    }

    private static void demonstrateSwap() {
        List<String> listNames = Arrays.asList("Tiger", "Lion", "Deer", "Monkey", "Elephant");
        System.out.println("Animals:\n" + listNames);
        Collections.swap(listNames, 1, 3);
        System.out.println("Animals:(After Swapping)\n" + listNames);
        Collections.swap(listNames, 10, 3);
    }

    private static void demonstrateUnModifiable() {
        Set<String> set = new HashSet<>();
        set.add("Bobby");
        set.add("Eshwar");
        set.add("Gullu");
        set.add("Eshita");

//      Returns an unmodifiable view of the specified set. 
        var readOnly = Collections.unmodifiableSet(set);
        readOnly.stream().forEach(System.out::println);
        readOnly.add("Chandu");

    }

}
