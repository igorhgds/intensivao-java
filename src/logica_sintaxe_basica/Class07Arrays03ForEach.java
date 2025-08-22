package logica_sintaxe_basica;

public class Class07Arrays03ForEach {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        int[] numbers2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        System.out.println("----------------------");
        int[] numbers3 = new int[]{5, 4, 3, 2, 1, 0};
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        System.out.println("----------------------");
        for (int num : numbers2){
            System.out.println(num);
        }
    }
}
