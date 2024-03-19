package org.example;

import org.example.prototype.PriceList;
import org.example.prototype.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lista de precios inicial
        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = List.of(new Product("Computadora", 650000),
                                            new Product("Mouse", 120000),
                                            new Product("Teclado", 80000),
                                            new Product("Pantalla", 1350000),
                                            new Product("Auriculares", 40000));
        priceList.setProductList(productList);

        System.out.println(priceList);


        // Segunda lista de precios con descuento
        PriceList priceList2 = (PriceList) priceList.clone();
        priceList2.setName("Lista Prefer");

        for (Product product : priceList2.getProductList()){
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList2);


        // Tercera lista de precios con descuento
        PriceList priceList3 = (PriceList) priceList.clone();
        priceList3.setName("Lista VIP");

        for (Product product : priceList3.getProductList()){
            product.setPrice(product.getPrice() * 0.5);
        }

        System.out.println(priceList3);
    }
}