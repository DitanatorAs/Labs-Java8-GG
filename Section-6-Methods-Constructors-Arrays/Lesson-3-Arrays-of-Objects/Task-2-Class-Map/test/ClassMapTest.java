import org.junit.Test;

import static org.junit.Assert.*;

public class ClassMapTest {

    @Test
    public void setDesk() {
        ClassMap clazz = new ClassMap(3, 4);
        assertNotNull(clazz.getDesks());
        assertEquals("0_0", clazz.setDesk("Vasia"));
        assertEquals("0_0", clazz.searchDesk("Vasia"));

        assertEquals("2_3", clazz.setDesk("Petia", 2, 3));
        assertEquals("место занято", clazz.setDesk("Sasha", 2, 3));
        assertEquals("0_1", clazz.setDesk("Sasha"));
        assertEquals("0_1", clazz.searchDesk("Sasha"));
        assertEquals("ученик не найден", clazz.searchDesk("Pet"));
    }
}