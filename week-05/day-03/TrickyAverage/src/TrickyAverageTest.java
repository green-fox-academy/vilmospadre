import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TrickyAverageTest {

    @Test
    public void getTrickyAvg_() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        double result = TrickyAverage.getTrickyAvg(numbers);

        assertEquals(1.5, result, 0);
    }

    @Test
    public void getTrickyAvg_testCase2() {
        /*
         * create a test case
         */
    }

}
