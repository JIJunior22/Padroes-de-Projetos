package creators;

import interfaces.Bebida;
import products.Cha;


//classe concreta que estende a classe BebidaFactory: FabricaCha. Esta classe implementa o método criarBebida() para retornar uma instância da bebida correspondente.

public class FabricaCha extends BebidaFactory {
    @Override
    public Bebida criarBebida() {
        return new Cha();
    }
}
