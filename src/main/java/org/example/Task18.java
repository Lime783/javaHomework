package org.example;

public class Task18 {

    public static int BiggestMutualDiviser(int int1, int int2) {
        if (int2 == 0) {
            return int1;
        }

        return BiggestMutualDiviser(int2, int1 % int2);
    }

    public static void main(String[] args) {
        int x = 48;
        int y = 18;

        int wynik = BiggestMutualDiviser(x, y);
        System.out.print("NWD(" + x + ", " + y + ") = " + wynik);
    }
}
