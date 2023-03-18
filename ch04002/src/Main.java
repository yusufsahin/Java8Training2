import com.example.*;

public class Main {
    public static void main(String[] args) {


     /*
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

        */

/*
        Statistics statistics= new Statistics();

        System.out.println(statistics.average(2,6));
        System.out.println(statistics.average(2,4,8));
        System.out.println(statistics.average(2,4,6,8,10,12));
*/
  /*
        int k= 10;

        double l = 5.5;
        float m= 2.5f;

        double result1=k;
        double result2=k+l;
        float results=k+m;

        int result4= (int) l;
        int result5=(int)(l+m);
    */


        Employee employee2=new Manager(150,"John Kern","444-333-444",100000,"Marketind");

        if(employee2 instanceof  Manager)
        {
            Manager m2=(Manager) employee2;
            m2.setDeptName("SW");
            System.out.println(m2.getDetails());
        }

        //m2.

        Director d= new Director();
        Manager m= new Manager();
        //Employee e=m;
        //m= d;

        Employee e2= d;

       // Engineer engineer=(Manager)e;

        //Engineer eng= new Manager();

        System.out.println("Random: "+Math.random()*10);

        System.out.println("Square root: "+Math.sqrt(9.0));

        System.out.println("Rounded random: "+Math.round(Math.random()*100));

        System.out.println("Abs: "+Math.abs(-9));

        double double1= Math.random();

        StaticHelper.printMessage("Hello");

        double pi= Math.PI;

        System.out.println(pi);

        System.out.println("Start: "+StaticCounter.getCount());

        StaticCounter.increment();
        StaticCounter.increment();
        System.out.println("End: "+StaticCounter.getCount());
    }
}