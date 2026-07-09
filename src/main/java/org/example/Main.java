package org.example;


import org.example.template.ArrayUtils;
import org.example.template.MinMax;
import org.example.template.Pair;
import org.example.template.Stats;

import java.util.Arrays;

public class Main {

    public static void task1() {
        Pair<Integer, String> p1 = Pair.of(1, "a");
        Pair<Integer, String> p2 = Pair.of(1, "a");
        Pair<Integer, String> p3 = Pair.of(1, "b");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode() == (p2.hashCode()));

        Pair<Integer, String> pNull = Pair.of(null, "x");
        System.out.println(pNull);
        System.out.println(pNull.first());

        Pair<String, String> pAB = Pair.of("A", "B");
//        pAB.first() = "B";
        System.out.println("==========================================");
    }

    public static void task2() {
        String[] a = {"A", "B", "C"};
        ArrayUtils.swap(a, 0, 2);
        System.out.println(Arrays.toString(a));

        Integer[] b = {1, 2, 3};
//        ArrayUtils.swap(b, -1, 0);
//        ArrayUtils.swap(b, 0, 3);

        Object[] c = {"X", "Y"};
        ArrayUtils.swap(c, 1, 1);
        System.out.println(Arrays.toString(c));
        System.out.println("==========================================");
    }

    public static void task3() {
        Integer[] tab = {1, 2, 3, 4};
        Stats<Integer> classToTest = new Stats<>(tab);
        System.out.println(classToTest.mean());
        System.out.println(classToTest.variance());

        Double[] tab2 = {2.0, 2.0};
        Double[] tab3 = {2.001, 1.999};
        double eps = 0.01;
        Stats<Double> classToTest2 = new Stats<>(tab2);
        Stats<Double> classToTest3 = new Stats<>(tab3);
        System.out.println(classToTest2.hasSameMean(classToTest3, eps));

        Double[] tab4 = {};
//        Stats<Double> classToTest4 = new Stats<>(tab4);
        System.out.println("==========================================");
    }

    public static void task4() {
        String[] tabString = {"A", "B", "C"};
        System.out.println(MinMax.minMax(tabString));

        Integer[] tabInteger = {1, 2, 3, 4, -1, 10, 10};
        System.out.println(MinMax.minMax(tabInteger));

        Integer[] tabSoleInteger = {1};
        System.out.println(MinMax.minMax(tabSoleInteger));

        Integer[] tabInteger2 = {null, 1, 2};
//        System.out.println(MinMax.minMax(tabInteger2));
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}