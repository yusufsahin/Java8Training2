import com.example.*;

public class Main {
    public static void main(String[] args) {
        Employee employee= new Employee(100,"John Doe","222222225",50000);

        System.out.println(employee.getDetails());

        Manager manager= new Manager(110,"Jane Doe","322222227",70000,"SW");

        System.out.println(manager.getDetails());

        Employee employee1= new Manager(120,"Frank Doe","7777777",75000,"PMO");

        System.out.println(employee1.getDetails());

        BadBonus bonus = new BadBonus();

        //Bad Practice
        System.out.println(manager.getSalary()*bonus.getBonusPercent(manager));


        System.out.println(manager.calcBonus()+ manager.getSalary());

        Director director= new Director(150,"Angel Doe","55557777",80000,"SW",1000000);

        System.out.println(director.getSalary() + director.calcBonus());

        System.out.println(employee.toString());

        System.out.println(manager.toString());


        Employee x= new Employee(1,"Sue Doe","111-111-111",50000 );
        Employee y=x;

        System.out.println(x.equals(y));

        Employee z= new Employee(1,"Sue Doe","111-111-111",50000 );

        System.out.println(x.equals(z));


        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

        Statistics statistics= new Statistics();

        System.out.println(statistics.average(2,6));
        System.out.println(statistics.average(2,4,8));
        System.out.println(statistics.average(2,4,6,8,10,12));


    }
}