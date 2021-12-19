package es.ulpgc.toys.products.model;

import es.ulpgc.toys.products.Toy;

public class CarToy implements Toy {

    private final Integer serialNumber;

    public CarToy(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    @Override
    public void pack() {
        System.out.println("Packing car...");
    }

    @Override
    public void label() {
        System.out.println("Car....");
    }

}
