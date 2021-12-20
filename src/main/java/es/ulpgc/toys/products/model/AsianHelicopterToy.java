package es.ulpgc.toys.products.model;

public class AsianHelicopterToy implements Toy {

    private final Integer serialNumber;

    private final String type;

    public AsianHelicopterToy(final Integer serialnumber,
                              final String type) {
        this.serialNumber = serialnumber;
        this.type = type;
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
