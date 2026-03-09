import org.junit.Test;

import static org.junit.Assert.*;

public class VetTest {

    @Test
    public void testAnimals() {
        assertEquals(1, new Vet().testAnimals(
                new Animal[]{
                        new Cat(), new Spider(), new Spider()
                }));

        assertEquals(0, new Vet().testAnimals(new Animal[]{new Spider(), new Spider()}));
        assertEquals(1 ,new Vet().testAnimals(new Animal[]{new Spider(), new Spider(), new Fish()}));
        assertEquals(3, new Vet().testAnimals(new Animal[]{new Cat(), new Cat(), new Fish()}));
        assertEquals(2, new Vet().testAnimals(new Animal[]{new Cat(), new Spider(), new Fish()}));
        assertEquals(0, new Vet().testAnimals(new Animal[]{}));
    }
}