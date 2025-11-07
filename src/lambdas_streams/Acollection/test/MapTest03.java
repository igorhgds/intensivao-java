package lambdas_streams.Acollection.test;

import lambdas_streams.Acollection.domain.Customer;
import lambdas_streams.Acollection.domain.Manga;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Igor Henrique");
        Customer customer2 = new Customer("DevDojo Academy");
        System.out.println(customer1);

        Manga manga1 = new Manga(1L, "Pokemon", 19.99);
        Manga manga2 = new Manga(5L, "Hellsing ultimate", 9.99);
        Manga manga3 = new Manga(3L, "berserk", 29.99);
        Manga manga4 = new Manga(2L, "Attack on titans", 39.99);
        Manga manga5 = new Manga(4L, "Dragon Ball Z", 89.99);

        Map<Customer, List<Manga>> customerMangaMap = new HashMap<>();
        List<Manga> mangaCustomer1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaCustomer2List = List.of(manga4, manga5);

        customerMangaMap.put(customer1, mangaCustomer1List);
        customerMangaMap.put(customer2, mangaCustomer2List);

        System.out.println(customerMangaMap);

        System.out.println("-------------------\n");

        for (Map.Entry<Customer, List<Manga>> entry : customerMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " : " + entry.getValue());
        }

        System.out.println("-------------------\n");

        for (Map.Entry<Customer, List<Manga>> entry : customerMangaMap.entrySet()) {
            System.out.println("** " + entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("-- " + manga.getTitle());
            }
        }

    }
}
