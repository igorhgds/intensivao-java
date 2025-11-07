package classes_objetos_metodos.Npolymorphism.test;

import classes_objetos_metodos.Npolymorphism.repository.Repository;
import classes_objetos_metodos.Npolymorphism.service.DatabaseRepositoryService;
import classes_objetos_metodos.Npolymorphism.service.InMemoryRepositoryService;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepositoryService();
        Repository repository2 = new InMemoryRepositoryService();
        repository.save();
        repository2.save();

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println(list);

    }
}
