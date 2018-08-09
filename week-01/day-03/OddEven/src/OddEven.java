import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        System.out.println("Give me a number, please.");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num % 2 != 0) {
            System.out.println(" This number is odd.");
        } else {
            System.out.println(" This number is even.");
        }
    }
}
