import sun.lwawt.macosx.CSystemTray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a=5;

        try {
            System.out.println(a);
            a= a*2;
            System.out.println(a);
            Scanner scanner= new Scanner(new File("myFile.txt"));
        }
        catch (FileNotFoundException e)
        {
            a=0;
            System.out.println(a);
            System.out.println("The file could not be found "+e.getMessage());
        }
        finally {

            System.out.println(a);
            System.out.println("Program completed");
        }
    }
}