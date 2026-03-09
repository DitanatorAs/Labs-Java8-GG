import org.junit.Test;

import static org.junit.Assert.*;

public class ShirtOrderTest {

    @Test
    public void getShirt() {

        int shirtQuantity = 50;
        ShirtOrder shirtOrder = new ShirtOrder(shirtQuantity);
        assertEquals(shirtQuantity, shirtOrder.getShirtQuantity());

        for (int i = 1; i <= shirtQuantity; i++) {
            assertNotNull(shirtOrder.getShirt(i));
            assertEquals(shirtQuantity - i, shirtOrder.getShirtQuantity());
        }

        assertNull(shirtOrder.getShirt(10));
        assertEquals(0, shirtOrder.getShirtQuantity());

    }
}