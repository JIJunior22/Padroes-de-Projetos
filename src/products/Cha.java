package products;

import interfaces.Bebida;

//classe concreta CHA que implementa a interface Bebida
public class Cha implements Bebida {
    @Override
    public void preparar() {
        System.out.println("Preparando chá...");

    }
}
