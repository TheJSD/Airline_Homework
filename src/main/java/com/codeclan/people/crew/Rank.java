package com.codeclan.people.crew;

public enum Rank {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDENT("Flight Attendent");

    private final String rank;
    Rank(String rank)
    {this.rank = rank;}
    public String getRankName(){
        return rank;
    }
}
