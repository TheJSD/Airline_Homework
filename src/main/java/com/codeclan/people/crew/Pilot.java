package com.codeclan.people.crew;

public class Pilot extends PlaneStaff{
    private String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }
    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }
}
