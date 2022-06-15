
package com.impetusits.first;

/**
 *
 * @author Akash
 */
public class Alpha {
    private int priMemb;
    protected int proMemb;
    public int pubMemb;
    int pacMemb;

    public void foo() {
//        All members are accessible within its own class
        System.out.println("Private : " + priMemb);
        System.out.println("Protected : " + proMemb);
        System.out.println("Public : " + pubMemb);
        System.out.println("Package : " + pacMemb);
    }

    public void baz() {
        System.out.println("Static data of Beta" + Beta.classData);
        Beta bref = new Beta();
        int x = bref.classData;
    }
    
}
