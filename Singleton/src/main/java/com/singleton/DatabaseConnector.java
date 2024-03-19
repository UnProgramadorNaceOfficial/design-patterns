package com.singleton;

/**
 *  Rules:
 *  1) Debemos tener un constructor vacio / We need to have an empty constructor
 *  2) Debemos tener un atributo privado estatico / We need to have a static private attribute
 *  3) Debemos tener un metodo estatico de devuelva la instancia / We need to have a public static method wich returns the instance
 */

public class DatabaseConnector {

    private static DatabaseConnector databaseConnectorInstance;

    private DatabaseConnector(){
        System.out.println("Creating object");
    }

    public static DatabaseConnector getInstance(){

        if(databaseConnectorInstance == null){
            databaseConnectorInstance = new DatabaseConnector();
        }
        return databaseConnectorInstance;
    }

    public void connectDatabase(){

        if(databaseConnectorInstance == null){
            throw new NullPointerException("La instancia no ha sido creada");
        }

        System.out.println("Connecting to Database " + databaseConnectorInstance);
    }

    public void disconnectDatabase(){

        if(databaseConnectorInstance == null){
            throw new NullPointerException("La instancia no ha sido creada");
        }

        System.out.println("Disconnecting to Database " + databaseConnectorInstance);
    }
}
