package ek.osnb.functional;

import java.util.*;

/** Lesson 4: Optional. Run Lesson4OptionalTest to check your methods. */
public class Lesson4Optional {

    /** Exercise 1: the first product with the given name, or an empty Optional. */
    static Optional<Product> findProduct(List<Product> products, String name) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exercise 3: the product with the given name.
     * Throws IllegalArgumentException("Product not found: " + name) if it doesn't exist.
     */
    static Product requireProduct(List<Product> products, String name) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Exercise 4: "Name (Price kr)" if the product exists and costs less than 500 kr.
     * Otherwise "Not available".
     */
    static String productLabel(List<Product> products, String name) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        List<Product> products = SampleData.products();

        // Exercise 1: test findProduct() with "Laptop" and "Keyboard", then orElse() with a fallback product


        // Exercise 2: findProduct(), map() and orElse()
        // Expected: 8000, Office, NOT FOUND


        // Exercise 3: test requireProduct() with "Laptop" and "Keyboard"


        // Exercise 4: test productLabel() with "Clean Code", "Laptop" and "Keyboard"
        // Expected: Clean Code (300 kr), Not available, Not available


    }
}
