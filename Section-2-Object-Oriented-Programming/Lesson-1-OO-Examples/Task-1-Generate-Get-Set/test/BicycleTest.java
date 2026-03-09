import org.junit.Test;

import static org.junit.Assert.*;

public class BicycleTest {

    Bicycle b = new Bicycle();

    @Test
    public void getCadence() {
        b.setCadence(56);
        assertEquals(56, b.getCadence());
    }

    @Test
    public void getSpeed() {
        b.setSpeed(12);
        assertEquals(12, b.getSpeed());
    }

    @Test
    public void getGear() {
        b.setGear(2);
        assertEquals(2, b.getGear());
    }
}