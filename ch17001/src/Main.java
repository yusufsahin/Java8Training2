import sun.lwawt.macosx.CSystemTray;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee(1,"Jane","Sea",50000,"Manager"),
                new Employee(2,"John","Doe",30000,"Sales"),
                new Employee(3,"Jane","Doe",50000,"Manager"),
                new Employee(4,"Frank","Doe",70000,"Manager"),
                new Employee(5,"Angel","Doe",35000,"Developer"),
                new Employee(6,"Nick","Doe",35000,"Developer")

        );

        String searhName="Jane";

        Employee employee= employees.parallelStream().filter(e->searhName.equals(e.getFirstName())).findAny()
                .orElseThrow(null);

        System.out.println("Employee found "+employee.getLastName());

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);

        int sum= numbers.stream().parallel().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

        double totalSalary= employees.parallelStream()
             //   .filter(e->e.getPosition().equals("Manager"))
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("Total Salary: "+totalSalary);

    }
}