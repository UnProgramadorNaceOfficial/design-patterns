package org.example.products.trousers;

import org.example.products.Trousers;

public class GalaTrousers implements Trousers {

    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones de gala -- Tienen bolsillos? -> Si");
        return true;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalones de gala -- Tipo de cierre? -> cierre - cremayera");
        return "cierre - cremayera";
    }
}
