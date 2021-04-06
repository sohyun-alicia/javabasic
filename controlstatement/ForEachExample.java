package controlstatement;
import java.util.ArrayList;

public class ForEachExample {
    public static void main(String[] args) {
        // String[] numbers = {"one", "two", "three"};
        // for (int i=0; i<numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // String[] numbers = {"one", "two", "three"};
        // for (String number: numbers) {
        //     System.out.println(number);
        // }

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");

        System.out.println(numbers);

        for (String number: numbers) {
            System.out.println(number);
        }


    }
}
