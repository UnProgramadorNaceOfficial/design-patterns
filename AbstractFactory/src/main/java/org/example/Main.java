package org.example;


import org.example.factories.GalaClothesFactory;
import org.example.factories.SportClothesFactory;
import org.example.products.shirt.GalaShirt;
import org.example.products.shirt.SportShirt;
import org.example.products.shoe.GalaShoe;
import org.example.products.shoe.SportShoe;
import org.example.products.trousers.GalaTrousers;
import org.example.products.trousers.SportTrousers;

public class Main {
    public static void main(String[] args) {

        // Fabrica de ropa deportiva
        ClothesFactory sportClothesFactory = new SportClothesFactory();

        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.createTrousers();

        System.out.println("\n---> Ejemplo de ropa deportiva <---");
        sportShirt.hasButtons();
        sportTrousers.getClosureType();
        sportShoe.isRunningShoes();

        // Fabrica de ropa de gala
        ClothesFactory galaClothesFactory = new GalaClothesFactory();

        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.createTrousers();
        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoes();

        System.out.println("\n---> Ejemplo de ropa de gala <---");
        galaShirt.hasButtons();
        galaTrousers.getClosureType();
        galaShoe.isRunningShoes();
    }
}