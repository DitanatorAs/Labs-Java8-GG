import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ThrowExTest {

    @Test (expected = ClassMapException.class)
    public void exception() {
        ClassMap clazz = new ClassMap(3,4);
        clazz.searchDesk("Inna");
    }

    @Test
    public void function() {
        ClassMap clazz = new ClassMap(3,4);
        assertNotNull(clazz.getDesks());
        assertEquals("0_0", clazz.setDesk("Vasia"));
        assertEquals("0_0", clazz.searchDesk("Vasia"));

        assertEquals("2_3", clazz.setDesk("Petia", 2, 3));
        assertEquals("0_1", clazz.setDesk("Sasha"));
        assertEquals("0_1", clazz.searchDesk("Sasha"));
    }

    @Test (expected = ClassMapException.class)
    public void functionEx() {
        ClassMap clazz = new ClassMap(3,4);
        assertNotNull(clazz.getDesks());
        assertEquals("0_0", clazz.setDesk("Vasia"));
        assertEquals("0_0", clazz.searchDesk("Vasia"));

        assertEquals("2_3", clazz.setDesk("Petia", 2, 3));
        clazz.setDesk("Sasha", 2, 3);
    }
}