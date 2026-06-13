package org.example.homework_07_enum;

public class Person {
    String name;
    DayOfWeek dayOff;

    public Person(String name, DayOfWeek dayOff) throws Exception {
        if (name.length() < 3) {
            throw new Exception("Name is too short");
        }
        this.name = name;
        this.dayOff = dayOff;
    }

    public Person() throws Exception {
        this("Anon", DayOfWeek.SUNDAY);
    }

    protected void showDayOff() {
        System.out.println(dayOff);
    }
}
