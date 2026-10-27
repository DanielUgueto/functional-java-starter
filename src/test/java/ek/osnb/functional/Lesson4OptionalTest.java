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
    void searchProductsFindsAffordableProducts() {
        List<String> affordable = searchProducts(
                products,
                product -> product.price() < 500,
                Product::name,
                3);

        assertEquals(List.of("Pen", "Notebook", "Java Basics"), affordable);
    }

    @Test
    void searchProductsUsesTheFormatter() {
        List<String> electronics = searchProducts(
                products,
                product -> product.category().equals("Electronics"),
                product -> product.name() + " - " + product.price() + " kr",
                5);

        assertEquals(List.of("Mouse - 200 kr", "Laptop - 8000 kr"), electronics);
    }

    @Test
    void searchProductsReturnsAnEmptyListWhenNothingMatches() {
        List<String> missing = searchProducts(
                products,
                product -> product.category().equals("Clothing"),
                Product::name,
                5);

        assertEquals(List.of(), missing);
    }
}
