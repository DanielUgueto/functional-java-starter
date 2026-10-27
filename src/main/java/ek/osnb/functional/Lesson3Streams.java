package ek.osnb.functional;

import java.util.*;
import java.util.function.*;

/** Lesson 3: Streams. Run Lesson3StreamsTest to check Exercise 3. */
public class Lesson3Streams {

    /**
     * Exercise 3: the names of the products that match the condition,
     * cheapest first, at most limit of them.
     */
    static List<String> searchProducts(List<Product> products, Predicate<Product> condition, int limit) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        List<Product> products = SampleData.products();

        // Exercise 1: filter and map
        // Expected:
        // 1. [Clean Code, Java Basics, Laptop, Mouse, Notebook, Pen]
        // 2. Clean Code, Laptop and Mouse
        // 3. [Clean Code (300 kr), Java Basics (150 kr), Laptop (8000 kr), Mouse (200 kr), Notebook (40 kr), Pen (20 kr)]
        // 4. [Laptop, Mouse]
        // 5. [300, 150]
        // 6. [JAVA BASICS, NOTEBOOK, PEN]


        // Exercise 2: sort and count
        // Expected: [Clean Code, Java Basics, Laptop, Mouse, Notebook, Pen], [Laptop, Clean Code], 2, 60


        // Exercise 3: test searchProducts()
        // Expected: [Pen, Notebook, Java Basics]


    }
}
