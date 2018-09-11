import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String guns = "Shes got a smile that it seems to me remind me of childhood memories where everything was as fresh as the bright blue sky";

        guns = guns.toLowerCase().replaceAll("\\W", "");
        Map<Object, Long> charFreq = guns.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(chars -> chars, Collectors.counting()));

        charFreq.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
