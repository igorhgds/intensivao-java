package classes_objetos_metodos.Bintroductionmethods.test;

import classes_objetos_metodos.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "Jiraya";  with public
//        person.age = 70;
//        coupling - acoplamento

        person.setName("Jiraya");
        person.setAge(70);
        person.print();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
