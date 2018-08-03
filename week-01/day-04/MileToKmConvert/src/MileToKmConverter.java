import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String [] args) {
        System.out.println("Please give me a distance in kilometers!");
        Scanner scan = new Scanner(System.in);
        double km = scan.nextDouble();
        System.out.println("In mile that's:" + km / 1.60934);
    }
}
