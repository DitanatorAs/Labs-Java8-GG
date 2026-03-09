import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    Bird b = new Bird();

    @Test
    public void fly() {
        b.fly();
    }

    @Test
    public void land() {
        b.land();
    }

    @Test
    public void takeOff() {
        b.takeOff();
    }

    @Test
    public void eat() {
        b.eat();
    }

    @Test
    public void getName() {
        assertEquals("just bird".toLowerCase(), b.getName().toLowerCase());
    }
}