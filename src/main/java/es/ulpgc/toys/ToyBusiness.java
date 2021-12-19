package es.ulpgc.toys;

import es.ulpgc.toys.products.model.CarToy;
import es.ulpgc.toys.products.model.HelicopterToy;
import es.ulpgc.toys.products.Toy;

public class ToyBusiness {

    private final SerialNumberGenerator generator = new SerialNumberGenerator();

    public Toy createToy(String type) {
        switch (type) {
            case "Car":
                return new CarToy(generator.next());
            case "Helicopter":
                return new HelicopterToy(generator.next());
            default:
                throw new IllegalArgumentException("Unknown toy type!");
        }
    }


}
