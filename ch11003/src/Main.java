import sun.lwawt.macosx.CSystemTray;

public class Main {
    public static void main(String[] args) {

        try {
            MyClass obj= new MyClass();

           // obj.myMethod(-4);
            obj.myMethod(-4);
            System.out.println(obj.toString());
        }catch (MyException e)
        {
            System.out.println("An error occured "+e.getMessage());
        }
        finally {
            System.out.println("Program completed");
        }
    }
}