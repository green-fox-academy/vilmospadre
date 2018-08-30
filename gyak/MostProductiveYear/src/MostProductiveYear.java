import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostProductiveYear {

    /**
     * Write a method that helps you find the most productive year for a film studio.
     * The method should take one argument, which is the name of the film studio.
     * The method should try to open the related data file named `studioname`.csv,
     * which is a comma separated file with 3 columns: name of the movie, release year, director
     * <p>
     * - If we do not have any data about the studio, the method should return an error message.
     * - If we have found data, the method should return an information message about the most productive year for that studio.
     * <p>
     * Examples:
     * <p>
     * If we call the method with 'marvel':
     * should return 'marvel has made the most movies in 2017.'
     * <p>
     * If we call the method with 'ghibli':
     * should print 'Cannot find studio, please try again later.'
     * <p>
     * Hint:
     * - You can find some example files in this folder (marvel.csv and paramount.csv)
     * - Most productive year: The year in which the studio has made the most movies.
     */

    public static void main(String[] args) {
        System.out.println(getMostProductiveYear("marvel"));
    }

    public static String getMostProductiveYear(String studioName) {
        try {
            Map<String, Integer> yearCounts = new HashMap<>();
            List<String> lines = Files.readAllLines(Paths.get(studioName + ".csv"));

            for (String line : lines) {
                String[] lineParts = line.split(",");

                String year = lineParts[1];

                Integer yearCount = yearCounts.get(year);

                if (yearCount == null) {
                    yearCount = 0;
                }

                yearCounts.put(year, yearCount + 1);
            }

            Map.Entry<String, Integer> maxEntry = null;
            for (Map.Entry<String, Integer> yearWithCount : yearCounts.entrySet()) {
                if (maxEntry == null || yearWithCount.getValue() > (maxEntry.getValue())) {
                    maxEntry = yearWithCount;
                }
            }

            return studioName + " has made the most movies in " + maxEntry.getKey();
        } catch (IOException e) {
            System.out.println("Cannot find studio, please try again later.");
        }

        return null;
    }

}