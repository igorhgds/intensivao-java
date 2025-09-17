package classes_objetos_metodos.Npolymorphism.service;

import classes_objetos_metodos.Npolymorphism.domain.Product;
import classes_objetos_metodos.Npolymorphism.domain.Tomato;

public class ProductTaxReportService {
//    public static void generateComputerTaxReport(Computer computer) {
//        System.out.println("Starting the report for Computer");
//        double taxValue = computer.calculateTaxValue();
//        System.out.println("Computer " + computer.getName());
//        System.out.println("Price " + computer.getPrice());
//        System.out.println("Tax Value " + taxValue);
//    }
//
//    public static void generateTomatoTaxReport(Tomato tomato) {
//        System.out.println("Starting the report for Tomato");
//        double taxValue = tomato.calculateTaxValue();
//        System.out.println("Tomato " + tomato.getName());
//        System.out.println("Price " + tomato.getPrice());
//        System.out.println("Tax Value " + taxValue);
//    }

    public static void generateTaxReport(Product  product) {
        System.out.println("Starting the tax report");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax Value: " + taxValue);
        if(product instanceof Tomato tomato) {
            System.out.println(tomato.getBestConsumedBefore());
        }
    }
}