package org.example.homework_07_enum;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31, true),
    AUGUST(31, true),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    public final int days;
    public final boolean isHolidaySeason;

    Month(int days, boolean isHolidaySeason) {
        this.days = days;
        this.isHolidaySeason = isHolidaySeason;
    }

    Month(int days) {
        this(days, false);
    }

    int getDays() {
        return this.days;
    }

    boolean isHolidaySeason() {
        return this.isHolidaySeason;
    }

    // Task 7
    @Override
    public String toString() {
        return this.name() + " (days: " + this.days + ")";
    }
}
