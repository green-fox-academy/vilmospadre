import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {


    @Test
    public void TestNumberConv1() {
        NumberConverter numberConv1 = new NumberConverter();

        int amount = 745;
        assertEquals(numberConv1.numberToWord(amount), "seven hundred forty-five");
    }

    @Test
    public void TestNumberConv2() {
        NumberConverter numberConv1 = new NumberConverter();

        int amount2 = 741;
        assertEquals(numberConv1.numberToWord(amount2), "seven hundred forty-one");
    }

    @Test
    public void TestNumberConv3() {
        NumberConverter numberConv1 = new NumberConverter();

        int amount2 = 1600750;
        assertEquals(numberConv1.numberToWord(amount2), "one million six hundred  thousand seven hundred fifty");
    }
}