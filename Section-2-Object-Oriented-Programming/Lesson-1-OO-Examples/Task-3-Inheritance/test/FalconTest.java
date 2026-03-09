import org.junit.Test;

import static org.junit.Assert.*;

public class FalconTest {

    Falcon f = new Falcon();

    @Test
    public void fly() {
        f.fly();
    }

    @Test
    public void land() {
        f.land();
    }

    @Test
    public void takeOff() {
        f.takeOff();
    }

    @Test
    public void eat() {
        f.eat();
    }

    @Test
    public void getName() {
        assertEquals("falcon".toLowerCase(), f.getName().toLowerCase());
    }
}