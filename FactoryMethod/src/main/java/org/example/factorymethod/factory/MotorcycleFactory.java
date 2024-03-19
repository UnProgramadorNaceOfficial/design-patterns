package org.example.factorymethod.factory;

import org.example.factorymethod.Vehicle;
import org.example.factorymethod.models.Motorcycle;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
