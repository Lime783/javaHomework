package org.example.homework_07_enum;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("1. ====================================================");


        // Task 1
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek);
        System.out.println("2. =========================");

        // Task 2
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
        System.out.println("3. ====================================================");

        // Task 3
        DayOfWeek saturday = DayOfWeek.SATURDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(monday == saturday);
        System.out.println(monday == dayOfWeek);
        System.out.println("4. ==========================");

        // Task 4
        System.out.println(dayOfWeek.name() + " -> " + switch (dayOfWeek) {
            case MONDAY -> "Start of the week";
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Middle of the week";
            case SATURDAY, SUNDAY -> "Weekend";
        });
        System.out.println("5. ====================================================");

        // Task 5
        System.out.println(monday.isWeekend());
        System.out.println(saturday.isWeekend());
        System.out.println("6. ==========================");

        // Task 6
        for (Month month : Month.values()) {
            System.out.println(month + " " + month.getDays());
        }
        System.out.println("8. && 9. ====================================================");

        // Task 8, 9
        for (Month month : Month.values()) {
            System.out.println(month + " " + month.ordinal() + " | " + (month.isHolidaySeason ? "Holiday" : "Not a holiday"));
        }
        System.out.println(Month.JANUARY.compareTo(Month.DECEMBER));
        System.out.println("10. ==========================");

        // Task 10
        Person person1 = new Person("Arek", DayOfWeek.MONDAY);
        Person person2 = new Person("Bartek", DayOfWeek.TUESDAY);
        Person person3 = new Person("Czarek", DayOfWeek.WEDNESDAY);

        List<Person> people = Arrays.asList(person1, person2, person3);

        for (Person person : people) {
            person.showDayOff();
        }
        System.out.println("11. ====================================================");

        // Task 11
        List<Month> months = Arrays.asList(Month.JANUARY, Month.FEBRUARY, Month.DECEMBER);
        int sumOfDays = 0;

        for (Month month : months) {
            System.out.println(month);
            sumOfDays += month.getDays();
        }

        System.out.println("Sum of days: " + sumOfDays);
        System.out.println("12. ==========================");

        // Task 12
        for (Currency currency : Currency.values()) {
            System.out.println(currency + " " + currency.getSymbol());
        }
        System.out.println("13. ====================================================");

        // Task 13
        for (Operation operation : Operation.values()) {
            System.out.println(operation.calculate(BigDecimal.TWO, BigDecimal.TEN));
        }
        System.out.println("14. ==========================");

        // Task 14
        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus + " | " + (orderStatus.isActive() ? "Active" : "Inactive"));
        }
        System.out.println("15. ====================================================");

        // Task 15
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }
        System.out.println("16. ==========================");

        // Task 16
        Logger.INSTANCE.logInConsole("Siema eniu");
        System.out.println("17. ====================================================");

        // Task 17
        Scanner scanner = new Scanner(System.in);
        MenuOption menuOption;

        System.out.print("Choose a menu option (1 - start, 2 - stop, 3 - exit): ");
        menuOption = switch (scanner.nextInt()) {
            case 1 -> MenuOption.START;
            case 2 -> MenuOption.STOP;
            case 3 -> MenuOption.EXIT;
            default -> throw new Exception("Invalid menu option");
        };
        System.out.println("18. ==========================");

        // Task 18
        Product product1 = new Product("Banana", Category.FOOD);
        Product product2 = new Product("Hat", Category.CLOTHING);
        Product product3 = new Product("Bulb", Category.ELECTRONICS);

        List<Product> products = Arrays.asList(product1, product2, product3);

        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("19. ====================================================");

        // Task 19
        for (Calculation calculation : Calculation.values()) {
            System.out.println(calculation.calculate(new BigDecimal("1.23"), BigDecimal.TEN));
        }
        System.out.println("20. ==========================");

        // Task 20
        DayOfWeek saturday2 = DayOfWeek.SATURDAY;
        System.out.println("saturday == saturday2: " + (saturday == saturday2));
        System.out.println("saturday.equals(saturday2): " + (saturday.equals(saturday2)));
    }
}