package com.codeclan;

import com.codeclan.people.Passenger;

public class Main {
    public static void main(String[] args) {
        Passenger passenger;
        passenger = new Passenger("Mark", 2);
        System.out.println(passenger.getName());
    }
}