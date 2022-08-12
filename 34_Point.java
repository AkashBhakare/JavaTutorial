
package com.impetusits;

/*
 Simple userdefined java class
 */

/**
 *
 * @author Akash
 */

public class Point {

    private int x;
    private int y;

    public Point() {
        x = 10;
        y = 10;
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
            this.y = y;
    }

    public void displayCoordinates() {
        System.out.println("x = " + x + "\ty = " + y);
    }

    @Override
    public String toString() {
       return "[x = " + x + ", y = " + y + "]"; 
    }

}


