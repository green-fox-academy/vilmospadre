import java.util.ArrayList;
import java.util.Arrays;

public class StreamGetEven {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 == 0);
                         .map(e -> e * 2); {
            System.out.println();

            //.reduce(0, Integer::sum));
        }
    }
}

