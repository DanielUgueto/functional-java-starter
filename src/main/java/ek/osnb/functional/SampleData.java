package ek.osnb.functional;

import java.util.List;

/**
 * The product catalogue used in lessons 3 and 4.
 * The list is unmodifiable: calling add, remove or sort on it throws an exception.
 */
public final class SampleData {

    private static final List<Product> PRODUCTS = List.of(
            new Product("Clean Code", 300, "Books"),
            new Product("Java Basics", 150, "Books"),
            new Product("Laptop", 8000, "Electronics"),
            new Product("Mouse", 200, "Electronics"),
            new Product("Notebook", 40, "Office"),
            new Product("Pen", 20, "Office")
    );

    private SampleData() {
    }

    public static List<Product> products() {
        return PRODUCTS;
    }
}
