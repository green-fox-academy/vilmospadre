import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostProductiveYear {

    public static void main(String[] args) {
        System.out.println(findMostProductiveYear("marvel"));

    }

    public static String findMostProductiveYear(String nameOfStudio) {
        Path filePath = Paths.get(nameOfStudio + ".csv");
        try {
            Map<String, Long> occurrences = calculateOccurrences(filePath);

            String bestYear = findMostProductiveYear(occurrences);

            return nameOfStudio + " has made the most movies in " + bestYear + ".";

        } catch (IOException e) {
            return "Cannot find studio, please try again later.";
        }
    }

    private static Map<String, Long> calculateOccurrences(Path filePath) throws IOException {
        return Files.readAllLines(filePath)
                .stream()
                .map(line -> line.split(",")[1])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static String findMostProductiveYear(Map<String, Long> occurrences) {
        return occurrences
                .entrySet()
                .stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
                .get().getKey();
    }
}// explanation ONLY AT TEST-EXAM for using stream, collector, lambda:
// I found these:
// https://stackoverflow.com/questions/29122394/word-frequency-count-java-8
// https://stackoverflow.com/questions/6008241/what-is-the-difference-between-e-and-t-for-java-generics
// not sure I understand, seems interesting.
// whereas the collector gives back Long, the stream API function expects lambda as parameter
// https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
// i don't know these, I try to inspect them furthermore later on (past and passed exam probably)