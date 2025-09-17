package classes_objetos_metodos.Npolymorphism.test;

import classes_objetos_metodos.Npolymorphism.domain.Computer;
import classes_objetos_metodos.Npolymorphism.domain.Tomato;
import classes_objetos_metodos.Npolymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 1000);
        Tomato tomato = new Tomato("Italian", 5);

        ProductTaxReportService.generateComputerTaxReport(computer);
        System.out.println("-----------------------");
        ProductTaxReportService.generateTomatoTaxReport(tomato);
    }
}
