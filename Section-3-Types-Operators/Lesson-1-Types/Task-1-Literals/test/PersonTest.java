import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person p = new Person(1);

    @Test
    public void getYears() {
        assertEquals(1, p.getYears());
    }

    @Test
    public void getDays() {
        assertEquals(365, p.getDays());
    }

    @Test
    public void getHours() {
        assertEquals(365 * 24, p.getHours());
    }

    @Test
    public void getMinuts() {
        assertEquals(365 * 24 * 60, p.getMinutes());
    }

    @Test
    public void getSeconds() {
        assertEquals(31536000, p.getSeconds());
    }

    @Test
    public void getMilliSeconds() {
        assertEquals(31536000000L, p.getMilliSeconds());
    }
}