import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path filePath= Paths.get("/Users/yusufsahin/Projects/JavaSe8Training/ch14002/src/people.txt");

        try(Stream<String> lines= Files.lines(filePath, StandardCharsets.UTF_8))
        {
            List<Person> people= lines
                    .map(line->line.split(";"))
                    .map(fields->new Person(fields[0],fields[1],Integer.parseInt(fields[2])))
                    .collect(Collectors.toList());

            for (Person person:people) {
                System.out.println(person.getFirstName()+" "+person.getLastName()+" "+ person.getAge());
            }
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}