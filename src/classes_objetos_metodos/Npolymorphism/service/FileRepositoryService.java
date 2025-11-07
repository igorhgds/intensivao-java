package classes_objetos_metodos.Npolymorphism.service;

import classes_objetos_metodos.Npolymorphism.repository.Repository;

public class FileRepositoryService implements Repository {

    @Override
    public void save() {
        System.out.println("Saving in the a file");
    }
}
