package com.singleton;

public class Main {
    public static void main(String[] args) {

        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        System.out.println("databaseConnector = " + databaseConnector);

        DatabaseConnector databaseConnector1 = DatabaseConnector.getInstance();
        System.out.println("databaseConnector1 = " + databaseConnector1);

        System.out.println("\n");
        databaseConnector.connectDatabase();
        databaseConnector1.connectDatabase();
        System.out.println("\n");

        databaseConnector.disconnectDatabase();
        databaseConnector1.disconnectDatabase();
    }
}