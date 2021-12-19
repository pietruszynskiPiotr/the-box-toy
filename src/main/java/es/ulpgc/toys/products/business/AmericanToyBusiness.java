package es.ulpgc.toys.products.business;

import es.ulpgc.toys.products.Toy;
import es.ulpgc.toys.products.model.AmericanCarToy;
import es.ulpgc.toys.products.model.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "American Car":
                return new AmericanCarToy(generator.next());
            case "American Helicopter":
                return new AmericanHelicopterToy(generator.next());
            default:
                throw new IllegalArgumentException("Unknown toy type!");
        }
    }
}
