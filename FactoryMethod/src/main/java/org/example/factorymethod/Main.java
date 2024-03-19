package org.example.factorymethod;

import org.example.factorymethod.factory.CarFactory;
import org.example.factorymethod.factory.MotorcycleFactory;
import org.example.factorymethod.factory.PlaneFactory;
import org.example.factorymethod.factory.TruckFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new CarFactory().createVehicle();
        Vehicle truck = new TruckFactory().createVehicle();
        Vehicle plane = new PlaneFactory().createVehicle();
        Vehicle motorcycle = new MotorcycleFactory().createVehicle();

        car.start();
        truck.start();
        plane.start();
        motorcycle.start();
    }
}
