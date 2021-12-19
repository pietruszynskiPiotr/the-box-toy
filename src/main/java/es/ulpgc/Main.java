package es.ulpgc;

import es.ulpgc.toys.products.Toy;
import es.ulpgc.toys.products.business.AmericanToyBusiness;
import es.ulpgc.toys.products.business.AsianToyBusiness;
import es.ulpgc.toys.products.business.ToyBusiness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToyBusiness americanToyBusiness = new AmericanToyBusiness();
        ToyBusiness asianToyBusiness = new AsianToyBusiness();
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            line = keyboard.nextLine();
            switch (line) {
                case "American Car":
                case "American Helicopter": {
                    Toy car = americanToyBusiness.createToy(line);
                    car.label();
                    car.pack();
                    break;
                }
                case "Asian Car":
                case "Asian Helicopter": {
                    Toy car = asianToyBusiness.createToy(line);
                    car.label();
                    car.pack();
                    break;
                }
                default:
                    System.out.println("Command unknown!");
                    break;
            }
        }
    }

}
