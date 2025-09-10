package classes_objetos_metodos.Hinheritence.test;

import classes_objetos_metodos.Hinheritence.domain.Address;
import classes_objetos_metodos.Hinheritence.domain.Employee;
import classes_objetos_metodos.Hinheritence.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12th Avenue");
        address.setZipCode("12345");

        Employee employee = new Employee("Igor");
        employee.setSocialSecurityNumber("123123");
        employee.setSalary(3000);
        employee.setAddress(address);
        employee.print();
        System.out.println("----------------");

        Manager manager = new Manager("Aline");
        manager.setSocialSecurityNumber("321123");
        manager.setSalary(9000);
        manager.setAddress(address);
        manager.setDepartment("Financial");
        manager.print();
    }
}
