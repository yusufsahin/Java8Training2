import com.example.Circle;
import com.example.Rectangle;
import com.example.Shape;

public class Main {
    public static void main(String[] args) {

        Shape circle= new Circle(5);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Shape rectangle= new Rectangle(3,4);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}