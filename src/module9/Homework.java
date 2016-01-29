package module9;

import module8.task1.AudioFile;
import module8.task1.Directory;
import module8.task1.TextFile;

public class Homework {
    public static void main(String[] args) {

        Directory dir = new Directory("Desktop");
        dir.addFile(new AudioFile("song.mp3"));
        dir.addFile(new TextFile("article.txt"));

        String encodedStr = encode(dir.toString());
        System.out.println(encodedStr);
        String originalStr = decode(encodedStr);
        System.out.println(originalStr);
    }

    public static String decode(String str) {
        return transform(str, false);
    }

    public static String encode(String str) {
        return transform(str, true);
    }

    private static String transform(String str, boolean doEncode) {
        char[] charArray = str.toCharArray();
        int value = charArray.length;
        // просто увеличивает сдвиг, типа нетривиальное шифрование )
        for (int i = 0; i < charArray.length; i++) {
            value += i;
            charArray[i] = doEncode ? (char) (charArray[i] + value) : (char) (charArray[i] - value);
        }
        return new String(charArray);
    }
}
