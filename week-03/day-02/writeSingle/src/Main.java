import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/Users/VL/Desktop/greenfox/vilmospadre/week-03/day-02/writeSingle/my-file.txt

public class Main {

    public static void main(String[] args) {

        try {
            Path path = Paths.get(/Users/VL/Desktop/greenfox/vilmospadre/week-03/day-02/writeSingle/my-file.txt, "my-file.txt");
            List<String> lines = new ArrayList<>();

            for (int i = 0; i < 1; i++) {
                lines.add("Liszka Viktor");
            }
            Files.write(path, lines);
        } catch (Exception e) {

            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
