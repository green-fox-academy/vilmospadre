import com.sun.javafx.collections.MappingChange;

import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

public class MostProductive {

    public static void main(String[] args) {
        System.out.println(getMostProductive("marvel"));
    }

 //a method
      public static String getMostProductive(studioName) {
          try {
              Map<String, Integer> yearCounts = new HashMap<>();
              List<String> lines = Files.readAllLines(Paths.get(studioName + ".csv"));

              for (String line : lines) {
                String[] lineParts = line.split(",");
                 {

              }
          }
          catch (IOException) {
              System.out.println("Cannot find studio, please try again late.");
          }

    }
}
