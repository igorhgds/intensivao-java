package classes_objetos_metodos.Minterfaces.test;

import classes_objetos_metodos.Minterfaces.domain.DataLoader;
import classes_objetos_metodos.Minterfaces.domain.DatabaseLoader;
import classes_objetos_metodos.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();

        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

    }
}
