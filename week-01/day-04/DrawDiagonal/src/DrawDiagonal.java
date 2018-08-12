import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number, please.");

        int numb = scanner.nextInt();

        for (int i = 0; i <= numb; i++) {
            for (int j = 0; j <= numb; j++) {
                if (i == 0 || j == 0 || i == numb || j == numb || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}