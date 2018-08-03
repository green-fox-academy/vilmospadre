import java.util.Scanner;
public class OddEven {
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number, please.");
        int num = scan.nextInt();
            if (num % 2 == 0)
                 System.out.println("It's even.");

            else System.out.println("It's odd.");
    }
    }
