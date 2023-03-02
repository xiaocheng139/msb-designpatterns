package com.msb.builder.improve;

import com.msb.builder.CommonHouse;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new CommonHouseBuilder());
        House house = director.constructHouse();
    }
}
