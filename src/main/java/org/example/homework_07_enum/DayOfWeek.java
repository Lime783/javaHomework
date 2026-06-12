package org.example.homework_07_enum;

public enum DayOfWeek {
    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();

    boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
