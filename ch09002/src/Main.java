import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        /*
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 4.0, 9.0, 16.0, 25.0));

        Function<Double,Double> squareRootFunction=num->Math.sqrt(num);

        List<Double> squareRoots=mapList(numbers,squareRootFunction);

        System.out.println("Square roots of numbers: " + squareRoots);

        BiPredicate<String, String> equalStringsPredicate = (str1, str2) -> str1.equals(str2);
        boolean result = equalStringsPredicate.test("hello", "hello");
        System.out.println(result);

        UnaryOperator<Integer> incrementOperator = num -> num + 1 ;
        int result1 = incrementOperator.apply(5);
        System.out.println(result1);

        */

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        UnaryOperator<String> uppercaseOperator = str -> str.toUpperCase();
        List<String> uppercaseWords = mapList(words, uppercaseOperator);

        System.out.println("Uppercase words: " + uppercaseWords);



    }

    /*
    public static <T, R> List<R> mapList(List<T> list, Function<T, R> function) {
        List<R> mappedList = new ArrayList<>();
        for (T item : list) {
            R mappedItem = function.apply(item);
            mappedList.add(mappedItem);
        }
        return mappedList;
    }*/

    public static <T> List<T> mapList(List<T> list, UnaryOperator<T> operator) {
        List<T> mappedList = new ArrayList<>();

        for (T item : list) {
            T mappedItem = operator.apply(item);
            mappedList.add(mappedItem);
        }

        return mappedList;
    }
}