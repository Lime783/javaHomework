package org.example.homework_17_annotations.longbook;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CoolerPerson {
    private String name;
    private String surname;
    private String nickname;
    private final String email;
    private String password;
    private int age;
}
