/*
SubClass in another package
 */
package com.impetusits.second;

import com.impetusits.first.Alpha;
/**
 *
 * @author Akash
 */
public class AlphaSub extends Alpha {
    public void baz(){
//       Only public and protected members of super class
//       defined in another package are accessible 
//        System.out.println("Private : "+ priMemb);
        System.out.println("Protected : "+ proMemb);
        System.out.println("Public : "+ pubMemb);
//        System.out.println("Package : "+ pacMemb);
        
    }
}
