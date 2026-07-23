package org.example.homework_12_functionalInterfaces;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void task1() {
        Runnable runnable1 = () -> System.out.println("Starting");
        Runnable runnable2 = () -> System.out.println("Finishing");
        runnable1.run();
        runnable2.run();
        System.out.println("=============================");
    }

    public static void task2() {
        Function<String, String> trimLogin = String::trim;
        Function<String, String> lowercaseLogin = String::toLowerCase;
        Function<String, String> deleteWhitespaces = login -> login.replace(" ", "");
        Function<String, String> normalizeLogin = trimLogin.andThen(lowercaseLogin).andThen(deleteWhitespaces);

        String[] logins = {"  Adam  ", "ANIA K  ", "  k o w a l "};
        ArrayList<String> normalizedLogins = new ArrayList<>();
        for (String login : logins) {
            normalizedLogins.add(normalizeLogin.apply(login));
        }

        for (String normalizedLogin : normalizedLogins) {
            System.out.println(normalizedLogin);
        }
        System.out.println("=============================");
    }

    public static void task3(String text) {
        Function<String, Integer> countLength = someText -> someText.replace(" ", "").length();
        Function<String, Integer> countVowels = someText -> {
            int counter = 0;
            for (int i = 0; i < someText.length(); i++) {
                if (isVowel(someText.charAt(i))) {
                    counter++;
                }
            }
            return counter;
        };
        System.out.println(countLength.apply(text));
        System.out.println(countVowels.apply(text));
        System.out.println("=============================");
    }

    private static boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y';
    }

    public static void task4() {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> sub = (int1, int2) -> int1 - int2;
        BiFunction<Integer, Integer, Integer> mul = (int1, int2) -> int1 * int2;
        BiFunction<Integer, Integer, Integer> div = (int1, int2) -> int1 / int2;
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        BiFunction<Integer, Integer, Integer> operation;

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter an operation (+, -, *, /): ");
        operation = switch (scanner.next()) {
            case "+" -> add;
            case "-" -> sub;
            case "*" -> mul;
            case "/" -> div;
            default -> throw new IllegalArgumentException("Not a valid operation");
        };
        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        System.out.println(calculate(number1, number2, operation));
        System.out.println("=============================");
    }

    static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> operation) {
        return operation.apply(a, b);
    }

    public static void task5() {
        UnaryOperator<List<Integer>> removeNegatives = listOfIntegers -> {
            listOfIntegers.removeIf(number -> number < 0);
            return listOfIntegers;
        };

        BinaryOperator<Integer> greaterNumber = (number1, number2) -> {
            if (number1 > number2) {
                return number1;
            }
            return number2;
        };

        List<Integer> nums = new ArrayList<>(List.of(3, -1, 7, -5, 10, 0, 1));
        removeNegatives.apply(nums);

        Integer maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            maxNumber = greaterNumber.apply(nums.get(i), maxNumber);
        }
        System.out.println(nums);
        System.out.println(maxNumber);
        System.out.println("=============================");
    }

    public static void task6() {
        String[] logins = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};
        Predicate<String> isCorrectLength = login -> login.length() >= 3;
        Predicate<String> containsOnlyLettersOrDigits = login -> login.matches("[a-zA-Z0-9]+");
        Predicate<String> startsWithALetter = login -> login.matches("^[a-zA-Z].*");
        Predicate<String> isValidLogin = isCorrectLength.and(containsOnlyLettersOrDigits).and(startsWithALetter);

        int counter = 0;
        for (String login : logins) {
            if (isValidLogin.test(login)) {
                counter++;
                System.out.println(login);
            }
        }
        System.out.println(counter);
        System.out.println("=============================");
    }

    public static void task7(String text1, String text2) {
        BiPredicate<String, String> sameIgnoreCase = String::equalsIgnoreCase;
        BiPredicate<String, String> isSuffix = String::endsWith;

        System.out.println(sameIgnoreCase.test(text1, text2));
        System.out.println(isSuffix.test(text1, text2));
        System.out.println("=============================");
    }

    public static void task8(ArrayList<String> list) {
        Consumer<String> logger = System.out::println;
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ") ");
            logger.accept(list.get(i));
        }
        System.out.println("=============================");
    }

    public static void task9() {
        Map<String, Integer> products = Map.of("Apple", 2, "Banana", 100, "Coconut", 0);
        BiConsumer<String, Integer> reporter = (name, quantity) -> {
            System.out.println("Name: " + name + ", quantity: " + quantity);
        };
        printReport(products, reporter);
        System.out.println("=============================");
    }

    static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            consumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public static void task10() {
        Random radom = new Random();
        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Supplier<String> codeSupplier = () -> {
            String password = "";
            for (int i = 0; i <= 6; i++) {
                int randomCharacter = radom.nextInt(CHARACTERS.length());
                password += CHARACTERS.substring(randomCharacter, randomCharacter + 1);
            }
            return password;
        };

        ArrayList<String> passwords = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            passwords.add(codeSupplier.get());
        }

        for (String password : passwords) {
            System.out.println(password);
        }
    }

    //    public static void task(){}

    //    public static void task(){}

    //    public static void task(){}

    public static void main(String[] args) {
        task1();
        task2();
        task3("  Hel lo   ");
//        task4();
        task5();
        task6();
        task7("aaabb", "AaAbb");
        task8(new ArrayList<>(List.of("a", "bb", "ccc", "dddd")));
        task9();
        task10();
    }
}