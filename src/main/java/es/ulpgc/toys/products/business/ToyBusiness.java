package es.ulpgc.toys.products.business;

import es.ulpgc.toys.products.model.Toy;
import es.ulpgc.toys.products.factory.ToyFactory;

public class ToyBusiness {

    private final ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }

    public Toy produceToy(String type) {
        return toyFactory.produceToy(type);
    }

}
