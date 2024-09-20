package AbstractFactory.ex02.concretas;

import AbstractFactory.ex02.concretas.impl.CadeirasModernas;
import AbstractFactory.ex02.abstratas.FabricaDeCadeiras;
import AbstractFactory.ex02.interfaces.Cadeira;

public class FabricaDeCadeirasModernas extends FabricaDeCadeiras {
    @Override
    public Cadeira criarCadeira() {
        return new CadeirasModernas();
    }
}
