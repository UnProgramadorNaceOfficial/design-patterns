package org.example.factorymethod.models;

import org.example.factorymethod.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run Truck!!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop Truck!!");
    }
}
