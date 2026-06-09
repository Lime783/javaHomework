package org.example.homework_06_OOP.task11_17;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Adam", 1);
        Person person2 = new Person("Bartek", 20);

        // Task 11
        person1.introduceYourself();
        person2.introduceYourself();

        // Task 12
        person1.introduceYourself("Siema");
        person2.introduceYourself("Eniu");

        // Task 13, 14
        Person person3 = new Person("Czarek");
        person3.introduceYourself();

        // Task 15
        System.out.println(Person.numberOfPeople);
        System.out.println(person1.numberOfPeople);

        // Task 16
        List<Person> people = Arrays.asList(person1, person2, person3);
        for (Person person : people) {
            System.out.println(person.checkWhetherPersonIsAnAdult() ?
                    person.name + " is an adult" :
                    person.name + " is not an adult");
        }

        // Task 17
        System.out.println(person1.ageDifference(person2));
    }
}
