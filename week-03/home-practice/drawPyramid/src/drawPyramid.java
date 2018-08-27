import java.util.Scanner;

public class drawPyramid {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    for (int i = 0; i<num; i++) {

            for (int j = 0; j < num - i; j++) {

                System.out.println(" * ");

                for (int k = 0; k <= i; k++) {


                    System.out.println(" * ");
                }
            }
        }
    }
