import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ize {

    public static void main(String[] args) {

        readFile("file.txt");
    }

    public static void readFile(String filename) {

        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i).charAt(0));
            }

        } catch (Exception e) {
            System.out.println("unable to ize my-file");
        }
    }
}
