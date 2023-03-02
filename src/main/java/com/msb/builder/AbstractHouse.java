package com.msb.builder;

public abstract class AbstractHouse {
    abstract void buildBasic();
    abstract void buildWall();
    abstract void roof();

    public void build() {
        buildBasic();
        buildWall();
        roof();
    }
}
