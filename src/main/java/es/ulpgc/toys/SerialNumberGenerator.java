package es.ulpgc.toys;

public class SerialNumberGenerator {

    private static Integer serialNumber = 0;

    public static Integer next() {
        return serialNumber++;
    }

}
