package ek.osnb.functional.exercises;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static ek.osnb.functional.exercises.Lesson2Interfaces.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2InterfacesTest {

    private static final Product BOOK = new Product("Clean Code", 300, "Books");
    private static final Product LAPTOP = new Product("Laptop", 8000, "Electronics");

    @Test
    void discountIsSubtractedWhenThePredicateMatches() {
        Predicate<Product> expensive = product -> product.price() >= 500;

        Function<Product, Integer> sale = discountedPrice(expensive, 100);

        assertEquals(300, sale.apply(BOOK));
        assertEquals(7900, sale.apply(LAPTOP));
    }

    @Test
    void thePredicateDecidesWhichProductsGetTheDiscount() {
        Predicate<Product> isBook = product -> product.category().equals("Books");

        Function<Product, Integer> bookSale = discountedPrice(isBook, 50);

        assertEquals(250, bookSale.apply(BOOK));
        assertEquals(8000, bookSale.apply(LAPTOP));
    }
}
