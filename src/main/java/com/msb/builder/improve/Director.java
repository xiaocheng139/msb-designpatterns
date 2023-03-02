package com.msb.builder.improve;

public class Director {
    HouseBuilder houseBuilder = null;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        return houseBuilder.buildHouse();
    }
}
