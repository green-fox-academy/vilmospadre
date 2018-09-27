import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every second element from the original list
        // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result


        System.out.println(seconds(Arrays.asList(1, 2, 3, 4, 5)));
    }

    private static List<Integer> seconds(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < list.size(); i += 2) {
            result.add(list.get(i));
        }
        return result;
    }
}