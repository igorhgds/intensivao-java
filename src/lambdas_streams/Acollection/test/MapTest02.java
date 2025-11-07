package lambdas_streams.Acollection.test;

import lambdas_streams.Acollection.domain.Customer;
import lambdas_streams.Acollection.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Igor Henrique");
        Customer customer2 = new Customer("DevDojo Academy");
        System.out.println(customer1);

        Manga manga1 = new Manga(1L, "Pokemon", 19.99);
        Manga manga2 = new Manga(5L, "Hellsing ultimate", 9.99);
        Manga manga3 = new Manga(3L, "berserk", 29.99);
        Manga manga4 = new Manga(2L, "Attack on titans", 39.99);
        Manga manga5 = new Manga(4L, "Dragon Ball Z", 89.99);

        Map<Customer, Manga> customerMangaMap = new HashMap<>();
        customerMangaMap.put(customer1, manga2);
        customerMangaMap.put(customer2, manga5);

        for (Map.Entry<Customer, Manga> entry : customerMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " : " + entry.getValue().getTitle());
        }
    }
}
