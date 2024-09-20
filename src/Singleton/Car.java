package Singleton;

import java.util.List;

public class Car {
    private String model;
    private List<Car> listaCarros;

    public Car(String model) {
        this.model = model;
    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Car> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(List<Car> listaCarros) {
        this.listaCarros = listaCarros;
    }
}
