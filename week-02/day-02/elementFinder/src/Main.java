import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String... args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        System.out.println(doesIt(arrayList));

    }

    private static String doesIt(ArrayList<Integer> arrayList) {


        if (arrayList.contains(7)) {
            return "Hoooray!";

        } else {
            return "Nooooo!";
        }
    }
}
