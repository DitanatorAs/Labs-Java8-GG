import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {

    @Test
    public void sum() {
        assertEquals("400", new Strings().sumOfNmbers("200", "200"));
        assertEquals("5000000000", new Strings().sumOfNmbers("2000000000", "3000000000"));
    }

    @Test
    public void initials() {
        assertEquals("IB", new Strings().initials("Ivan", "Boychenko"));
        assertEquals("RD", new Strings().initials("Richard", "Dawkins"));
    }

    @Test
    public void equity() {
        String orange1 = "оранжевый";
        String orange2 = new String("ОРАНЖЕВЫЙ");
        assertTrue(new Strings().equity(orange1, orange2));
    }
}