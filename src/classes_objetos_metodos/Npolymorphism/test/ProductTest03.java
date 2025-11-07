package classes_objetos_metodos.Npolymorphism.test;

import classes_objetos_metodos.Npolymorphism.domain.Computer;
import classes_objetos_metodos.Npolymorphism.domain.Product;
import classes_objetos_metodos.Npolymorphism.domain.Tomato;
import classes_objetos_metodos.Npolymorphism.service.ProductTaxReportService;

public class ProductTest03 {
    public static void main(String[] args) {

        Product product = new Computer("Ryzen 9", 1000);

        Tomato tomato = new Tomato("Dutch", 6);
        tomato.setBestConsumedBefore("11/21/2025");

        ProductTaxReportService.generateTaxReport(tomato);
        System.out.println("------------------------");
        ProductTaxReportService.generateTaxReport(product);

    }
}
