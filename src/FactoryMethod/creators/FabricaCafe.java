package FactoryMethod.creators;

import FactoryMethod.products.Cafe;
import FactoryMethod.interfaces.Bebida;

//classe concreta que estende a classe BebidaFactory: FabricaCafe. Esta classe implementa o método criarBebida() para retornar uma instância da bebida correspondente.
public class FabricaCafe extends BebidaFactory {

    @Override
    public Bebida criarBebida() {
        return new Cafe();
    }
}