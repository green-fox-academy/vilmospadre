import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me two numbers, please.");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if (n1 > n2) {

            System.out.println(n1);
        } else if (n2 > n1) {

            System.out.println(n2);
        }

    }
}
