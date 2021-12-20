package es.ulpgc.toys.products.factories;

import es.ulpgc.toys.products.model.Toy;

public abstract class ToyFactory {

    public abstract Toy createToy(Integer serialNumber);

    public Toy produceToy(Integer serialNumber) {
        Toy toy = createToy(serialNumber);
        toy.label();
        toy.pack();
        return toy;
    }

}
