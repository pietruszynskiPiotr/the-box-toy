package es.ulpgc.toys.products.model;

import es.ulpgc.toys.products.Toy;

public class AmericanHelicopterToy implements Toy {

    private final Integer serialNumber;

    public AmericanHelicopterToy(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    @Override
    public void pack() {
        System.out.println("Packing american helicopter...");
    }

    @Override
    public void label() {
        System.out.println("American helicopter....");
    }
}
