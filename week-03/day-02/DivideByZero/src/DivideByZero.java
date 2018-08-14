import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a divisor, please.");
        int divisor = scan.nextInt();

        try {
            int result = 10 / divisor;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Fail.");


        }
    }
}