package ek.osnb.functional.exercises;

import org.junit.jupiter.api.Test;

import static ek.osnb.functional.exercises.Lesson1Lambdas.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson1LambdasTest {

    @Test
    void fixedDiscountSubtractsTheAmount() {
        PriceRule discount = fixedDiscount(50);

        assertEquals(150.0, discount.apply(200));
        assertEquals(50.0, discount.apply(100));
    }

    @Test
    void fixedDiscountWorksWithCalculatePrice() {
        assertEquals(250.0, calculatePrice(300, fixedDiscount(50)));
    }

    @Test
    void combineAppliesTheFirstRuleAndThenTheSecond() {
        PriceRule discount = percentageDiscount(10);
        PriceRule bookingFee = price -> price + 25;

        assertEquals(205.0, combine(discount, bookingFee).apply(200));
        assertEquals(202.5, combine(bookingFee, discount).apply(200));
    }
}
