package es.ulpgc.toys.products.factories.regionalfactories;

import es.ulpgc.toys.products.factories.ToyFactory;
import es.ulpgc.toys.products.model.AsianHelicopterToy;
import es.ulpgc.toys.products.model.Toy;

public class AsianHelicopterToyFactory extends ToyFactory {
    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianHelicopterToy(serialNumber, "Asian Helicopter");
    }
}
