package org.example.homework_17_annotations.task2;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        System.out.println(vehicle.description());
        System.out.println(vehicle.oldMethod());
        System.out.println(car.description());
//        car.oldMethod();
        car.newMethod();

        BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);
        BiConsumer<Integer, Integer> sub = (a, b) -> System.out.println(a - b);

        add.accept(1, 2);
        sub.accept(1, 2);
    }
}
