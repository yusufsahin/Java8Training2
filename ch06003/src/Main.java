import com.example.abst.MathContants;
import com.example.abst.MyInterface;
import com.example.abst.Total;
import com.example.con.ConcTotal;
import com.example.con.DortIslem;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {

        double pi= MathContants.PI;
        System.out.println(pi);

        MyInterface myLambda=(message) ->{
          System.out.println("Hello "+ message);
        };

        myLambda.doSomething("World");

        Total mylambdaTotal= ConcTotal::add;

        int result=mylambdaTotal.add(5,10);

        System.out.println(result);

        IntBinaryOperator add= (a,b)->a+b;

        int result2 =add.applyAsInt(2,5);

        System.out.println(result2);

        System.out.println(DortIslem.Topla(5,10));
    }
}