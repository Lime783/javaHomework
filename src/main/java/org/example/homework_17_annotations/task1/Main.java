package org.example.homework_17_annotations.task1;

public class Main {
    public static void main(String[] args) {
    User user1 = new User("a2@");
    User user2 = new User("abcd!!!!!!!!");
    User user3 = new User("1234567890");
    User user4 = new User("abcde12345!");

//    PasswordValidator.validate(user1);
//    PasswordValidator.validate(user2);
//    PasswordValidator.validate(user3);
    PasswordValidator.validate(user4);
    }
}
