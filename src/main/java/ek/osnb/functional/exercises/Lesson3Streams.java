package ek.osnb.functional.exercises;

import java.util.*;
import java.util.function.*;

/**
 * Lesson 3: Streams. Run Lesson3StreamsTest to check Exercise 3.
 */
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
        List<String> getNames = products
                .stream()
                .map(Product::name)
                .toList();

        List<Product> expensive = products
                .stream()
                .filter(p -> p.price() >= 200)
                .toList();

        List<String> formatted = products.stream()
                .map(p -> p.name() + " (" + p.price() + " kr)")
                .toList();

        List<String> findByCategory = products
                .stream()
                .filter(p -> p.category().equals("Electronics"))
                .map(Product::name)
                .toList();

        List<Integer> seePriceByCategory = products
                .stream()
                .filter(p -> p.category().equals("Books"))
                .map(Product::price)
                .toList();

        List<String> cheapToUppercase = products
                .stream()
                .filter(p -> p.price() < 200)
                .map(Product::name)
                .map(String::toUpperCase)
                .toList();

        System.out.println("1.1 " + getNames);
        System.out.println("1.2 " + expensive);
        System.out.println("1.3 " + formatted);
        System.out.println("1.4 " + findByCategory);
        System.out.println("1.5 " + seePriceByCategory);
        System.out.println("1.6 " + cheapToUppercase);

        List<String> containsO = products
                .stream()
                .map(Product::name)
                .filter(name -> name.toLowerCase().contains("o"))
                .toList();

        System.out.println("BONUS: " + containsO);

        System.out.println();

        // Exercise 2: sort and count
        // Expected: [Clean Code, Java Basics, Laptop, Mouse, Notebook, Pen], [Laptop, Clean Code], 2, 60

        List<String> sortNamesAlpha = products
                .stream()
                .map(Product::name)
                .sorted()
                .toList();

        System.out.println("2.1 " + sortNamesAlpha);

        List<String> twoMostExpensive = products
                .stream()
                .sorted(Comparator.comparingInt(Product::price).reversed())
                .map(Product::name)
                .limit(2)
                .toList();

        System.out.println("2.2 " + twoMostExpensive);

        long howManyByCategory = products
                .stream()
                .filter(p -> p.category().equals("Books"))
                .count();

        System.out.println("2.3 " + howManyByCategory);

        int totalPriceByCategory = products
                .stream()
                .filter(p -> p.category().equals("Office"))
                .mapToInt(Product::price)
                .sum();

        System.out.println("2.4 " + totalPriceByCategory);


        // Exercise 3: test searchProducts()
        // Expected: [Pen, Notebook, Java Basics]


    }
}
