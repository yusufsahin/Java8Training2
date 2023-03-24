import java.io.*;

public class Main {
    public static void main(String[] args) {
         /*try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String s = "";
            while (true) {
                System.out.print("Type xyz to exit: ");
                s = in.readLine();
                if (s != null) {
                    System.out.println("Read: " + s.trim());// ekrana yaz
                    if (s.equals("xyz")) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }*/
        try
        {

            //Create
            Student s= new Student("John",20);

            FileOutputStream fos= new FileOutputStream("student.ser");

            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();


            //Read
            FileInputStream fis= new FileInputStream("student.ser");

            ObjectInputStream ois= new ObjectInputStream(fis);

            Student s1= (Student) ois.readObject();

            System.out.println("Name: "+ s1.getName());
            System.out.println("Age: "+s1.getAge());
        }catch (IOException e)
        {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}