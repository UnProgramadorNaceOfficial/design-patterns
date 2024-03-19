package org.example.factorymethod.factory;

import org.example.factorymethod.Vehicle;
import org.example.factorymethod.models.Car;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
