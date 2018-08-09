import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number, please.");

        int num = scan.nextInt();

        String triangle = ("");

        for (int i = 1; i < num; i++) {
            for (int j = 1; j < i; j++) {

                triangle += "*";

                System.out.println(triangle);

                System.out.println("");
            }

        }
    }
}