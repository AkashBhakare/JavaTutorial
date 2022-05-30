/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.switchcasedemo;

import java.util.Scanner;

/**
 *
 * @author Akash
 */
public class CountryCapital {
    public static void main(String[] args) {
        //lexigraphical_comparision();
        //string_comparision();
        //saarc_country_using_nested_if();
        saarc_country_using_switch_case();

    }// end of main
    
    private static void lexigraphical_comparision() {
        String s1 = "Abhay kumar";// Rao";
        String s2 = "Abhay3";// Patil";
//        String s1 = "Zaheer";
//        String s2 = "Azaruddhin";
        int result = s1.compareTo(s2);
        System.out.println("Result = " + result);
        if (result == 0) {
            System.out.println(s1 + " == " + s2);
        } else {
            if (result > 0) {
                System.out.println(s1 + " > " + s2);
            } else {
                System.out.println(s1 + " < " + s2);
            }
        }
    }

    private static void string_comparision() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a SAARC country name:");
        String countryName = scan.next();

        //Incorrect way ot compare string
        if (countryName == "India") {
            System.out.println("Capital of " + countryName + " is New Delhi");
        }

        //Correct way to compare strings, but comaparision is case sensitive
        if (countryName.compareTo("India") == 0) {
            System.out.println("Capital of " + countryName + " is New Delhi");
        }

        //Correct way to compare strings, ignores case while comparing
        if (countryName.compareToIgnoreCase("India") == 0) {
            System.out.println("Capital of " + countryName + " is New Delhi");
        }

        //Best way to compare strings, but comaparision is case sensitive
        if (countryName.equals("India")) {
            System.out.println("Capital of " + countryName + " is New Delhi");
        }

        //Best way to compare strings, ignores case while comparing
        if (countryName.equalsIgnoreCase("India")) {
            System.out.println("Capital of " + countryName + " is New Delhi");
        }

        System.out.println("country name : " + countryName);
    }

    private static void saarc_country_using_nested_if() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a SAARC country name:");
        String countryName = scan.next();

        if (countryName.equalsIgnoreCase("India")) {
            System.out.println("Capital of " + countryName + " is New Delhi");
        } else {
            if (countryName.equalsIgnoreCase("Pakistan")) {
                System.out.println("Capital of " + countryName + " is Islamabad");
            } else {
                if (countryName.equalsIgnoreCase("Sri Lanka")) {
                    System.out.println("Capital of " + countryName + " is Colombo");
                } else {
                    if (countryName.equalsIgnoreCase("Nepal")) {
                        System.out.println("Capital of " + countryName + " is Katmandhu");
                    } else {
                        if (countryName.equalsIgnoreCase("Buthan")) {
                            System.out.println("Capital of " + countryName + " Timphu");
                        } else {
                            if (countryName.equalsIgnoreCase("Maldives")) {
                                System.out.println("Capital of " + countryName + " is Malé");
                            } else {
                                if (countryName.equalsIgnoreCase("Afganistan")) {
                                    System.out.println("Capital of " + countryName + " is Kabul");
                                } else {
                                    System.out.println("It's not a SAARC country name");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void saarc_country_using_switch_case() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a SAARC country name:");
        String countryName = scan.next();
        switch (countryName.toUpperCase()) {
            case "INDIA":
                System.out.println("Capital : New Delhi");
                break;
            case "PAKISTAN":
                System.out.println("Capital : ISLAMABAD");
                break;
            case "SRILANKA":
                System.out.println("Capital : COLOMBO");
                break;
            case "BANGLADESH":
                System.out.println("Capital : DHAKA");
                break;
            case "AFGANISTHAN":
                System.out.println("Capital : KABUL");
                break;
            case "NEPAL":
                System.out.println("Capital : KATHMANDU");
                break;
            case "BUTHAN":
                System.out.println("Capital : THIMPU");
                break;
            case "MALDIVES":
                System.out.println("Capital : MALYE");
                break;
            default:
                System.out.println("Not a SAARC Country Name");
        } // end of case construct
        
        System.out.println("Thank you!");
    }

}//end of class
