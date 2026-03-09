import org.junit.Test;

import static org.junit.Assert.*;

public class VacationScaleTest {

    @Test
    public void getVacationDays() {
        VacationScale v = new VacationScale();
        assertEquals(10, v.getVacationDays(0));
        assertEquals(15, v.getVacationDays(2));
        assertEquals(20, v.getVacationDays(4));
        assertEquals(20, v.getVacationDays(5));
        assertEquals(25, v.getVacationDays(6));
        assertEquals(25, v.getVacationDays(7));
    }
}