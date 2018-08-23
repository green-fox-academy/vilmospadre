import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {

    @Test
    public void sumOfElmnts() {

        Main numb = new Main();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 3, 5, 8));
        assertEquals(numb.sumOfElmnts(list), 18);
    }
    @Test
    public void sumOfElmntsEmpty() {
        Main numb = new Main();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
        assertEquals(numb.sumOfElmnts(list), 0);
    }

}