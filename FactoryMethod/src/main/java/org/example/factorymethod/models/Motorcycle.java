package org.example.factorymethod.models;

import org.example.factorymethod.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run Motorcycle!!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop Motorcycle!!");
    }
}
