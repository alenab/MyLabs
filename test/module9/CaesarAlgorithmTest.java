package module9;

import module8.task1.AudioFile;
import module8.task1.Directory;
import module8.task1.TextFile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaesarAlgorithmTest {
    Directory dir = new Directory("Desktop");

    @Before
    public void createDirectory() {
        dir.addFile(new AudioFile("song.mp3"));
        dir.addFile(new TextFile("article.txt"));
    }

    @Test(timeout = 3000)
    public void encodeTest() {
        String encodedStr = CaesarAlgorithm.encode(dir.toString());

        Assert.assertNotEquals(dir.toString(), encodedStr);
    }

    @Test(timeout = 3000)
    public void decodeTest() {
        String encodedStr = CaesarAlgorithm.encode(dir.toString());
        Assert.assertNotEquals(dir.toString(), encodedStr);
        String originalStr = CaesarAlgorithm.decode(encodedStr);

        Assert.assertEquals(dir.toString(), originalStr);
    }
}
