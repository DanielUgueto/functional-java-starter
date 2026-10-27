package ek.osnb.functional;

import org.junit.jupiter.api.Test;

import static ek.osnb.functional.Lesson1Lambdas.*;
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
    void addFeeAddsTheFee() {
        PriceRule bookingFee = addFee(25);

        assertEquals(225.0, bookingFee.apply(200));
        assertEquals(325.0, bookingFee.apply(300));
    }
}
