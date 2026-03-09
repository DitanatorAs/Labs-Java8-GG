import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceWorldTest {


    @Test
    public void replaceCheck() {
        assertEquals("Hello, World!", new ReplaceWorld().replaceWorld());
    }


}