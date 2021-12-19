package es.ulpgc;

import es.ulpgc.toys.Car;
import es.ulpgc.toys.SerialNumberGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")) {
            line = keyboard.nextLine();
            if (line.equals("Car")) {
                Integer serialNumber = SerialNumberGenerator.next();
                Car car = new Car(serialNumber);
                car.label();
                car.pack();
            }
        }
    }

}
