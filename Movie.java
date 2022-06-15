package com.impetusits;

/**
 *
 * @author Akash
 */
public class Movie {
    private String title;   //instance variable
    private String rating;  //instance variable
    
    static private float rent  ;                //class variable
    static public final float MIN_RENT = 200;   //class variable

    //instance methods
    public Movie(String title, String rating) {
        this.title = title;
        this.rating = rating;
//        System.out.println("Welcome to my show");
    }

     public Movie() {
        this.title = "Not Known";
        this.rating = "UG";
//        System.out.println("Welcome to my show");
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;

    }

    public static float getRent() {
//        title = ""; //Non-Static member cannot be accessed
//        rent = MIN_RENT; //Static members can be accessed
        return rent;
    }

    public static void setRent(float rent_new) {
        if (isRentValid(rent_new)){
            Movie.rent = rent_new;
        } else {
            Movie.rent = MIN_RENT;
        }
    }
    
    private static boolean isRentValid(float rent_new){
        return rent_new >= MIN_RENT;
    }

    static{
        System.out.println("Very complex implementation");
        rent  = 200;
    }
    
   // Non-Static Code Block
    {
        System.out.println("I bet! you will love the movie");
        System.out.println("Welcome to my show");
    }
    
}
