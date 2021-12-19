package es.ulpgc.toys.products.business;

import es.ulpgc.toys.products.Toy;
import es.ulpgc.toys.products.model.AsianCarToy;
import es.ulpgc.toys.products.model.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "Asian Car":
                return new AsianCarToy(generator.next());
            case "Asian Helicopter":
                return new AsianHelicopterToy(generator.next());
            default:
                throw new IllegalArgumentException("Unknown toy type!");
        }
    }
}
