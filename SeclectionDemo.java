package com.impetusits;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class SeclectionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if_construct_demo();
        if_else_construct_demo();
        nested_if_construct_demo1();
        nested_if_construct_demo2();
    }

    /* 
    Accept sales of a salesman and calculate the bonus to be paid
    Given : Bonus is 5% of total sales and is paid only if the total sales
    are greater than equal to Rs One Lakh
     */
    private static void if_construct_demo() {
        final float MIN_SALES_TARGET = 100000.0F;
        final float BONUS_RATE = 0.05F;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the total Sales (Rs) ");
        float total_sales = scan.nextFloat();
        float bonus = 0.0F;
        //Single Alternative if
        if (total_sales >= MIN_SALES_TARGET) {
            bonus = total_sales * BONUS_RATE;
        }
        System.out.println("The Bonus is Rs " + bonus);
    }

    /*
    Accept sales of a salesman and calculate the bonus to be paid
    Given : Bonus is 5% of total sales  if the total sales are greater than 
    equal to Rs One Lakh otherwise the bonus is 2 % of total sales
     */
    private static void if_else_construct_demo() {
        final float MIN_SALES_TARGET = 100000.0F;
        final float MAX_BONUS_RATE = 0.05F;
        final float MIN_BONUS_RATE = 0.02F;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the total Sales (Rs) ");
        float total_sales = scan.nextFloat();
        float bonus;
        // Dual alternative
        if (total_sales >= MIN_SALES_TARGET) {
            bonus = total_sales * MAX_BONUS_RATE;
        } else {
            bonus = total_sales * MIN_BONUS_RATE;
        }
        System.out.println("The Bonus is Rs " + bonus);
    }

    /*
   Accept two integers and check whether their relationship
     */
    private static void nested_if_construct_demo1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first integer : ");
        int num1 = scan.nextInt();
        System.out.print("Please enter the second integer : ");
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            if (num1 < num2) {
                System.out.println(num1 + " < " + num2);
            } else {
                System.out.println(num1 + " = " + num2);
            }
        }

    }

    /*
    Accept 3 intgers and display the largest amongst them
     */
    private static void nested_if_construct_demo2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first integer : ");
        int num1 = scan.nextInt();
        System.out.print("Please enter the second integer : ");
        int num2 = scan.nextInt();
        System.out.print("Please enter the third integer : ");
        int num3 = scan.nextInt();
        int max = 0;
        if(num1 > num2){
            if(num1 > num3){
                max = num1;
            }else{
                max = num3;
            }
        }else{
            if(num2 > num3){
                max = num2;
            }else{
                max = num3;
            }
        }
        
        System.out.println("The largest number is "+max);
    }

}
