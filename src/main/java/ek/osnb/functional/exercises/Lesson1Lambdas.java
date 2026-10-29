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
        return price -> price - amount;
    }

    /** Challenge: a rule that applies first and then second. */
    static PriceRule combine(PriceRule first, PriceRule second) {
        return price -> first.apply(second.apply(price));
    }

    public static void main(String[] args) {
        // Exercise 1: use calculatePrice() with a lambda
        // Expected: 240.0, 250.0, 325.0
        System.out.println("Exercise 1");
        System.out.println(calculatePrice(300, price -> price * 0.8)); //20%
        System.out.println(calculatePrice(300, price -> price - 50)); //-50
        System.out.println(calculatePrice(300, price -> price + 25)); //+25

        System.out.println();


        // Exercise 2: halfPrice, addShipping and minimumPrice
        // Expected: 100.0, 239.0, 100.0, 150.0
        System.out.println("Exercise 2");
        PriceRule halfPrice = price -> price / 2;
        PriceRule addShipping = price -> price + 39;
        PriceRule minimumPrice = price -> Math.max(price, 100); //det er åbenbart byttet rundt i java google det til fremtidige mig

        System.out.println(halfPrice.apply(200));
        System.out.println(addShipping.apply(200));
        System.out.println(minimumPrice.apply(50));
        System.out.println(minimumPrice.apply(150));

        System.out.println();


        // Exercise 3: test fixedDiscount()
        // Expected: 150.0, 50.0
        System.out.println("Exercise 3");
        PriceRule discount = fixedDiscount(50);

        System.out.println(discount.apply(200));
        System.out.println(discount.apply(100));

        System.out.println();

        // Challenge: test combine()
        // Expected: 175.0
        System.out.println("Exercise 4");
        PriceRule first = price -> price + 50;
        PriceRule second = price -> price + 25;

        System.out.println(combine(first, second).apply(100));

        System.out.println();

    }
}
