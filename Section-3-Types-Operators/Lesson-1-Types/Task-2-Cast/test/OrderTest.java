import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void getBigValue() {
        Order o = new Order(10000000, 555500);
        assertEquals(5555000000000L, o.getValue());
    }

    @Test
    public void getSmallValue() {
        Order o = new Order(1000, 500);
        assertEquals(500000L, o.getValue());
    }
}