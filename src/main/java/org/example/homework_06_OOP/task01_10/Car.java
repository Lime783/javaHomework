package org.example.homework_06_OOP.task01_10;

public class Car {
    String brand;
    int yearOfProduction;
    static int counter = 0;

    // Task 03
    Car(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        counter++;
    }

    // Task 02, 06
    Car() {
    //    this.brand = "Unknown";
    //    this.yearOfProduction = 2000;
        this("Unknown", 2000);
    }

    // Task 04
    protected void showDifference(){
        String brand = "Siema eniu";
        System.out.println("brand: " + brand + " this.brand: " + this.brand);
    }

    // Task 05
    protected void changeBrand(String newBrand){
        this.brand = newBrand;
    }

    // Task 07
    protected void introduceYourself(){
        System.out.println("I am a car of brand " + this.brand + " from year " + this.yearOfProduction);
    }

    // Task 08
    static protected void classDescription(){
        System.out.println("This class represents cars");
    }
}
