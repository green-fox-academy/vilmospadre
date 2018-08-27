import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestAnagram {

    @Test
    public void testAnagram1() {
        String string1 = new String("gézakékazég");
        String string2 = new String("gézakékazgéza");
        Anagram anagram = new Anagram();

        assertFalse(anagram.anagram(string1, string2));
    }

    @Test
    public void testAnagram2() {
        String string1 = new String("gézakékazég");
        String string2 = new String("gézakékazég");
        Anagram anagram = new Anagram();

        assertTrue(anagram.anagram(string1, string2));
    }

    @Test
    public void testAnagram3() {
        String string1 = new String("Iringo");
        String string2 = new String("GoIrin");
        Anagram anagram = new Anagram();

        assertFalse(anagram.anagram(string1, string2));
    }
}



