
package com.impetusits;

/**
 *
 * @author Akash
 */
public class Sample {
    private String private_data = "Private Data value";
    public String public_data = "Public Data value";
    protected String protected_data = "Protected Data value";
    String package_data = "Package_data value";

    public String getPrivate_data() {
        return private_data;
    }

    public String getPublic_data() {
        return public_data;
    }

    public String getProtected_data() {
        return protected_data;
    }

    public String getPackage_data() {
        return package_data;
    }

    public String foo(){
        return  private_data+
                package_data+
                protected_data+
                public_data;
                
    }
    
}
