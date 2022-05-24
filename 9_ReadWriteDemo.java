

//package io_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author Akash
 
public class ReadWriteDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Java @ Impetus");
        System.out.println("Master Java");
        System.out.println("First Line"+ System.lineSeparator()+"Second Line");
        
      
        String name = "Mangesh";
        System.out.println("Hello Mr/Miss "+name);
        
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
       
      
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("What's your name ? ");
        name = br.readLine();
        System.out.println("Hello Mr/Miss "+name);
        System.out.print("What's your age ? ");
        int data;
        //data = new Integer(br.readLine());
        //System.out.println("You are "+(data+3)+" years old");
        
        data = Integer.decode(br.readLine());
        System.out.println("You are "+(data+3)+" years old");
        
        data = Integer.valueOf(br.readLine());
        System.out.println("You are "+(data+3)+" years old");
        
        data = Integer.parseInt(br.readLine());
        System.out.println("You are "+(data+3)+" years old");
    }
}

* */

public class ReadWriteDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Java @ Impetus");
        System.out.println("Master Java");
        System.out.println("First Line"+ System.lineSeparator()+"Second Line");
        
      
        String name = "Mangesh";
        System.out.println("Hello Mr/Miss "+name);
        
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
       
      
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("What's your name ? ");
        name = br.readLine();
        System.out.println("Hello Mr/Miss "+name);
        System.out.print("What's your age ? ");
       
  	int data;
        //data = new Integer(br.readLine());
        //System.out.println("You are "+(data+3)+" years old");
        
        data = Integer.decode(br.readLine());
        System.out.println("You are "+(data+3)+" years old");
        
        data = Integer.valueOf(br.readLine());
        System.out.println("You are "+(data+3)+" years old");
        
        data = Integer.parseInt(br.readLine());
        System.out.println("You are "+(data+3)+" years old");
    }
}
