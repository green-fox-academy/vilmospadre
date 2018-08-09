import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number, I'll give you a pyramid.");

        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < 5 - i; j++) {

                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {

                System.out.print("$ ");
            }
            System.out.println();
        }

    }
}
