package logica_sintaxe_basica;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];

        days[0][0] = 11;
        days[0][1] = 12;
        days[0][2] = 13;
        days[1][0] = 21;
        days[1][1] = 22;
        days[1][2] = 23;
        days[2][0] = 31;
        days[2][1] = 32;
        days[2][2] = 33;

        System.out.println(days[0][0]);
        System.out.println("---------------------------");

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("---------------------------");
        for(int[] baseArray: days){
            for (int day : baseArray){
                System.out.println("- " +day);
            }
        }
    }
}
