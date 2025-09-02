package classes_objetos_metodos.Kenum.domain;

public class Customer {
    private String name;
    private CustomerType type;
    private PaymentType paymentType;

    public Customer(String name, CustomerType type, PaymentType paymentType) {
        this.name = name;
        this.type = type;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", type=" + type.getReportValue() +
                ", typeDatabaseValue=" + type.getDbValue() +
                ", paymentType=" + paymentType +
                '}';
    }

    //    public static final String INDIVIDUAL = "INDIVIDUAL";
//    public static final String COMPANY = "COMPANY";
//    public Customer(String name, String type) {
//        if (!type.equals(INDIVIDUAL) && !type.equals(COMPANY)) {
//            return;
//        }
//        this.name = name;
//        this.type = type;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                '}';
//    }
}
