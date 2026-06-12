package org.example.template;

public enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED;

    boolean isActive() {
        return (this != CANCELED && this != DELIVERED);
    }
}
