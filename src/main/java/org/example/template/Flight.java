package org.example.template;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Flight {
    String flightNumber;
    String departureAirport;
    String arrivalAirport;
    ZonedDateTime departureTime;
    ZonedDateTime arrivalTime;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport, ZonedDateTime departureTime, ZonedDateTime arrivalTime) {
        if (departureTime.toInstant().isAfter(arrivalTime.toInstant())) {
            throw new IllegalArgumentException(
                    "Arrival must be after departure");
        }
        this.flightNumber = Objects.requireNonNull(flightNumber);
        this.departureAirport = Objects.requireNonNull(departureAirport);
        this.arrivalAirport = Objects.requireNonNull(arrivalAirport);
        this.departureTime = Objects.requireNonNull(departureTime);
        this.arrivalTime = Objects.requireNonNull(arrivalTime);
    }

    public Duration calculateFlightDuration() {
        return Duration.between(departureTime, arrivalTime);
    }
}


