import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);

        System.out.println("How many girls are coming to the party?");
        int num1 = scan.nextInt();

        System.out.println("How many boys are coming to the party?");
        int num2 = scan.nextInt();

        if (num1 == num2 && ((num1 + num2) >= 20))
        System.out.println("The party is excellent!");

        else if ((num1 + num2) > 20 && num1 != num2)
            System.out.println("Quite cool party!");

        else if ((num1 + num2) < 20)
            System.out.println("Average party...");

        else if (num1 == 0)
            System.out.println("Sausage party");
    }
}
