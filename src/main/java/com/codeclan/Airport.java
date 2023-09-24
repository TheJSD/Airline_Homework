package com.codeclan;

public enum Airport {
    EDINBURGH("EDI","Edinburgh"),
    MANCHESTER("MAN","Manchester"),
    ABERDEEN("ABZ","ABERDEEN"),
    LONDONHEATHROW("LHR","London Heathrow");

    private final String code;
    private final String location;
    Airport(String code, String location){
        this.code = code;
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }
}
