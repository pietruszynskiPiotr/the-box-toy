package es.ulpgc;

import es.ulpgc.toys.ToyBusiness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            line = keyboard.nextLine();
            if (line.equals("Car")) {
                business.createCar();
            } else if (line.equals("Helicopter")) {
                business.createHelicopter();
            } else {
                System.out.println("Command unknown!");
            }
        }
    }

}
