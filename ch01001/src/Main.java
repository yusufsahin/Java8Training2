import java.sql.Connection;
import java.sql.PseudoColumnUsage;

public class Main {
    public static void main(String[] args) {

        //primitives();

        wrappers();
    }

    public static  void  primitives()
    {
         short s=3;
         char c='a';
         int i1=c;
         System.out.println(c);
         System.out.println(i1);
         float f=23f;
         System.out.println(f);
         double d=25.5;
         System.out.println(d);
         d=f;
         System.out.println(d);
         double d1=35.9;
         //float f2=d1;
         float f3=i1;
         System.out.println(f3);

         final char c2='a';

        // c2='b';

        int b1 = 0b101010;      // binary: 32 + 8 + 2
        System.out.println(b1);
        int o1 = 052;
        int h1 = 0x2a;

        System.out.println(o1);
        System.out.println(h1);


        double double1=123_000.54;
       // double double2=_123_000.54;

       // double double2=_123_000.54;
       // double double3=123_000_.54;

        int i2=100_010;

        System.out.println(double1);
        System.out.println(i2);

    }

    public static void wrappers()
    {
       // int b;
        // System.out.println(b);

       // int y="5";




     //   System.out.println(b);
      //  int k= Integer.parseInt("");
      //  System.out.println(k);

     /*   int c= Integer.parseInt("33");
        System.out.println(c);
        double g=Double.parseDouble("5.4");
        System.out.println(g);
        float h= Float.parseFloat("4.4");
        System.out.println(h);

        int x= Integer.valueOf(5);


        System.out.println(x);
*/

    }
}