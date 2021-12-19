package es.ulpgc.toys.products.business;

import es.ulpgc.toys.products.Toy;

public abstract class ToyBusiness {

    protected final SerialNumberGenerator generator = new SerialNumberGenerator();

    public abstract Toy createToy(String type);

}
