import com.example.Employee;

public class Main {
    public static void main(String[] args) {
        //No-Arg Constructor
        Employee employee= new Employee();


        employee.setEmpId(101);
        employee.setName("John Doe");
        employee.setSsn("555555535553");
        employee.setSalary(25000);

        //No Info Hiding
        employee.empId=100;
        employee.name="";
        employee.ssn="";
        employee.salary=0;
        //All-Arg Constructor
        Employee employee2= new Employee(101,"Jane Doe","3333333356",25000);

        System.out.println(employee2.getEmpId()+"-"+employee2.getName()+"-"+employee2.getSsn()+"-"+employee2.getSalary());

        //PassByValue

        int a=5;
        int b=a;

        a=a+5;

        System.out.println(a);
        System.out.println(b);

        
        // PassByValue Object Reference
        Employee employee3= employee2;
        System.out.println(employee3.getEmpId()+"-"+employee3.getName()+"-"+employee3.getSsn()+"-"+employee3.getSalary());

        employee2.setSalary(30000);
        System.out.println(employee3.getEmpId()+"-"+employee3.getName()+"-"+employee3.getSsn()+"-"+employee3.getSalary());
        employee3.setSalary(35000);
        System.out.println(employee2.getEmpId()+"-"+employee2.getName()+"-"+employee2.getSsn()+"-"+employee2.getSalary());
    }
}