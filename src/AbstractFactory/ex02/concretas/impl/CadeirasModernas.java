package AbstractFactory.ex02.concretas.impl;

import AbstractFactory.ex02.interfaces.Cadeira;

public class CadeirasModernas implements Cadeira {
    @Override
    public void exibirTipo() {
        System.out.println("Esta é uma cadeira moderna.");

    }
}
