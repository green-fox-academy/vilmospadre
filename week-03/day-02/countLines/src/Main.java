import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String filename = "my-file.txt";
        System.out.println(countLines(filename));
    }

    public static int countLines(String name) {

        int numOfLines;
        try {
            Path filePath = Paths.get(name);
            List<String> lines = Files.readAllLines(filePath);
            numOfLines = lines.size();
            return numOfLines;
        } catch (Exception e) {
            return 0;
        }
    }


}
