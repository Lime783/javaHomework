package org.example.homework_11_TwoKeyMap;

public class Main {

    static TwoKeyMap<String, String, Integer> grades;

    public static void generateTwoKeyMap() {
        grades = new NestedTwoKeyHashMap<>();
        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);
        grades.put("Bob", "Math", 4);
    }

    public static void testPuttingNullKey() {
        grades.put("Alice", null, 5);
        System.out.println("===============");
    }

    public static void testGettingValue() {
        System.out.println(grades.get("Alice", "Math"));
        System.out.println("===============");
    }

    public static void testEntrySet() {
        System.out.println(grades.entrySet());
        System.out.println("===============");
    }

    public static void testKeySet() {
        System.out.println(grades.keySet());
        System.out.println("===============");
    }

    public static void testValuesCollection() {
        System.out.println(grades.values());
        System.out.println("===============");
    }

    public static void testIterator() {
        for (TwoKeyMap.Entry<String, String, Integer> entry : grades) {
            System.out.println(entry.getKey1() + " -> " + entry.getKey2() + " -> " + entry.getValue());
        }
        System.out.println("===============");
    }

    public static void testRemovingKey() {
        grades.remove("Alice", "Math");
        System.out.print(grades);
        System.out.println("===============");
    }

    public static void testPuttingDuplicateValue() {
        grades.put("Alice", "CS", 5);
        System.out.print(grades);
        System.out.println("===============");
    }

    public static void testSize() {
        System.out.println(grades.size());
        System.out.println("===============");
    }

    public static void testIsEmpty() {
        System.out.println(grades.isEmpty());
        System.out.println("===============");
    }


    public static void main(String[] args) {
        generateTwoKeyMap();
//        testPuttingNullKey();
        testGettingValue();
        testEntrySet();
        testKeySet();
        testValuesCollection();
        testIterator();
        testRemovingKey();
        testPuttingDuplicateValue();
        testSize();

        testIsEmpty();
        grades.clear();
        testIsEmpty();
    }
}