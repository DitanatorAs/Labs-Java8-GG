import org.junit.Test;

import static org.junit.Assert.*;

public class IfTest {

    @Test
    public void dayOfWeek() {
        assertEquals("Понедельник", new If().dayOfWeek(1));
        assertEquals("Вторник" ,new If().dayOfWeek(2));
        assertEquals("Среда", new If().dayOfWeek(3));
        assertEquals("Четверг", new If().dayOfWeek(4));
        assertEquals("Пятница", new If().dayOfWeek(5));
        assertEquals("Суббота", new If().dayOfWeek(6));
        assertEquals("Воскресенье", new If().dayOfWeek(7));
    }
}