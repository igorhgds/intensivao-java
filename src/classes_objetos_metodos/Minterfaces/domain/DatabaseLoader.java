package classes_objetos_metodos.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in the database");
    }

    //@Override -> ERROR
    public static void retrieveMaxDataSize(){
        System.out.println("Insede retrieveMaxDataSize in the class DatabaseLoader"); // -> don't overwrite in class that implements
    }
}
