package es.ulpgc.toys;

public class ToyBusiness {

    private final SerialNumberGenerator generator = new SerialNumberGenerator();

    public Car createCar() {
        Integer serialNumber = generator.next();
        Car car = new Car(serialNumber);
        car.label();
        car.pack();
        return car;
    }

    public Helicopter createHelicopter() {
        Integer serialNumber = generator.next();
        Helicopter helicopter = new Helicopter(serialNumber);
        helicopter.label();
        helicopter.pack();
        return helicopter;
    }

}
