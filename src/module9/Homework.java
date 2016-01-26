package module9;

import module8.task1.AudioFile;
import module8.task1.Directory;
import module8.task1.TextFile;

public class Homework {
    public static void main(String[] args) {

        Directory dir = new Directory("Desktop");
        dir.addFile(new AudioFile("song.mp3"));
        dir.addFile(new TextFile("article.txt"));

        String encodedStr = encoder(dir.toString());
        System.out.println(encodedStr);
        String originalStr = decoder(encodedStr);
        System.out.println(originalStr);
    }

    private static String decoder(String str) {
        return transform(str, false);
    }

    private static String encoder(String str) {
        return transform(str, true);
    }

    private static String transform(String str, boolean doEncode) {
        char[] charArray = str.toCharArray();
        int value = charArray.length;
        for (int i = 0; i < charArray.length; i++) {
            value += i;
            charArray[i] = doEncode ? (char) (charArray[i] + value) : (char) (charArray[i] - value);
        }
        return new String(charArray);
    }
}
