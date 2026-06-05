package org.example.homework_04_functions;

public class Task07 {

    public static void changeX(int number){
        number = 8;
        System.out.println(number);
    }

    public static void main(String[] args) {
        int x = 5;
        changeX(x);
        System.out.print(x);
    }
}
