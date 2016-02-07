package module10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static module9.CaesarAlgorithm.decode;
import static module9.CaesarAlgorithm.encode;

public class Homework {

    public static void main(String[] args) {
        final String fileName = "secret.txt";
        try {
            saveSecureFile(fileName, "you should not see this text"); //почему именно такой текст? ведь именно его мы в конце и читаем))
            String text = loadSecureFile(fileName);
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.format("File \"%s\" is not found", fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void saveSecureFile(String fileName, String text) throws IOException {
        String encoded = encode(text);
        try (FileOutputStream writer = new FileOutputStream(fileName)) {
            writer.write(encoded.getBytes());
        }
    }

    public static String loadSecureFile(String fileName) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        try (Scanner reader = new Scanner(new File(fileName))) {
            while (reader.hasNextLine()) {
                builder.append(decode(reader.nextLine())); //ну, это немного паровозик, сложно будет дебажить.
                //закон Деметры говорит, что лучше разбить на отдельные строки последовательный вызов нескольких методов.
            }
        }
        return builder.toString();
    }
}

