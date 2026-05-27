package org.example.homework_01_if;

import java.util.Random;
import java.util.Scanner;

public class Task13 {

    public static boolean isMoveValid(String move) {
        return move.equals("r") || move.equals("p") || move.equals("s");
    }

    public static String whoWonGame(String playerMove, String computerMove) {

        if (computerMove.equals(playerMove)) {
            return "Draw";
        }

        return switch (playerMove){
            case "r" -> computerMove.equals("s") ? "You won" : "You lost";
            case "p" -> computerMove.equals("r") ? "You won" : "You lost";
            case "s" -> computerMove.equals("p") ? "You won" : "You lost";
            default -> "Something went wrong (how?)";
        };
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playerMove;
        String computerMove;
        int randomNumber;

        System.out.print("Type your move ((r)ock, (p)aper, (s)cissors): ");
        playerMove = scanner.nextLine();

        if (!(isMoveValid(playerMove))) {
            throw new Exception("Invalid move");
        }

        randomNumber = random.nextInt(0, 3);

        computerMove = switch (randomNumber){
            case 0 -> "r";
            case 1 -> "p";
            case 2 -> "s";
            default -> throw new Exception("Invalid move (how?)");
        };

        System.out.println("Computer chose " + computerMove);

        System.out.print(whoWonGame(playerMove, computerMove));
    }
}
