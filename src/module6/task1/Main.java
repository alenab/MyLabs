package module6.task1;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Directory dir = new Directory();// не понятно, какую ты создаешь директорию. Где название папки? где ее вообще создание, как реального файла?
        //у меня этот код всегда работает на то, чтобы выбрасывался эксепшн. Или в этом и задумка?

        try {
            for (int i = 0; i <= 10; i++) {
                dir.addFile(new ImageFile("pictures" + i + ".jpg"));
            }
        } catch (FullDirectoryException e) {
            System.out.println(e.getMessage());
        }

        try {
            dir.removeFile("picture1.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            dir.removeFile("not_existing_file_name.bmp");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
