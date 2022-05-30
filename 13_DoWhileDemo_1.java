
/*
Accept two intgers and display their addition 
continue the process until user wishes
*/

package com.impetusits;

import java.util.Scanner;


/**
 *
 * @author Akash
 */
public class DoWhileDemo_1 {
    public static void main(String[] args) {
       //using_while_loop();
       using_do_while_loop();
    }

    private static void using_while_loop() {
        int num1;
        int num2;
        int choice = 1;
        Scanner scan = new Scanner(System.in);
        
        while(choice == 1){
            System.out.print("Please enter the first integer : ");
            num1 =  scan.nextInt();
            System.out.print("Please enter the Second integer: ");
            num2 =  scan.nextInt();
            System.out.println(num1+ " + "+ num2 +" = " + (num1+num2)  );
            System.out.print("Press 1 to continue or 0 to stop : ");
            choice = scan.nextInt();
            
        }
    }

    private static void using_do_while_loop() {
    int num1;
    int num2;
    int choice;
    Scanner scan = new Scanner(System.in);
          
       do{
            System.out.print("Please enter the first integer : ");
            num1 =  scan.nextInt();
            System.out.print("Please enter the Second integer: ");
            num2 =  scan.nextInt();
            System.out.println(num1+ " + "+ num2 +" = " + (num1+num2)  );
            System.out.print("Press 1 to continue or 0 to stop : ");
            choice = scan.nextInt();
        }while(choice == 1);
    }
    
}
