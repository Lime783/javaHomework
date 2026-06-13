package org.example.homework_02_loops;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String login = "Lime", password = "783";
        String guessLogin = "", guessPassword = "";

        for(int i = 1; i <= 3; i++){
            System.out.println("Attempt " + i);
            if (!(guessLogin.equals(login))){
                System.out.print("Guess login: ");
                guessLogin = scanner.nextLine();
            }
            if (!(guessPassword.equals(password))){
                System.out.print("Guess password: ");
                guessPassword = scanner.nextLine();
            }
            if (i == 3 && !(guessLogin.equals(login)) && !(guessPassword.equals(password))){
                System.out.print("Account blocked");
            }
        }
    }
}
