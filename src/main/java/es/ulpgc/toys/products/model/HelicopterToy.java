package es.ulpgc.toys.products.model;

import es.ulpgc.toys.products.Toy;

public class HelicopterToy implements Toy {

    private final Integer serialNumber;

    public HelicopterToy(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    @Override
    public void pack() {
        System.out.println("Packing helicopter...");
    }

    @Override
    public void label() {
        System.out.println("Helicopter....");
    }

}
