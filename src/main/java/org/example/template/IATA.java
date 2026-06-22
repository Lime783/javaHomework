package org.example.template;

public enum IATA {
    WAW("Europe/Warsaw"),
    JFK("America/New_York"),
    LA("America/Los_Angeles"),
    KOL("Asia/Kolkata"),
    SIN("Asia/Singapore"),
    LON("Europe/London"),
    TOK("Asia/Tokyo");

    private final String airpotName;

    IATA(String airpotName) {
        this.airpotName = airpotName;
    }

    public String getAirpotName() {
        return airpotName;
    }
}
