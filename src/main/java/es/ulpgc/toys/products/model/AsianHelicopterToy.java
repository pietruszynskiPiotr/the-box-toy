package es.ulpgc.toys.products.model;

import es.ulpgc.toys.products.Toy;

public class AsianHelicopterToy implements Toy {

    private final Integer serialNumber;

    public AsianHelicopterToy(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    @Override
    public void pack() {
        System.out.println("Packing asian helicopter...");
    }

    @Override
    public void label() {
        System.out.println("Asian helicopter....");
    }
}
