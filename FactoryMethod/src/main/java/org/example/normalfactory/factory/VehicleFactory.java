package org.example.normalfactory.factory;

import org.example.normalfactory.Vehicle;
import org.example.normalfactory.models.Car;
import org.example.normalfactory.models.Motorcycle;
import org.example.normalfactory.models.Plane;
import org.example.normalfactory.models.Truck;

public class VehicleFactory {

    private final String CAR = "Car";
    private final String TRUCK = "Truck";
    private final String MOTORCYCLE = "Motorcycle";
    private final String PLANE = "Plane";

    public Vehicle createVehicle(String typeOfVehicle){

        if(typeOfVehicle.equalsIgnoreCase(CAR)){
            return new Car();
        }

        if(typeOfVehicle.equalsIgnoreCase(TRUCK)){
            return new Truck();
        }

        if(typeOfVehicle.equalsIgnoreCase(MOTORCYCLE)){
            return new Motorcycle();
        }

        if(typeOfVehicle.equalsIgnoreCase(PLANE)){
            return new Plane();
        }

        return null;
    }
}
