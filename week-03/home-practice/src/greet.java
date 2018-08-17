import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class greet {
    public static void main(String[] args) {

        String[] abc = new String[]{"first", "second", "third"};
        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;

        System.out.println(Arrays.toString(abc));

    }
}