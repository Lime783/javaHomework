package org.example.template;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    static void test1(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 01,15, 10, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01,15, 12, 30, 00, 00, ZoneId.of("Europe/Warsaw"));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test2(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 01,15, 23, 00, 00, 00, ZoneId.of(IATA.WAW.getAirpotName()));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01,16, 01, 30, 00, 00, ZoneId.of(IATA.WAW.getAirpotName()));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test3() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        ZonedDateTime departure = LocalDateTime
                .parse("2025-01-15 10:00:00", formatter)
                .atZone(ZoneId.of("Europe/Warsaw"));

        ZonedDateTime arrival = LocalDateTime
                .parse("2025-01-15 14:00:00", formatter)
                .atZone(ZoneId.of("America/New_York"));

        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test4(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 03,30, 01, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 03,30, 05, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test5(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 10,26, 01, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 10,26, 02, 30, 00, 00, ZoneId.of("Europe/Warsaw"));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test6(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 01,15, 10, 00, 00, 00, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01,14, 18, 00, 00, 00, ZoneId.of("America/Los_Angeles"));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test7(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 01,15, 10, 00, 00, 00, ZoneId.of("aschuasc"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01,15, 12, 30, 00, 00, ZoneId.of("Europe/Warsaw"));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test8(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 01,15, 14, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01,15, 12, 30, 00, 00, ZoneId.of("Europe/Warsaw"));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test9(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 01,15, 10, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01,15, 19, 00, 00, 00, ZoneId.of("Asia/Kolkata"));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test10(){
        ZonedDateTime departure = ZonedDateTime.of(2025, 01,15, 06, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01,16, 06, 00, 00, 00, ZoneId.of("Asia/Singapore"));
        Flight flight = new Flight("A1", "Krakow", "Praga", departure, arrival);
        System.out.println(flight.calculateFlightDuration());
    }

    static void test11(){
        ZonedDateTime departure1 = ZonedDateTime.of(2025, 01,15, 8, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival1 = ZonedDateTime.of(2025, 01,15, 12, 00, 00, 00, ZoneId.of("Europe/London"));
        Flight flight1 = new Flight("A1", "Krakow", "Praga", departure1, arrival1);
        System.out.println(flight1.calculateFlightDuration());

        ZonedDateTime departure2 = ZonedDateTime.of(2025, 01,15, 16, 00, 00, 00, ZoneId.of("Europe/London"));
        ZonedDateTime arrival2 = ZonedDateTime.of(2025, 01,15, 20, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        Flight flight2 = new Flight("A1", "Krakow", "Praga", departure2, arrival2);
        System.out.println(flight2.calculateFlightDuration());
    }

    static void testCustom(){
        ZoneId zone = ZoneId.of(IATA.WAW.getAirpotName());
        LocalDateTime localDateTime = LocalDateTime.of(2025, 3, 30, 2, 30);
        ZonedDateTime zonedDateTime =  ZonedDateTime.ofStrict(localDateTime, zone.getRules().getOffset(localDateTime), zone);
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        test1();
        System.out.println("\nTest 2");
        test2();
        System.out.println("\nTest 3");
        test3();
        System.out.println("\nTest 4");
        test4();
        System.out.println("\nTest 5");
        test5();
        System.out.println("\nTest 6");
        test6();
//        System.out.println("Test 7");
//        test7();
//        System.out.println("Test 8");
//        test8();
        System.out.println("\nTest 9");
        test9();
        System.out.println("\nTest 10");
        test10();
        System.out.println("\nTest 11");
        test11();
        System.out.println("\nTest custom");
        testCustom();
    }
}
