package es.ulpgc.toys.products.model;

import es.ulpgc.toys.products.Toy;

public class AsianCarToy implements Toy {

    private final Integer serialNumber;

    public AsianCarToy(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    @Override
    public void pack() {
        System.out.println("Packing asian car...");
    }

    @Override
    public void label() {
        System.out.println("Asian car....");
    }
}

