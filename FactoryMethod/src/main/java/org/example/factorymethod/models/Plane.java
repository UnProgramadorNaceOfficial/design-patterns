package org.example.factorymethod.models;

import org.example.factorymethod.Vehicle;

public class Plane implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run Plane!!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop Plane!!");
    }

    public void fly(){
        System.out.println("--> Take off the plane!!");
    }
}
