package com.msb.builder.improve;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("Common basic");
    }

    @Override
    void buildWall() {
        System.out.println("Common build wall");
    }

    @Override
    void roof() {
        System.out.println("Common roof");
    }
}
