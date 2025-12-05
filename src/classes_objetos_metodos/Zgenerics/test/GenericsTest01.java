package classes_objetos_metodos.Zgenerics.test;

import classes_objetos_metodos.Ycollection.domain.Customer;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Midoriya");
        list.add(123L);
        list.add(new Customer("Jiraya"));

        for(Object o : list) {
            if (o instanceof Customer) {
                Customer c = (Customer) o;
                System.out.println(c);
            }
        }
    }
}
