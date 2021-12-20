package es.ulpgc.toys.products.model;

public class AsianCarToy implements Toy {

    private final Integer serialNumber;

    private final String type;

    public AsianCarToy(final Integer serialnumber,
                       final String type) {
        this.serialNumber = serialnumber;
        this.type = type;
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

