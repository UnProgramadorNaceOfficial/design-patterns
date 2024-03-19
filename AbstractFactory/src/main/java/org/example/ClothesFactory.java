package org.example;

import org.example.products.Shirt;
import org.example.products.Shoe;
import org.example.products.Trousers;

public interface ClothesFactory {

    Shoe createShoes();
    Shirt createShirt();
    Trousers createTrousers();
}
