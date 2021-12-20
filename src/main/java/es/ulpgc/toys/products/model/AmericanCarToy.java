package es.ulpgc.toys.products.model;

public class AmericanCarToy implements Toy {

    private final Integer serialNumber;

    private final String type;

    public AmericanCarToy(final Integer serialnumber,
                          final String type) {
        this.serialNumber = serialnumber;
        this.type = type;
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

