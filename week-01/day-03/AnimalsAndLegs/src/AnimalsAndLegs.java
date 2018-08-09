import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many chickens do you have?");
        int chic = scan.nextInt();

        System.out.println("How many pigs do you have?");
        int pig = scan.nextInt();

        System.out.println("You've got " + chic * 2 + pig * 4 + " animal legs then.");

    }
}
