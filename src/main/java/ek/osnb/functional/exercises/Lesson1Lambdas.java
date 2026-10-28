package ek.osnb.functional.exercises;

/** Lesson 1: Lambdas. Run Lesson1LambdasTest to check Exercise 3 and the Challenge. */
public class Lesson1Lambdas {

    static double calculatePrice(double price, PriceRule rule) {
        return rule.apply(price);
    }

    static PriceRule percentageDiscount(double percent) {
        return price -> price * (1 - percent / 100);
    }

    /** Exercise 3: a rule that subtracts the amount from the price. */
    static PriceRule fixedDiscount(double amount) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Challenge: a rule that applies first and then second. */
    static PriceRule combine(PriceRule first, PriceRule second) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        // Exercise 1: use calculatePrice() with a lambda
        // Expected: 240.0, 250.0, 325.0


        // Exercise 2: halfPrice, addShipping and minimumPrice
        // Expected: 100.0, 239.0, 100.0, 150.0


        // Exercise 3: test fixedDiscount()
        // Expected: 150.0, 50.0


        // Challenge: test combine()
        // Expected: 175.0


    }
}
