import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplesTest {

    private Apples apples;

    @Test
    public void getApple() {
        assertEquals("apple", apples.getApple());
    }
}
