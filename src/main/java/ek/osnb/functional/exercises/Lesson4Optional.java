package ek.osnb.functional.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import java.util.*;

/**
 * Lesson 4: Optional. Run Lesson4OptionalTest to check your methods.
 */
public class Lesson4Optional {

    /**
     * Exercise 1: the first product with the given name, or an empty Optional.
     */
    static Optional<Product> findProduct(List<Product> products, String name) {
        return products.stream()
                .filter(p -> p.name().equals(name))
                .findFirst();
    }

    /**
     * Exercise 3: the product with the given name.
     * Throws IllegalArgumentException("Product not found: " + name) if it doesn't exist.
     */
    static Product requireProduct(List<Product> products, String name) {
        return findProduct(products, name)
                .orElseThrow(() -> new IllegalArgumentException("Product not found: " + name));
    }

    /**
     * Exercise 4: "Name (Price kr)" if the product exists and costs less than 500 kr.
     * Otherwise "Not available".
     */
    static String productLabel(List<Product> products, String name) {
        return findProduct(products, name)
                .filter(p -> p.price() < 500)
                .map(p -> p.name() + " (" + p.price() + " kr)")
                .orElse("Not available");
    }

    public static void main(String[] args) {
        List<Product> products = SampleData.products();

        // Exercise 1: test findProduct() with "Laptop" and "Keyboard", then orElse() with a fallback product
        System.out.println("Exercise 1");

        System.out.println(findProduct(products, "Laptop"));
        System.out.println(findProduct(products, "Keyboard"));

        Product fallback = new Product("Unknown", 0, "Unknown");

        System.out.println(findProduct(products, "Keyboard").orElse(fallback));

        System.out.println();

        // Exercise 2: findProduct(), map() and orElse()
        // Expected: 8000, Office, NOT FOUND
        System.out.println("Exercise 2");

        System.out.println(findProduct(products, "Laptop")
                .map(Product::price)
                .orElse(0));

        System.out.println(findProduct(products, "Pen")
                .map(Product::category)
                .orElse("Unknown"));

        System.out.println(findProduct(products, "Keyboard")
                .map(Product::name)
                .map(String::toUpperCase)
                .orElse("Not Found"));

        System.out.println();

        // Exercise 3: test requireProduct() with "Laptop" and "Keyboard"
        System.out.println("Exercise 3");

        Product laptop = requireProduct(products, "Laptop");

        System.out.println(laptop.name());

        System.out.println();

        // Exercise 4: test productLabel() with "Clean Code", "Laptop" and "Keyboard"
        // Expected: Clean Code (300 kr), Not available, Not available

        System.out.println("Exercise 4");

        System.out.println(productLabel(products, "Clean Code"));
        System.out.println(productLabel(products, "Laptop"));
        System.out.println(productLabel(products, "Keyboard"));

        System.out.println();
    }
}
