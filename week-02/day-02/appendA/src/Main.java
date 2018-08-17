import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA(far));
    }


    public static List appendA(List<String> list) {
        List<String> its = new ArrayList<String>();
        for (int i = 0; i <= list.size() - 1; i++) {
            its.add(list.get(i) + "a");
        }
        return its;
    }
}
