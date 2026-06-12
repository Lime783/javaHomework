package org.example.template;

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
