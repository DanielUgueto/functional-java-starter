package ek.osnb.functional;

import java.util.function.*;

/** Lesson 2: Functional interfaces. Run Lesson2InterfacesTest to check the Challenge. */
public class Lesson2Interfaces {

    /**
     * Challenge: a function that subtracts the discount from the price of products
     * the predicate says yes to. Other products keep their price.
     */
    static Function<Product, Integer> discountedPrice(Predicate<Product> eligible, int discount) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Product book = new Product("Clean Code", 300, "Books");
        Product laptop = new Product("Laptop", 8000, "Electronics");
        Product mouse = new Product("Mouse", 200, "Electronics");

        // Exercise 1: shout, countCharacters, describe
        // Expected: HELLO, 4, Length: 4


        // Exercise 2: affordable, isBook, affordableBook, notAffordable, affordableOrBook
        // Expected for affordableBook: true, false, false


        // Try it: a Consumer<Product> that prints "Clean Code costs 300 kr"


        // Try it: a Supplier<Product> that produces a "Mystery box"


    }
}
