import com.example.Gender;
import com.example.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person= new Person.PersonBuilder()
                .givenName("John")
                .surName("Doe")
                .age(30)
                .gender(Gender.MALE)
                .eMail("john.doe@example.com")
                .phone("0-001-0000-111-111")
                .address("123 Main  St")
                .city("New York City")
                .state("NY")
                .code("12345")
                .build();
        Person person2= new Person.PersonBuilder()
                .givenName("Jane")
                .surName("Doe")
                .age(27)
                .gender(Gender.FEMALE)
                .eMail("jane.doe@example.com")
                .phone("0-001-0000-111-112")
                .address("123 Main  St")
                .city("New York City")
                .state("NY")
                .code("12345")
                .build();

        ArrayList<Person> persons= new ArrayList<>();

        persons.add(person);
        persons.add(person2);
        persons.add(new Person.PersonBuilder()
                .givenName("Smith")
                .surName("Doe")
                .age(23)
                .gender(Gender.MALE)
                .eMail("smith.doe@example.com")
                .phone("0-001-0000-111-114")
                .address("123 Main  St")
                .city("New York City")
                .state("NY")
                .code("12345")
                .build());

        Predicate<Person> over25 = p-> p.getAge() > 25;


        List<Person> ageover25= persons.stream()
                .filter(over25)
                //.filter(p->p.getAge()>25)
                .collect(Collectors.toList());

        ageover25.forEach(x->System.out.println(x.getGivenName()+"-"+x.getSurName()));
    }
}