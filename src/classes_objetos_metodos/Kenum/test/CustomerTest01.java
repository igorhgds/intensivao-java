package classes_objetos_metodos.Kenum.test;

import classes_objetos_metodos.Kenum.domain.Customer;
import classes_objetos_metodos.Kenum.domain.CustomerType;
import classes_objetos_metodos.Kenum.domain.PaymentType;

;

public class CustomerTest01 {
    public static void main(String[] args) {
//        Customer customer1 = new Customer("Tsubasa", "individual");
//        Customer customer2 = new Customer("Tsubasa", "company");
//        Customer customer3 = new Customer("Tsubasa", "COMPANY");
//        Customer customer4 = new Customer("Tsubasa", "INDIVIDUAL");
        Customer customer1 = new Customer("Tsubasa", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Akira", CustomerType.COMPANY,  PaymentType.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100.0));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100.0));

        CustomerType customerType = CustomerType.valueOf("INDIVIDUAL");
        System.out.println(customerType.getReportValue());
        System.out.println(customerType.getDbValue());

        CustomerType customerType2 = CustomerType.getByReportValue("coMpaNy");
        System.out.println(customerType2.getReportValue());
        System.out.println(customerType2.getDbValue());

    }
}
