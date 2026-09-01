package org.example.homework_17_annotations.task2;

public class Car extends Vehicle {

    @Override
    String description() {
        return "This is a car";
    }

    @Override
    @Deprecated(since = "1.0", forRemoval = true)
    String oldMethod() {
        return "This is a siema eniu";
    }

    void newMethod(){
        System.out.println("This is a void car");
    }
}
