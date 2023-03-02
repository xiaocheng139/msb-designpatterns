package com.msb.factory.simplefactory;

import com.msb.factory.Car;
import com.msb.factory.Plane;

/**
 * 简单工厂方法
 * Cons
 * 扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar() {
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }
}
