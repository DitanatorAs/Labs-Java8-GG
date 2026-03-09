import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest100 {

    Person p = new Person(100);

    @Test
    public void getYears() {
        assertEquals(100, p.getYears());
    }

    @Test
    public void getDays() {
        assertEquals(365 * 100L, p.getDays());
    }

    @Test
    public void getHours() {
        assertEquals(365 * 100L * 24, p.getHours());
    }

    @Test
    public void getMinuts() {
        assertEquals(365 * 100L * 24 * 60, p.getMinutes());
    }

    @Test
    public void getSeconds() {
        assertEquals(3153600000L, p.getSeconds());
    }

    @Test
    public void getMilliSeconds() {
        assertEquals(3153600000000L, p.getMilliSeconds());
    }
}