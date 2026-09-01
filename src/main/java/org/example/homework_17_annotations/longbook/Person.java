package org.example.homework_17_annotations.longbook;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString(exclude = "password")
//@ToString(of = {"name", "surname"})
//@ToString(callSuper = true)
//@ToString(onlyExplicitlyIncluded = true)
//@EqualsAndHashCode(exclude = "password")
@EqualsAndHashCode(of = {"name", "surname"})
//@EqualsAndHashCode(callSuper = false)
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder(builderMethodName = "newPerson", buildMethodName = "birth", toBuilder = true)

public class Person {
    private String name;
    private String surname;
    @Singular
    private List<String> nicknames;
    private final String email;
    private String password;
    private int age;
}
