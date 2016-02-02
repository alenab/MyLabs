package module10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

import static java.util.stream.Collectors.joining;
import static org.hamcrest.CoreMatchers.equalTo;

public class HomeworkTest {

    private static final String FILE_NAME = "secret.txt";
    private static final String TEXT = "you should not see this text";
    private static final int DEFAULT_TIMEOUT_MILLIS = 3_000;

    @Test(timeout = DEFAULT_TIMEOUT_MILLIS)
    public void safeSecureFileTest() throws IOException {
        Homework.saveSecureFile(FILE_NAME, TEXT);
        File file = new File(FILE_NAME);

        Assert.assertTrue(file.exists());
        Assert.assertNotEquals(TEXT, Files.lines(file.toPath()).collect(joining()));
    }

    @Test(timeout = DEFAULT_TIMEOUT_MILLIS)
    public void loadSecureFile() throws FileNotFoundException {
        final String textFromFile = Homework.loadSecureFile(FILE_NAME);
        Assert.assertThat("Content differs from original", textFromFile, equalTo(TEXT));
    }

    @AfterClass
    public static void deleteFile() {
        File file = new File(FILE_NAME);
        file.delete();
    }
}

