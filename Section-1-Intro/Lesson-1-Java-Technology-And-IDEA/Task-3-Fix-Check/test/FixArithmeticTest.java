import org.junit.Test;

import static org.junit.Assert.*;

public class FixArithmeticTest {

    @Test
    public void testCalc() {
        assertEquals(0, new FixArithmetic().calc(2, -5, 4));
    }
}