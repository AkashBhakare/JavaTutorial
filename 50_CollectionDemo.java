package com.impetusits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Akash
 */
public class CollectionDemo {

    public static void main(String[] args) {
        demonstrateCopyList();
        System.out.println("");
        demonstrateSubList();
        System.out.println("");
        demonstrateEmptySet();
        System.out.println("");
        demonstrateSingletonList();
        System.out.println("");
        demonstrateSingletonSet();
        System.out.println("");
        demonstrateEnumerationToList();
        System.out.println("");
        demonstrateCollectionToEnumeration();
        System.out.println("");
        demonstrateReverseList();
        System.out.println("");
        demonstrateSortList();
        System.out.println("");
        demonstrateSearching();
        System.out.println("");
        demonstrateShuffle();
        System.out.println("");
        demonstrateFrequency();
        System.out.println("");
        demonstratesNCopies();
        System.out.println("");
        demonstrateRotate();
        System.out.println("");
        demonstrateMaxMin();
        System.out.println("");
        demonstrateSwap();
        System.out.println("");
        demonstrateUnModifiable();
        System.out.println("");
        demonstrateReplaceAll();
    }

    /**
     * Provide an empty set (immutable). Collections.emptySet(): Returns an
     * empty set (immutable). This set is serializable
     */
    static public void demonstrateEmptySet() {
        System.out.println("== DEMONSTRATING EMPTY SET ==");
        Set<String> emptySet = Collections.emptySet();
        System.out.println("Size of returned emptySet(): " + emptySet.size());
        System.out.println("--- Adding String to Collections.emptySet() returned Set ---");
        emptySet.add("A new String to add.");
    }

    /**
     * Collections.singletonList(): Returns an immutable list containing only
     * the specified object. The returned list is serializable.
     */
    static public void demonstrateSingletonList() {
        System.out.println("== DEMONSTRATING SINGLETON LIST ==");
        final List<String> singleElementList
                = Collections.singletonList("A single String to add.");
        System.out.println("Size of returned singletonList(): "
                + singleElementList.size() + "\n");

        System.out.println("--- Adding String to Collections.singletonList() returned List ---");
        singleElementList.add("Another String to add.");
    }

    /**
     * Provide a Set with a single element.
     */
    static public void demonstrateSingletonSet() {
        class Product {

            String name;
            float price;

            public Product(String name, float price) {
                this.name = name;
                this.price = price;
            }
        }
        System.out.println("== DEMONSTRATING SINGLETON LIST ==");
        final Set<Product> singleElementSet
                = Collections.singleton(new Product("Pen", 55.50F));
        System.out.println("Size of returned singletonList(): "
                + singleElementSet.size() + "\n");

        System.out.println("--- Adding Product to Collections.singletonList() returned List ---");
        singleElementSet.add(new Product("Pencil", 55.50F));
    }

    /**
     * Demonstrate use of Collections.list(Enumeration). Collections.list():
     * Returns an array list containing the elements returned by the specified
     * enumeration in the order they are returned by the enumeration.
     */
    static public void demonstrateEnumerationToList() {
        System.out.println("=== Demonstrate Collections.list(Enumeration) ===");
        Enumeration<?> propertiesEnums = System.getProperties().propertyNames();
//        Enumerations can be iterated only once
        printUsingEnumeration(propertiesEnums);
//        printUsingEnumeration(propertiesEnums);
        List<?> propertiesList = Collections.list(propertiesEnums);

        System.out.println("List size : " + propertiesList.size());
        printUsingList(propertiesList);
        printUsingList(propertiesList);
    }

    /**
     * Collections.enumeration(Collection). Returns an enumeration over the
     * specified collection. This provides interoperability with legacy APIs
     * that require an enumeration as input.
     */
    static public void demonstrateCollectionToEnumeration() {
        Set<String> bookset = new LinkedHashSet<>();
        String[] booklist = {"Goal", "Wings of Fire", "Eat that frog"};
        bookset.addAll(Arrays.asList(booklist));
        System.out.println("=== Demonstrate Collections.enumeration(Collection) ===");
        Enumeration<?> books = Collections.enumeration(bookset);
        System.out.println("\nPrinting Set of Books");
        printUsingEnumeration(books);
        System.out.println("\nPrinting Set of Books");
        printUsingEnumeration(books);

        books = Collections.enumeration(Arrays.asList(booklist));
        System.out.println("\nPrinting List of Books");
        printUsingEnumeration(books);
    }

    /**
     * Demonstrate use of Collections.reverse(List). To reverse order of
     * elements in a list,
     */
    static public void demonstrateReverseList() {
        List<String> nameList = new ArrayList<>();
        String[] names = {"Abdul", "Dharam", "Chandra", "Babu"};
        nameList.addAll(Arrays.asList(names));
        System.out.println("=== Demonstrate Collections.reverse(List) ===");
        System.out.println("List BEFORE reverse:\n" + nameList);
        Collections.reverse(nameList);
        System.out.println("List AFTER reverse:\n" + nameList);
    }

    /**
     * Demonstrate Collections.shuffle(List). To randomly permute elements in a
     * list
     */
    static public void demonstrateShuffle() {
        System.out.println("=== Demonstrate Collections.shuffle(List) and Sort ===");
        List<String> nameList = new ArrayList<>();
        String[] names = {"Ashwini", "Deepa", "Chandani", "Babita"};
        nameList.addAll(Arrays.asList(names));
        System.out.println("Original List :\n" + nameList);
        Collections.sort(nameList);
        System.out.println("Sorted List :\n" + nameList);
        System.out.println("List BEFORE shuffle: \n" + nameList);
        Collections.shuffle(nameList);
        System.out.println("List AFTER shuffle: \n" + nameList);
    }

    /*
     The subList(fromIndex, toIndex) allows us to 
     get a portion of the list between the specified 
     fromIndex (inclusive) and toIndex (exclusive). 
     */
    private static void demonstrateSubList() {
        String[] names = {"Jay", "Jaya", "Jayesh", "Jitu", "Jignesh", "Jaggu"};
        List<String> listNames = Arrays.asList(names);
        System.out.println("Original list: " + listNames);
        List<String> subList = listNames.subList(2, 5);
        System.out.println("Sub list: " + subList);
    }

    /*
     Copying one list into another  Collections.copyList(dest, src) 
     static method allows us to copy all elements from the source 
     list into the destination one. 
     Note that the destination list must be large enough to contain 
     the entire source list.
     */
    private static void demonstrateCopyList() {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("A");
        sourceList.add("B");
        sourceList.add("C");
        sourceList.add("D");
//        sourceList.add("D");
//        sourceList.add("D");
//        sourceList.add("D");
        System.out.println("Src :" + sourceList.size());
        List<String> destList = new ArrayList<>(sourceList.size());
//        List<String> destList = new ArrayList<>();
        destList.add("V");
        destList.add("W");
        destList.add("X");
        destList.add("Y");
        destList.add("Z");

        System.out.println("destList before copy: " + destList);
        // Throws exception if destination is not large enough
        Collections.copy(destList, sourceList);

        System.out.println("destList after copy: " + destList);
    }

    /* Collections.sort() static method which sorts the specified 
      list into ascending order, based on the natural ordering 
      of its elements
     */
    private static void demonstrateSortList() {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("Dada");
        listStrings.add("Chand");
        listStrings.add("Edwin");
        listStrings.add("Amir");
        listStrings.add("Badshah");

        System.out.println("listStrings before sorting: " + listStrings);

        Collections.sort(listStrings);

        System.out.println("listStrings after sorting: " + listStrings);
    }

    /*
    Collections.binarySearch():
    Searches the specified list for the specified object 
    using the binary search algorithm. 
    The list must be sorted into ascending order according 
    to the natural ordering of its elements 
     */
    private static void demonstrateSearching() {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("Dada");
        listStrings.add("Chandu");
        listStrings.add("Edwin");
        listStrings.add("Akram");
        listStrings.add("Bablu");

        System.out.println("listStrings before sorting: " + listStrings);
        Collections.sort(listStrings);  //prerequisite
        String stringToSearch = "Bablu";
        int index = Collections.binarySearch(listStrings, stringToSearch);
        if (index >= 0) {
            System.out.println(stringToSearch + " is found at index " + index);
        } else {
            System.out.println(stringToSearch + " is not present");
        }
        System.out.println("listStrings after sorting: " + listStrings);
    }

    /*
    Collections.frequency((Collection<?> c,Object o)
    Returns the number of elements in the specified collection 
    equal to the specified object
     */
    private static void demonstrateFrequency() {
        String[] fruitNames = {"Mango", "Apricot", "Apple", "Mango", "Banana", "Date",
            "Mango", "Apricot", "Apple"};
        List<String> fruitList = Arrays.asList(fruitNames);
        String fruit = "Mango";
        int freq = Collections.frequency(fruitList, fruit);
        System.out.println("Frequency of " + fruit + " is " + freq);
    }

    /*
    nCopies(int n, T o) 
    Returns an immutable list consisting of n copies of the specified object
     */
    private static void demonstratesNCopies() {
        String element = "Hurray!";
        int numberOfElements = 5;
        List<String> alist = Collections.nCopies(numberOfElements, element);
        System.out.println("List :\n" + alist);
    }

    /*
    Collections.rotate(List<?> list,int distance);
    Rotates the elements in the specified list by the specified distance
     */
    private static void demonstrateRotate() {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original List : " + numList);
        int distance = 2; //clockwise
        Collections.rotate(numList, distance);
        System.out.println("Rotated List (by " + distance + ") : " + numList);
        Collections.sort(numList);
        System.out.println("");
        System.out.println("Original List : " + numList);
        distance = -1; //anticlockwise
        Collections.rotate(numList, distance);
        System.out.println("Rotated List (by " + distance + ") : " + numList);

    }

    private static void demonstrateMaxMin() {
        /*  Max : 
            Returns the maximum element of the given collection, 
            according to the natural ordering of its elements. 
            Min :
            Returns the minimum element of the given collection, 
            according to the natural ordering of its elements
         */
        List<Integer> numList = Arrays.asList(112, 55, 333, 41, 51);
        System.out.println("Largest Element  : " + Collections.max(numList));
        System.out.println("Smallest Element : " + Collections.min(numList));

        String[] fruitNames = {"Mango", "Apricot", "Apple", "Banana", "Date"};
        Set<String> fruitSet = new HashSet<>();
        fruitSet.addAll(Arrays.asList(fruitNames));
        System.out.println("Largest Element  : " + Collections.max(fruitSet));
        System.out.println("Smallest Element : " + Collections.min(fruitSet));
    }

    private static void demonstrateSwap() {
        List<String> animalList = Arrays.asList("Tiger", "Lion", "Deer", "Monkey", "Elephant");
        System.out.println("Animals:\n" + animalList);
        Collections.swap(animalList, 1, 3);
        System.out.println("Animals:(After Swapping)\n" + animalList);
    }

    private static void demonstrateUnModifiable() {
        Set<String> set = new HashSet<>();
        set.add("Bobby");
        set.add("Eshwar");
        set.add("Gullu");
        set.add("Eshita");
        try {
//      Returns an unmodifiable view of the specified set. 
            set = Collections.unmodifiableSet(set);
//            set.add("Chandu");
        } catch (UnsupportedOperationException e) {
            System.err.println("Type :" + e.toString());
        }
        System.out.println("Unmodifiable Set : " + set);
    }

    private static void printUsingEnumeration(Enumeration<?> propertiesEnums) {
        System.out.println("Printing using enumeration :");
        while (propertiesEnums.hasMoreElements()) {
            System.out.println("Element :" + propertiesEnums.nextElement());
        }
    }

    private static void printUsingList(List<?> propertiesList) {
        System.out.println("Printing using List :");
        Iterator<?> iter = propertiesList.iterator();
        while (iter.hasNext()) {
            System.out.println("Element :" + iter.next());
        }
    }

    private static void demonstrateReplaceAll() {
        List<String> zoo = Arrays.asList("Deer", "Tiger", "Lion", "Deer", "Monkey", "Deer", "Elephant");

        System.out.println("Zoo Animals:\n" + zoo);
        System.out.println("After Replacing Deer's with Chimp");
        Collections.replaceAll(zoo, "Deer", "Chimp");
        System.out.println("Zoo Animals:\n" + zoo);
    }
}
