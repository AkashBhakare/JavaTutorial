package com.impetusits;

/**
 *
 * @author Akash
 */
public class DateClass {

    private int day = 1;
    private int month = 1;
    private int year = 2000;
    
    public DateClass( int day, int month, int year)
    {
            this.day = day;
            this.month = month;
            this.year = year;
    }        
       
    public void displayDate()
    {
        System.out.println("DAY : " + day + "  Month :"
                + month + "  Year :" + year );
        return;
    }
    
    public void setDay(int day )
    {
       this.day = day;
    }
    
}
