package es.ulpgc.toys.products.factories.regionalfactories;

import es.ulpgc.toys.products.factories.ToyFactory;
import es.ulpgc.toys.products.model.AmericanHelicopterToy;
import es.ulpgc.toys.products.model.Toy;

public class AmericanHelicopterToyFactory extends ToyFactory {
    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanHelicopterToy(serialNumber, "American Helicopter");
    }
}
