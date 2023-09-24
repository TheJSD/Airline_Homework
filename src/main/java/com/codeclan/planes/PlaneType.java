package com.codeclan.planes;

public enum PlaneType {
    TINYPLANE(5,30),
    SMALLPLANE(50, 120),
    PLANE(100,250),
    BIGPLANE(200,500),
    BIGGERPLANE(500,1200);
    private final int capacity;
    private final int totalWeight;
    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
