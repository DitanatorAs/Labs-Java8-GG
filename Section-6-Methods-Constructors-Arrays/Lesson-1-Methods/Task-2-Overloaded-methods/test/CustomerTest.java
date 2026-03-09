import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void setInfo() {
        Customer customer = new Customer();
        customer.setInfo(1, "name", "address", "1-2-3");
        assertEquals(1, customer.getId());
        assertEquals("name", customer.getName());
        assertEquals("address", customer.getAddress());
        assertEquals("1-2-3", customer.getPhone());
        assertNull(customer.getEmail());
    }

    @Test
    public void setInfo2() {
        Customer customer = new Customer();
        customer.setInfo(1, "name", "address", "1-2-3", "e@mail");
        assertEquals(1, customer.getId());
        assertEquals("name", customer.getName());
        assertEquals("address", customer.getAddress());
        assertEquals("1-2-3", customer.getPhone());
        assertEquals("e@mail", customer.getEmail());
    }
}