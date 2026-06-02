package org.example;

public class Task03 {

    public static int whichIntIsBigger(int int1, int int2){
        return int1 > int2 ? int1 : int2;
    }

    public static void main(String[] args) {
        int biggerInt = whichIntIsBigger(1,2);
        System.out.print(biggerInt);
    }
}
