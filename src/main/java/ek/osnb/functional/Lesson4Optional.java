package ek.osnb.functional;

import java.util.*;
import java.util.function.*;

/** Lesson 4: Optional and practice. Run Lesson4OptionalTest to check your methods. */
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
     * Final exercise: the products that match the condition, cheapest first,
     * at most limit of them, each one turned into a String by the formatter.
     */
    static List<String> searchProducts(
            List<Product> products,
            Predicate<Product> condition,
            Function<Product, String> formatter,
            int limit
    ) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        List<Product> products = SampleData.products();

        // Exercise 1: test findProduct() with "Laptop" and "Keyboard"


        // Exercise 2: findProduct(), map() and orElse()
        // Expected: 8000, Office, NOT FOUND


        // Try it: Optional.filter() with "Clean Code", "Laptop" and "Keyboard"


    }
}
