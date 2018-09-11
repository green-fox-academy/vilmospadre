import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int limit = 100;
        long count = random.ints()
                //long count = random.ints(1, 7)  -- ezzel az első érték benne van, az utolsó nem, mert az exkluziv
                .limit(limit)
                .map(number -> Math.abs(number))
                .map(number -> number % 6 + 1)
                .filter(number -> number == 6)
               // .forEach (number -> System.out.println(number));
                .count();

        System.out.println(count / (double)limit * 100 + "%");

        }
    }

