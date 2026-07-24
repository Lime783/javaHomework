package org.example.homework_12_functionalInterfaces;

@FunctionalInterface
interface PriceStrategy {
    double apply(double basePrice);
}
