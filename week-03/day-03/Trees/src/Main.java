import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Trees baobab = new Trees("baobab", "crimson", 113);
        Scanner scan = new Scanner(System.in);
        int scan = Scanner.nextInt();


        if (scan = "baobab") {
        return baobab;



           // System.out.println(baobab);
        }

        Trees larix = new Trees("larix", "emerald", 100);
        System.out.println(larix);

        Trees mangrove = new Trees("mangrove", "purple", 50);
        System.out.println(mangrove);

        Trees oak = new Trees("oak", "green", 311);
        System.out.println(oak);

        Trees sycamor = new Trees("sycamor", "darkblue", 113);
        System.out.println(sycamor);



        if (scan = "baobab") {
            return baobab;
        }

        System.out.println("I have baobab, larix, mangrove, oak, sycamor trees in my garden. Choose.");
        int tree = scan.nextInt();

        System.out.println(scan + "is " + this.color + "and " + this.age + "old.");


    }
}
