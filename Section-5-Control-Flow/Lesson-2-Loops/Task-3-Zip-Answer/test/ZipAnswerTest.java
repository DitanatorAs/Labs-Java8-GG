import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class ZipAnswerTest {

    @Test
    public void zipAnswer() throws IOException {
        PackAnswer.pack("../..", "../../../answers/" + new File("../..").getCanonicalFile().getName() + "-answer.zip");
    }

}