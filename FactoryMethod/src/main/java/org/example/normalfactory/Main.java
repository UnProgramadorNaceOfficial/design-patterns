package org.example.normalfactory;

import org.example.normalfactory.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle(TypeOfCar.CAR.name());
        Vehicle truck = vehicleFactory.createVehicle(TypeOfCar.TRUCK.name());
        Vehicle motorcycle = vehicleFactory.createVehicle(TypeOfCar.MOTORCYCLE.name());
        Vehicle plane = vehicleFactory.createVehicle(TypeOfCar.PLANE.name());

        car.start();
        truck.start();
        motorcycle.start();
        plane.start();
    }
}