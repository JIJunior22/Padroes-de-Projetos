package FactoryMethod.products;

import FactoryMethod.interfaces.Bebida;

//classe concreta CAFE que implementa a interface Bebida
public class Cafe implements Bebida {
    @Override
    public void preparar() {
        System.out.println("Preparando café!");
    }
}
