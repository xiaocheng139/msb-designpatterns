package com.msb.builder.improve;

public abstract class HouseBuilder {
    protected House house = new House();

    abstract void buildBasic();
    abstract void buildWall();
    abstract void roof();

    public House buildHouse() {
        buildBasic();
        buildWall();
        roof();
        return house;
    }
}
