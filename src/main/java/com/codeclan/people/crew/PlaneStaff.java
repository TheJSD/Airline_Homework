package com.codeclan.people.crew;

import com.codeclan.people.Person;

public class PlaneStaff extends Person {
    private Rank rank;

    public PlaneStaff(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }
    public Rank getRank() {
        return rank;
    }
}
