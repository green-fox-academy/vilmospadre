import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String... args) {

        ArrayList<String> planets = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));


            planets.add(5, "Saturn");

            System.out.println(planets);

        }
    }
