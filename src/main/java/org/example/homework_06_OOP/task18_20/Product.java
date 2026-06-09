package org.example.homework_06_OOP.task18_20;

import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal price;

    // Task 18
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    protected void showProduct(){
        System.out.println(this.name + " " + this.price);
    }

    // Task 19
    protected void reducePrice(BigDecimal price) throws Exception {
        checkPriceValidity(price);
        this.price = this.price.subtract(price);
    }

    protected void reducePrice(BigDecimal price, String reason) throws Exception {
        reducePrice(price);
        System.out.println("Reduced price of " + this.name + " because: " + reason);
    }

    private void checkPriceValidity(BigDecimal priceReduction) throws Exception {
        if (priceReduction.compareTo(BigDecimal.ZERO) < 0){
            throw new Exception("Cannot subtract a negative price");
        }
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
