package es.ulpgc.toys.products.model;

public class AmericanHelicopterToy implements Toy {

    private final Integer serialNumber;

    private final String type;

    public AmericanHelicopterToy(final Integer serialnumber,
                                 final String type) {
        this.serialNumber = serialnumber;
        this.type = type;
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
