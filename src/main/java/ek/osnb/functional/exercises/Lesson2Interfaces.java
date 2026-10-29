package ek.osnb.functional.exercises;

import java.util.function.*;

/**
 * Lesson 2: Functional interfaces. Run Lesson2InterfacesTest to check Exercise 4.
 */
public class Lesson2Interfaces {

    /**
     * Exercise 4: a function that subtracts the discount from the price of products
     * the predicate says yes to. Other products keep their price.
     */
    static Function<Product, Integer> discountedPrice(Predicate<Product> eligible, int discount) {
        return p -> eligible.test(p) ? p.price() - discount : p.price();
    }

    public static void main(String[] args) {
        Product book = new Product("Clean Code", 300, "Books");
        Product laptop = new Product("Laptop", 8000, "Electronics");
        Product mouse = new Product("Mouse", 200, "Electronics");

        // Exercise 1: shout, countCharacters, then countCharacters.andThen(describe)
        // Expected: HELLO, 4, Length: 4
        System.out.println("Exercise 1");

        Function<String, String> shout = s -> s.toUpperCase();
        Function<String, Integer> countCharacters = s -> s.length();
        Function<Integer, String> describe = d -> "Length: " + d;

        System.out.println(shout.apply("hello"));
        System.out.println(countCharacters.apply("hell"));
        System.out.println(countCharacters.andThen(describe).apply("hell"));

        System.out.println();


        // Exercise 2: affordable, isBook, affordableBook (if you finish early: notAffordable, affordableOrBook)
        // Expected for affordableBook: true, false, false
        System.out.println("Exercise 2");

        Predicate<Product> affordable = p -> p.price() < 500;
        Predicate<Product> isBook = p -> p.category().equals("Books");
        Predicate<Product> affordableBook = affordable.and(isBook);

        Predicate<Product> notAffordable = affordable.negate();
        Predicate<Product> affordableOrBook = affordable.or(isBook);

        System.out.println(affordable.test(book));
        System.out.println(isBook.test(mouse));
        System.out.println(affordableBook.test(laptop));

        System.out.println(notAffordable.test(laptop));
        System.out.println(affordableOrBook.test(mouse));

        System.out.println();


        // Exercise 3: a Consumer<Product> that prints "Clean Code costs 300 kr"
        // and a Supplier<Product> that provides a "Mystery box"
        System.out.println("Exercise 3");

        Consumer<Product> printDetails = p-> System.out.println(p.name() + " costs " + p.price() + " kr");
        Supplier<Product> mysteryBox = () -> new Product("Mystery Box", 99, "Other");

        printDetails.accept(book);
        System.out.println(mysteryBox.get().name());

        System.out.println();

        // Exercise 4: test discountedPrice()
        // Expected: 300, 7900
        System.out.println("Exercise 4");

        Predicate<Product> expensive = product -> product.price() >= 500;
        Function<Product, Integer> sale = discountedPrice(expensive, 100);

        System.out.println(sale.apply(book));
        System.out.println(sale.apply(laptop));

        System.out.println();

    }
}
