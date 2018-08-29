import java.util.ArrayList;

public class TrickyAverage {


    public static double getTrickyAvg(ArrayList<Integer> numbers) {
        double smallestOdd = numbers.get(1);
        double greatestEven = numbers.get(1);
        for (int i = 0; i < numbers.size(); i++) {
            Integer actual = numbers.get(i);
            if (!isEven(actual) && actual < smallestOdd) {
                smallestOdd = actual;
            }
            if (isEven(actual) && actual > greatestEven) {
                greatestEven = actual;
            }
        }
        return (smallestOdd + greatestEven) / 2;
    }

    private static Boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
