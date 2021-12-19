package es.ulpgc.toys.products.model;

import es.ulpgc.toys.products.Toy;

public class AmericanCarToy implements Toy {

    private final Integer serialNumber;

    public AmericanCarToy(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    @Override
    public void pack() {
        System.out.println("Packing american car...");
    }

    @Override
    public void label() {
        System.out.println("American car....");
    }
}

