package es.ulpgc;

import es.ulpgc.toys.Car;
import es.ulpgc.toys.Helicopter;
import es.ulpgc.toys.SerialNumberGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")) {
            line = keyboard.nextLine();
            Integer serialNumber = SerialNumberGenerator.next();
            if (line.equals("Car")) {
                Car car = new Car(serialNumber);
                car.label();
                car.pack();
            } else if (line.equals("Helicopter")) {
                Helicopter helicopter = new Helicopter(serialNumber);
                helicopter.label();
                helicopter.pack();
            } else {
                System.out.println("Command unknown!");
            }
        }
    }

}
