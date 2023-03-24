import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva"));
        Predicate<String> startsWithAPredicate=name->name.startsWith("A");

        List<String> filteredNames=names.stream().filter(startsWithAPredicate).collect(Collectors.toList());

        System.out.println(filteredNames);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Consumer<Integer> printNumberConsumer = number -> System.out.print(number + " ");

        numbers.forEach(printNumberConsumer);
        System.out.println("----");

        Function<String,Integer> stringToIntFunction=str->Integer.parseInt(str);

        int result=stringToIntFunction.apply("123");

        System.out.println(result);

        Supplier<Double> randomNumberSupplier=()-> Math.random();

        double randomNumber=randomNumberSupplier.get();

        System.out.println(randomNumber);

        ToDoubleFunction<Integer> squareFunction=num->num*1.18;

        double result1=squareFunction.applyAsDouble(10);

        System.out.println(result1);

        DoubleFunction<String> doubleToStringFunction=d->Double.toString(d);

        String result2=doubleToStringFunction.apply(3.14159);


        System.out.println(result2);

    }
}