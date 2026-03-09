import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void date() {
        Date d = new Date();
        assertEquals(1, d.getDay());
        assertEquals(1, d.getMonth());
        assertEquals(1970, d.getYear());

        d = new Date(10, 3, 2020);
        assertEquals(10, d.getDay());
        assertEquals(3, d.getMonth());
        assertEquals(2020, d.getYear());
    }

}