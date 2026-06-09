package org.example.homework_06_OOP.task01_10;

public class Main {
    public static void main(String[] args) {
        // Task 01
        Car car1 = new Car();
        car1.brand = "Audi";
        car1.yearOfProduction = 2018;
        System.out.println(car1.brand + " " + car1.yearOfProduction);

        // Task 02, 06
        Car car2 = new Car();
        System.out.println(car2.brand + " " + car2.yearOfProduction);

        // Task 03
        Car car3 = new Car("BMW", 2002);
        System.out.println(car3.brand + " " + car3.yearOfProduction);
        Car car4 = new Car("Citroen", 2000);
        System.out.println(car4.brand + " " + car4.yearOfProduction);

        // Task 04
        car1.showDifference();

        // Task 05
        car1.changeBrand("Alfa Romeo");
        System.out.println(car1.brand);

        // Task 07
        car1.introduceYourself();
        car2.introduceYourself();

        // Task 08
        Car.classDescription();

        // Task 09
        System.out.println("There are currently " + Car.counter + " cars");

        // Task 10
        Car[] cars = {car1, car2, car3};
        for (Car car : cars) {
            car.introduceYourself();
        }
    }
}
