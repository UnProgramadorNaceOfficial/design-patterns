package org.example.factories;

import org.example.ClothesFactory;
import org.example.products.Shirt;
import org.example.products.Shoe;
import org.example.products.Trousers;
import org.example.products.shirt.SportShirt;
import org.example.products.shoe.SportShoe;
import org.example.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new SportTrousers();
    }
}
