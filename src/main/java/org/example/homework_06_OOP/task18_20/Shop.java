package org.example.homework_06_OOP.task18_20;

import java.util.List;

public class Shop {
    String name;
    List<Product> products;

    // Task 20
    public Shop(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    protected void showProducts(){
        for (Product product : this.products){
            System.out.println(product);
        }
    }
}
