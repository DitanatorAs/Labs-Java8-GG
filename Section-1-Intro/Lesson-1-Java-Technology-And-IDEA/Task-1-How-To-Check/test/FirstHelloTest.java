import org.junit.Test;

import static org.junit.Assert.*;

public class FirstHelloTest {

    @Test
    public void hello() {
        assertEquals("Hello, Java!", new FirstHello().hello());
    }
}