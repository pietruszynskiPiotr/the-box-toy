package es.ulpgc;

import es.ulpgc.toys.products.Toy;
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
                Toy car = business.createToy(line);
                car.label();
                car.pack();
            } else if (line.equals("Helicopter")) {
                Toy helicopter = business.createToy(line);
                helicopter.label();
                helicopter.pack();
            } else {
                System.out.println("Command unknown!");
            }
        }
    }

}
