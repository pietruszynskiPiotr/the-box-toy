package es.ulpgc.toys.products.factories.regionalfactories;

import es.ulpgc.toys.products.factories.ToyFactory;
import es.ulpgc.toys.products.model.AsianCarToy;
import es.ulpgc.toys.products.model.Toy;

public class AsianCarToyFactory extends ToyFactory {
    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianCarToy(serialNumber, "Asian Car");
    }
}
