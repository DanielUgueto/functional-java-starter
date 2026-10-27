package ek.osnb.functional;

import java.util.*;
import java.util.function.*;

/** Lesson 3: Streams. Run Lesson3StreamsTest to check the Challenge. */
public class Lesson3Streams {

    /**
     * Challenge: the names of the products that match the condition,
     * cheapest first, at most limit of them.
     */
    static List<String> searchProducts(List<Product> products, Predicate<Product> condition, int limit) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        List<Product> products = SampleData.products();

        // Exercise 1: filter products
        // Expected: [Clean Code, Java Basics], [Clean Code, Laptop, Mouse], [Clean Code, Laptop, Mouse, Notebook]


        // Exercise 2: transform products with map()
        // Expected first element of the third list: Clean Code (300 kr)


        // Exercise 3: combine filter() and map()
        // Expected: [Laptop, Mouse], [300, 150], [JAVA BASICS, NOTEBOOK, PEN]


        // Exercise 4: method references


        // Exercise 5: sort and filter
        // Expected for the third one: [Java Basics, Clean Code]


        // Exercise 6: count, sum and average
        // Expected: 2, 60, 225.0


    }
}
