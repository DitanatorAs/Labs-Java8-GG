import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class RegistrationTest {

    @Test
    public void testRegister() throws IOException {
        Registration r = new Registration();
        assertTrue(StringUtils.isNotEmpty(r.email));
        assertTrue(StringUtils.isNotEmpty(r.familyName));
        assertTrue(StringUtils.isNotEmpty(r.name));
        BufferedWriter br = new BufferedWriter(new FileWriter("../../../jb-registration.txt"));
        br.write(r.email + "\n" + r.name + " " + r.familyName);
        br.close();
    };

}