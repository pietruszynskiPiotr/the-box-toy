package es.ulpgc.toys.products.factory;

import es.ulpgc.toys.products.model.Toy;

public abstract class ToyFactory {

    protected final SerialNumberGenerator generator = new SerialNumberGenerator();

    public abstract Toy createToy(String type);

    public Toy produceToy(String type) {
        Toy toy = createToy(type);
        toy.label();
        toy.pack();
        return toy;
    }

}
