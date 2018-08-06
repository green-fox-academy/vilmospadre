import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number, please.");
        int number = scanner.nextInt();
        System.out.println();

        System.out.println(sum(number));
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i += 1) {
            sum += i;
        }
        return sum;
    }
}

