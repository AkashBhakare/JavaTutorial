package com.impetusits;

/**
 *
 * @author Akash
 */
public class Product {

    private final String name;
    private final float price;

    Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    Product(String name) {
        this.name = name;
        this.price = 0.0F;

    }

    @Override
    public String toString() {
        return "[ " + "Product Name : " + name + ",\tPrice : " + price + " ]\n";
    }

}
