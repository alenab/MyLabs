package module10;

import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.util.stream.Collectors.joining;
import static org.hamcrest.CoreMatchers.equalTo;

public class HomeworkTest {

    private static final File FILE = new File("secret.txt");
    private static final String TEXT = "you should not see this text";
    private static final int DEFAULT_TIMEOUT_MILLIS = 3_000;

    @BeforeClass
    public static void prepareFile() throws IOException {
        Homework.saveSecureFile(FILE.getName(), TEXT);
    }

    @Test(timeout = DEFAULT_TIMEOUT_MILLIS)
    public void safeSecureFileTest() throws IOException {
        Homework.saveSecureFile(FILE.getName(), TEXT);

        Assert.assertTrue(FILE.exists());
        Assert.assertNotEquals(TEXT, Files.lines(FILE.toPath()).collect(joining()));
    }

    @Test(timeout = DEFAULT_TIMEOUT_MILLIS)
    public void loadSecureFile() throws IOException {
        Homework.saveSecureFile(FILE.getName(), TEXT);
        final String textFromFile = Homework.loadSecureFile(FILE.getName());
        Assert.assertThat("Content differs from original", textFromFile, equalTo(TEXT));
    }

    @AfterClass
    public static void deleteFile() {
        FILE.delete();
    }
}

