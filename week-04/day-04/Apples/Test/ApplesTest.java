import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    Apples apple;


    @Before
    public void goApple() {
    apple = new Apples("lali");
    }

    @Test
    public void getApple() {
    assertEquals("lali", apple.getApple());
    }
}