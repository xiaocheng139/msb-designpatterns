package com.msb.factory.asbtractfactory;

public class ModernFactory extends AbstractFactory{
    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
