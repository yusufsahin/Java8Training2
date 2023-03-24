import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       /* List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        List<Integer> doublednumbers= numbers.stream()
                .map(n->n*2)
                .collect(Collectors.toList());

        System.out.println(doublednumbers);

        List<String> names=Arrays.asList("John","Alice","Bob");

        List<String> uppercaseNames=names.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);
        */
        /*
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean anyNegative=numbers.stream().noneMatch(n->n<0);
        boolean anyPositive=numbers.stream().noneMatch(n->n>0);

        System.out.println(anyNegative);
        System.out.println(anyPositive);

        boolean allPositive= numbers.stream().allMatch(n->n>0);

        System.out.println(allPositive);

        Optional<Integer> firsteven=numbers.stream().filter(n->n%2==0).findFirst();

        if(!firsteven.isEmpty()){
            System.out.println(firsteven.get());
        }

        List<String> words = Arrays.asList("apple", "banana", "orange");
        boolean anyWordWithA = words.stream()
                .anyMatch(word -> word.contains("a"));
        System.out.println(anyWordWithA);
        */
        /*
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        long count = numbers.stream()
                .count();

        System.out.println(count);

        Optional<Integer> max= numbers.stream().max(Integer::compare);

        System.out.println(max.get());
        Optional<Integer> min= numbers.stream().min(Integer::compare);

        System.out.println(min.get());
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(average);

        int sum =numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);*/

     //   List<String> fruits = Arrays.asList("banana", "apple", "pear", "orange");

     //   List<String> sortedFruits=fruits.stream().sorted().collect(Collectors.toList());

     //   System.out.println(sortedFruits);
        /*
        List<String> sortedFruits = fruits.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedFruits);
*/

        List<String> words = Arrays.asList("apple", "banana", "orange");
        String joinedWords = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joinedWords);

     /*   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitionedNumbers);
*/

        /*
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));

        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(List::stream)
                .filter(s->s%2==0)
                .collect(Collectors.toList());

        System.out.println(flattenedNumbers);
        Stream.of("Monday", "Tuesday","Wednesday", "Thursday")
                .filter(s -> s.startsWith("T"))
                .forEach(s -> System.out.println("Matching Days: " +s));*/
/*
        List<Person> people=Arrays.asList(
                new Person("Alice",25),
                new Person("Bob",30),
                new Person("Charlie",35)
        );

        Map<String,Integer> ageByName= people.stream()
                .collect(Collectors.toMap(Person::getName,Person::getAge));

        System.out.println(ageByName);

        */
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35),
                new Person("David", 30),
                new Person("Eva", 25));

        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(peopleByAge);

    }
}