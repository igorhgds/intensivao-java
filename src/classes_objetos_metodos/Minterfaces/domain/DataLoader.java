package classes_objetos_metodos.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 100; //-> needs hava a initial value

    void load(); //-> in interface the methods already is public abstract

    public default void checkPermission(){
        System.out.println("Checking permission general"); // -> default method does not need to be overridden in the class that implements it
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Insede retrieveMaxDataSize in the interface"); // -> STATIC METHODS cannot be overridden in the implementing class,
    }
}
