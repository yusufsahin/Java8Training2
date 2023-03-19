import com.example.conc.Customer;
import com.example.conc.Example;
import com.example.conc.Person;

import java.util.*;


public class Main {
    public static void main(String[] args) {


/*

        ArrayList list= new ArrayList();

        Customer customer1= new Customer(101,"Jane","Doe","Bulv 985 No5");
        list.add("Hello");
        list.add(43);
        list.add(3.14);
        list.add(customer1);

        for (int i=0;i<list.size();i++)
        {
            Object element= list.get(i);
            System.out.println(element);
        }
*/
        Customer customer1= new Customer(101,"Jane","Doe","Bulv 985 No5");


        Customer customer2= new Customer(102,"John","Doe","Bulv 786 No9");
        Customer customer3= new Customer(103,"Frank","Doe","Bulv 796 No7");
        Customer customer4=new Customer(104,"Angle","Doe","Bulv 765 No8");
        //ArrayList<Customer> customers= new ArrayList<Customer>();
        //List<Customer> customers= new ArrayList<>();

/*
        ArrayList<Customer> customers= new ArrayList<>();

        customers.add(customer1);

        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        for (Customer cus:customers) {
            System.out.println(cus.getId()+")"+ cus.getLastName()+","+cus.getFirstName()+"-"+cus.getAddress());

        }

        Set<String> set= new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three");

        for (String item:set) {
            System.out.println("Item: "+item);
        }

        Map<Integer,String> map= new HashMap<>();

        map.put(1,"Jane Doe");
        map.put(2,"John Doe");
        map.put(3,"Angel Doe");
        map.put(4,"Angel Doe");

        System.out.println(map);



        for (Map.Entry<Integer,String> item:map.entrySet()) {
            System.out.println(item.getKey()+"-"+item.getValue());
        }


        /*
        Map<Integer,Customer> map2= new HashMap<>();
        map2.put(4,customer2);
        map2.put(1,customer1);
        map2.put(2,customer2);
        map2.put(3,customer3);
       // map2.put(null,null);


        for (Map.Entry<Integer,Customer> item:map2.entrySet()) {
            System.out.println(item.getKey()+","+item.getValue().getId()+"-"+item.getValue().getFirstName());
        }

        Map<String, Integer> map3 = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        map3.put("orange",6);
        map3.put("apple", 3);
        map3.put("banana", 2);
        map3.put("orange", 5);
        map3.put(null,null);

        int value = map3.get("apple");
        System.out.println("Value for key 'apple': " + value);

        // Check if a key is in the TreeMap
        boolean containsKey = map3.containsKey("banana");
        System.out.println("TreeMap contains key 'banana': " + containsKey);

        // Get the size of the TreeMap
        int size = map3.size();
        System.out.println("TreeMap size: " + size);

        // Iterate over the key-value pairs of the TreeMap
        System.out.println("TreeMap contents:");
        for (Map.Entry<String, Integer> entry : map3.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            System.out.println(key + " = " + val);
        }*/
/*
        Deque<String> deque= new LinkedList<>();

        deque.addLast("apple");
        deque.addLast("banana");
        deque.addFirst("orange");

        System.out.println("Deque contents "+ deque);

        String  first= deque.removeFirst();

        String last= deque.removeLast();
        System.out.println("Removed first element: " + first);
        System.out.println("Removed last element: " + last);
        System.out.println("Deque contents "+ deque);
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();

        // Print the first and last elements
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        deque.addLast("banana");
        deque.addFirst("orange");
        System.out.println("Deque elements: ");

        for (String element : deque) {
            System.out.println(element + " ");
        }
        System.out.println();


        String str1= "Hello";
        //String str2="Hello";
        String str2="World";

        boolean result= Example.isEqual(str1,str2);

        System.out.println(result);

        int a=5;

        int b=5;

        boolean result2= Example.isEqual(a,b);

        System.out.println(result2);
*/
        List<Person> personList= new ArrayList<>();

        personList.add(new Person("Alice",25));
        personList.add(new Person("Bob",30));
        personList.add(new Person("Charlie",20));

        for (Person person:personList) {
            System.out.println(person.getName()+": "+person.getAge());
        }
/*
        Comparator<Person> ageComparator=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

        };


  */
     //   Collections.sort(personList,);
    //    Collections.sort(personList,ageComparator);
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        for (Person person:personList) {
            System.out.println(person.getName()+": "+person.getAge());

        }
    }
}