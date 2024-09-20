package AbstractFactory.ex02;

import AbstractFactory.ex02.abstratas.FabricaDeCadeiras;
import AbstractFactory.ex02.concretas.FabricaDeCadeirasClassicas;
import AbstractFactory.ex02.concretas.FabricaDeCadeirasModernas;
import AbstractFactory.ex02.interfaces.Cadeira;

public class Cliente {
    public static void main(String[] args) {
        FabricaDeCadeiras fc = new FabricaDeCadeirasClassicas();
        Cadeira cm = fc.criarCadeira();
        cm.exibirTipo();
        System.out.println("-".repeat(15));

        FabricaDeCadeiras fab=new FabricaDeCadeirasModernas();
        Cadeira cc=fab.criarCadeira();
        cc.exibirTipo();

    }
}
