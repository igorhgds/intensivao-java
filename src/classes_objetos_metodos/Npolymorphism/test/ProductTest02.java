package classes_objetos_metodos.Npolymorphism.test;

import classes_objetos_metodos.Npolymorphism.domain.Computer;
import classes_objetos_metodos.Npolymorphism.domain.Product;
import classes_objetos_metodos.Npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {

        Product product = new Computer("Ryzen 9", 1000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTaxValue());

        System.out.println("------------------");
        Product product2 = new Tomato("Dutch", 6);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxValue());

        Tomato t = new Tomato("Italian", 5);
        t.setBestConsumedBefore("2");
    }
}
