package classes_objetos_metodos.Oexception.exception.test;

import classes_objetos_metodos.Oexception.exception.domain.Employee;
import classes_objetos_metodos.Oexception.exception.domain.LoginInvalidException;
import classes_objetos_metodos.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWithExceptionsTest01 {
    public static void main(String[] args) {

        Person person = new Person();

        try {
            person.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            e.printStackTrace();
        }

        Employee employee = new Employee();
        try {
            employee.save();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
