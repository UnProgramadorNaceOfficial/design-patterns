package org.example.factorymethod.factory;

import org.example.factorymethod.Vehicle;
import org.example.factorymethod.models.Plane;

public class PlaneFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
