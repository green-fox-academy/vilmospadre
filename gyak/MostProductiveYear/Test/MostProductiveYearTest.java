import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MostProductiveYearTest {

    @Test
    public void findMostProductiveYear_returnErrorWhenFileDoesNotExist() {
        String result = MostProductiveYear.getMostProductiveYear("not-existing-studio");
        assertEquals("Cannot find studio, please try again later.", result);
    }

    @Test
    public void findMostProductiveYear_returnMostProductiveYear() {
        String result = MostProductiveYear.getMostProductiveYear("marvel");
        assertEquals("marvel has made the most movies in 2.", result);
    }
}

