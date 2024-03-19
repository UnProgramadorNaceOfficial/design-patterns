package org.example.products.shoe;

import org.example.products.Shoe;

public class GalaShoe implements Shoe  {

    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos de gala -- Son zapatos elegantes? -> Si");
        return true;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos de gala -- Son zapatos para correr? -> No");
        return false;
    }
}
