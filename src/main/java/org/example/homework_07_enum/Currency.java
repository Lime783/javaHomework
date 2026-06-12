package org.example.homework_07_enum;

public enum Currency {
    PLN("\uD83E\uDDC5"),
    USD("$"),
    EUR("€");

    private final String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    String getSymbol() {
        return symbol;
    }
}
