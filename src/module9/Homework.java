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

    public static String decoder(String str) {
        return transform(str, false);
    }//методы лучше называть, начиная глаголом

    public static String encoder(String str) {
        return transform(str, true);
    }

    private static String transform(String str, boolean doEncode) { //о!!!! класс!!!! то, что я хотела увидеть у всех -
        // вынесение в метод общее для encode и decode
        char[] charArray = str.toCharArray();
        int value = charArray.length; //не совсем понятно название для переменной? какую функцию она выполняет? - сдвиг?
        //если да, тогда ей лучше название shift. И почему она получает значение длины строки(массива чаров)? Просто так
        //или есть какой-то смысл глубокий?)
        for (int i = 0; i < charArray.length; i++) {
            value += i;
            charArray[i] = doEncode ? (char) (charArray[i] + value) : (char) (charArray[i] - value);
        }
        return new String(charArray);
    }
}
