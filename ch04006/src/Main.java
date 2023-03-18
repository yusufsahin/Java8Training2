import com.example.Contact;

public class Main {
    public static void main(String[] args) {
        Contact contact= new Contact("Jane","Doe");

        System.out.println(contact.getFirstName()+" "+contact.getLastName());

        System.out.println(contact.toString());

    }
}