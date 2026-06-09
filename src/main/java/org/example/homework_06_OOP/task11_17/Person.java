package org.example.homework_06_OOP.task11_17;

public class Person {
    String name;
    int age;
    static int numberOfPeople;

    // Task 11, 13, 15
    public Person(String name, int age) throws Exception {
        this.name = name;
        if (age < 0) {
            throw new Exception("Age cannot be negative");
        }
        this.age = age;
        numberOfPeople++;
    }

    // Task 13, 14
    public Person(String name) throws Exception {
        this(name, 0);
    }

    // Task 11
    protected void introduceYourself() {
        System.out.println(name + ", " + age);
    }

    // Task 12
    protected void introduceYourself(String greeting) {
        System.out.println(greeting + " " + name + ", " + age);
    }

    // Task 16
    protected boolean checkWhetherPersonIsAnAdult(){
        return this.age >= 18;
    }

    // Task 17
    protected int ageDifference(Person otherPerson){
        return Math.abs(this.age - otherPerson.age);
    }
}
