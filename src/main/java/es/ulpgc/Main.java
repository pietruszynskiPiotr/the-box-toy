package es.ulpgc;

import es.ulpgc.toys.products.business.BusinessToy;
import es.ulpgc.toys.products.factories.regionalfactories.AmericanCarToyFactory;
import es.ulpgc.toys.products.factories.regionalfactories.AmericanHelicopterToyFactory;
import es.ulpgc.toys.products.factories.regionalfactories.AsianCarToyFactory;
import es.ulpgc.toys.products.factories.regionalfactories.AsianHelicopterToyFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BusinessToy businessToy = new BusinessToy();
        businessToy.add("American Car", new AmericanCarToyFactory());
        businessToy.add("American Helicopter", new AmericanHelicopterToyFactory());
        businessToy.add("Asian Car", new AsianCarToyFactory());
        businessToy.add("Asian Helicopter", new AsianHelicopterToyFactory());
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            line = keyboard.nextLine();
            tryToCreateToy(businessToy, line);
        }
    }

    private static void tryToCreateToy(BusinessToy businessToy, String line) {
        try {
            businessToy.produceToy(line);
        } catch (Throwable e) {
            System.out.println("Command unknown!");
        }

    }
}
