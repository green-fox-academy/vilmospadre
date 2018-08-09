import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        System.out.println("Give me five numbers, please.");

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();

        int sum = n1 + n2 + n3 + n4 + n5;
        int avg = sum / 5;

        System.out.println("Sum: " + sum + " Average: " + avg);


    }
}
