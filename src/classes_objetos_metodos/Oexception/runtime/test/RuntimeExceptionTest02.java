package classes_objetos_metodos.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(1, 0);
    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("The second parameter cannot be zero");
        }
            return a / b;
    }

//    private static int division(int a, int b) {
//        if (b == 0) {
//            throw new IllegalArgumentException("The second parameter cannot be zero");
//        }
//        try{
//            return a / b;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
}
