import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number, please.");
        int number = scanner.nextInt();

        System.out.println(factorio(number));
    }

    public static int factorio(int number) {
        int factorio = 1;

        for (int i = 1; i <= number; i += 1) {
            factorio = factorio * i;
        }
        return factorio;

    }
}
