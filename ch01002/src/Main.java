import sun.lwawt.macosx.CSystemTray;

public class Main {
    public static void main(String[] args) {


       /* int a = 11;

        int b = 7;

        if(a<10 && b>6)
        {
            System.out.println("Both conditions are true");
        }
        if(a<5 || b<5)
        {
            System.out.println("At least conditions are true");
        }


        if (a > 10)
        {
            System.out.println("a is greater than 10");
        }else {
            System.out.println("a is less than or equal to 10");
        }


        boolean x= true;
        //if(x)
        if(!x)
        {
            System.out.println("The value of a is false");
        }

        int k= 5;

        int l= (k<3) ? 10 : 20;
        System.out.println(l);

        Object obj= "Hello";

        if(obj instanceof String)
        {
            String str= (String) obj;

            System.out.println("Lenght of string: " + str.length());
        }
*/
/*
        int dayOfWeek = 1;

        while (dayOfWeek < 8){
            switch (dayOfWeek) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day of week");

            }
            dayOfWeek++;
        }*/
/*
        int i=1;
        while (i<=1){
            System.out.println(i);
            i++;
        };

        do{
            System.out.println(i);
            i++;
        }while (i<=0);
*/
/*
        for (int i=0;i<10;i++)
        {
            System.out.println("i: "+ i);
        }
*/
/*
        String[]  names = new String[3];
        names[0] = "Blue Shirt";
        names[1] = "Red Shirt";
       // names[2] = "Black Shirt";

        for (String name:names)
        {
            System.out.println("Name: "+name);
        }

        for (int i=0;i<3;i++)
        {
            System.out.println("Name: "+names[i]);
        }

        int[] numbers={100,200,300};

        for (int number:numbers) {
            System.out.println("Numbers: "+ number);
        }
        */

/*
        char letter='a';

        String string1="Hello";

        String string2="World";

        String string3="";

        String dontDoThis= new String("Bad Practice");

        string3= string1+string2;
        string3+=letter;

        System.out.println("Output: "+string3+" "+letter);
        */

        StringBuilder sb= new StringBuilder("hello");
        System.out.println("string sb: "+sb);
        sb.append(" world");

        System.out.println("string sb: "+sb);

        sb.append("!").append(" are").append(" you?");
        System.out.println("string sb: "+sb);
        sb.insert(12," How");
        System.out.println("string sb: "+sb);
        // Get length
        System.out.println("Length: " + sb.length());
        // Get SubString
        System.out.println("Sub: " + sb.substring(0, 5));

    }
}