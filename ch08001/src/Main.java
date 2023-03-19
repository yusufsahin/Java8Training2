import com.example.Gender;
import com.example.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*List<Integer> numbers= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenNumbers=numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println("Even Number: "+evenNumbers);

        List<Integer> squaredNumbers= numbers.stream()
                .map(n->n*n)
                .collect(Collectors.toList());

        System.out.println("Squared numbers: " + squaredNumbers);
        */


        Person p1= new Person("John","Doe",30, Gender.MALE,"john.doe@example.com","0-001-344-88-00","Blv. 995 No5","New York","NY","033889");
        Person p2= new Person("Jane","Doe",29, Gender.FEMALE,"jane.doe@example.com","0-001-344-88-01","Blv. 995 No5","New York","NY","033889");
        Person p3= new Person("Angeline","Joe",27, Gender.FEMALE,"angeline.joe@example.com","0-002-879-88-00","Blv. 9106 No6","California","CA","867788");
        Person p4= new Person("Frank","Silver",40, Gender.MALE,"frank.silver@silver.com","0-005-344-88-00","Blv. 778 No5","Austin","TX","670090");
        Person p5= new Person("Frank","Joe",30, Gender.MALE,"john.doe@example.com","0-001-878-99-00","Blv. 887 No5","New Jersey","NJ","889766");
        Person p6= new Person("Ian","Doe",25, Gender.MALE,"ian.doe@example.com","0-001-344-88-00","Blv. 995 No5","New York","NY","033889");


        List<Person> personList= new ArrayList<>();

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);

        List<Person> peopleInNY= personList.stream()
                .filter(x->x.getState()=="NY")
                .collect(Collectors.toList());

        System.out.println("----Stream .forEach");

        List<Person> ageunder30=personList.stream()
                        .filter(p->p.getAge()<=30)
                                .collect(Collectors.toList());
        ageunder30.forEach(p->System.out.println(p.getGivenName()+"-"+p.getSurName()));


        List<Person> ageunder30andliveinNY=personList.stream()
              //  .filter(p->p.getAge()<30 && p.getState().equals("NY"))
                .filter(p->p.getAge()<30)
                .filter(p->p.getState().equals("NY"))
                .collect(Collectors.toList());

        System.out.println("---ageunder30andliveinNY--");
        ageunder30andliveinNY.forEach(p->System.out.println(p.getGivenName()+"-"+p.getSurName()));


        System.out.println("----Stream .forEach with Static Method");
        peopleInNY.forEach(p->printPerson(p));

        System.out.println("----for");
        for (Person p:peopleInNY) {
            System.out.println(p.getGivenName()+"-"+p.getSurName());

        }

    }
    public static void printPerson(Person p){
        System.out.println(p.getGivenName()+"-"+p.getSurName());
    }
}