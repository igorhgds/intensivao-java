package classes_objetos_metodos.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the most advanced AI system MIA");
        System.out.println("Ask any question and I shall reply yes or no");

        String question = input.nextLine();
        if (question.charAt(0) == ' ') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
