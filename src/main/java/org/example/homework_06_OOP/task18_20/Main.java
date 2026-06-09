package org.example.homework_06_OOP.task18_20;

import java.math.BigDecimal;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product("apple", new BigDecimal("1.0"));
        Product product2 = new Product("banana", new BigDecimal("2.0"));

        // Task 18
        product1.showProduct();
        product2.showProduct();

        // Task 19
        product1.reducePrice(new BigDecimal("0.01"));
        System.out.println(product1.price);
        product2.reducePrice(new BigDecimal("1.00"), "too expensive");
        System.out.println(product2.price);

        // Task 20
        List<Product> products = Arrays.asList(product1, product2);

        Shop shop = new Shop("Didl", products);
        shop.showProducts();
    }
}
