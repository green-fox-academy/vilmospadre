import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number, please.");

        int num = scan.nextInt();

        String triangle = "";


        for (int i = 0; i <= num; i++) {


                triangle += "*";
                System.out.println(triangle);
            }
        }
    }
