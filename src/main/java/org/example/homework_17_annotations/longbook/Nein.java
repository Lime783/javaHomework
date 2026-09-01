package org.example.homework_17_annotations.longbook;

import java.util.ArrayList;
import java.util.List;

public class Nein {
    public static void main(String[] args) {
        Person person1 = new Person("abc@fastmail.com");
        Person person2 = new Person("Kamil", "Ślimak", List.of("A", "B"), "aa@aa.aa", "hasloMaslo", 1);
        Person person3 = Person.newPerson()
                .name("Kamil")
                .surname("Ślimak")
                .nickname("Jol")
                .nickname("Menik")
                .nickname("Mobbyn")
                .email("accac")
                .password("aaaaa")
                .age(20)
                .birth();

        CoolerCoolerPerson coolerPerson1 = CoolerCoolerPerson.builder()
                .isCool(true)
                .name("Kamil")
                .build();

        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
        person2.setAge(999);
        System.out.println(person2.getAge());
        System.out.println(person3);
        System.out.println(person2.equals(person3));
        System.out.println(coolerPerson1.isCool);
    }
}
