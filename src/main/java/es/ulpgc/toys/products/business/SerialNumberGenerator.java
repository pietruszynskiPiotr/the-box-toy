package es.ulpgc.toys.products.business;

public class SerialNumberGenerator {

    private Integer serialNumber = 0;

    public Integer next() {
        return serialNumber++;
    }

}
