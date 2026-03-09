import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Test
    public void isAnagram() {
        assertTrue(new AnagramChecker().isAnagram("software", "swear oft"));
        assertFalse(new AnagramChecker().isAnagram("software", "swear oftt"));
        assertFalse(new AnagramChecker().isAnagram("sss a", "s aaa"));
        assertTrue(new AnagramChecker().isAnagram("sss aa ", "ss aa s"));
    }
}