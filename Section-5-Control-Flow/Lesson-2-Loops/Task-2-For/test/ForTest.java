import org.junit.Test;

import static org.junit.Assert.*;

public class ForTest {

    @Test
    public void count() {
        assertEquals("0 2 4 6 8", new For().count(5,2));
        assertEquals("0", new For().count(1,3));
        assertEquals("0 -1 -2 -3", new For().count(4,-1));
        assertEquals("0 -5 -10 -15 -20 -25 -30", new For().count(7,-5));
    }
}