package AbstractFactory.ex02.concretas;

import AbstractFactory.ex02.concretas.impl.CadeirasClassicas;
import AbstractFactory.ex02.abstratas.FabricaDeCadeiras;
import AbstractFactory.ex02.interfaces.Cadeira;

public class FabricaDeCadeirasClassicas extends FabricaDeCadeiras {

    @Override
    public Cadeira criarCadeira() {
        return new CadeirasClassicas();
    }
}
