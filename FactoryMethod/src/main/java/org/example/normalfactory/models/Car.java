package org.example.normalfactory.models;

import org.example.normalfactory.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run car!!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop car!!");
    }
}
