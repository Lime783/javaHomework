package org.example.template;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Task 1
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek);
        System.out.println("=========================");

        // Task 2
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
        System.out.println("====================================================");

        // Task 3
        DayOfWeek saturday = DayOfWeek.SATURDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(monday == saturday);
        System.out.println(monday == dayOfWeek);
        System.out.println("==========================");

        // Task 4
        System.out.println(switch (dayOfWeek) {
            case MONDAY -> "Start of the week";
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Middle of the week";
            case SATURDAY, SUNDAY -> "Weekend";
        });
        System.out.println("====================================================");

        // Task 5
        System.out.println(monday.isWeekend());
        System.out.println(saturday.isWeekend());
        System.out.println("==========================");

        // Task 6
        for (Month month : Month.values()) {
            System.out.println(month + " " + month.getDays());
        }
        System.out.println("====================================================");

        // Task 8, 9
        for (Month month : Month.values()) {
            System.out.println(month + " " + month.ordinal() + " | " + (month.isHolidaySeason ? "Holiday" : "Not a holiday"));
        }
        System.out.println(Month.JANUARY.compareTo(Month.DECEMBER));
        System.out.println("==========================");

        // Task 10
        Person person1 = new Person("Arek", DayOfWeek.MONDAY);
        Person person2 = new Person("Bartek", DayOfWeek.TUESDAY);
        Person person3 = new Person("Czarek", DayOfWeek.WEDNESDAY);

        List<Person> people = Arrays.asList(person1, person2, person3);

        for (Person person : people) {
            person.showDayOff();
        }
        System.out.println("====================================================");

        // Task 11
        List<Month> months = Arrays.asList(Month.JANUARY, Month.FEBRUARY, Month.DECEMBER);
        int sumOfDays = 0;

        for (Month month : months) {
            System.out.println(month);
            sumOfDays += month.getDays();
        }

        System.out.println(sumOfDays);
        System.out.println("==========================");

        // Task 12
        for (Currency currency : Currency.values()) {
            System.out.println(currency + " " + currency.getSymbol());
        }
        System.out.println("====================================================");

        // Task 13
        for (Operation operation : Operation.values()) {
            System.out.println(operation.calculate(BigDecimal.TWO, BigDecimal.TEN));
        }
        System.out.println("==========================");

        // Task 14
        for (OrderStatus  orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus + " | " + (orderStatus.isActive() ? "Active" : "Inactive"));
        }
        System.out.println("====================================================");

        // Task 15
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }
    }
}
