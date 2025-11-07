package classes_objetos_metodos.Kenum.domain;

public enum PaymentType {
    DEBIT{
        @Override
        public double calculateDiscount(Double value) {
            return value * 0.1;
        }
    },
    CREDIT{
        @Override
        public double calculateDiscount(Double value) {
            return value * 0.05;
        }
    };

    public abstract double calculateDiscount(Double value);
}
