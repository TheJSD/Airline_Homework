package com.codeclan;

import com.codeclan.people.Passenger;
import com.codeclan.people.crew.CabinCrewMember;
import com.codeclan.people.crew.Pilot;
import com.codeclan.planes.Plane;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilotMembers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Airport destinationTo;
    private Airport departureFrom;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, Airport destinationTo, Airport departureFrom, String departureTime) {
        this.pilotMembers = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationTo = destinationTo;
        this.departureFrom = departureFrom;
        this.departureTime = departureTime;
    }
    public void addPilot(Pilot pilot){
        this.pilotMembers.add(pilot);
    }
    public int getNumberOfPilots(){
        return pilotMembers.size();
    }
    public void addCabinCrewMember(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }
    public int getNumberOfCabinCrewMembers(){
        return cabinCrewMembers.size();
    }
    public void addPassenger(Passenger passenger){
        if (this.plane.getCapacity() > this.getNumberOfPassengers())
        this.passengers.add(passenger);
    }
    public int getNumberOfPassengers(){
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDestinationTo() {
        return destinationTo;
    }

    public Airport getDepartureFrom() {
        return departureFrom;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    public int getAvailableSeats(){
        return this.plane.getCapacity() - this.getNumberOfPassengers();
    }
}
