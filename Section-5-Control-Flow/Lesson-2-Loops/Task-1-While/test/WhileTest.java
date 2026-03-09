import org.junit.Test;

import static org.junit.Assert.*;

public class WhileTest {

    @Test
    public void counter() {
        assertEquals("0 2 4 6 8", new While().count(5,2));
        assertEquals("0", new While().count(1,3));
        assertEquals("0 -1 -2 -3", new While().count(4,-1));
        assertEquals("0 -5 -10 -15 -20 -25 -30", new While().count(7,-5));
    }

}