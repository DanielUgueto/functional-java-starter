package ek.osnb.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static ek.osnb.functional.Lesson3Streams.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson3StreamsTest {

    private final List<Product> products = SampleData.products();

    @Test
    void returnsTheCheapestMatchingNames() {
        List<String> result = searchProducts(products, product -> product.price() < 500, 3);

        assertEquals(List.of("Pen", "Notebook", "Java Basics"), result);
    }

    @Test
    void returnsAllMatchesWhenThereAreFewerThanTheLimit() {
        List<String> result = searchProducts(products, product -> product.category().equals("Books"), 5);

        assertEquals(List.of("Java Basics", "Clean Code"), result);
    }

    @Test
    void returnsAnEmptyListWhenNothingMatches() {
        List<String> result = searchProducts(products, product -> product.category().equals("Clothing"), 5);

        assertEquals(List.of(), result);
    }

    @Test
    void theOriginalListIsNotChanged() {
        searchProducts(products, product -> true, 6);

        assertEquals("Clean Code", products.getFirst().name());
        assertEquals(6, products.size());
    }
}
