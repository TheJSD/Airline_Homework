package com.codeclan.people.crew;

public class CabinCrewMember extends PlaneStaff{
    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }
    public String makeAnnouncement(String message){
        return message;
    }
}
