package com.impetusits;

/**
 *
 * @author Akash
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class ListExample {

    public static void main(String[] args) {
//        usingArrayList();
//        eleminatingDuplicates();
//        usingLinkedList();
//        usingListAsStack();
//        linkedListAsStack();
        usingLinkedListAsQueue();
    }

    public static void usingArrayList() {
        // Define a interface type reference variable
//        which can point to a collection holding objects
        List raw_list;

        raw_list = new ArrayList();
        raw_list.add("one");
        raw_list.add("second");
        raw_list.add("3rd");
        raw_list.add(4);
        raw_list.add(5.0F);
        raw_list.add("second"); // duplicate, is added
        raw_list.add(4); // duplicate, is added
        System.out.println(raw_list);
        System.out.println("Size :" + raw_list.size());
        printList(raw_list);
//        System.out.println("Capacity :",listRef.c);
        Integer i = (Integer) raw_list.get(3); //list[3]:illegal
        System.out.println("Integer :" + i);

        ArrayList<String> nameList = new ArrayList<>();
        System.out.println("Size :" + nameList.size());

        nameList = new ArrayList<>(20);
        System.out.println("Size :" + nameList.size());
        nameList.ensureCapacity(35);
        nameList.add("Raja Mohan");
        nameList.add("Parthsarthi");
        nameList.add("Vijay Gokhale");
  //      nameList.add(34);
        printStudentList(nameList);
        System.out.println("");
         
        System.out.println("Iterating using stream Api");
        nameList.stream().forEach(System.out::println);
        System.out.println("");
        
        System.out.println("Iterating using Iterator");
        Iterator<String> iter = nameList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
    public static void eleminatingDuplicates() {

        ArrayList<String> nameList = new ArrayList<>();
       
        nameList.add("Amit");
        nameList.add("Jaya");
        nameList.add("Raju");
        nameList.add("Smita");
        nameList.add("Raju");
        nameList.add("Smita");
        nameList.add("Tom");
        nameList.add("Asif");
        
        System.out.println("Original List ");
        nameList.stream().forEach(System.out::println);
        
        //construct a HashSet using ArrayList
        Set<String> string_set = new HashSet<>(nameList);
        
        //construct a ArrayList using HashSet
        nameList = new ArrayList<>(string_set);
        
        System.out.println("List without duplicate ");
        nameList.stream().forEach(System.out::println);
   
    }
    
    public static void usingLinkedList() {
        // List of string
        List<String> studentList;
        studentList = new LinkedList<>();
        studentList.add("Anil");
        studentList.add("Kunal");
        studentList.add("Jayesh");
        studentList.add("Baban");
        printStudentList(studentList);
        
        System.out.println("Before iteration list size is " + studentList.size());
        System.out.println("\nUsing Iterator");
        Iterator<String> iter;
        iter = studentList.iterator();
        while (iter.hasNext()) {
            System.out.println("Element :" + iter.next());
            iter.remove();
        }
        System.out.println("After iteration list size is " + studentList.size());

        String[] names = {"Rohan", "Yash", "Nurpati", "Rameshwari", "Vishal"};
//        Arrays.asList(names); //returns Abstarct List
        //Abstract doesnot have implementation for remove()

        studentList = new LinkedList<>(Arrays.asList(names));
        printStudentList(studentList);

        System.out.println("After deleting element at index 2 " + studentList.remove(2));
        printStudentList(studentList);

        if (studentList.contains("Yash")) {
            System.out.print("List contains \'Yash\'");
            System.out.println(" At " + studentList.indexOf("Yash"));
        }

    }

    //FILO : LIFO
    public static void usingListAsStack() {
        List<String> astack = new ArrayList<>();
        astack.add("aaa");
        astack.add("bbb");
        astack.add("ccc");
        astack.add("ddd");
//        astack.pop(); //Stack class specific method
        int last_index;
        while (!astack.isEmpty()) {
            last_index = astack.size() - 1;
//            System.out.println("Element : " + astack.get(last));
            System.out.println("Element :" + astack.remove(last_index));
        }

        //  The Stack class represents a last-in-first-out (LIFO)
//      stack of objects.
//      It extends class Vector (which implements List) with five
//      operations that allow a vector to be treated as a stack.
//        ((Stack)astack).push("anil");
        Stack<String> astk = new Stack<>();
        astk.push("aaaaa");
        astk.push("bbbbb");
        astk.push("ccccc");
        astk.push("ddddd");
        System.out.println("Top most Element : " + astk.peek());
        System.out.println("Deleting Elements from Stack");
        while (!astk.isEmpty()) {
           System.out.println("Element : " + astk.pop());
        }
        System.out.println("Stack Size : " + astk.size());
    }
    
     public static void linkedListAsStack() {
        // LinkedList as Stack
        System.out.println("Linked List as Stack");
        LinkedList<String> stk_list = new LinkedList<>();
        System.out.println("Using addFirst & removeFirst");
        stk_list.addFirst("aaa");
        stk_list.addFirst("bbb");
        stk_list.addFirst("ccc");
        stk_list.addFirst("ddd");
        System.out.println(stk_list.removeFirst());
        System.out.println(stk_list.removeFirst());
        System.out.println(stk_list.removeFirst());
        System.out.println(stk_list.removeFirst());

        System.out.println("Using addLast & removeLast");
        stk_list.addLast("aaa");
        stk_list.addLast("bbb");
        stk_list.addLast("ccc");
        stk_list.addLast("ddd");
        System.out.println(stk_list.removeLast());
        System.out.println(stk_list.removeLast());
        System.out.println(stk_list.removeLast());
        System.out.println(stk_list.removeLast());
        
    }

    public static void usingLinkedListAsQueue() {
        // LinkedList as Queue
        System.out.println("Linked List as Queue");
        LinkedList<String> que_list = new LinkedList<>();
        que_list.addLast("aaa");
        que_list.addLast("bbb");
        que_list.addLast("ccc");
        que_list.addLast("ddd");
        System.out.println(que_list.removeFirst());
        System.out.println(que_list.removeFirst());
        System.out.println(que_list.removeFirst());
        System.out.println(que_list.removeFirst());
        
        System.out.println("Using Queue<E>");
        /* LinkedList implements Queue in addtion to List*/
        Queue<String> queue =  new LinkedList<>();
        queue.add("aaaa");
        queue.add("bbbb");
        queue.add("cccc");
        queue.add("dddd");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        
        
    }


    public static void printStudentList(List<String> studentList) {
        System.out.println("\nUsing For each loop");

        for (String element : studentList) {
            System.out.println(element);
        }

    }

    private static void printList(List listRef) {
        for(Object element : listRef){
            System.out.println("Element : "+element);
        }
    }
}

