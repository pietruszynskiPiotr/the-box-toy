package es.ulpgc;

import es.ulpgc.toys.products.business.ToyBusiness;
import es.ulpgc.toys.products.factory.AmericanToyFactory;
import es.ulpgc.toys.products.factory.AsianToyFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToyBusiness americanToyBusiness = new ToyBusiness(new AmericanToyFactory());
        ToyBusiness asianToyBusiness = new ToyBusiness(new AsianToyFactory());
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            line = keyboard.nextLine();
            switch (line) {
                case "American Car":
                case "American Helicopter": {
                    americanToyBusiness.produceToy(line);
                    break;
                }
                case "Asian Car":
                case "Asian Helicopter": {
                    asianToyBusiness.produceToy(line);
                    break;
                }
                default:
                    System.out.println("Command unknown!");
                    break;
            }
        }
    }

}
