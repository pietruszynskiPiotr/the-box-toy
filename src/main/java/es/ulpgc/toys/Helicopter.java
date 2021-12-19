package es.ulpgc.toys;

public class Helicopter {

    private final Integer serialNumber;

    public Helicopter(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    public void pack() {
        System.out.println("Packing helicopter...");
    }

    public void label() {
        System.out.println("Helicopter....");
    }

}
