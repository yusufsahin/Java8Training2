import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Dosya kopyalanıyor...");

        Path sourcePath= Paths.get("/Users/yusufsahin/Projects/JavaSe8Training/ch14001/src/person.txt");

        Path targetPath= Paths.get("/Users/yusufsahin/Projects/JavaSe8Training/ch14001/src/people.txt");

        Files.copy(sourcePath,targetPath, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("Dosya kopyalandı.");
    }
}