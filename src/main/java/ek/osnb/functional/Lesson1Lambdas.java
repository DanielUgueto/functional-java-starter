package ek.osnb.functional;

/** Lesson 1: Lambdas. Run Lesson1LambdasTest to check Exercise 3. */
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

    /** Exercise 3 (if you finish early): a rule that adds the fee to the price. */
    static PriceRule addFee(double fee) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println(calculatePrice(200, price -> price * 0.90)); // 180.0

        // Exercise 1: use calculatePrice() with a lambda
        // Expected: 240.0, 250.0, 325.0


        // Exercise 2: halfPrice, addShipping, minimumPrice
        // Expected: 100.0, 239.0, 100.0, 150.0


    }
}
