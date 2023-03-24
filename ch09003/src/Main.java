import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>(Arrays.asList("hello", 123, true));

        System.out.println("Objects: "+objects);

        List<String> strings= new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Integers: " + integers);

        System.out.println("Sum of integers: "+ sumList(integers));
    }
    public static double sumList(List<? extends Number> list) {
        double sum = 0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }
}