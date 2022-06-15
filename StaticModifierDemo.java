package com.impetusits;

/**
 *
 * @author Akash
 */
public class StaticModifierDemo {

    public static void main(String[] args) {
        System.out.println("Minimum Rent (Rs):" + Movie.MIN_RENT);
 //       System.out.println("Rent (Rs):" + Movie.rent);
 
        System.out.println("Movie Rent (Rs): " + Movie.getRent());
 //      Movie.rent  = -400;
        Movie.setRent(-300);
 //       Movie.MIN_RENT = -444; //Final members are read only
        System.out.println("Movie Rent (Rs): " + Movie.getRent());

        Movie mov1 = new Movie("Sholey", "UG");
//
        System.out.println("Title :" + mov1.getTitle());
        System.out.println("Rating :" + mov1.getRating());
        System.out.println("Mov1's rent =" + mov1.getRent());
        
        Movie mov2 = new Movie("DCH","UG");
        System.out.println("Title :" + mov2.getTitle());
        System.out.println("Rating :" + mov2.getRating());
        System.out.println("Mov2\'s rent =" + mov2.getRent());
        Movie.setRent(350);
        System.out.println("Mov1\'s rent =" + mov1.getRent());
        System.out.println("Mov2\'s rent =" + mov2.getRent());
        System.out.println("Movie Rent : " + Movie.getRent());
     
    }
    
}
