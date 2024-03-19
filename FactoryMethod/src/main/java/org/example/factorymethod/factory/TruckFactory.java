package org.example.factorymethod.factory;

import org.example.factorymethod.Vehicle;
import org.example.factorymethod.models.Truck;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
