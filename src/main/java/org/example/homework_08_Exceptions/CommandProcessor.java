package org.example.homework_08_Exceptions;

import java.util.Objects;

final class CommandProcessor {
    static void processCommand(String command) {
        if (Objects.equals(command, "ARG")) {
            throw new IllegalArgumentException("bad argument");
        }
        if (Objects.equals(command, "STATE")) {
            throw new IllegalStateException("bad state");
        }
        System.out.println("Command: " + command + " is good");
    }
    static void demo() {
        try {
            processCommand("ABC");
            processCommand("ARG");
            processCommand("STATE");
            System.out.println("All commands are good");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e);
        }
    }
}
