package org.example.homework_13_Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void allTasks() {
        task1();
        task2();
        task3("XX");
        task4();
        //TODO: czemu nie rzuca na czerwono
        try {
            task5("db.password");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown error " + e.getMessage());
        }
        task6();
        task7(Optional.of("jan.kowalski@example.com"));
        task7(Optional.empty());
        task8();
        task9();
    }

    public static void task1() {
        Optional<String> optional1 = Optional.of("Aaa");
//        Optional<String> optionalBad = Optional.of(null);
//        Program sie wywala i dobrze, cos musi byc co nie jest nullem
//        .of wymaga czegos co nie jest nullem a .ofNullable moze byc wszystkim
        Optional<String> optional2 = Optional.ofNullable("Bbb");
        Optional<String> optional3 = Optional.empty();

        List<Optional<String>> list = new ArrayList<>(List.of(optional1, optional2, optional3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Optional" + i + ": present = " + list.get(i).isPresent() + ", empty = " + list.get(i).isEmpty());
        }
        System.out.println("============================");
    }

    public static void task2() {
        List<String> list = new ArrayList<>(List.of("WA", "KR", "GD", "XX"));

        for (String code : list) {
            Optional<String> codeOrEmpty = switch (code) {
                case "WA" -> Optional.of("Warsaw");
                case "KR" -> Optional.of("Cracow");
                case "GD" -> Optional.of("Gdansk");
                default -> Optional.empty();
            };
            System.out.println(codeOrEmpty.orElse("City not found"));
        }
        System.out.println("============================");
    }

    public static void task3(String code) {
        Optional<String> codeOrEmpty = switch (code) {
            case "WA" -> Optional.of("Warsaw");
            case "KR" -> Optional.of("Cracow");
            case "GD" -> Optional.of("Gdansk");
            default -> Optional.of("City not found");
        };
        System.out.println(codeOrEmpty);

        System.out.println("============================");
    }

    public static void task4() {
        Optional<String> optional1 = Optional.of("aaaaa");
        Optional<String> optional2 = Optional.empty();

        //TODO: czemu nie zawsze orElseGet
        System.out.println("optional orElse: " + optional1.orElse(generateDefault()) + "\n");
        System.out.println("EMPTY optional orElse: " + optional2.orElse(generateDefault()) + "\n");
        System.out.println("optional orElseGet: " + optional1.orElseGet(Main::generateDefault) + "\n");
        System.out.println("EMPTY optional orElseGet: " + optional2.orElseGet(Main::generateDefault) + "\n");
        // orElse gdy mamy stałą a orElseGet gdy może się wykonywać jakaś kosztowna operacja
        System.out.println("============================");
    }

    public static String generateDefault() {
        System.out.println("  >> Generuję wartość domyślną...");
        return "DOMYŚLNA";
    }

    public static void task5(String config) {
        System.out.println(AppConfig.getRequired(config));
        System.out.println("============================");
    }

    public static void task6() {
        String[] nicks = {"Janek", null, "Ania", null, "Kuba"};

        System.out.println("Version A");
        for (String nick : nicks) {
            Optional<String> potentialNick = Optional.ofNullable(nick);
            potentialNick.ifPresent(n -> System.out.println("Found: " + n));
        }

        System.out.println("\nVersion B");
        for (String nick : nicks) {
            Optional<String> potentialNick = Optional.ofNullable(nick);
            potentialNick.ifPresentOrElse(n -> System.out.println("Found: " + n), () -> System.out.println("No nick"));
        }

        System.out.println("============================");
    }

    public static void task7(Optional<String> email) {
        Optional<String> extractedEmail = email
                .map(Main::extractEmail)
                .map(String::toUpperCase);
        System.out.println("Extracted email: " + extractedEmail);
        System.out.println("============================");
    }

    public static String extractEmail(String email) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) != '@') {
                stringBuilder.append(email.charAt(i));
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }

    public static void task8() {
        Optional<User> ala = Optional.of(new User("Ala", "ala@mail.com"));
        Optional<User> bob = Optional.of(new User("Bob", null));
        Optional<User> empty = Optional.empty();

        List<Optional<User>> users = Arrays.asList(ala, bob, empty);
        for (Optional<User> user : users) {
            System.out.println(getUserEmail(user));
        }
        System.out.println("============================");
    }

    public static String getUserEmail(Optional<User> user) {
        return user.flatMap(User::getEmail).orElse("No email");
    }

    public static void task9() {
        List<Optional<Integer>> grades = List.of(
                Optional.of(5), Optional.of(3), Optional.empty(),
                Optional.of(4), Optional.of(2), Optional.of(5)
        );

        for (Optional<Integer> grade : grades) {
            String comment = grade
                    .filter(g -> g >= 4)
                    .map(g -> "Good graade: " + g)
                    .orElse("Skipped");
            System.out.println(comment);
        }
        System.out.println("============================");
    }

//    public static void task(){
//
//        System.out.println("============================");
//    }

//    public static void task(){
//
//        System.out.println("============================");
//    }

//    public static void task(){
//
//        System.out.println("============================");
//    }

//    public static void task(){
//
//        System.out.println("============================");
//    }

//    public static void task(){
//
//        System.out.println("============================");
//    }

//    public static void task(){
//
//        System.out.println("============================");
//    }


    public static void main(String[] args) {
        allTasks();
    }
}
