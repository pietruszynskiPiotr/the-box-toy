package es.ulpgc.toys;

public class Car {

    private final Integer serialNumber;

    public Car(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    public void pack() {
        System.out.println("Packing car...");
    }

    public void label() {
        System.out.println("Car....");
    }

}
