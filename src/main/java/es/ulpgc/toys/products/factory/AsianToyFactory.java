package es.ulpgc.toys.products.factory;

import es.ulpgc.toys.products.model.Toy;
import es.ulpgc.toys.products.model.AsianCarToy;
import es.ulpgc.toys.products.model.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory {
    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "Asian Car":
                return new AsianCarToy(generator.next(), type);
            case "Asian Helicopter":
                return new AsianHelicopterToy(generator.next(), type);
            default:
                throw new IllegalArgumentException("Unknown toy type!");
        }
    }
}
