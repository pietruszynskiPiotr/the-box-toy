package es.ulpgc.toys.products.factory;

import es.ulpgc.toys.products.model.Toy;
import es.ulpgc.toys.products.model.AmericanCarToy;
import es.ulpgc.toys.products.model.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory {
    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "American Car":
                return new AmericanCarToy(generator.next(), type);
            case "American Helicopter":
                return new AmericanHelicopterToy(generator.next(), type);
            default:
                throw new IllegalArgumentException("Unknown toy type!");
        }
    }
}
