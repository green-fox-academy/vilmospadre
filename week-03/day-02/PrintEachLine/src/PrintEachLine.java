import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {

        Path path = Paths.get("C:/Users/VL/Desktop/greenfox/vilmospadre/week-03/day-02/PrintEachLine/my-file.txt");

        try {
            List<String> lines = Files.readAllLines(path);

            for (int i = 0; i < lines.size(); i++)
                System.out.println(lines.get(i));

        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
