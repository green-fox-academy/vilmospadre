import java.util.ArrayList;
import java.util.Arrays;

public class matchMaking {

    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println(match(girls, boys));
    }

    public static ArrayList<String> match(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> match = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
          //  match.add(a.get(i));
          //  match.add(b.get(i));

            match.add(a.get(i) + ", " + b.get(i));
        }
        return match;

    }
}
