import com.example.Circle;
import com.example.Rectangle;
import com.example.Shape;
import com.test.BankEMICalculator;
import com.test.Currency;
import com.test.DayofWeek;

public class Main {
    public static void main(String[] args) {

     /*
        //Shape shape= new Shape();
        Shape s1= new Rectangle("blue",5,3);

        Shape s2= new Circle("red",7);

        System.out.println(s1.toString());
       // System.out.println("Area of "+s1.getColor()+" rectangle: "+s1.area());
        System.out.println(s2.toString());
       // System.out.println("Area of "+s2.getColor()+" circle: "+s2.area());

        BankEMICalculator bankEMICalculator= new BankEMICalculator("Jane Doe","5555-666",10000,400);

        BankEMICalculator.EMICalculatorHelper emiCalculatorHelper= bankEMICalculator.new EMICalculatorHelper();

        System.out.println(emiCalculatorHelper.calcMonthlyPayment(4000));

        DayofWeek today=DayofWeek.WEDNESDAY;
        System.out.println("Today is " +today);

        if (today == DayofWeek.FRIDAY) {
            System.out.println("It's the start of the week!");
        }

        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a weekday");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's the weekend!");
        }*/

        Currency currency= Currency.USD;

        System.out.println("Name: " + currency.getName()); // Output: Name: United States Dollar
        System.out.println("Symbol: " + currency.getSymbol()); // Output: Symbol: $
        System.out.println("Short Form: " + currency.getShortForm()); // Output: Symbol: $

        Currency currency2= Currency.EUR;

        System.out.println("Name: " + currency2.getName()); // Output: Name: United States Dollar
        System.out.println("Symbol: " + currency2.getSymbol()); // Output: Symbol: $
        System.out.println("Short Form:"+ currency2.getShortForm()); // Output: Symbol: $
    }
}