
package com.impetusits;

/**
 *
 * @author Akash
 */
public class Application {
public static void main(String[] args) {
        Sample sampleRef = new Sample();
//      Private memebers cannot be accessed directly outside its own class
//      System.out.println("Private Data : " + sampleRef.private_data);

//      private member accessed through member function 
        System.out.println("Private Data accessed indirectly via public method: " 
                + sampleRef.getPrivate_data());
        
//      public member accessable where  class object is accessable     
//      Protected member accessable in its own package
        System.out.println("Public Data accessed directly: " 
                + sampleRef.public_data);
        
//      Protected member accessable in its own package
        System.out.println("Protected Data accessed directly: " 
                + sampleRef.protected_data);
        
//      Package member accessable in its own package
        System.out.println("Package Data accessed directly: " 
                + sampleRef.package_data);
    }
}
