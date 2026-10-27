package ek.osnb.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static ek.osnb.functional.Lesson4Optional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Lesson4OptionalTest {

    private static final Product LAPTOP = new Product("Laptop", 8000, "Electronics");

    private final List<Product> products = SampleData.products();

    @Test
    void findProductReturnsTheProductWhenItExists() {
        assertEquals(Optional.of(LAPTOP), findProduct(products, "Laptop"));
    }

    @Test
    void findProductReturnsEmptyWhenItDoesNotExist() {
        assertEquals(Optional.empty(), findProduct(products, "Keyboard"));
    }

    @Test
    void requireProductReturnsTheProductWhenItExists() {
        assertEquals(LAPTOP, requireProduct(products, "Laptop"));
    }

    @Test
    void requireProductThrowsWhenItDoesNotExist() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> requireProduct(products, "Keyboard"));

        assertEquals("Product not found: Keyboard", exception.getMessage());
    }

    @Test
    void productLabelShowsAnAffordableProduct() {
        assertEquals("Clean Code (300 kr)", productLabel(products, "Clean Code"));
    }

    @Test
    void productLabelIsNotAvailableWhenTooExpensiveOrMissing() {
        assertEquals("Not available", productLabel(products, "Laptop"));
        assertEquals("Not available", productLabel(products, "Keyboard"));
    }
}
