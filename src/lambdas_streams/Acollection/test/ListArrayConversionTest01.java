package lambdas_streams.Acollection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numbersList1 = new ArrayList<>();
        numbersList1.add(1);
        numbersList1.add(2);
        numbersList1.add(3);

        //Object[] objects = numbersList1.toArray();
        Integer[] numbersArray01 = numbersList1.toArray(new Integer[0]);
        System.out.println(numbersList1);
        System.out.println(Arrays.toString(numbersArray01));

        System.out.println("-----------------------------");

        Integer[] numbersArray02 = {1, 2, 3};
        List<Integer> numbersList02 = Arrays.asList(numbersArray02); // -> it's alter all the list, numbersArray02/numbersList02
        numbersList02.set(0, 12); // -> alter all lists
        // numbersList02.add(5); -> Unsupported Operation
        System.out.println(Arrays.toString(numbersArray02));
        System.out.println(numbersList02);

        System.out.println("-------------------------------");
        List<Integer> numbersList03 = new ArrayList<>(Arrays.asList(numbersArray02)); //-> it's better
        numbersList03.add(19);
        System.out.println(numbersList03);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = Arrays.asList("1", "2", "3");
        List<String> strings1 = List.of("1", "2", "3");
    }
}
