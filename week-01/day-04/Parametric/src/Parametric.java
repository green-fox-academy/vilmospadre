import java.util.*;

public class Parametric {
    public static void main(String[] args) {

        int a = 0;
        System.out.println("Give me a number, please. ");
        Scanner scan = new Scanner(System.in);

        int numb = scan.nextInt();
        System.out.println("Give me a number, please " + numb + "numbers.");

        for (int i = 0; i < numb; i++) ;
        int b = scan.nextInt();
        int a = (a + b);

        System.out.println(a / numb + " is the average");
        System.out.println(a + " is the amount");
    }
}
