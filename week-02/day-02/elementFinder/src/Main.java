import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String... args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        System.out.println(doesit(arrayList));

    }

    public static String doesit(ArrayList<Integer> list) {

        String well;


        if (list.contains(7)) {
            well = "Hoooray!";

        } else {
            well = "Nooooo!";
        }

        return well;



        if (list.contains(6)) {

            well = "Hoooray!";
        } else {

            well = "Nooooo!";
        }

        return well;
    }

}
