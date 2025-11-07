package classes_objetos_metodos.Bintroductionmethods.domain;


public class StudentPrinter {
    public void print(Student student) {
        System.out.println("-----------------");
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Gender: " + student.gender);

        student.name = "Gohan";
    }
}
