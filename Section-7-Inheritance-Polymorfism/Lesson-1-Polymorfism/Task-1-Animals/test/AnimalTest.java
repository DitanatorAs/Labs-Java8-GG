import org.junit.Test;

import static org.junit.Assert.*;


public class AnimalTest {
    @Test
    public void test() {
        Cat cat = new Cat();
        assertTrue(cat instanceof Animal);
        assertTrue(cat instanceof Pet);
        cat.setName("Shoost");
        assertEquals("Shoost", cat.getName());

        Fish fish = new Fish();
        assertTrue(fish instanceof Animal);
        assertTrue(fish instanceof Pet);
        fish.setName("Goldy");
        assertEquals("Goldy", fish.getName());

        Spider spider = new Spider();
        assertTrue(spider instanceof Animal);
        assertFalse(spider instanceof Pet);
    }
}