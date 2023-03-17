import com.example.Box;

public class Main {
    public static void main(String[] args) {
        Box b1= new Box();
        System.out.println(b1.getLenght()+"-"+ b1.getWidth()+"-"+b1.getHeight());

        Box b2=new Box(5);
        System.out.println(b2.getLenght()+"-"+ b2.getWidth()+"-"+b2.getHeight());

        Box b3= new Box(3,4,5);
        System.out.println(b3.getLenght()+"-"+ b3.getWidth()+"-"+b3.getHeight());

        System.out.println(b3.volume());


    }
}