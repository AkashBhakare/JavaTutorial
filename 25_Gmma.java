
/*
Other unrelated class in another package
 */
package com.impetusits.second;

import com.impetusits.first.Alpha;
/**
 *
 * @author Akash
 */
public class Gmma {

    public void doSomeThing() {
        Alpha ref = new Alpha();
//        Only public members are accessible in an unrelated
//        class in another package

//        System.out.println("Private : " + ref.priMemb);
//        System.out.println("Protected : " + ref.proMemb);
//        System.out.println("Package : "+ref.pacMemb);
        System.out.println("Public : " + ref.pubMemb);
       

    }
}
