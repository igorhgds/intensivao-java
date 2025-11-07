package logica_sintaxe_basica;

public class Class05ConditionalStatements02 {

    public static void main(String[] args) {
        //age   < 15                category junior
        //age   >= 15 && age < 18   category senior
        // age  >= 18               category masters
        int age = 17;
        String category;

        if (age < 15) {
            System.out.println("Category Junior");
        } else if (age >= 15 && age < 18) {
            System.out.println("Category Senior");
        } else {
            System.out.println("Category Master");
        }

        System.out.println("*********************");

        if (age < 15) {
            category = "Category Junior";
        } else if (age >= 15 && age < 18) {
            category = "Category Senior";
        } else {
            category = "Category  Master";
        }
        System.out.println(category);

        System.out.println("*********************");

        age = 20;
        category = age < 15 ? "Category Junior" : age >= 15 && age < 18 ? "Category Senior" : "Category Master";
        System.out.println(category);
    }
}