package es.ulpgc.toys.products.business;

import es.ulpgc.toys.products.factories.SerialNumberGenerator;
import es.ulpgc.toys.products.factories.ToyFactory;
import es.ulpgc.toys.products.model.Toy;

import java.util.HashMap;
import java.util.Map;

public class BusinessToy {

    private final Map<String, ToyFactory> toyFactories = new HashMap<>();

    private final SerialNumberGenerator generator = new SerialNumberGenerator();

    public void add(String name, ToyFactory factory) {
        toyFactories.put(name, factory);
    }

    public Toy produceToy(String name) {
        ToyFactory toyFactory = toyFactories.get(name);
        return toyFactory.produceToy(generator.next());
    }

}
