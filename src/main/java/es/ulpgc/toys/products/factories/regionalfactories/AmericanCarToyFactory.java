package es.ulpgc.toys.products.factories.regionalfactories;

import es.ulpgc.toys.products.factories.ToyFactory;
import es.ulpgc.toys.products.model.AmericanCarToy;
import es.ulpgc.toys.products.model.Toy;

public class AmericanCarToyFactory extends ToyFactory {
    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanCarToy(serialNumber, "American Car");
    }
}
