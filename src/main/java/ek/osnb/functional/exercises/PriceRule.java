package ek.osnb.functional.exercises;

/** A rule that turns a price into a new price. Used in lesson 1. */
@FunctionalInterface
public interface PriceRule {

    double apply(double price);
}
