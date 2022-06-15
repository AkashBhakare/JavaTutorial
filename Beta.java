package com.impetusits.first;

/**
 *
 * @author Akash
 */
public class Beta {
    public static int classData = 10;
    public void doSomeThing() {

        Alpha ref = new Alpha();
//        System.out.println("Private : " + ref.priMemb);
        System.out.println("Protected : " + ref.proMemb);
        System.out.println("Public : " + ref.pubMemb);
        System.out.println("Package : " + ref.pacMemb);

    }

    public void baz() {
        System.out.println("static data :" + classData);
    }
    
}
