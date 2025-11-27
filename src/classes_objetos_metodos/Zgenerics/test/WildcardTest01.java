package classes_objetos_metodos.Zgenerics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog  extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting Dog");
    }
}

class Cat  extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting Cat");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsult(dogs);
        printConsult(cats);
    }

    private static void printConsult(Animal[] animals){
        System.out.println("--------------");
        for (Animal animal : animals){
            animal.consult();
        }
        animals[1] = new Cat(); // -> ERROR, because the array know that animals[1] is a dog
    }
}
