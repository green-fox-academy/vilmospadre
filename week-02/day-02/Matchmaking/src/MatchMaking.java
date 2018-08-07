import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {

    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        System.out.println(makingMatches(girls, boys));
    }


    public static ArrayList<String> makingMatches(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> matchesList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            matchesList.add(a.get(i));
            matchesList.add(b.get(i));
        }
        return matchesList;
    }

}